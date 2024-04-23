package _21670310075_Albaraa_Basha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _21670310075_Albaraa_Basha_FHesaplama {
	private int[] A = new int[16];
	private int[] B = new int[16];
	private int[] C = new int[16];
	private int[] D = new int[16];
	private int[] F = new int[16];

	public int[] hesaplaF(LinkedList<Character> charList, List<String> words, ArrayList<Character> arr) {

		_21670310075_Albaraa_Basha_truthTable bo = new _21670310075_Albaraa_Basha_truthTable();
		bo.a(A);
		bo.b(B);
		bo.c(C);
		bo.d(D);

		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).contains(String.valueOf('\''))) {
				int num = countLetters(words.get(i));

				String word = words.get(i);
				char[] charArray = word.toCharArray();

				if (num == 1) {
					int index = arr.indexOf(charArray[0]);

					if (index == 0) {
						bo.a(F);
						for (int j = 0; j < F.length; j++) {
							if (F[j] == 0)
								F[j] = 1;
							else
								F[j] = 0;
						}

					} else if (index == 1) {
						bo.b(F);
						for (int j = 0; j < F.length; j++) {
							if (F[j] == 0)
								F[j] = 1;
							else
								F[j] = 0;
						}

					} else if (index == 2) {
						bo.c(F);
						for (int j = 0; j < F.length; j++) {
							if (F[j] == 0)
								F[j] = 1;
							else
								F[j] = 0;
						}

					} else if (index == 3) {
						bo.d(F);
						for (int j = 0; j < F.length; j++) {
							if (F[j] == 0)
								F[j] = 1;
							else
								F[j] = 0;
						}

					}

				}

				else if (num == 2) {
					if (words.get(i).length() == 3) {

						if (words.get(i).charAt(1) == '\'') {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[2]);

							if (index == 0 && index2 == 1) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && B[j] == 1)
										F[j] = 1;
								}
							} else if (index == 0 && index2 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && C[j] == 1)
										F[j] = 1;
								}
							} else if (index == 0 && index2 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 0 && C[j] == 1)
										F[j] = 1;
								}
							} else if (index == 1 && index2 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}

						} else {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[1]);

							if (index == 0 && index2 == 1) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && B[j] == 0)
										F[j] = 1;
								}
							} else if (index == 0 && index2 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && C[j] == 0)
										F[j] = 1;
								}
							} else if (index == 0 && index2 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 1 && C[j] == 0)
										F[j] = 1;
								}
							} else if (index == 1 && index2 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

						}

					} else {
						int index = arr.indexOf(charArray[0]);
						int index2 = arr.indexOf(charArray[2]);

						if (index == 0 && index2 == 1) {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 0)
									F[j] = 1;
							}
						} else if (index == 0 && index2 == 2) {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && C[j] == 0)
									F[j] = 1;
							}
						} else if (index == 0 && index2 == 3) {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && D[j] == 0)
									F[j] = 1;
							}
						}

						else if (index == 1 && index2 == 2) {
							for (int j = 0; j < 16; j++) {
								if (B[j] == 0 && C[j] == 0)
									F[j] = 1;
							}
						} else if (index == 1 && index2 == 3) {
							for (int j = 0; j < 16; j++) {
								if (B[j] == 0 && D[j] == 0)
									F[j] = 1;
							}
						}

					}

				}

				else if (num == 3) {
					if (words.get(i).length() == 4) {
						if (words.get(i).charAt(1) == '\'') {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[2]);
							int index3 = arr.indexOf(charArray[3]);

							if (index == 0 && index2 == 1 && index3 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && B[j] == 1 && C[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 1 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && B[j] == 1 && D[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && C[j] == 1 && D[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 0 && C[j] == 1 && D[j] == 1)
										F[j] = 1;
								}
							}
						} else if (words.get(i).charAt(2) == '\'') {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[1]);
							int index3 = arr.indexOf(charArray[3]);

							if (index == 0 && index2 == 1 && index3 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && B[j] == 0 && C[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 1 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && B[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && C[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 1 && C[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}

						} else {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[1]);
							int index3 = arr.indexOf(charArray[2]);

							if (index == 0 && index2 == 1 && index3 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && B[j] == 1 && C[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 1 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && B[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && C[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 1 && C[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

						}

					}

					else if (words.get(i).length() == 5) {
						if (words.get(i).charAt(2) == '\'' && words.get(i).charAt(4) == '\'') {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[1]);
							int index3 = arr.indexOf(charArray[3]);

							if (index == 0 && index2 == 1 && index3 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && B[j] == 0 && C[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 1 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && B[j] == 0 && D[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 1 && C[j] == 0 && D[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 1 && C[j] == 0 && D[j] == 0)
										F[j] = 1;
								}
							}

						} else if (words.get(i).charAt(1) == '\'' && words.get(i).charAt(4) == '\'') {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[2]);
							int index3 = arr.indexOf(charArray[3]);

							if (index == 0 && index2 == 1 && index3 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && B[j] == 1 && C[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 1 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && B[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && C[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 0 && C[j] == 1 && D[j] == 0)
										F[j] = 1;
								}
							}

						} else {
							int index = arr.indexOf(charArray[0]);
							int index2 = arr.indexOf(charArray[2]);
							int index3 = arr.indexOf(charArray[4]);

							if (index == 0 && index2 == 1 && index3 == 2) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && B[j] == 0 && C[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 1 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && B[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 0 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (A[j] == 0 && C[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}

							else if (index == 1 && index2 == 2 && index3 == 3) {
								for (int j = 0; j < 16; j++) {
									if (B[j] == 0 && C[j] == 0 && D[j] == 1)
										F[j] = 1;
								}
							}
						}

					}

					else {
						int index = arr.indexOf(charArray[0]);
						int index2 = arr.indexOf(charArray[2]);
						int index3 = arr.indexOf(charArray[4]);

						if (index == 0 && index2 == 1 && index3 == 2) {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 0 && C[j] == 0)
									F[j] = 1;
							}
						}

						else if (index == 0 && index2 == 1 && index3 == 3) {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 0 && D[j] == 0)
									F[j] = 1;
							}
						}

						else if (index == 0 && index2 == 2 && index3 == 3) {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && C[j] == 0 && D[j] == 0)
									F[j] = 1;
							}
						}

						else if (index == 1 && index2 == 2 && index3 == 3) {
							for (int j = 0; j < 16; j++) {
								if (B[j] == 0 && C[j] == 0 && D[j] == 0)
									F[j] = 1;
							}
						}

					}

				}

				else if (num == 4) {
					if (words.get(i).length() == 5) {
						if (words.get(i).charAt(1) == '\'') {

							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 1 && C[j] == 1 && D[j] == 1)
									F[j] = 1;
							}
						} else if (words.get(i).charAt(2) == '\'') {

							for (int j = 0; j < 16; j++) {
								if (A[j] == 1 && B[j] == 0 && C[j] == 1 && D[j] == 1)
									F[j] = 1;
							}
						}

						else if (words.get(i).charAt(3) == '\'') {

							for (int j = 0; j < 16; j++) {
								if (A[j] == 1 && B[j] == 1 && C[j] == 0 && D[j] == 1)
									F[j] = 1;
							}
						}

						else if (words.get(i).charAt(4) == '\'') {

							for (int j = 0; j < 16; j++) {
								if (A[j] == 1 && B[j] == 1 && C[j] == 1 && D[j] == 0)
									F[j] = 1;
							}
						}

					}

					else if (words.get(i).length() == 6) {
						if (words.get(i).charAt(1) == '\'' && words.get(i).charAt(3) == '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 0 && C[j] == 1 && D[j] == 1)
									F[j] = 1;
							}
						} else if (words.get(i).charAt(1) == '\'' && words.get(i).charAt(4) == '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 1 && C[j] == 0 && D[j] == 1)
									F[j] = 1;
							}
						} else if (words.get(i).charAt(1) == '\'' && words.get(i).charAt(5) == '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 1 && C[j] == 1 && D[j] == 0)
									F[j] = 1;
							}
						} else if (words.get(i).charAt(2) == '\'' && words.get(i).charAt(4) == '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 1 && B[j] == 0 && C[j] == 0 && D[j] == 1)
									F[j] = 1;
							}
						} else if (words.get(i).charAt(2) == '\'' && words.get(i).charAt(5) == '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 1 && B[j] == 0 && C[j] == 1 && D[j] == 0)
									F[j] = 1;
							}
						} else {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 1 && B[j] == 1 && C[j] == 0 && D[j] == 0)
									F[j] = 1;
							}
						}
					}

					else if (words.get(i).length() == 7) {
						if (words.get(i).charAt(1) != '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 1 && B[j] == 0 && C[j] == 0 && D[j] == 0)
									F[j] = 1;
							}

						} else if (words.get(i).charAt(2) != '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 1 && C[j] == 0 && D[j] == 0)
									F[j] = 1;
							}

						} else if (words.get(i).charAt(4) != '\'') {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 0 && C[j] == 1 && D[j] == 0)
									F[j] = 1;
							}

						} else {
							for (int j = 0; j < 16; j++) {
								if (A[j] == 0 && B[j] == 0 && C[j] == 0 && D[j] == 1)
									F[j] = 1;
							}
						}

					}

					else {
						F[0] = 1;

					}

				}

			}

			else {
				String word = words.get(i);
				char[] charArray = word.toCharArray();

				if (words.get(i).length() == 1) {

					int index = arr.indexOf(charArray[0]);

					if (index == 0) {
						bo.a(F);

					} else if (index == 1) {
						bo.b(F);

					} else if (index == 2) {
						bo.c(F);

					} else if (index == 3) {
						bo.d(F);

					}

				}

				else if (words.get(i).length() == 2) {

					int index = arr.indexOf(charArray[0]);
					int index2 = arr.indexOf(charArray[1]);

					if (index == 0 && index2 == 1) {
						for (int j = 0; j < 16; j++) {
							if (A[j] == 1 && B[j] == 1)
								F[j] = 1;
						}
					} else if (index == 0 && index2 == 2) {
						for (int j = 0; j < 16; j++) {
							if (A[j] == 1 && C[j] == 1)
								F[j] = 1;
						}
					} else if (index == 0 && index2 == 3) {
						for (int j = 0; j < 16; j++) {
							if (A[j] == 1 && D[j] == 1)
								F[j] = 1;
						}
					}

					else if (index == 1 && index2 == 2) {
						for (int j = 0; j < 16; j++) {
							if (B[j] == 1 && C[j] == 1)
								F[j] = 1;
						}
					} else if (index == 1 && index2 == 3) {
						for (int j = 0; j < 16; j++) {
							if (B[j] == 1 && D[j] == 1)
								F[j] = 1;
						}
					}

					else if (index == 2 && index2 == 3) {
						for (int j = 0; j < 16; j++) {
							if (C[j] == 1 && D[j] == 1)
								F[j] = 1;
						}

					}

				}

				else if (words.get(i).length() == 3) {

					int index = arr.indexOf(charArray[0]);
					int index2 = arr.indexOf(charArray[1]);
					int index3 = arr.indexOf(charArray[2]);

					if (index == 0 && index2 == 1 && index3 == 2) {
						for (int j = 0; j < 16; j++) {
							if (A[j] == 1 && B[j] == 1 && C[j] == 1)
								F[j] = 1;
						}
					}

					else if (index == 0 && index2 == 1 && index3 == 3) {
						for (int j = 0; j < 16; j++) {
							if (A[j] == 1 && B[j] == 1 && D[j] == 1)
								F[j] = 1;
						}
					}

					else if (index == 0 && index2 == 2 && index3 == 3) {
						for (int j = 0; j < 16; j++) {
							if (A[j] == 1 && C[j] == 1 && D[j] == 1)
								F[j] = 1;
						}
					}

					else if (index == 1 && index2 == 2 && index3 == 3) {
						for (int j = 0; j < 16; j++) {
							if (B[j] == 1 && C[j] == 1 && D[j] == 1)
								F[j] = 1;
						}
					}

				}

				else if (words.get(i).length() == 4) {
					F[15] = 1;

				}
			}

		}

		return F;
	}

	public static int countLetters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				count++;
			}
		}
		return count;
	}

}

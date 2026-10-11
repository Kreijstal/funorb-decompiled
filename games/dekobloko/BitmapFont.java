/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BitmapFont extends DualNode {
    private Sprite[] spriteArrayState0001;
    private int[] integerArrayState0159;
    private int[] integerArrayState0160;
    private int[] integerArrayState0161;
    private int[] integerArrayState0162;
    int integerState0516;
    private int[] integerArrayState0163;
    private byte[] byteArrayState0016;
    private int[] integerArrayState0164;
    private static StringBuilder stringBuilderState0005;
    int integerState0517;
    int integerState0518;
    private static int integerState0519;
    private static int integerState0520;
    private static int integerState0521;
    private static int integerState0522;
    int integerState0523;
    private static int integerState0524;
    private static int integerState0525;
    private static int integerState0526;
    private static int integerState0527;
    private static int integerState0528;
    private static int integerState0529;
    private static String[] stringArrayState0023;

    final static String computeString1216(BitmapFont bitmapFontArgument1, String stringArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        if (bitmapFontArgument1.computeInteger1208(stringArgument2) <= integerArgument3) {
          return stringArgument2;
        }
        integerLocal2 = bitmapFontArgument1.computeInteger1208("...");
        integerLocal3 = integerArgument3 - integerLocal2;
        integerLocal4 = 0;
        for (integerLocal1 = 0; integerLocal1 < stringArgument2.length(); integerLocal1++) {
          integerLocal5 = bitmapFontArgument1.computeInteger1206(stringArgument2.charAt(integerLocal1));
          if (integerLocal4 + integerLocal5 > integerLocal3) {
            return stringArgument2.substring(0, integerLocal1 - 1) + "...";
          }
          integerLocal4 = integerLocal4 + integerLocal5;
        }
        return null;
    }

    private final static int computeInteger1219(byte[][] byteArrayArrayArgument1, byte[][] byteArrayArrayArgument2, int[] integerArrayArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        byte[] byteArrayLocal11;
        byte[] byteArrayLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        integerLocal4 = integerArrayArgument3[integerArgument6];
        integerLocal5 = integerLocal4 + integerArrayArgument5[integerArgument6];
        integerLocal6 = integerArrayArgument3[integerArgument7];
        integerLocal7 = integerLocal6 + integerArrayArgument5[integerArgument7];
        integerLocal8 = integerLocal4;
        if (integerLocal6 > integerLocal4) {
          integerLocal8 = integerLocal6;
        }
        integerLocal9 = integerLocal5;
        if (integerLocal7 < integerLocal5) {
          integerLocal9 = integerLocal7;
        }
        integerLocal10 = integerArrayArgument4[integerArgument6];
        if (integerArrayArgument4[integerArgument7] < integerLocal10) {
          integerLocal10 = integerArrayArgument4[integerArgument7];
        }
        byteArrayLocal11 = byteArrayArrayArgument2[integerArgument6];
        byteArrayLocal12 = byteArrayArrayArgument1[integerArgument7];
        integerLocal13 = integerLocal8 - integerLocal4;
        integerLocal14 = integerLocal8 - integerLocal6;
        for (integerLocal1 = integerLocal8; integerLocal1 < integerLocal9; integerLocal1++) {
          previousIntegerLocal2 = integerLocal13;
          integerLocal13++;
          previousIntegerLocal3 = integerLocal14;
          integerLocal14++;
          integerLocal15 = byteArrayLocal11[previousIntegerLocal2] + byteArrayLocal12[previousIntegerLocal3];
          if (integerLocal15 < integerLocal10) {
            integerLocal10 = integerLocal15;
          }
        }
        return -integerLocal10;
    }

    final int computeInteger1214(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11) {
        int[] integerArrayLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        if (stringArgument1 == null) {
          return 0;
        }
        this.performAction1207(integerArgument6, integerArgument7, integerArgument8);
        if (integerArgument11 == 0) {
          integerArgument11 = this.integerState0516;
        }
        integerArrayLocal1 = new int[]{integerArgument4};
        if (integerArgument5 < this.integerState0518 + this.integerState0523 + integerArgument11 &&
          integerArgument5 < integerArgument11 + integerArgument11) {
          integerArrayLocal1 = null;
        }
        integerLocal2 = this.computeInteger1215(stringArgument1, integerArrayLocal1, stringArrayState0023);
        if (integerArgument10 == 3 &&
          integerLocal2 == 1) {
          integerArgument10 = 1;
        }
        if (integerArgument10 != 0) {
          if (integerArgument10 != 1) {
            if (integerArgument10 != 2) {
              integerLocal4 = (integerArgument5 - this.integerState0518 - this.integerState0523 - (integerLocal2 - 1) * integerArgument11) / (integerLocal2 + 1);
              if (integerLocal4 < 0) {
                integerLocal4 = 0;
              }
              integerLocal3 = integerArgument3 + this.integerState0518 + integerLocal4;
              integerArgument11 = integerArgument11 + integerLocal4;
            } else {
              integerLocal3 = integerArgument3 + integerArgument5 - this.integerState0523 - (integerLocal2 - 1) * integerArgument11;
            }
          } else {
            integerLocal3 = integerArgument3 + this.integerState0518 + (integerArgument5 - this.integerState0518 - this.integerState0523 - (integerLocal2 - 1) * integerArgument11) / 2;
          }
        } else {
          integerLocal3 = integerArgument3 + this.integerState0518;
        }
        for (integerLocal5 = 0; integerLocal5 < integerLocal2; integerLocal5++) {
          if (integerArgument9 != 0) {
            if (integerArgument9 != 1) {
              if (integerArgument9 != 2) {
                if (integerLocal5 != integerLocal2 - 1) {
                  this.performAction1227(stringArrayState0023[integerLocal5], integerArgument4);
                  this.performAction1210(stringArrayState0023[integerLocal5], integerArgument2, integerLocal3);
                  integerState0528 = 0;
                } else {
                  this.performAction1210(stringArrayState0023[integerLocal5], integerArgument2, integerLocal3);
                }
                integerLocal3 = integerLocal3 + integerArgument11;
              } else {
                this.performAction1210(stringArrayState0023[integerLocal5], integerArgument2 + integerArgument4 - this.computeInteger1208(stringArrayState0023[integerLocal5]), integerLocal3);
                integerLocal3 = integerLocal3 + integerArgument11;
              }
            } else {
              this.performAction1210(stringArrayState0023[integerLocal5], integerArgument2 + (integerArgument4 - this.computeInteger1208(stringArrayState0023[integerLocal5])) / 2, integerLocal3);
              integerLocal3 = integerLocal3 + integerArgument11;
            }
          } else {
            this.performAction1210(stringArrayState0023[integerLocal5], integerArgument2, integerLocal3);
            integerLocal3 = integerLocal3 + integerArgument11;
          }
        }
        return integerLocal2;
    }

    private final void performAction1207(int integerArgument1, int integerArgument2, int integerArgument3) {
        integerState0525 = -1;
        integerState0520 = -1;
        integerState0522 = integerArgument2;
        integerState0519 = integerArgument2;
        integerState0529 = integerArgument1;
        integerState0526 = integerArgument1;
        integerState0524 = integerArgument3;
        integerState0527 = integerArgument3;
        integerState0528 = 0;
        integerState0521 = 0;
    }

    final int computeInteger1222(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal2 = this.computeInteger1215(stringArgument1, new int[]{integerArgument2}, stringArrayState0023);
        integerLocal3 = 0;
        for (integerLocal1 = 0; integerLocal1 < integerLocal2; integerLocal1++) {
          integerLocal4 = this.computeInteger1208(stringArrayState0023[integerLocal1]);
          if (integerLocal4 > integerLocal3) {
            integerLocal3 = integerLocal4;
          }
        }
        return integerLocal3;
    }

    final int computeInteger1215(String stringArgument1, int[] integerArrayArgument2, String[] stringArrayArgument3) {
        int integerLocal1 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int stackIntegerLocal6 = 0;
        int[] stackIntegerArrayLocal7 = null;
        int stackIntegerLocal8 = 0;
        Throwable caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        String stringLocal20 = null;
        int integerLocal21 = 0;
        Exception exceptionLocal22 = null;
        Object objectLocal23 = null;
        CharSequence charSequenceLocal24 = null;
        objectLocal23 = null;
        if (stringArgument1 == null) {
          return 0;
        }
        MixedSupport144.computeStringBuilder1942(stringBuilderState0005, -23510, 0, ' ');
        integerLocal10 = 0;
        integerLocal11 = 0;
        integerLocal12 = -1;
        integerLocal13 = 0;
        integerLocal14 = 0;
        integerLocal15 = -1;
        integerLocal16 = 0;
        integerLocal17 = 0;
        integerLocal18 = stringArgument1.length();
        for (integerLocal1 = 0; integerLocal1 < integerLocal18; integerLocal1++) {
          integerLocal19 = stringArgument1.charAt(integerLocal1);
          if (integerLocal19 != 60) {
            if (integerLocal19 == 62 &&
              integerLocal15 != -1) {
              stringLocal20 = stringArgument1.substring(integerLocal15 + 1, integerLocal1).toLowerCase();
              integerLocal15 = -1;
              discarded$0 = stringBuilderState0005.append('<');
              discarded$1 = stringBuilderState0005.append(stringLocal20);
              discarded$2 = stringBuilderState0005.append('>');
              if (!stringLocal20.equals("br")) {
                if (!stringLocal20.equals("lt")) {
                  if (!stringLocal20.equals("gt")) {
                    if (!stringLocal20.equals("nbsp")) {
                      if (!stringLocal20.equals("shy")) {
                        if (!stringLocal20.equals("times")) {
                          if (!stringLocal20.equals("euro")) {
                            if (!stringLocal20.equals("copy")) {
                              if (!stringLocal20.equals("reg")) {
                                if (stringLocal20.startsWith("img=")) {
                                  try {
                                    charSequenceLocal24 = (CharSequence) ((Object) stringLocal20.substring(4));
                                    integerLocal21 = MixedSupport014.computeInteger0207((byte) -77, charSequenceLocal24);
                                    integerLocal10 = integerLocal10 + this.spriteArrayState0001[integerLocal21].integerState0422;
                                    integerLocal16 = 0;
                                  } catch (java.lang.Exception caughtParameterLocal25) {
                                    caughtExceptionLocal9 = caughtParameterLocal25;
                                    exceptionLocal22 = (Exception) (Object) caughtExceptionLocal9;
                                  }
                                }
                              } else {
                                integerLocal10 = integerLocal10 + this.computeInteger1206('®');
                                if (this.byteArrayState0016 != null &&
                                  integerLocal16 != 0) {
                                  integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 174];
                                }
                                integerLocal16 = 174;
                              }
                            } else {
                              integerLocal10 = integerLocal10 + this.computeInteger1206('©');
                              if (this.byteArrayState0016 != null &&
                                integerLocal16 != 0) {
                                integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 169];
                              }
                              integerLocal16 = 169;
                            }
                          } else {
                            integerLocal10 = integerLocal10 + this.computeInteger1206('€');
                            if (this.byteArrayState0016 != null &&
                              integerLocal16 != 0) {
                              integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 128];
                            }
                            integerLocal16 = 8364;
                          }
                        } else {
                          integerLocal10 = integerLocal10 + this.computeInteger1206('×');
                          if (this.byteArrayState0016 != null &&
                            integerLocal16 != 0) {
                            integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 215];
                          }
                          integerLocal16 = 215;
                        }
                      } else {
                        integerLocal10 = integerLocal10 + this.computeInteger1206('­');
                        if (this.byteArrayState0016 != null &&
                          integerLocal16 != 0) {
                          integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 173];
                        }
                        integerLocal16 = 173;
                      }
                    } else {
                      integerLocal10 = integerLocal10 + this.computeInteger1206(' ');
                      if (this.byteArrayState0016 != null &&
                        integerLocal16 != 0) {
                        integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 160];
                      }
                      integerLocal16 = 160;
                    }
                  } else {
                    integerLocal10 = integerLocal10 + this.computeInteger1206('>');
                    if (this.byteArrayState0016 != null &&
                      integerLocal16 != 0) {
                      integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 62];
                    }
                    integerLocal16 = 62;
                  }
                } else {
                  integerLocal10 = integerLocal10 + this.computeInteger1206('<');
                  if (this.byteArrayState0016 != null &&
                    integerLocal16 != 0) {
                    integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + 60];
                  }
                  integerLocal16 = 60;
                }
              } else {
                stringArrayArgument3[integerLocal17] = stringBuilderState0005.toString().substring(integerLocal11, stringBuilderState0005.length());
                integerLocal17++;
                integerLocal11 = stringBuilderState0005.length();
                integerLocal10 = 0;
                integerLocal12 = -1;
                integerLocal16 = 0;
              }
              integerLocal19 = 0;
            }
            if (integerLocal15 == -1) {
              if (integerLocal19 != 0) {
                discarded$3 = stringBuilderState0005.append((char) integerLocal19);
                integerLocal19 = (char)(MixedSupport064.computeByte0848((char) integerLocal19, (byte) 28) & 255);
                integerLocal10 = integerLocal10 + this.integerArrayState0160[integerLocal19];
                if (this.byteArrayState0016 != null &&
                  integerLocal16 != 0) {
                  integerLocal10 = integerLocal10 + this.byteArrayState0016[(integerLocal16 << 8) + integerLocal19];
                }
                integerLocal16 = integerLocal19;
              }
              if (integerLocal19 == 32) {
                integerLocal12 = stringBuilderState0005.length();
                integerLocal13 = integerLocal10;
                integerLocal14 = 1;
              }
              if (integerArrayArgument2 != null) {
                stackIntegerLocal6 = integerLocal10;
                stackIntegerArrayLocal7 = (int[]) (integerArrayArgument2);
                if (integerLocal17 >= integerArrayArgument2.length) {
                  stackIntegerLocal8 = integerArrayArgument2.length - 1;
                } else {
                  stackIntegerLocal8 = integerLocal17;
                }
                if (stackIntegerLocal6 > stackIntegerArrayLocal7[stackIntegerLocal8] &&
                  integerLocal12 >= 0) {
                  stringArrayArgument3[integerLocal17] = stringBuilderState0005.toString().substring(integerLocal11, integerLocal12 - integerLocal14);
                  integerLocal17++;
                  integerLocal11 = integerLocal12;
                  integerLocal12 = -1;
                  integerLocal10 = integerLocal10 - integerLocal13;
                  integerLocal16 = 0;
                }
              }
              if (integerLocal19 == 45) {
                integerLocal12 = stringBuilderState0005.length();
                integerLocal13 = integerLocal10;
                integerLocal14 = 0;
              }
            }
          } else {
            integerLocal15 = integerLocal1;
          }
        }
        if (stringBuilderState0005.length() > integerLocal11) {
          stringArrayArgument3[integerLocal17] = stringBuilderState0005.toString().substring(integerLocal11, stringBuilderState0005.length());
          integerLocal17++;
        }
        return integerLocal17;
    }

    private final void performAction1210(String stringArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        Throwable caughtExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        String stringLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        Exception exceptionLocal11 = null;
        Sprite spriteLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        CharSequence charSequenceLocal15 = null;
        integerArgument3 = integerArgument3 - this.integerState0516;
        integerLocal4 = -1;
        integerLocal5 = 0;
        integerLocal6 = stringArgument1.length();
        for (integerLocal1 = 0; integerLocal1 < integerLocal6; integerLocal1++) {
          boolean frameRemainderLocal16 = true;
          integerLocal7 = stringArgument1.charAt(integerLocal1);
          if (integerLocal7 != 60) {
            if (integerLocal7 == 62 &&
              integerLocal4 != -1) {
              stringLocal8 = stringArgument1.substring(integerLocal4 + 1, integerLocal1).toLowerCase();
              integerLocal4 = -1;
              if (!stringLocal8.equals("lt")) {
                if (!stringLocal8.equals("gt")) {
                  if (!stringLocal8.equals("nbsp")) {
                    if (!stringLocal8.equals("shy")) {
                      if (!stringLocal8.equals("times")) {
                        if (!stringLocal8.equals("euro")) {
                          if (!stringLocal8.equals("copy")) {
                            if (!stringLocal8.equals("reg")) {
                              if (!stringLocal8.startsWith("img=")) {
                                this.performAction1221(stringLocal8);
                              } else {
                                try {
                                  charSequenceLocal15 = (CharSequence) ((Object) stringLocal8.substring(4));
                                  integerLocal10 = MixedSupport014.computeInteger0207((byte) 40, charSequenceLocal15);
                                  spriteLocal12 = this.spriteArrayState0001[integerLocal10];
                                  if (this.integerArrayState0162 == null) {
                                    stackIntegerLocal2 = spriteLocal12.integerState0423;
                                  } else {
                                    stackIntegerLocal2 = this.integerArrayState0162[integerLocal10];
                                  }
                                  integerLocal14 = stackIntegerLocal2;
                                  if (integerState0527 != 256) {
                                    spriteLocal12.performAction1054(integerArgument2, integerArgument3 + this.integerState0516 - integerLocal14, integerState0527);
                                  } else {
                                    spriteLocal12.performAction1053(integerArgument2, integerArgument3 + this.integerState0516 - integerLocal14);
                                  }
                                  integerArgument2 = integerArgument2 + spriteLocal12.integerState0422;
                                  integerLocal5 = 0;
                                } catch (java.lang.Exception caughtParameterLocal17) {
                                  caughtExceptionLocal3 = caughtParameterLocal17;
                                  exceptionLocal11 = (Exception) (Object) caughtExceptionLocal3;
                                }
                              }
                              frameRemainderLocal16 = false;
                            }
                            else {
                              integerLocal7 = 174;
                            }
                          } else {
                            integerLocal7 = 169;
                          }
                        } else {
                          integerLocal7 = 8364;
                        }
                      } else {
                        integerLocal7 = 215;
                      }
                    } else {
                      integerLocal7 = 173;
                    }
                  } else {
                    integerLocal7 = 160;
                  }
                } else {
                  integerLocal7 = 62;
                }
              } else {
                integerLocal7 = 60;
              }
            }
            if ((frameRemainderLocal16) &&
              (integerLocal4 == -1)) {
              integerLocal7 = (char)(MixedSupport064.computeByte0848((char) integerLocal7, (byte) 28) & 255);
              if (this.byteArrayState0016 != null &&
                integerLocal5 != 0) {
                integerArgument2 = integerArgument2 + this.byteArrayState0016[(integerLocal5 << 8) + integerLocal7];
              }
              integerLocal9 = this.integerArrayState0163[integerLocal7];
              integerLocal10 = this.integerArrayState0159[integerLocal7];
              integerLocal13 = integerArgument2;
              if (integerLocal7 == 32) {
                if (integerState0528 > 0) {
                  integerState0521 = integerState0521 + integerState0528;
                  integerArgument2 = integerArgument2 + (integerState0521 >> 8);
                  integerState0521 = integerState0521 & 255;
                }
              } else {
                if (integerState0527 != 256) {
                  if (integerState0519 != -1) {
                    this.performAction1129(integerLocal7, integerArgument2 + this.integerArrayState0164[integerLocal7] + 1, integerArgument3 + this.integerArrayState0161[integerLocal7] + 1, integerLocal9, integerLocal10, integerState0519, integerState0527, true);
                  }
                  this.performAction1129(integerLocal7, integerArgument2 + this.integerArrayState0164[integerLocal7], integerArgument3 + this.integerArrayState0161[integerLocal7], integerLocal9, integerLocal10, integerState0526, integerState0527, false);
                } else {
                  if (integerState0519 != -1) {
                    this.performAction1130(integerLocal7, integerArgument2 + this.integerArrayState0164[integerLocal7] + 1, integerArgument3 + this.integerArrayState0161[integerLocal7] + 1, integerLocal9, integerLocal10, integerState0519, true);
                  }
                  this.performAction1130(integerLocal7, integerArgument2 + this.integerArrayState0164[integerLocal7], integerArgument3 + this.integerArrayState0161[integerLocal7], integerLocal9, integerLocal10, integerState0526, false);
                }
              }
              integerArgument2 = integerArgument2 + this.integerArrayState0160[integerLocal7];
              if (integerState0525 != -1) {
                SoftwareRaster.performAction0718(integerLocal13, integerArgument3 + (int)((double)this.integerState0516 * 0.7), integerArgument2 - integerLocal13, integerState0525);
              }
              if (integerState0520 != -1) {
                SoftwareRaster.performAction0718(integerLocal13, integerArgument3 + this.integerState0516 + 1, integerArgument2 - integerLocal13, integerState0520);
              }
              integerLocal5 = integerLocal7;
            }
          } else {
            integerLocal4 = integerLocal1;
          }
        }
    }

    final int computeInteger1206(char characterArgument1) {
        return this.integerArrayState0160[MixedSupport064.computeByte0848(characterArgument1, (byte) 28) & 255];
    }

    final int computeInteger1208(String stringArgument1) {
        int integerLocal1 = 0;
        Throwable caughtExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        String stringLocal8 = null;
        int integerLocal9 = 0;
        Exception exceptionLocal10 = null;
        CharSequence charSequenceLocal11 = null;
        if (stringArgument1 == null) {
          return 0;
        }
        integerLocal3 = -1;
        integerLocal4 = 0;
        integerLocal5 = 0;
        integerLocal6 = stringArgument1.length();
        for (integerLocal1 = 0; integerLocal1 < integerLocal6; integerLocal1++) {
          boolean frameRemainderLocal12 = true;
          integerLocal7 = stringArgument1.charAt(integerLocal1);
          if (integerLocal7 != 60) {
            if (integerLocal7 == 62 &&
              integerLocal3 != -1) {
              stringLocal8 = stringArgument1.substring(integerLocal3 + 1, integerLocal1).toLowerCase();
              integerLocal3 = -1;
              if (!stringLocal8.equals("lt")) {
                if (!stringLocal8.equals("gt")) {
                  if (!stringLocal8.equals("nbsp")) {
                    if (!stringLocal8.equals("shy")) {
                      if (!stringLocal8.equals("times")) {
                        if (!stringLocal8.equals("euro")) {
                          if (!stringLocal8.equals("copy")) {
                            if (!stringLocal8.equals("reg")) {
                              if (!(!stringLocal8.startsWith("img="))) {
                                try {
                                  charSequenceLocal11 = (CharSequence) ((Object) stringLocal8.substring(4));
                                  integerLocal9 = MixedSupport014.computeInteger0207((byte) 91, charSequenceLocal11);
                                  integerLocal5 = integerLocal5 + this.spriteArrayState0001[integerLocal9].integerState0422;
                                  integerLocal4 = 0;
                                } catch (java.lang.Exception caughtParameterLocal13) {
                                  caughtExceptionLocal2 = caughtParameterLocal13;
                                  exceptionLocal10 = (Exception) (Object) caughtExceptionLocal2;
                                }
                              }
                              frameRemainderLocal12 = false;
                            }
                            else {
                              integerLocal7 = 174;
                            }
                          } else {
                            integerLocal7 = 169;
                          }
                        } else {
                          integerLocal7 = 8364;
                        }
                      } else {
                        integerLocal7 = 215;
                      }
                    } else {
                      integerLocal7 = 173;
                    }
                  } else {
                    integerLocal7 = 160;
                  }
                } else {
                  integerLocal7 = 62;
                }
              } else {
                integerLocal7 = 60;
              }
            }
            if ((frameRemainderLocal12) &&
              (integerLocal3 == -1)) {
              integerLocal7 = (char)(MixedSupport064.computeByte0848((char) integerLocal7, (byte) 28) & 255);
              integerLocal5 = integerLocal5 + this.integerArrayState0160[integerLocal7];
              if (this.byteArrayState0016 != null &&
                integerLocal4 != 0) {
                integerLocal5 = integerLocal5 + this.byteArrayState0016[(integerLocal4 << 8) + integerLocal7];
              }
              integerLocal4 = integerLocal7;
            }
          } else {
            integerLocal3 = integerLocal1;
          }
        }
        return integerLocal5;
    }

    final void performAction1218(Sprite[] spriteArrayArgument1, int[] integerArrayArgument2) {
        if (integerArrayArgument2 != null &&
          integerArrayArgument2.length != spriteArrayArgument1.length) {
          throw new IllegalArgumentException();
        }
        this.spriteArrayState0001 = spriteArrayArgument1;
        this.integerArrayState0162 = integerArrayArgument2;
    }

    private final void performAction1221(String stringArgument1) {
        Throwable caughtExceptionLocal1 = null;
        Exception exceptionLocal2 = null;
        CharSequence charSequenceLocal3 = null;
        CharSequence charSequenceLocal4 = null;
        CharSequence charSequenceLocal5 = null;
        CharSequence charSequenceLocal6 = null;
        CharSequence charSequenceLocal7 = null;
        try {
          if (!stringArgument1.startsWith("col=")) {
            if (!stringArgument1.equals("/col")) {
              if (!stringArgument1.startsWith("trans=")) {
                if (!stringArgument1.equals("/trans")) {
                  if (!stringArgument1.startsWith("str=")) {
                    if (!stringArgument1.equals("str")) {
                      if (!stringArgument1.equals("/str")) {
                        if (!stringArgument1.startsWith("u=")) {
                          if (!stringArgument1.equals("u")) {
                            if (!stringArgument1.equals("/u")) {
                              if (!stringArgument1.startsWith("shad=")) {
                                if (!stringArgument1.equals("shad")) {
                                  if (!stringArgument1.equals("/shad")) {
                                    if (stringArgument1.equals("br")) {
                                      this.performAction1207(integerState0529, integerState0522, integerState0524);
                                    }
                                  } else {
                                    integerState0519 = integerState0522;
                                  }
                                } else {
                                  integerState0519 = 0;
                                }
                              } else {
                                charSequenceLocal7 = (CharSequence) ((Object) stringArgument1.substring(5));
                                integerState0519 = HashNode.computeInteger0160(16, false, charSequenceLocal7);
                              }
                            } else {
                              integerState0520 = -1;
                            }
                          } else {
                            integerState0520 = 0;
                          }
                        } else {
                          charSequenceLocal6 = (CharSequence) ((Object) stringArgument1.substring(2));
                          integerState0520 = HashNode.computeInteger0160(16, false, charSequenceLocal6);
                        }
                      } else {
                        integerState0525 = -1;
                      }
                    } else {
                      integerState0525 = 8388608;
                    }
                  } else {
                    charSequenceLocal5 = (CharSequence) ((Object) stringArgument1.substring(4));
                    integerState0525 = HashNode.computeInteger0160(16, false, charSequenceLocal5);
                  }
                } else {
                  integerState0527 = integerState0524;
                }
              } else {
                charSequenceLocal4 = (CharSequence) ((Object) stringArgument1.substring(6));
                integerState0527 = MixedSupport014.computeInteger0207((byte) 46, charSequenceLocal4);
              }
            } else {
              integerState0526 = integerState0529;
            }
          } else {
            charSequenceLocal3 = (CharSequence) ((Object) stringArgument1.substring(4));
            integerState0526 = HashNode.computeInteger0160(16, false, charSequenceLocal3);
          }
        } catch (java.lang.Exception caughtParameterLocal8) {
          caughtExceptionLocal1 = caughtParameterLocal8;
          exceptionLocal2 = (Exception) (Object) caughtExceptionLocal1;
        }
    }

    final void performAction1224(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        if (stringArgument1 == null) {
          return;
        }
        this.performAction1220(integerArgument4, integerArgument5);
        this.performAction1210(stringArgument1, integerArgument2 - this.computeInteger1208(stringArgument1) / 2, integerArgument3);
    }

    abstract void performAction1129(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, boolean booleanArgument8);

    private final void performAction1220(int integerArgument1, int integerArgument2) {
        integerState0525 = -1;
        integerState0520 = -1;
        integerState0522 = integerArgument2;
        integerState0519 = integerArgument2;
        integerState0529 = integerArgument1;
        integerState0526 = integerArgument1;
        integerState0524 = 256;
        integerState0527 = 256;
        integerState0528 = 0;
        integerState0521 = 0;
    }

    final void performAction1211(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        if (stringArgument1 == null) {
          return;
        }
        this.performAction1220(integerArgument4, integerArgument5);
        this.performAction1210(stringArgument1, integerArgument2, integerArgument3);
    }

    private final void performAction1217(byte[] byteArrayArgument1) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int integerLocal5 = 0;
        byte[] byteArrayLocal6 = null;
        int previousIntegerLocal7 = 0;
        byte[] byteArrayLocal8 = null;
        int integerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        int integerLocal11;
        int[] integerArrayLocal12;
        int[] integerArrayLocal13;
        int integerLocal14;
        byte[][] byteArrayArrayLocal15;
        byte[][] byteArrayArrayLocal16;
        int integerLocal17;
        int integerLocal18;
        int[] integerArrayLocal19;
        byte[][] byteArrayArrayLocal20;
        byte[][] byteArrayArrayLocal21;
        int[] integerArrayLocal22;
        int[] integerArrayLocal23;
        byte[][] byteArrayArrayLocal24;
        byte[][] byteArrayArrayLocal25;
        int[] integerArrayLocal26;
        int integerLocal27;
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        int integerLocal31;
        this.integerArrayState0160 = new int[256];
        if (byteArrayArgument1.length == 257) {
          for (integerLocal11 = 0; integerLocal11 < this.integerArrayState0160.length; integerLocal11++) {
            this.integerArrayState0160[integerLocal11] = byteArrayArgument1[integerLocal11] & 255;
          }
          this.integerState0516 = byteArrayArgument1[256] & 255;
        } else {
          integerLocal11 = 0;
          for (integerLocal1 = 0; integerLocal1 < 256; integerLocal1++) {
            previousIntegerLocal2 = integerLocal11;
            integerLocal11++;
            this.integerArrayState0160[integerLocal1] = byteArrayArgument1[previousIntegerLocal2] & 255;
          }
          integerArrayLocal23 = new int[256];
          integerArrayLocal19 = integerArrayLocal23;
          integerArrayLocal12 = integerArrayLocal19;
          integerArrayLocal26 = new int[256];
          integerArrayLocal22 = integerArrayLocal26;
          integerArrayLocal13 = integerArrayLocal22;
          for (integerLocal14 = 0; integerLocal14 < 256; integerLocal14++) {
            previousIntegerLocal3 = integerLocal11;
            integerLocal11++;
            integerArrayLocal12[integerLocal14] = byteArrayArgument1[previousIntegerLocal3] & 255;
          }
          for (integerLocal27 = 0; integerLocal27 < 256; integerLocal27++) {
            previousIntegerLocal4 = integerLocal11;
            integerLocal11++;
            integerArrayLocal13[integerLocal27] = byteArrayArgument1[previousIntegerLocal4] & 255;
          }
          byteArrayArrayLocal24 = new byte[256][];
          byteArrayArrayLocal20 = byteArrayArrayLocal24;
          byteArrayArrayLocal15 = byteArrayArrayLocal20;
          for (integerLocal5 = 0; integerLocal5 < 256; integerLocal5++) {
            byteArrayLocal6 = new byte[integerArrayLocal23[integerLocal5]];
            byteArrayArrayLocal15[integerLocal5] = byteArrayLocal6;
            integerLocal17 = 0;
            for (integerLocal18 = 0; integerLocal18 < byteArrayArrayLocal24[integerLocal5].length; integerLocal18++) {
              previousIntegerLocal7 = integerLocal11;
              integerLocal11++;
              integerLocal17 = (byte)(integerLocal17 + byteArrayArgument1[previousIntegerLocal7]);
              byteArrayArrayLocal24[integerLocal5][integerLocal18] = (byte)integerLocal17;
            }
          }
          byteArrayArrayLocal25 = new byte[256][];
          byteArrayArrayLocal21 = byteArrayArrayLocal25;
          byteArrayArrayLocal16 = byteArrayArrayLocal21;
          for (integerLocal30 = 0; integerLocal30 < 256; integerLocal30++) {
            byteArrayLocal8 = new byte[integerArrayLocal23[integerLocal30]];
            byteArrayArrayLocal16[integerLocal30] = byteArrayLocal8;
            integerLocal28 = 0;
            for (integerLocal9 = 0; integerLocal9 < byteArrayArrayLocal25[integerLocal30].length; integerLocal9++) {
              previousIntegerLocal10 = integerLocal11;
              integerLocal11++;
              integerLocal28 = (byte)(integerLocal28 + byteArrayArgument1[previousIntegerLocal10]);
              byteArrayArrayLocal25[integerLocal30][integerLocal9] = (byte)integerLocal28;
            }
          }
          this.byteArrayState0016 = new byte[65536];
          for (integerLocal31 = 0; integerLocal31 < 256; integerLocal31++) {
            if (integerLocal31 != 32 &&
              integerLocal31 != 160) {
              for (integerLocal29 = 0; integerLocal29 < 256; integerLocal29++) {
                if (integerLocal29 != 32 &&
                  integerLocal29 != 160) {
                  this.byteArrayState0016[(integerLocal31 << 8) + integerLocal29] = (byte)BitmapFont.computeInteger1219(byteArrayArrayLocal24, byteArrayArrayLocal25, integerArrayLocal26, this.integerArrayState0160, integerArrayLocal23, integerLocal31, integerLocal29);
                }
              }
            }
          }
          this.integerState0516 = integerArrayLocal26[32] + integerArrayLocal23[32];
        }
    }

    abstract void performAction1130(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7);

    final int computeInteger1213(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        return this.computeInteger1214(stringArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, 256, integerArgument8, integerArgument9, integerArgument10);
    }

    final void performAction1225(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        if (stringArgument1 == null) {
          return;
        }
        this.performAction1207(integerArgument4, integerArgument5, integerArgument6);
        this.performAction1210(stringArgument1, integerArgument2 - this.computeInteger1208(stringArgument1) / 2, integerArgument3);
    }

    final void performAction1212(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        if (stringArgument1 == null) {
          return;
        }
        this.performAction1207(integerArgument4, integerArgument5, integerArgument6);
        this.performAction1210(stringArgument1, integerArgument2 - this.computeInteger1208(stringArgument1), integerArgument3);
    }

    final int computeInteger1223(String stringArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument3 == 0) {
          integerArgument3 = this.integerState0516;
        }
        int integerLocal1 = this.computeInteger1215(stringArgument1, new int[]{integerArgument2}, stringArrayState0023);
        int integerLocal2 = (integerLocal1 - 1) * integerArgument3;
        return this.integerState0518 + integerLocal2 + this.integerState0523;
    }

    final void performAction1228(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        if (stringArgument1 == null) {
          return;
        }
        this.performAction1220(integerArgument4, integerArgument5);
        this.performAction1210(stringArgument1, integerArgument2 - this.computeInteger1208(stringArgument1), integerArgument3);
    }

    public static void performAction1205() {
        stringBuilderState0005 = null;
        stringArrayState0023 = null;
    }

    final int computeInteger1209(String stringArgument1, int integerArgument2) {
        return this.computeInteger1215(stringArgument1, new int[]{integerArgument2}, stringArrayState0023);
    }

    final void performAction1229(String stringArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        if (stringArgument1 == null) {
          return;
        }
        this.performAction1207(integerArgument4, integerArgument5, integerArgument6);
        this.performAction1210(stringArgument1, integerArgument2, integerArgument3);
    }

    private final void performAction1227(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal2 = 0;
        integerLocal3 = 0;
        integerLocal4 = stringArgument1.length();
        for (integerLocal1 = 0; integerLocal1 < integerLocal4; integerLocal1++) {
          integerLocal5 = stringArgument1.charAt(integerLocal1);
          if (integerLocal5 != 60) {
            if (integerLocal5 != 62) {
              if (integerLocal3 == 0 &&
                integerLocal5 == 32) {
                integerLocal2++;
              }
            } else {
              integerLocal3 = 0;
            }
          } else {
            integerLocal3 = 1;
          }
        }
        if (integerLocal2 > 0) {
          integerState0528 = (integerArgument2 - this.computeInteger1208(stringArgument1) << 8) / integerLocal2;
        }
    }

    final static String computeString1226(String stringArgument1) {
        int integerLocal1 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        StringBuilder stringBuilderLocal8;
        int integerLocal9;
        int integerLocal10;
        integerLocal5 = stringArgument1.length();
        integerLocal6 = 0;
        for (integerLocal1 = 0; integerLocal1 < integerLocal5; integerLocal1++) {
          integerLocal7 = stringArgument1.charAt(integerLocal1);
          if (integerLocal7 != 60) {
            if (integerLocal7 == 62) {
              integerLocal6 += 3;
            }
          } else {
            integerLocal6 += 3;
          }
        }
        stringBuilderLocal8 = new StringBuilder(integerLocal5 + integerLocal6);
        for (integerLocal10 = 0; integerLocal10 < integerLocal5; integerLocal10++) {
          integerLocal9 = stringArgument1.charAt(integerLocal10);
          if (integerLocal9 != 60) {
            if (integerLocal9 != 62) {
              discarded$0 = stringBuilderLocal8.append((char) integerLocal9);
            } else {
              discarded$1 = stringBuilderLocal8.append("<gt>");
            }
          } else {
            discarded$2 = stringBuilderLocal8.append("<lt>");
          }
        }
        return stringBuilderLocal8.toString();
    }

    BitmapFont(byte[] byteArrayArgument1, int[] integerArrayArgument2, int[] integerArrayArgument3, int[] integerArrayArgument4, int[] integerArrayArgument5) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        this.integerState0516 = 0;
        this.integerArrayState0164 = integerArrayArgument2;
        this.integerArrayState0161 = integerArrayArgument3;
        this.integerArrayState0163 = integerArrayArgument4;
        this.integerArrayState0159 = integerArrayArgument5;
        this.performAction1217(byteArrayArgument1);
        integerLocal2 = 2147483647;
        integerLocal3 = -2147483648;
        for (integerLocal1 = 0; integerLocal1 < 256; integerLocal1++) {
          if (this.integerArrayState0161[integerLocal1] < integerLocal2 &&
            this.integerArrayState0159[integerLocal1] != 0) {
            integerLocal2 = this.integerArrayState0161[integerLocal1];
          }
          if (this.integerArrayState0161[integerLocal1] + this.integerArrayState0159[integerLocal1] > integerLocal3) {
            integerLocal3 = this.integerArrayState0161[integerLocal1] + this.integerArrayState0159[integerLocal1];
          }
        }
        this.integerState0518 = this.integerState0516 - integerLocal2;
        this.integerState0523 = integerLocal3 - this.integerState0516;
        this.integerState0517 = this.integerState0516 - this.integerArrayState0161[88];
    }

    static {
        stringBuilderState0005 = new StringBuilder(100);
        integerState0521 = 0;
        integerState0519 = -1;
        integerState0520 = -1;
        integerState0522 = -1;
        integerState0527 = 256;
        integerState0524 = 256;
        integerState0529 = 0;
        integerState0525 = -1;
        integerState0528 = 0;
        integerState0526 = 0;
        stringArrayState0023 = new String[100];
    }
}

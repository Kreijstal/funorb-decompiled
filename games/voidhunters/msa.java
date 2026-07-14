/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class msa extends rqa {
    static llb field_o;
    static float[] field_q;
    static rbb field_s;
    static String field_p;
    static String field_r;

    msa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_q = null;
        field_p = null;
        field_s = null;
        field_r = null;
        if (param0 != -61) {
            return;
        }
        field_o = null;
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        StringBuilder var10 = null;
        StringBuilder var11 = null;
        var8 = VoidHunters.field_G;
        if (param1 == 32) {
          L0: {
            var2 = param0.length();
            var10 = new StringBuilder(var2);
            var4 = 0;
            if (var2 <= var4) {
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param0.charAt(var4);
                    if (97 > var5) {
                      break L3;
                    } else {
                      if (var5 <= 122) {
                        StringBuilder discarded$27 = var10.append(var5);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (65 > var5) {
                      break L4;
                    } else {
                      if (var5 <= 90) {
                        StringBuilder discarded$28 = var10.append(var5);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var5 < 48) {
                      break L5;
                    } else {
                      if (57 >= var5) {
                        StringBuilder discarded$29 = var10.append(var5);
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var5 == 46) {
                    StringBuilder discarded$30 = var10.append(var5);
                    break L2;
                  } else {
                    if (var5 == 45) {
                      StringBuilder discarded$31 = var10.append(var5);
                      break L2;
                    } else {
                      if (var5 == 42) {
                        StringBuilder discarded$32 = var10.append(var5);
                        break L2;
                      } else {
                        if (var5 != 95) {
                          L6: {
                            L7: {
                              if (var5 != 32) {
                                L8: {
                                  var6 = aea.a(param1 ^ -90, (char) var5);
                                  StringBuilder discarded$33 = var10.append(37);
                                  var7 = (var6 & 244) >> -581017148;
                                  if ((var7 ^ -1) > -11) {
                                    StringBuilder discarded$34 = var10.append((char)(48 - -var7));
                                    break L8;
                                  } else {
                                    StringBuilder discarded$35 = var10.append((char)(55 - -var7));
                                    break L8;
                                  }
                                }
                                var7 = var6 & 15;
                                if (var7 < 10) {
                                  StringBuilder discarded$36 = var10.append((char)(48 - -var7));
                                  break L6;
                                } else {
                                  StringBuilder discarded$37 = var10.append((char)(55 - -var7));
                                  break L7;
                                }
                              } else {
                                StringBuilder discarded$38 = var10.append(43);
                                var4++;
                                break L7;
                              }
                            }
                            var4++;
                            break L6;
                          }
                          var4++;
                          break L1;
                        } else {
                          StringBuilder discarded$39 = var10.append(var5);
                          break L2;
                        }
                      }
                    }
                  }
                }
                var4++;
                break L1;
              }
              var4++;
              var4++;
              var4++;
              var4++;
              var4++;
              break L0;
            }
          }
          return var10.toString();
        } else {
          var9 = null;
          String discarded$40 = msa.a((CharSequence) null, -104);
          L9: {
            var2 = param0.length();
            var11 = new StringBuilder(var2);
            var3 = var11;
            var4 = 0;
            if (var2 <= var4) {
              break L9;
            } else {
              L10: {
                L11: {
                  L12: {
                    var5 = param0.charAt(var4);
                    if (97 > var5) {
                      break L12;
                    } else {
                      if (var5 <= 122) {
                        StringBuilder discarded$41 = var11.append(var5);
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (65 > var5) {
                      break L13;
                    } else {
                      if (var5 <= 90) {
                        StringBuilder discarded$42 = var11.append(var5);
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5 < 48) {
                      break L14;
                    } else {
                      if (57 >= var5) {
                        StringBuilder discarded$43 = var11.append(var5);
                        break L11;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (var5 == 46) {
                    StringBuilder discarded$44 = var11.append(var5);
                    break L11;
                  } else {
                    if (var5 == 45) {
                      StringBuilder discarded$45 = var11.append(var5);
                      break L11;
                    } else {
                      if (var5 == 42) {
                        StringBuilder discarded$46 = var11.append(var5);
                        break L11;
                      } else {
                        if (var5 != 95) {
                          L15: {
                            L16: {
                              if (var5 != 32) {
                                L17: {
                                  var6 = aea.a(param1 ^ -90, (char) var5);
                                  StringBuilder discarded$47 = var11.append(37);
                                  var7 = (var6 & 244) >> -581017148;
                                  if ((var7 ^ -1) > -11) {
                                    StringBuilder discarded$48 = var11.append((char)(48 - -var7));
                                    break L17;
                                  } else {
                                    StringBuilder discarded$49 = var11.append((char)(55 - -var7));
                                    break L17;
                                  }
                                }
                                var7 = var6 & 15;
                                if (var7 < 10) {
                                  StringBuilder discarded$50 = var11.append((char)(48 - -var7));
                                  break L15;
                                } else {
                                  StringBuilder discarded$51 = var11.append((char)(55 - -var7));
                                  break L16;
                                }
                              } else {
                                StringBuilder discarded$52 = var11.append(43);
                                var4++;
                                break L16;
                              }
                            }
                            var4++;
                            break L15;
                          }
                          var4++;
                          break L10;
                        } else {
                          StringBuilder discarded$53 = var11.append(var5);
                          break L11;
                        }
                      }
                    }
                  }
                }
                var4++;
                break L10;
              }
              var4++;
              var4++;
              var4++;
              var4++;
              var4++;
              break L9;
            }
          }
          return var11.toString();
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(56, 108));
        } else {
          return new nc((Object) (Object) frb.a(56, 108));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "DirectX";
        field_r = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_q = new float[16];
    }
}

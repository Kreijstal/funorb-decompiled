/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ow {
    private int[] field_c;
    static jn field_f;
    static String field_a;
    static String field_b;
    static int field_e;
    static byte[][] field_d;

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (0 != param4) {
          param4 = param4 + param0;
          var7 = 0;
          var9 = -35 / ((52 - param3) / 59);
          var8 = param1;
          L0: while (true) {
            L1: {
              var10 = param5[var8];
              if (var10 < 0) {
                var7 = ((ow) this).field_c[var7];
                break L1;
              } else {
                var7++;
                break L1;
              }
            }
            L2: {
              var11 = ((ow) this).field_c[var7];
              if (((ow) this).field_c[var7] < 0) {
                param0++;
                param2[param0] = (byte)(var11 ^ -1);
                if (param4 > param0) {
                  var7 = 0;
                  break L2;
                } else {
                  return -param1 + var8 + 1;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 == (64 & var10)) {
                var7++;
                break L3;
              } else {
                var7 = ((ow) this).field_c[var7];
                break L3;
              }
            }
            L4: {
              var11 = ((ow) this).field_c[var7];
              if (-1 <= ((ow) this).field_c[var7]) {
                break L4;
              } else {
                param0++;
                param2[param0] = (byte)(var11 ^ -1);
                if (param0 < param4) {
                  var7 = 0;
                  break L4;
                } else {
                  return -param1 + var8 + 1;
                }
              }
            }
            L5: {
              if (-1 == (var10 & 32 ^ -1)) {
                var7++;
                break L5;
              } else {
                var7 = ((ow) this).field_c[var7];
                break L5;
              }
            }
            L6: {
              var11 = ((ow) this).field_c[var7];
              if (0 <= ((ow) this).field_c[var7]) {
                break L6;
              } else {
                param0++;
                param2[param0] = (byte)(var11 ^ -1);
                if (param0 < param4) {
                  var7 = 0;
                  break L6;
                } else {
                  return -param1 + var8 + 1;
                }
              }
            }
            L7: {
              if ((16 & var10) != 0) {
                var7 = ((ow) this).field_c[var7];
                break L7;
              } else {
                var7++;
                break L7;
              }
            }
            L8: {
              var11 = ((ow) this).field_c[var7];
              if (((ow) this).field_c[var7] >= 0) {
                break L8;
              } else {
                param0++;
                param2[param0] = (byte)(var11 ^ -1);
                if (param0 < param4) {
                  var7 = 0;
                  break L8;
                } else {
                  return -param1 + var8 + 1;
                }
              }
            }
            L9: {
              if (-1 != (8 & var10 ^ -1)) {
                var7 = ((ow) this).field_c[var7];
                break L9;
              } else {
                var7++;
                break L9;
              }
            }
            L10: {
              var11 = ((ow) this).field_c[var7];
              if (((ow) this).field_c[var7] >= 0) {
                break L10;
              } else {
                param0++;
                param2[param0] = (byte)(var11 ^ -1);
                if (param0 < param4) {
                  var7 = 0;
                  break L10;
                } else {
                  return -param1 + var8 + 1;
                }
              }
            }
            L11: {
              if ((var10 & 4) != 0) {
                var7 = ((ow) this).field_c[var7];
                break L11;
              } else {
                var7++;
                break L11;
              }
            }
            L12: {
              var11 = ((ow) this).field_c[var7];
              if (((ow) this).field_c[var7] < 0) {
                param0++;
                param2[param0] = (byte)(var11 ^ -1);
                if (param4 > param0) {
                  var7 = 0;
                  break L12;
                } else {
                  return -param1 + var8 + 1;
                }
              } else {
                break L12;
              }
            }
            L13: {
              if ((2 & var10) != 0) {
                var7 = ((ow) this).field_c[var7];
                break L13;
              } else {
                var7++;
                break L13;
              }
            }
            L14: {
              var11 = ((ow) this).field_c[var7];
              if (-1 >= (((ow) this).field_c[var7] ^ -1)) {
                break L14;
              } else {
                param0++;
                param2[param0] = (byte)(var11 ^ -1);
                if (param4 > param0) {
                  var7 = 0;
                  break L14;
                } else {
                  return -param1 + var8 + 1;
                }
              }
            }
            L15: {
              if ((1 & var10) != 0) {
                var7 = ((ow) this).field_c[var7];
                break L15;
              } else {
                var7++;
                break L15;
              }
            }
            var11 = ((ow) this).field_c[var7];
            if (((ow) this).field_c[var7] < 0) {
              param0++;
              param2[param0] = (byte)(var11 ^ -1);
              if (param0 < param4) {
                var7 = 0;
                var8++;
                continue L0;
              } else {
                return -param1 + var8 + 1;
              }
            } else {
              var8++;
              var8++;
              continue L0;
            }
          }
        } else {
          return 0;
        }
    }

    private ow() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, ki param1, wi param2) {
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        ha.field_e = param1;
        pn.field_n = "";
        if (param0 != -18527) {
          ow.a((byte) 19);
          qn.field_e = param2;
          if (!en.field_h.startsWith("win")) {
            if (en.field_h.startsWith("linux")) {
              pn.field_n = pn.field_n + "linux/";
              if (qn.field_e.field_t) {
                pn.field_n = pn.field_n + "msjava/";
                return;
              } else {
                if (en.field_d.startsWith("amd64")) {
                  pn.field_n = pn.field_n + "x86_64/";
                  return;
                } else {
                  if (!en.field_d.startsWith("x86_64")) {
                    L0: {
                      if (en.field_d.startsWith("i386")) {
                        break L0;
                      } else {
                        if (en.field_d.startsWith("i486")) {
                          break L0;
                        } else {
                          if (en.field_d.startsWith("i586")) {
                            break L0;
                          } else {
                            if (!en.field_d.startsWith("x86")) {
                              if (en.field_d.startsWith("ppc")) {
                                pn.field_n = pn.field_n + "ppc/";
                                return;
                              } else {
                                pn.field_n = pn.field_n + "universal/";
                                return;
                              }
                            } else {
                              pn.field_n = pn.field_n + "x86/";
                              return;
                            }
                          }
                        }
                      }
                    }
                    pn.field_n = pn.field_n + "x86/";
                    return;
                  } else {
                    pn.field_n = pn.field_n + "x86_64/";
                    return;
                  }
                }
              }
            } else {
              if (en.field_h.startsWith("mac")) {
                pn.field_n = pn.field_n + "macos/";
                if (qn.field_e.field_t) {
                  pn.field_n = pn.field_n + "msjava/";
                  return;
                } else {
                  if (en.field_d.startsWith("amd64")) {
                    pn.field_n = pn.field_n + "x86_64/";
                    return;
                  } else {
                    if (!en.field_d.startsWith("x86_64")) {
                      if (!en.field_d.startsWith("i386")) {
                        if (!en.field_d.startsWith("i486")) {
                          if (en.field_d.startsWith("i586")) {
                            pn.field_n = pn.field_n + "x86/";
                            return;
                          } else {
                            if (!en.field_d.startsWith("x86")) {
                              if (en.field_d.startsWith("ppc")) {
                                pn.field_n = pn.field_n + "ppc/";
                                return;
                              } else {
                                pn.field_n = pn.field_n + "universal/";
                                return;
                              }
                            } else {
                              pn.field_n = pn.field_n + "x86/";
                              return;
                            }
                          }
                        } else {
                          pn.field_n = pn.field_n + "x86/";
                          return;
                        }
                      } else {
                        pn.field_n = pn.field_n + "x86/";
                        return;
                      }
                    } else {
                      pn.field_n = pn.field_n + "x86_64/";
                      return;
                    }
                  }
                }
              } else {
                if (!qn.field_e.field_t) {
                  if (!en.field_d.startsWith("amd64")) {
                    if (!en.field_d.startsWith("x86_64")) {
                      if (!en.field_d.startsWith("i386")) {
                        L1: {
                          if (en.field_d.startsWith("i486")) {
                            break L1;
                          } else {
                            if (en.field_d.startsWith("i586")) {
                              break L1;
                            } else {
                              if (!en.field_d.startsWith("x86")) {
                                if (en.field_d.startsWith("ppc")) {
                                  pn.field_n = pn.field_n + "ppc/";
                                  return;
                                } else {
                                  pn.field_n = pn.field_n + "universal/";
                                  return;
                                }
                              } else {
                                pn.field_n = pn.field_n + "x86/";
                                return;
                              }
                            }
                          }
                        }
                        pn.field_n = pn.field_n + "x86/";
                        return;
                      } else {
                        pn.field_n = pn.field_n + "x86/";
                        return;
                      }
                    } else {
                      pn.field_n = pn.field_n + "x86_64/";
                      return;
                    }
                  } else {
                    pn.field_n = pn.field_n + "x86_64/";
                    return;
                  }
                } else {
                  pn.field_n = pn.field_n + "msjava/";
                  return;
                }
              }
            }
          } else {
            pn.field_n = pn.field_n + "windows/";
            if (!qn.field_e.field_t) {
              L2: {
                if (en.field_d.startsWith("amd64")) {
                  break L2;
                } else {
                  if (!en.field_d.startsWith("x86_64")) {
                    if (!en.field_d.startsWith("i386")) {
                      if (!en.field_d.startsWith("i486")) {
                        if (!en.field_d.startsWith("i586")) {
                          if (!en.field_d.startsWith("x86")) {
                            if (en.field_d.startsWith("ppc")) {
                              pn.field_n = pn.field_n + "ppc/";
                              return;
                            } else {
                              pn.field_n = pn.field_n + "universal/";
                              return;
                            }
                          } else {
                            pn.field_n = pn.field_n + "x86/";
                            return;
                          }
                        } else {
                          pn.field_n = pn.field_n + "x86/";
                          return;
                        }
                      } else {
                        pn.field_n = pn.field_n + "x86/";
                        return;
                      }
                    } else {
                      pn.field_n = pn.field_n + "x86/";
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              pn.field_n = pn.field_n + "x86_64/";
              return;
            } else {
              pn.field_n = pn.field_n + "msjava/";
              return;
            }
          }
        } else {
          L3: {
            qn.field_e = param2;
            if (!en.field_h.startsWith("win")) {
              if (en.field_h.startsWith("linux")) {
                pn.field_n = pn.field_n + "linux/";
                break L3;
              } else {
                if (!en.field_h.startsWith("mac")) {
                  break L3;
                } else {
                  pn.field_n = pn.field_n + "macos/";
                  break L3;
                }
              }
            } else {
              pn.field_n = pn.field_n + "windows/";
              break L3;
            }
          }
          if (!qn.field_e.field_t) {
            if (!en.field_d.startsWith("amd64")) {
              if (!en.field_d.startsWith("x86_64")) {
                if (!en.field_d.startsWith("i386")) {
                  if (!en.field_d.startsWith("i486")) {
                    if (!en.field_d.startsWith("i586")) {
                      if (!en.field_d.startsWith("x86")) {
                        if (en.field_d.startsWith("ppc")) {
                          pn.field_n = pn.field_n + "ppc/";
                          return;
                        } else {
                          pn.field_n = pn.field_n + "universal/";
                          return;
                        }
                      } else {
                        pn.field_n = pn.field_n + "x86/";
                        return;
                      }
                    } else {
                      pn.field_n = pn.field_n + "x86/";
                      return;
                    }
                  } else {
                    pn.field_n = pn.field_n + "x86/";
                    return;
                  }
                } else {
                  pn.field_n = pn.field_n + "x86/";
                  return;
                }
              } else {
                pn.field_n = pn.field_n + "x86_64/";
                return;
              }
            } else {
              pn.field_n = pn.field_n + "x86_64/";
              return;
            }
          } else {
            pn.field_n = pn.field_n + "msjava/";
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 123) {
          field_f = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading fonts";
        field_f = new jn();
        field_b = "Email: ";
        field_d = new byte[250][];
    }
}

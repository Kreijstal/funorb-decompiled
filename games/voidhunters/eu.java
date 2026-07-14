/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu extends ev {
    private int field_j;
    private int field_g;
    private int field_k;
    static lpb field_h;
    static fcb field_i;
    private int field_f;

    final void a(int param0, byte param1, int param2) {
        if (param1 != 110) {
            ((eu) this).field_k = -72;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (qmb.field_q >= 10) {
            if (-14 > ef.field_z) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = eu.a(true);
          if (qmb.field_q >= 10) {
            if (-14 < ef.field_z) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 > 36) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L0: {
              if (2048 <= param0) {
                stackOut_9_0 = kra.field_a[-param0 + 4096];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = kra.field_a[param0];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (6144 > param0) {
                stackOut_5_0 = -kra.field_a[param0 + -4096];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = -kra.field_a[8192 + -param0];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return 103;
        }
    }

    public static void b(int param0) {
        if (param0 != 30826) {
            field_h = null;
            field_i = null;
            field_h = null;
            return;
        }
        field_i = null;
        field_h = null;
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -112) {
            ((eu) this).field_g = 94;
        }
    }

    eu(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        ((eu) this).field_k = param1;
        ((eu) this).field_f = param3;
        ((eu) this).field_j = param2;
        ((eu) this).field_g = param0;
    }

    final static void a(eab param0, byte param1, asb param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        oea.field_p = "";
        tba.field_q = param2;
        nwa.field_c = param0;
        if (fjb.field_b.startsWith("win")) {
          oea.field_p = oea.field_p + "windows/";
          var3 = -92 % ((param1 - 67) / 49);
          if (!nwa.field_c.field_j) {
            if (!fjb.field_a.startsWith("amd64")) {
              if (!fjb.field_a.startsWith("x86_64")) {
                if (!fjb.field_a.startsWith("i386")) {
                  if (!fjb.field_a.startsWith("i486")) {
                    if (!fjb.field_a.startsWith("i586")) {
                      if (!fjb.field_a.startsWith("x86")) {
                        if (fjb.field_a.startsWith("ppc")) {
                          oea.field_p = oea.field_p + "ppc/";
                          return;
                        } else {
                          oea.field_p = oea.field_p + "universal/";
                          return;
                        }
                      } else {
                        oea.field_p = oea.field_p + "x86/";
                        return;
                      }
                    } else {
                      oea.field_p = oea.field_p + "x86/";
                      return;
                    }
                  } else {
                    oea.field_p = oea.field_p + "x86/";
                    return;
                  }
                } else {
                  oea.field_p = oea.field_p + "x86/";
                  return;
                }
              } else {
                oea.field_p = oea.field_p + "x86_64/";
                return;
              }
            } else {
              oea.field_p = oea.field_p + "x86_64/";
              return;
            }
          } else {
            oea.field_p = oea.field_p + "msjava/";
            return;
          }
        } else {
          if (fjb.field_b.startsWith("linux")) {
            oea.field_p = oea.field_p + "linux/";
            var3 = -92 % ((param1 - 67) / 49);
            if (!nwa.field_c.field_j) {
              if (!fjb.field_a.startsWith("amd64")) {
                if (!fjb.field_a.startsWith("x86_64")) {
                  if (!fjb.field_a.startsWith("i386")) {
                    if (!fjb.field_a.startsWith("i486")) {
                      if (!fjb.field_a.startsWith("i586")) {
                        if (!fjb.field_a.startsWith("x86")) {
                          if (fjb.field_a.startsWith("ppc")) {
                            oea.field_p = oea.field_p + "ppc/";
                            return;
                          } else {
                            oea.field_p = oea.field_p + "universal/";
                            return;
                          }
                        } else {
                          oea.field_p = oea.field_p + "x86/";
                          return;
                        }
                      } else {
                        oea.field_p = oea.field_p + "x86/";
                        return;
                      }
                    } else {
                      oea.field_p = oea.field_p + "x86/";
                      return;
                    }
                  } else {
                    oea.field_p = oea.field_p + "x86/";
                    return;
                  }
                } else {
                  oea.field_p = oea.field_p + "x86_64/";
                  return;
                }
              } else {
                oea.field_p = oea.field_p + "x86_64/";
                return;
              }
            } else {
              oea.field_p = oea.field_p + "msjava/";
              return;
            }
          } else {
            if (fjb.field_b.startsWith("mac")) {
              oea.field_p = oea.field_p + "macos/";
              var3 = -92 % ((param1 - 67) / 49);
              if (!nwa.field_c.field_j) {
                if (!fjb.field_a.startsWith("amd64")) {
                  if (!fjb.field_a.startsWith("x86_64")) {
                    if (!fjb.field_a.startsWith("i386")) {
                      if (!fjb.field_a.startsWith("i486")) {
                        if (!fjb.field_a.startsWith("i586")) {
                          if (!fjb.field_a.startsWith("x86")) {
                            if (!fjb.field_a.startsWith("ppc")) {
                              oea.field_p = oea.field_p + "universal/";
                              return;
                            } else {
                              oea.field_p = oea.field_p + "ppc/";
                              return;
                            }
                          } else {
                            oea.field_p = oea.field_p + "x86/";
                            return;
                          }
                        } else {
                          oea.field_p = oea.field_p + "x86/";
                          return;
                        }
                      } else {
                        oea.field_p = oea.field_p + "x86/";
                        return;
                      }
                    } else {
                      oea.field_p = oea.field_p + "x86/";
                      return;
                    }
                  } else {
                    oea.field_p = oea.field_p + "x86_64/";
                    return;
                  }
                } else {
                  oea.field_p = oea.field_p + "x86_64/";
                  return;
                }
              } else {
                oea.field_p = oea.field_p + "msjava/";
                return;
              }
            } else {
              var3 = -92 % ((param1 - 67) / 49);
              if (!nwa.field_c.field_j) {
                if (!fjb.field_a.startsWith("amd64")) {
                  if (!fjb.field_a.startsWith("x86_64")) {
                    if (!fjb.field_a.startsWith("i386")) {
                      if (!fjb.field_a.startsWith("i486")) {
                        if (!fjb.field_a.startsWith("i586")) {
                          if (!fjb.field_a.startsWith("x86")) {
                            if (!fjb.field_a.startsWith("ppc")) {
                              oea.field_p = oea.field_p + "universal/";
                              return;
                            } else {
                              oea.field_p = oea.field_p + "ppc/";
                              return;
                            }
                          } else {
                            oea.field_p = oea.field_p + "x86/";
                            return;
                          }
                        } else {
                          oea.field_p = oea.field_p + "x86/";
                          return;
                        }
                      } else {
                        oea.field_p = oea.field_p + "x86/";
                        return;
                      }
                    } else {
                      oea.field_p = oea.field_p + "x86/";
                      return;
                    }
                  } else {
                    oea.field_p = oea.field_p + "x86_64/";
                    return;
                  }
                } else {
                  oea.field_p = oea.field_p + "x86_64/";
                  return;
                }
              } else {
                oea.field_p = oea.field_p + "msjava/";
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * ((eu) this).field_g >> -253875988;
        int var5 = ((eu) this).field_j * param2 >> 1372049132;
        int var6 = param1 * ((eu) this).field_k >> -1279175316;
        int var7 = param1 * ((eu) this).field_f >> -2049760308;
        ew.a(var6, var5, (byte) 84, var4, var7, ((eu) this).field_d);
        int var8 = -73 / ((param0 - -48) / 40);
    }

    static {
    }
}

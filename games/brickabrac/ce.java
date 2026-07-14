/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_g;
    static br field_b;
    static jp field_c;
    static int[][] field_a;
    static char[] field_f;
    static int field_d;
    static bi field_e;

    final static void a(int param0) {
        if (mf.field_f == null) {
          if (param0 != 224) {
            L0: {
              field_d = -126;
              if (null != sj.field_b) {
                sj.field_b.l(6457);
                break L0;
              } else {
                break L0;
              }
            }
            fl.f((byte) -83);
            return;
          } else {
            L1: {
              if (null != sj.field_b) {
                sj.field_b.l(6457);
                break L1;
              } else {
                break L1;
              }
            }
            fl.f((byte) -83);
            return;
          }
        } else {
          mf.field_f.i((byte) -36);
          if (param0 == 224) {
            L2: {
              if (null != sj.field_b) {
                sj.field_b.l(6457);
                break L2;
              } else {
                break L2;
              }
            }
            fl.f((byte) -83);
            return;
          } else {
            L3: {
              field_d = -126;
              if (null != sj.field_b) {
                sj.field_b.l(6457);
                break L3;
              } else {
                break L3;
              }
            }
            fl.f((byte) -83);
            return;
          }
        }
    }

    final static void a(boolean param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (nq.field_p) {
          L0: {
            wd.field_w.a(param0, -15211);
            var4 = hd.field_a.i(28) ? 1 : 0;
            if (0 == ki.field_e) {
              break L0;
            } else {
              if (var4 == 0) {
                th.b(1);
                param0 = false;
                break L0;
              } else {
                if (param0) {
                  L1: {
                    hd.field_a.a(38, param3, param1);
                    if (var4 != 0) {
                      wd.field_w.a(param0, -15211);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (param2 < 89) {
                    L2: {
                      field_e = null;
                      var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
                      if (var5 <= 640) {
                        if (635 > var5) {
                          if (-1 > (ah.field_v ^ -1)) {
                            ah.field_v = ah.field_v - 5;
                            break L2;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        ah.field_v = ah.field_v + 5;
                        break L2;
                      }
                    }
                    return;
                  } else {
                    var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
                    if (var5 <= 640) {
                      if (635 > var5) {
                        if (-1 >= ah.field_v) {
                          return;
                        } else {
                          ah.field_v = ah.field_v - 5;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ah.field_v = ah.field_v + 5;
                      return;
                    }
                  }
                } else {
                  L3: {
                    if (var4 != 0) {
                      wd.field_w.a(param0, -15211);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param2 >= 89) {
                      break L4;
                    } else {
                      field_e = null;
                      break L4;
                    }
                  }
                  var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
                  if (var5 <= 640) {
                    if (635 > var5) {
                      if (-1 >= ah.field_v) {
                        return;
                      } else {
                        ah.field_v = ah.field_v - 5;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ah.field_v = ah.field_v + 5;
                    return;
                  }
                }
              }
            }
          }
          if (!param0) {
            L5: {
              if (var4 != 0) {
                wd.field_w.a(param0, -15211);
                break L5;
              } else {
                break L5;
              }
            }
            if (param2 >= 89) {
              var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
              if (var5 <= 640) {
                L6: {
                  if (635 <= var5) {
                    break L6;
                  } else {
                    if (-1 > (ah.field_v ^ -1)) {
                      ah.field_v = ah.field_v - 5;
                      break L6;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                ah.field_v = ah.field_v + 5;
                return;
              }
            } else {
              field_e = null;
              var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
              if (var5 <= 640) {
                L7: {
                  if (635 <= var5) {
                    break L7;
                  } else {
                    if (-1 > (ah.field_v ^ -1)) {
                      ah.field_v = ah.field_v - 5;
                      break L7;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                ah.field_v = ah.field_v + 5;
                return;
              }
            }
          } else {
            L8: {
              hd.field_a.a(38, param3, param1);
              if (var4 != 0) {
                wd.field_w.a(param0, -15211);
                break L8;
              } else {
                break L8;
              }
            }
            if (param2 >= 89) {
              var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
              if (var5 <= 640) {
                L9: {
                  if (635 <= var5) {
                    break L9;
                  } else {
                    if (-1 > (ah.field_v ^ -1)) {
                      ah.field_v = ah.field_v - 5;
                      break L9;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                ah.field_v = ah.field_v + 5;
                return;
              }
            } else {
              field_e = null;
              var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
              if (var5 <= 640) {
                L10: {
                  if (635 <= var5) {
                    break L10;
                  } else {
                    if (-1 > (ah.field_v ^ -1)) {
                      ah.field_v = ah.field_v - 5;
                      break L10;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                ah.field_v = ah.field_v + 5;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 < 16) {
            return;
        }
        field_f = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> wants to join";
        field_f = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_d = 65;
    }
}

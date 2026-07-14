/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static String field_c;
    static int field_b;
    static String field_a;

    final static kk a(byte param0, int param1, nh param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        if (param0 > 71) {
          var4 = param2.a(-6635, param1);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new kk(var4);
          }
        } else {
          int discarded$2 = dl.a(-15, -114);
          var4 = param2.a(-6635, param1);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new kk(var4);
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_a = null;
        if (param0 != 51) {
          var2 = null;
          kk discarded$2 = dl.a((byte) -53, -32, (nh) null);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        ba.field_f = 0;
        qi.field_e = null;
        pe.field_l = null;
        var2 = lk.field_T;
        lk.field_T = bf.field_k;
        if ((param1 ^ -1) == -52) {
          hb.field_a.field_c = 2;
          hb.field_a.field_h = hb.field_a.field_h + 1;
          bf.field_k = var2;
          if (-3 < hb.field_a.field_h) {
            if (-3 > hb.field_a.field_h) {
              if ((hb.field_a.field_h ^ -1) > param0) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (50 == param1) {
                return 5;
              } else {
                if ((hb.field_a.field_h ^ -1) > param0) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (51 == param1) {
              return 2;
            } else {
              if (-3 > hb.field_a.field_h) {
                if (hb.field_a.field_h > param0) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param1) {
                  return 5;
                } else {
                  if ((hb.field_a.field_h ^ -1) > param0) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          if (param1 == 50) {
            hb.field_a.field_c = 5;
            hb.field_a.field_h = hb.field_a.field_h + 1;
            bf.field_k = var2;
            if (-3 < hb.field_a.field_h) {
              if (-3 > hb.field_a.field_h) {
                if ((hb.field_a.field_h ^ -1) <= param0) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (50 != param1) {
                  if ((hb.field_a.field_h ^ -1) > param0) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              }
            } else {
              if (51 != param1) {
                if (-3 <= hb.field_a.field_h) {
                  if (50 == param1) {
                    return 5;
                  } else {
                    if (hb.field_a.field_h <= param0) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if ((hb.field_a.field_h ^ -1) <= param0) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                return 2;
              }
            }
          } else {
            hb.field_a.field_c = 1;
            hb.field_a.field_h = hb.field_a.field_h + 1;
            bf.field_k = var2;
            if (-3 >= hb.field_a.field_h) {
              if (51 == param1) {
                return 2;
              } else {
                if (-3 <= hb.field_a.field_h) {
                  if (50 == param1) {
                    return 5;
                  } else {
                    if ((hb.field_a.field_h ^ -1) <= param0) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if ((hb.field_a.field_h ^ -1) <= param0) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              if (-3 > hb.field_a.field_h) {
                if (hb.field_a.field_h <= param0) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (50 != param1) {
                  if ((hb.field_a.field_h ^ -1) <= param0) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<col=FF0000>Defence -1</col>";
        field_b = 0;
        field_a = "Password is valid";
    }
}

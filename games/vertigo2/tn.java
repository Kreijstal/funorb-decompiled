/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn {
    String field_k;
    int field_h;
    boolean field_n;
    static fe field_i;
    String field_d;
    static String field_r;
    static int field_c;
    int field_s;
    int field_q;
    static int field_j;
    long field_b;
    static long field_p;
    int field_m;
    String field_l;
    int[] field_f;
    String field_a;
    static String field_g;
    cr field_e;
    int field_o;

    final static er a(String param0, r param1, int param2, String param3) {
        int var4 = param1.a((byte) 118, param3);
        int var5 = param1.a(var4, param0, 98);
        if (param2 > -70) {
            return null;
        }
        return cr.a(var5, param1, (byte) -117, var4);
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 55) {
            field_p = -63L;
        }
        vm.field_c = param1;
        s.field_u = param0;
    }

    final int a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = 31 / ((-37 - param0) / 43);
          if (((tn) this).field_n) {
            break L0;
          } else {
            L1: {
              if (((tn) this).field_s != 2) {
                break L1;
              } else {
                if (-1 <= (((tn) this).field_h ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (((tn) this).field_b == ao.field_N) {
              return 1;
            } else {
              L2: {
                if (ba.field_d != 2) {
                  break L2;
                } else {
                  if (!c.a(((tn) this).field_a, (byte) -49)) {
                    break L2;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            }
          }
        }
        return 2;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param0 < 2) {
            break L0;
          } else {
            if (36 < param0) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              if (param3 <= -126) {
                L1: while (true) {
                  if (var8 >= var7) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param2.charAt(var8);
                      if (0 == var8) {
                        if (45 != var9) {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param1) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        } else {
                          var4 = 1;
                          var8++;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (var9 > 57) {
                            break L4;
                          } else {
                            var9 -= 48;
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (65 > var9) {
                          break L5;
                        } else {
                          if (90 >= var9) {
                            var9 -= 55;
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var9 < 97) {
                        return false;
                      } else {
                        if (122 >= var9) {
                          var9 -= 87;
                          break L3;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (param0 > var9) {
                      L6: {
                        if (var4 == 0) {
                          break L6;
                        } else {
                          var9 = -var9;
                          break L6;
                        }
                      }
                      var10 = var9 + var6 * param0;
                      if (var10 / param0 == var6) {
                        var6 = var10;
                        var5 = 1;
                        var8++;
                        continue L1;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    final static void a(lq param0, String param1, cc param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          if (param3 >= 16) {
            break L0;
          } else {
            field_c = 15;
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (var7 >= param1.length()) {
            return;
          } else {
            L2: {
              var8 = param1.charAt(var7);
              if (var8 == 60) {
                var6 = (var5 >> -398778200) + (param0.field_c[0] + param2.c(param1.substring(0, var7)));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 != var6) {
                param0.field_c[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (32 == var8) {
                    var5 = var5 + param4;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param0.field_c[var7] = (var5 >> -1487091512) + (param0.field_c[0] - -param2.c(param1.substring(0, 1 + var7)) - param2.a((char) var8));
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 >= -76) {
            return;
        }
        field_r = null;
        field_g = null;
    }

    tn(boolean param0) {
        ((tn) this).field_k = ad.field_a;
        ((tn) this).field_l = sp.field_U;
        ((tn) this).field_q = tj.field_b;
        if (param0) {
            ((tn) this).field_f = sd.field_P;
        } else {
            ((tn) this).field_f = null;
        }
        ((tn) this).field_s = ln.field_c;
        ((tn) this).field_h = rq.field_u;
        ((tn) this).field_m = qf.field_a;
        ((tn) this).field_b = ug.field_a;
        ((tn) this).field_n = cb.field_Ib;
        ((tn) this).field_a = fd.field_p;
        ((tn) this).field_d = tj.field_a;
        ((tn) this).field_o = ck.field_J;
    }

    tn(int param0, String param1, int param2, String param3, String param4) {
        ((tn) this).field_a = param1;
        ((tn) this).field_f = null;
        ((tn) this).field_h = 0;
        ((tn) this).field_s = param0;
        ((tn) this).field_d = param4;
        ((tn) this).field_m = 0;
        ((tn) this).field_n = true;
        ((tn) this).field_l = param1;
        ((tn) this).field_b = 0L;
        ((tn) this).field_o = 0;
        ((tn) this).field_q = param2;
        ((tn) this).field_k = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 32;
        field_j = 0;
        field_r = "Connecting to<br>friend server...";
        field_g = "<%0>";
    }
}

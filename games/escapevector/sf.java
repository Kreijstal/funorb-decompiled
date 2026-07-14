/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private int field_q;
    private int field_r;
    private int field_h;
    private int field_g;
    private int field_l;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    static hf field_d;
    private int field_p;
    static int[] field_m;
    static String field_n;
    static int field_c;
    private int field_k;
    static ed[] field_b;
    private int field_o;
    static hh[] field_e;

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!fd.a(true, param1.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!fd.a(true, param1.charAt(var3 - 1))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if (var4 >= 1) {
                if (12 >= var4) {
                  L4: {
                    var5 = new StringBuilder(var4);
                    if (param0 <= -65) {
                      break L4;
                    } else {
                      sf.a(true);
                      break L4;
                    }
                  }
                  var6 = var2;
                  L5: while (true) {
                    if (var6 >= var3) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param1.charAt(var6);
                      if (d.a((char) var7, -11217)) {
                        var8 = eo.a(227, (char) var7);
                        if (0 != var8) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void b(int param0, int param1) {
        ((sf) this).field_a = ((sf) this).field_a + param1;
        ((sf) this).field_j = ((sf) this).field_j + param1;
        ((sf) this).field_l = ((sf) this).field_l + param1;
        ((sf) this).field_h = ((sf) this).field_h + param1;
        ((sf) this).field_f = ((sf) this).field_f + param1;
        ((sf) this).field_r = ((sf) this).field_r + param1;
        if (param0 != -1) {
            field_d = null;
        }
        ((sf) this).field_o = ((sf) this).field_o + param1;
        ((sf) this).field_j = ((sf) this).field_j + param1;
    }

    private final void c(int param0, int param1) {
        if (param0 != 136) {
            ((sf) this).d(42, -12);
            return;
        }
    }

    final void a(int param0, int param1) {
        if (param1 != 3748) {
            return;
        }
        ((sf) this).field_q = ((sf) this).field_q | 1 << param0;
    }

    final int[] c(int param0) {
        if (param0 != 0) {
            ((sf) this).a((byte) -83);
        }
        this.c(136, this.b(param0 ^ -1));
        return new int[]{((sf) this).field_j, ((sf) this).field_l, ((sf) this).field_q, ((sf) this).field_o};
    }

    final void d(int param0, int param1) {
        if (param1 != 136) {
            ((sf) this).a((byte) 23);
        }
        ((sf) this).field_r = ((sf) this).field_r + param0;
    }

    final int[] d(int param0) {
        if (param0 != 31304) {
            int[] discarded$0 = ((sf) this).c(97);
        }
        this.c(param0 + -31168, this.b(-1));
        return new int[]{((sf) this).field_j, ((sf) this).field_l, 0, ((sf) this).field_o};
    }

    private final int b(int param0) {
        oe var2 = ma.field_a;
        if (var2 == null) {
            return 0;
        }
        int var3 = var2.field_ob;
        int var4 = var2.field_fc;
        var3 = tj.a(var4, (byte) 126, var3);
        if (param0 != -1) {
            ((sf) this).b(90, -103);
        }
        return var3;
    }

    final void a(byte param0) {
        int var2 = -78 / ((param0 - -73) / 35);
        ((sf) this).field_f = ((sf) this).field_f + ((sf) this).field_p;
        ((sf) this).field_h = ((sf) this).field_h + ((sf) this).field_i;
        ((sf) this).field_j = ((sf) this).field_j + ((sf) this).field_g;
        ((sf) this).field_r = ((sf) this).field_r + ((sf) this).field_p;
        ((sf) this).field_l = ((sf) this).field_l + ((sf) this).field_g;
        ((sf) this).field_a = ((sf) this).field_a + ((sf) this).field_i;
        ((sf) this).field_j = ((sf) this).field_j + ((sf) this).field_k;
        ((sf) this).field_o = ((sf) this).field_o + ((sf) this).field_k;
    }

    final static tk a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = EscapeVector.field_A;
        var2 = param0.length();
        if (-1 == var2) {
          return mf.field_d;
        } else {
          if (-65 < var2) {
            return d.field_c;
          } else {
            if (34 == param0.charAt(0)) {
              if (param0.charAt(var2 - 1) == 34) {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (var4 < var2 - 1) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L1;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (34 != var5) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            return wh.field_p;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return wh.field_p;
              }
            } else {
              if (param1 == 119) {
                var3 = 0;
                var4 = 0;
                L3: while (true) {
                  if (var4 < var2) {
                    var5 = param0.charAt(var4);
                    if (var5 == 46) {
                      L4: {
                        if (var4 == 0) {
                          break L4;
                        } else {
                          if (var2 + -1 == var4) {
                            break L4;
                          } else {
                            if (var3 == 0) {
                              var3 = 1;
                              var4++;
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      return wh.field_p;
                    } else {
                      if (en.field_g.indexOf(var5) == -1) {
                        return wh.field_p;
                      } else {
                        var3 = 0;
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final int[] a(int param0) {
        this.c(136, this.b(-1));
        int var2 = 0 / ((1 - param0) / 35);
        return new int[]{((sf) this).field_r, ((sf) this).field_h, ((sf) this).field_f, ((sf) this).field_a};
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0) {
            Object var2 = null;
            String discarded$0 = sf.a(27, (CharSequence) null);
        }
        field_n = null;
        field_m = null;
    }

    sf(int param0) {
        ((sf) this).field_h = 136;
        ((sf) this).field_g = 203;
        ((sf) this).field_a = 10;
        ((sf) this).field_f = 30589;
        ((sf) this).field_l = 247;
        ((sf) this).field_j = 201;
        ((sf) this).field_i = 50;
        ((sf) this).field_q = 0;
        ((sf) this).field_p = 65;
        ((sf) this).field_o = 10325;
        ((sf) this).field_k = 7;
        ((sf) this).field_r = 138;
        ((sf) this).b(-1, param0);
        ((sf) this).a((byte) -19);
        this.c(136, this.b(-1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hf();
        field_n = "Legend";
        field_c = 0;
        field_m = new int[4];
        field_e = new hh[17];
    }
}

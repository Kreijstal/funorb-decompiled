/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends a {
    static int field_r;
    static le[] field_t;
    static int field_v;
    static int[] field_u;
    private hc[] field_s;
    private hc field_q;

    public ak() {
        ((ak) this).field_s = new hc[6];
        ((ak) this).field_q = new hc();
        ((ak) this).field_s[0] = new hc();
        hc var1 = new hc();
        var1.a(0);
    }

    ak(ak param0, boolean param1) {
        this();
        param0.a(124, (ak) this, param1);
    }

    final void a(le[] param0, int param1, int param2) {
        if (param1 != 4986) {
            ((ak) this).field_q = null;
        }
        int var4 = param2;
        if (((ak) this).field_s[var4] == null) {
            ((ak) this).field_s[var4] = new hc();
        }
        ((ak) this).field_s[param2].field_e = param0;
    }

    final void a(le[] param0, int param1) {
        hc[] var3 = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 250) {
          var7 = ((ak) this).field_s;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_e = param0;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, ak param1, boolean param2) {
        int var4 = 0;
        hc var5 = null;
        hc var6 = null;
        int var7 = 0;
        hc stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        hc stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        hc stackIn_8_2 = null;
        hc stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        hc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        hc stackOut_7_2 = null;
        hc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        hc stackOut_6_2 = null;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          super.a(false, (a) (Object) param1);
          if (param2) {
            var4 = 0;
            L1: while (true) {
              if (6 <= var4) {
                break L0;
              } else {
                var5 = ((ak) this).field_s[var4];
                if (var5 == null) {
                  param1.field_s[var4] = null;
                  var4++;
                  continue L1;
                } else {
                  L2: {
                    var6 = param1.field_s[var4];
                    stackOut_5_0 = (hc) var5;
                    stackOut_5_1 = 124;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var6 == null) {
                      param1.field_s[var4] = new hc();
                      stackOut_7_0 = (hc) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = new hc();
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L2;
                    } else {
                      stackOut_6_0 = (hc) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = (hc) var6;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L2;
                    }
                  }
                  ((hc) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2);
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            gl.a((Object[]) (Object) ((ak) this).field_s, 0, (Object[]) (Object) param1.field_s, 0, 6);
            break L0;
          }
        }
        L3: {
          if (param0 >= 100) {
            break L3;
          } else {
            ak.a((byte) -47);
            break L3;
          }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = MonkeyPuzzle2.field_F ? 1 : 0;
            if (param0 <= (param1 ^ -1)) {
              break L1;
            } else {
              if (128 > param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 < 160) {
              if (param1 == 0) {
                break L2;
              } else {
                var6 = sb.field_n;
                var2 = var6;
                var3 = 0;
                L3: while (true) {
                  if (var6.length <= var3) {
                    break L2;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L3;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              if (255 >= param1) {
                break L0;
              } else {
                if (param1 == 0) {
                  break L2;
                } else {
                  var6 = sb.field_n;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var6.length <= var3) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L4;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        }
        return true;
    }

    public static void c(int param0) {
        if (param0 != -1) {
            ak.a((byte) -46);
        }
        field_u = null;
        field_t = null;
    }

    final void a(byte param0, le param1) {
        hc[] var3 = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var7 = ((ak) this).field_s;
        var3 = var7;
        var4 = 0;
        if (param0 == 1) {
          L0: while (true) {
            if (var4 >= var7.length) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_a = param1;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (uj.field_i != -ea.field_b + 0) {
            if (uj.field_i == -ea.field_b + 250) {
            }
        }
        if (param0 != 99) {
            return;
        }
        uj.field_i = uj.field_i + 1;
    }

    final hc a(byte param0, int param1) {
        if (param0 != -102) {
            field_t = null;
        }
        ((ak) this).field_s[param1] = new hc();
        return new hc();
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        hc var7 = null;
        hc var9 = null;
        Object var10 = null;
        t var11 = null;
        hc var12 = null;
        hc var13 = null;
        hc var14 = null;
        hc var15 = null;
        we stackIn_3_0 = null;
        we stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof t) {
            stackOut_2_0 = (we) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (we) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (t) (Object) stackIn_3_0;
          qi.a(param1.field_r + param3 + param1.field_l, true, param1.field_p + param1.field_e + param2, param1.field_r + param3, param2 + param1.field_e);
          if (var11 == null) {
            break L1;
          } else {
            param0 = param0 & var11.field_w;
            break L1;
          }
        }
        L2: {
          if (param4 >= 19) {
            break L2;
          } else {
            var10 = null;
            this.a(123, (ak) null, false);
            break L2;
          }
        }
        L3: {
          var7 = ((ak) this).field_s[0];
          ((ak) this).field_q.a(0);
          var7.a(param3, (ak) this, param2, 84, param1, ((ak) this).field_q);
          if (var11 == null) {
            break L3;
          } else {
            L4: {
              if (var11.field_u) {
                var12 = ((ak) this).field_s[1];
                if (var12 == null) {
                  break L4;
                } else {
                  var12.a(param3, (ak) this, param2, 112, param1, ((ak) this).field_q);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (var11.field_g) {
              L5: {
                var13 = ((ak) this).field_s[3];
                if (var11.field_t == 0) {
                  break L5;
                } else {
                  if (var13 != null) {
                    var13.a(param3, (ak) this, param2, 100, param1, ((ak) this).field_q);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var9 = ((ak) this).field_s[2];
              if (var9 != null) {
                var9.a(param3, (ak) this, param2, 115, param1, ((ak) this).field_q);
                break L3;
              } else {
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L6: {
          if (!param1.b((byte) 56)) {
            break L6;
          } else {
            var14 = ((ak) this).field_s[5];
            if (var14 != null) {
              var14.a(param3, (ak) this, param2, 114, param1, ((ak) this).field_q);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (param0) {
            break L7;
          } else {
            var15 = ((ak) this).field_s[4];
            if (var15 != null) {
              var15.a(param3, (ak) this, param2, 120, param1, ((ak) this).field_q);
              break L7;
            } else {
              break L7;
            }
          }
        }
        ((ak) this).field_q.a((ak) this, param1, (byte) -2, param2, param3);
        tj.b(653);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
        field_v = 2;
    }
}

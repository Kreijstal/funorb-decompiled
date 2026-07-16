/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends lb {
    static int field_u;
    static int field_v;
    static String field_q;
    static String field_t;
    static ko[] field_x;
    private pm field_w;
    static int field_s;
    static String field_y;
    private pm[] field_r;

    public static void b(int param0) {
        field_t = null;
        field_x = null;
        field_y = null;
        field_q = null;
        if (param0 != -5082) {
            field_y = null;
        }
    }

    fk(fk param0, boolean param1) {
        this();
        param0.a((fk) this, 6, param1);
    }

    final static ce a(boolean param0, String param1) {
        Object var2 = null;
        ce var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = CrazyCrystals.field_B;
        if (vl.field_d != null) {
          L0: {
            var6 = (CharSequence) (Object) param1;
            var2 = (Object) (Object) fe.a(60136, var6);
            if (var2 == null) {
              var2 = (Object) (Object) var6;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = (ce) (Object) vl.field_d.a((long)((String) var2).hashCode(), param0);
          L1: while (true) {
            if (var3 != null) {
              L2: {
                var7 = (CharSequence) (Object) var3.field_fb;
                var4 = fe.a(60136, var7);
                if (var4 == null) {
                  var4 = var3.field_fb;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var4.equals(var2)) {
                return var3;
              } else {
                var3 = (ce) (Object) vl.field_d.b(50);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public fk() {
        ((fk) this).field_r = new pm[6];
        ((fk) this).field_w = new pm();
        pm dupTemp$0 = new pm();
        ((fk) this).field_r[0] = dupTemp$0;
        pm var1 = dupTemp$0;
        var1.a(0);
    }

    final void a(int param0, int param1, dl[] param2) {
        int var4 = param0;
        if (!(((fk) this).field_r[var4] != null)) {
            ((fk) this).field_r[var4] = new pm();
        }
        if (param1 != 0) {
            ((fk) this).field_r = null;
        }
        ((fk) this).field_r[param0].field_k = param2;
    }

    final void a(dl[] param0, int param1) {
        pm[] var3 = null;
        int var4 = 0;
        pm var5 = null;
        int var6 = 0;
        pm[] var7 = null;
        var6 = CrazyCrystals.field_B;
        var7 = ((fk) this).field_r;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(fk param0, int param1, boolean param2) {
        int var4 = 0;
        pm var5 = null;
        pm var6 = null;
        int var7 = 0;
        pm stackIn_8_0 = null;
        pm stackIn_9_0 = null;
        pm stackIn_10_0 = null;
        pm stackIn_10_1 = null;
        pm stackOut_7_0 = null;
        pm stackOut_9_0 = null;
        pm stackOut_9_1 = null;
        pm stackOut_8_0 = null;
        pm stackOut_8_1 = null;
        var7 = CrazyCrystals.field_B;
        if (param1 == 6) {
          L0: {
            super.a((byte) 119, (lb) (Object) param0);
            if (param2) {
              var4 = 0;
              L1: while (true) {
                if (6 <= var4) {
                  break L0;
                } else {
                  var5 = ((fk) this).field_r[var4];
                  if (var5 == null) {
                    param0.field_r[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = param0.field_r[var4];
                      stackOut_7_0 = (pm) var5;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var6 == null) {
                        pm dupTemp$49 = new pm();
                        param0.field_r[var4] = dupTemp$49;
                        stackOut_9_0 = (pm) (Object) stackIn_9_0;
                        stackOut_9_1 = (pm) dupTemp$49;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        stackOut_8_0 = (pm) (Object) stackIn_8_0;
                        stackOut_8_1 = (pm) var6;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L2;
                      }
                    }
                    ((pm) (Object) stackIn_10_0).a(stackIn_10_1, -127);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              eg.a((Object[]) (Object) ((fk) this).field_r, 0, (Object[]) (Object) param0.field_r, 0, 6);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(dl param0, int param1) {
        pm[] var3 = null;
        int var4 = 0;
        pm var5 = null;
        int var6 = 0;
        pm[] var7 = null;
        L0: {
          var6 = CrazyCrystals.field_B;
          if (param1 == -13869) {
            break L0;
          } else {
            pm discarded$2 = ((fk) this).a((byte) 78, -108);
            break L0;
          }
        }
        var7 = ((fk) this).field_r;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_h = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final pm a(byte param0, int param1) {
        int var3 = 2 / ((param0 - -73) / 46);
        pm dupTemp$0 = new pm();
        ((fk) this).field_r[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        pm var7 = null;
        pm var9 = null;
        pc var10 = null;
        pm var11 = null;
        pm var12 = null;
        pm var13 = null;
        pm var14 = null;
        qm stackIn_5_0 = null;
        Object stackOut_4_0 = null;
        qm stackOut_3_0 = null;
        if (!param1) {
          L0: {
            if (!(param3 instanceof pc)) {
              stackOut_4_0 = null;
              stackIn_5_0 = (qm) (Object) stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = (qm) param3;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var10 = (pc) (Object) stackIn_5_0;
            qp.a(param2 + param3.field_r, param0 - (-param3.field_j - param3.field_f), param3.field_r + param2 + param3.field_g, (byte) 73, param0 + param3.field_j);
            if (var10 != null) {
              param4 = param4 & var10.field_x;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var7 = ((fk) this).field_r[0];
            ((fk) this).field_w.a(0);
            var7.a((fk) this, param0, -101, param3, param2, ((fk) this).field_w);
            if (var10 != null) {
              L3: {
                if (var10.field_A) {
                  var11 = ((fk) this).field_r[1];
                  if (var11 == null) {
                    break L3;
                  } else {
                    var11.a((fk) this, param0, -49, param3, param2, ((fk) this).field_w);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (var10.field_m) {
                L4: {
                  var12 = ((fk) this).field_r[3];
                  if (-1 == (var10.field_s ^ -1)) {
                    break L4;
                  } else {
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a((fk) this, param0, -73, param3, param2, ((fk) this).field_w);
                      break L2;
                    }
                  }
                }
                var9 = ((fk) this).field_r[2];
                if (var9 != null) {
                  var9.a((fk) this, param0, -39, param3, param2, ((fk) this).field_w);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (param3.e(-122)) {
              var13 = ((fk) this).field_r[5];
              if (var13 == null) {
                break L5;
              } else {
                var13.a((fk) this, param0, -106, param3, param2, ((fk) this).field_w);
                break L5;
              }
            } else {
              break L5;
            }
          }
          L6: {
            if (!param4) {
              var14 = ((fk) this).field_r[4];
              if (var14 != null) {
                var14.a((fk) this, param0, 16, param3, param2, ((fk) this).field_w);
                break L6;
              } else {
                break L6;
              }
            } else {
              break L6;
            }
          }
          ((fk) this).field_w.a((fk) this, param2, param3, param0, 36);
          lg.a(1);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "This password contains repeated characters, and would be easy to guess";
        field_y = "Discard";
        field_t = "ON";
    }
}

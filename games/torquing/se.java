/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends pc {
    private v field_r;
    private v[] field_q;

    final static byte[] a(byte param0, String param1) {
        if (param0 != -33) {
            return null;
        }
        return fm.field_F.a(-115, param1, "");
    }

    public se() {
        ((se) this).field_q = new v[6];
        ((se) this).field_r = new v();
        v dupTemp$0 = new v();
        ((se) this).field_q[0] = dupTemp$0;
        v var1 = dupTemp$0;
        var1.b((byte) -99);
    }

    final void a(int param0, t[] param1) {
        v[] var3 = null;
        int var4 = 0;
        v var5 = null;
        int var6 = 0;
        v[] var7 = null;
        var6 = Torquing.field_u;
        var7 = ((se) this).field_q;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(t[] param0, int param1, byte param2) {
        int var4 = param1;
        if (null == ((se) this).field_q[var4]) {
            ((se) this).field_q[var4] = new v();
        }
        if (param2 < 82) {
            Object var5 = null;
            ((se) this).a(27, 50, 123, true, (gm) null);
        }
        ((se) this).field_q[param1].field_g = param0;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        v var7 = null;
        v var9 = null;
        Object var10 = null;
        lg var11 = null;
        v var12 = null;
        v var13 = null;
        v var14 = null;
        v var15 = null;
        gm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        gm stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof lg)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (gm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (gm) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (lg) (Object) stackIn_3_0;
          ld.a(param4.field_p + (param4.field_w + param2), param4.field_w + param2, param1 - (-param4.field_k + -param4.field_o), param4.field_k + param1, (byte) -108);
          if (param0 >= 89) {
            break L1;
          } else {
            var10 = null;
            ((se) this).a((byte) 52, (t) null);
            break L1;
          }
        }
        L2: {
          if (var11 != null) {
            param3 = param3 & var11.field_x;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var7 = ((se) this).field_q[0];
          ((se) this).field_r.b((byte) -88);
          var7.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
          if (var11 == null) {
            break L3;
          } else {
            L4: {
              if (!var11.field_A) {
                break L4;
              } else {
                var12 = ((se) this).field_q[1];
                if (var12 != null) {
                  var12.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (var11.field_s) {
              L5: {
                var13 = ((se) this).field_q[3];
                if (0 == var11.field_l) {
                  break L5;
                } else {
                  if (var13 == null) {
                    break L5;
                  } else {
                    var13.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
                    break L3;
                  }
                }
              }
              var9 = ((se) this).field_q[2];
              if (var9 != null) {
                var9.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
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
          if (!param4.g(2)) {
            break L6;
          } else {
            var14 = ((se) this).field_q[5];
            if (var14 == null) {
              break L6;
            } else {
              var14.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
              break L6;
            }
          }
        }
        L7: {
          if (!param3) {
            var15 = ((se) this).field_q[4];
            if (var15 == null) {
              break L7;
            } else {
              var15.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((se) this).field_r.a(param1, (se) this, param4, param2, (byte) 113);
        r.a(122);
    }

    final void a(byte param0, t param1) {
        v[] var3 = null;
        int var4 = 0;
        v var5 = null;
        int var6 = 0;
        Object var7 = null;
        v[] var8 = null;
        L0: {
          var6 = Torquing.field_u;
          var8 = ((se) this).field_q;
          var3 = var8;
          if (param0 == -57) {
            break L0;
          } else {
            var7 = null;
            byte[] discarded$2 = se.a((byte) -119, (String) null);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var8.length) {
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_f = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    se(se param0, boolean param1) {
        this();
        param0.a((se) this, 6, param1);
    }

    private final void a(se param0, int param1, boolean param2) {
        int var4 = 0;
        v var5 = null;
        v var6 = null;
        int var7 = 0;
        v stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        v stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        v stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        v stackIn_10_2 = null;
        v stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        v stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        v stackOut_9_2 = null;
        v stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        v stackOut_8_2 = null;
        L0: {
          var7 = Torquing.field_u;
          super.a(90, (pc) (Object) param0);
          if (param1 == 6) {
            break L0;
          } else {
            v discarded$3 = ((se) this).a(57, -12);
            break L0;
          }
        }
        L1: {
          if (!param2) {
            dk.a((Object[]) (Object) ((se) this).field_q, 0, (Object[]) (Object) param0.field_q, 0, 6);
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (6 <= var4) {
                break L1;
              } else {
                var5 = ((se) this).field_q[var4];
                if (var5 != null) {
                  L3: {
                    var6 = param0.field_q[var4];
                    stackOut_7_0 = (v) var5;
                    stackOut_7_1 = -85;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var6 == null) {
                      v dupTemp$4 = new v();
                      param0.field_q[var4] = dupTemp$4;
                      stackOut_9_0 = (v) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (v) dupTemp$4;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L3;
                    } else {
                      stackOut_8_0 = (v) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = (v) var6;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L3;
                    }
                  }
                  ((v) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2);
                  var4++;
                  continue L2;
                } else {
                  param0.field_q[var4] = null;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final v a(int param0, int param1) {
        if (param1 != 4) {
            Object var4 = null;
            this.a((se) null, 7, true);
        }
        v dupTemp$0 = new v();
        ((se) this).field_q[param0] = dupTemp$0;
        return dupTemp$0;
    }

    static {
    }
}

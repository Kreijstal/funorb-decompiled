/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ll {
    static int field_s;
    static lg field_r;
    private la field_p;
    private la[] field_t;
    static oi field_q;

    final void a(byte param0, o[] param1) {
        la[] var3 = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        var6 = wizardrun.field_H;
        if (param0 == 11) {
          var7 = ((qa) this).field_t;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var7.length) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_j = param1;
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

    qa(qa param0, boolean param1) {
        this();
        param0.a(0, param1, (qa) this);
    }

    final la a(int param0, int param1) {
        if (param0 != 0) {
            qa.c(23);
        }
        ((qa) this).field_t[param1] = new la();
        return new la();
    }

    public static void b(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != -10059) {
            field_q = null;
        }
    }

    final static void c(int param0) {
        if (jd.field_f != -pe.field_B + 0) {
            if (250 + -pe.field_B != jd.field_f) {
            }
        }
        if (param0 != 250) {
            field_q = null;
        }
        jd.field_f = jd.field_f + 1;
    }

    public qa() {
        ((qa) this).field_t = new la[6];
        ((qa) this).field_p = new la();
        ((qa) this).field_t[0] = new la();
        la var1 = new la();
        var1.a(0);
    }

    final void a(int param0, o[] param1, byte param2) {
        int var4 = -120 / ((43 - param2) / 36);
        int var5 = param0;
        if (!(((qa) this).field_t[var5] != null)) {
            ((qa) this).field_t[var5] = new la();
        }
        ((qa) this).field_t[param0].field_j = param1;
    }

    final void a(byte param0, o param1) {
        la[] var3 = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        L0: {
          var6 = wizardrun.field_H;
          if (param0 >= 46) {
            break L0;
          } else {
            la discarded$2 = ((qa) this).a(-74, -15);
            break L0;
          }
        }
        var7 = ((qa) this).field_t;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_i = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, boolean param1, qa param2) {
        int var4 = 0;
        la var5 = null;
        la var6 = null;
        int var7 = 0;
        la stackIn_7_0 = null;
        la stackIn_8_0 = null;
        la stackIn_9_0 = null;
        la stackIn_9_1 = null;
        la stackOut_6_0 = null;
        la stackOut_8_0 = null;
        la stackOut_8_1 = null;
        la stackOut_7_0 = null;
        la stackOut_7_1 = null;
        L0: {
          var7 = wizardrun.field_H;
          super.a((ll) (Object) param2, param0);
          if (param1) {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -7) {
                break L0;
              } else {
                var5 = ((qa) this).field_t[var4];
                if (var5 != null) {
                  L2: {
                    var6 = param2.field_t[var4];
                    stackOut_6_0 = (la) var5;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 == null) {
                      param2.field_t[var4] = new la();
                      stackOut_8_0 = (la) (Object) stackIn_8_0;
                      stackOut_8_1 = new la();
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = (la) (Object) stackIn_7_0;
                      stackOut_7_1 = (la) var6;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  ((la) (Object) stackIn_9_0).a(stackIn_9_1, (byte) -26);
                  var4++;
                  continue L1;
                } else {
                  param2.field_t[var4] = null;
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            g.a((Object[]) (Object) ((qa) this).field_t, 0, (Object[]) (Object) param2.field_t, 0, 6);
            break L0;
          }
        }
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        la var7 = null;
        la var9 = null;
        pl var10 = null;
        la var11 = null;
        la var12 = null;
        la var13 = null;
        la var14 = null;
        ub stackIn_3_0 = null;
        la stackIn_32_0 = null;
        ub stackIn_32_1 = null;
        la stackIn_33_0 = null;
        ub stackIn_33_1 = null;
        la stackIn_34_0 = null;
        ub stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        Object stackOut_2_0 = null;
        ub stackOut_1_0 = null;
        la stackOut_31_0 = null;
        ub stackOut_31_1 = null;
        la stackOut_33_0 = null;
        ub stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        la stackOut_32_0 = null;
        ub stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        L0: {
          if (!(param2 instanceof pl)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ub) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ub) param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (pl) (Object) stackIn_3_0;
          eb.a(0, param1 - (-param2.field_l + -param2.field_n), param0 - -param2.field_o, param2.field_l + param1, param0 - -param2.field_o - -param2.field_r);
          if (var10 == null) {
            break L1;
          } else {
            param4 = param4 & var10.field_B;
            break L1;
          }
        }
        L2: {
          var7 = ((qa) this).field_t[0];
          ((qa) this).field_p.a(0);
          var7.a(param1, 83, param0, param2, ((qa) this).field_p, (qa) this);
          if (param3) {
            break L2;
          } else {
            qa.b(9);
            break L2;
          }
        }
        L3: {
          if (var10 != null) {
            L4: {
              if (var10.field_z) {
                var11 = ((qa) this).field_t[1];
                if (var11 != null) {
                  var11.a(param1, 100, param0, param2, ((qa) this).field_p, (qa) this);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (var10.field_v) {
              L5: {
                var12 = ((qa) this).field_t[3];
                if (var10.field_q == 0) {
                  break L5;
                } else {
                  if (var12 != null) {
                    var12.a(param1, 90, param0, param2, ((qa) this).field_p, (qa) this);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var9 = ((qa) this).field_t[2];
              if (var9 != null) {
                var9.a(param1, 100, param0, param2, ((qa) this).field_p, (qa) this);
                break L3;
              } else {
                break L3;
              }
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (param2.d((byte) 53)) {
            var13 = ((qa) this).field_t[5];
            if (var13 == null) {
              break L6;
            } else {
              var13.a(param1, 92, param0, param2, ((qa) this).field_p, (qa) this);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (param4) {
            break L7;
          } else {
            var14 = ((qa) this).field_t[4];
            if (var14 != null) {
              var14.a(param1, 95, param0, param2, ((qa) this).field_p, (qa) this);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          stackOut_31_0 = ((qa) this).field_p;
          stackOut_31_1 = (ub) param2;
          stackIn_33_0 = stackOut_31_0;
          stackIn_33_1 = stackOut_31_1;
          stackIn_32_0 = stackOut_31_0;
          stackIn_32_1 = stackOut_31_1;
          if (param3) {
            stackOut_33_0 = (la) (Object) stackIn_33_0;
            stackOut_33_1 = (ub) (Object) stackIn_33_1;
            stackOut_33_2 = 0;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            stackIn_34_2 = stackOut_33_2;
            break L8;
          } else {
            stackOut_32_0 = (la) (Object) stackIn_32_0;
            stackOut_32_1 = (ub) (Object) stackIn_32_1;
            stackOut_32_2 = 1;
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_34_2 = stackOut_32_2;
            break L8;
          }
        }
        ((la) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2 != 0, param1, (qa) this, param0);
        bb.b(4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new lg();
        field_q = new oi();
    }
}

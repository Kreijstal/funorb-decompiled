/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_c;
    private pf field_f;
    private int field_g;
    private vi field_b;
    private int field_a;
    static String field_e;
    static jc field_d;

    private final void a(byte param0, long param1) {
        dl var4 = (dl) (Object) ((lf) this).field_b.a(-1, param1);
        if (param0 >= -34) {
            return;
        }
        this.a(0, var4);
    }

    private final void a(Object param0, int param1, int param2, long param3) {
        dl var6 = null;
        hc var6_ref = null;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        if (param1 > ((lf) this).field_g) {
          throw new IllegalStateException();
        } else {
          this.a((byte) -116, param3);
          ((lf) this).field_a = ((lf) this).field_a - param1;
          L0: while (true) {
            if (((lf) this).field_a >= 0) {
              var6_ref = new hc(param0, param1);
              if (param2 >= -73) {
                ((lf) this).field_a = 94;
                ((lf) this).field_b.a((wf) (Object) var6_ref, (byte) 63, param3);
                ((lf) this).field_f.a(false, (ri) (Object) var6_ref);
                ((dl) (Object) var6_ref).field_j = 0L;
                return;
              } else {
                ((lf) this).field_b.a((wf) (Object) var6_ref, (byte) 63, param3);
                ((lf) this).field_f.a(false, (ri) (Object) var6_ref);
                ((dl) (Object) var6_ref).field_j = 0L;
                return;
              }
            } else {
              var6 = (dl) (Object) ((lf) this).field_f.a(false);
              this.a(0, var6);
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 27) {
            lf.a(true);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(Object param0, int param1, long param2) {
        if (param1 != -22137) {
            return;
        }
        this.a(param0, 1, param1 ^ 22019, param2);
    }

    final static void a(boolean param0) {
        hj stackIn_3_0 = null;
        hj stackIn_4_0 = null;
        hj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hj stackIn_12_0 = null;
        hj stackIn_13_0 = null;
        hj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        hj stackOut_11_0 = null;
        hj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        hj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        hj stackOut_2_0 = null;
        hj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        qd.b(5);
        if (null == gd.field_k) {
          L0: {
            jh.a(false);
            lk.b(false);
            eh.b((byte) 99);
            if (!ua.a((byte) 69)) {
              break L0;
            } else {
              L1: {
                stackOut_11_0 = ff.field_D;
                stackIn_13_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (param0) {
                  stackOut_13_0 = (hj) (Object) stackIn_13_0;
                  stackOut_13_1 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L1;
                } else {
                  stackOut_12_0 = (hj) (Object) stackIn_12_0;
                  stackOut_12_1 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  break L1;
                }
              }
              ((hj) (Object) stackIn_14_0).a(stackIn_14_1 != 0, 1);
              rb.a(0, -377);
              break L0;
            }
          }
          pc.a(1);
          if (!param0) {
            lf.a((byte) 48);
            return;
          } else {
            return;
          }
        } else {
          L2: {
            gd.a(gd.field_k, (byte) 118);
            jh.a(false);
            lk.b(false);
            eh.b((byte) 99);
            if (!ua.a((byte) 69)) {
              break L2;
            } else {
              L3: {
                stackOut_2_0 = ff.field_D;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (param0) {
                  stackOut_4_0 = (hj) (Object) stackIn_4_0;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L3;
                } else {
                  stackOut_3_0 = (hj) (Object) stackIn_3_0;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L3;
                }
              }
              ((hj) (Object) stackIn_5_0).a(stackIn_5_1 != 0, 1);
              rb.a(0, -377);
              break L2;
            }
          }
          pc.a(1);
          if (!param0) {
            lf.a((byte) 48);
            return;
          } else {
            return;
          }
        }
    }

    private lf() throws Throwable {
        throw new Error();
    }

    final Object a(int param0, long param1) {
        hc var6 = null;
        Object var7 = null;
        dl var9 = null;
        Object var10 = null;
        dl var11 = null;
        Object var12 = null;
        if (param0 == 17699) {
          var11 = (dl) (Object) ((lf) this).field_b.a(-1, param1);
          if (var11 != null) {
            var12 = var11.c((byte) -82);
            if (var12 == null) {
              var11.c(5);
              var11.b((byte) -121);
              ((lf) this).field_a = ((lf) this).field_a + var11.field_o;
              return null;
            } else {
              L0: {
                if (var11.d(8)) {
                  var6 = new hc(var12, var11.field_o);
                  ((lf) this).field_b.a((wf) (Object) var6, (byte) 93, var11.field_c);
                  ((lf) this).field_f.a(false, (ri) (Object) var6);
                  ((dl) (Object) var6).field_j = 0L;
                  var11.c(param0 + -17694);
                  var11.b((byte) -69);
                  break L0;
                } else {
                  ((lf) this).field_f.a(false, (ri) (Object) var11);
                  var11.field_j = 0L;
                  break L0;
                }
              }
              return var12;
            }
          } else {
            return null;
          }
        } else {
          var7 = null;
          Object discarded$1 = lf.a((byte) 50, false, (byte[]) null);
          var9 = (dl) (Object) ((lf) this).field_b.a(-1, param1);
          if (var9 != null) {
            var10 = var9.c((byte) -82);
            if (var10 == null) {
              var9.c(5);
              var9.b((byte) -121);
              ((lf) this).field_a = ((lf) this).field_a + var9.field_o;
              return null;
            } else {
              L1: {
                if (var9.d(8)) {
                  var6 = new hc(var10, var9.field_o);
                  ((lf) this).field_b.a((wf) (Object) var6, (byte) 93, var9.field_c);
                  ((lf) this).field_f.a(false, (ri) (Object) var6);
                  ((dl) (Object) var6).field_j = 0L;
                  var9.c(param0 + -17694);
                  var9.b((byte) -69);
                  break L1;
                } else {
                  ((lf) this).field_f.a(false, (ri) (Object) var9);
                  var9.field_j = 0L;
                  break L1;
                }
              }
              return var10;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, dl param1) {
        L0: {
          if (param1 != null) {
            param1.c(param0 + 5);
            param1.b((byte) -119);
            ((lf) this).field_a = ((lf) this).field_a + param1.field_o;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          this.a((Object) null, 86, 46, -115L);
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (-225 < (kc.field_g ^ -1)) {
          var1 = kc.field_g % 32;
          ec.a(kc.field_g + (32 + -var1), 9956);
          var1 = 4 / ((param0 - 58) / 47);
          return;
        } else {
          ec.a(256, 9956);
          var1 = 4 / ((param0 - 58) / 47);
          return;
        }
    }

    final static Object a(byte param0, boolean param1, byte[] param2) {
        hf var3 = null;
        if (param2 != null) {
          if (param2.length > 136) {
            var3 = new hf();
            ((dj) (Object) var3).a(param2, (byte) -128);
            return (Object) (Object) var3;
          } else {
            if (param0 == -43) {
              if (param1) {
                return (Object) (Object) pi.a((byte) -29, param2);
              } else {
                return (Object) (Object) param2;
              }
            } else {
              field_c = 124;
              if (param1) {
                return (Object) (Object) pi.a((byte) -29, param2);
              } else {
                return (Object) (Object) param2;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Name is available";
    }
}

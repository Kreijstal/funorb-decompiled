/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends mn implements ng {
    private boolean field_gb;
    private boolean field_hb;
    private ki field_ib;

    nm(ln param0, ki param1) {
        super(param0, pe.field_E, po.field_y, false, false);
        try {
            ((nm) this).field_ib = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "nm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        if (param0 >= -85) {
            Object var7 = null;
            ((nm) this).a((byte) 95, (lg) null, 85, -55, 97);
        }
        if (((nm) this).field_gb) {
            ea.a(false, (byte) 126, true);
            return;
        }
        try {
            m.c(-103);
            ((nm) this).b(true);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "nm.NA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void o(int param0) {
        if (param0 != 11) {
            return;
        }
        int discarded$0 = -1;
        this.a(true, pg.a(248, a.field_a), (byte) -117);
    }

    final boolean h(int param0) {
        dn var2 = null;
        Object var3 = null;
        if (((nm) this).field_D) {
          if (!((nm) this).field_hb) {
            int discarded$1 = 0;
            var2 = ji.a();
            if (var2 != null) {
              this.a(false, var2, (byte) -110);
              if (param0 != -7) {
                var3 = null;
                this.a(true, (dn) null, (byte) 100);
                return super.h(-7);
              } else {
                return super.h(-7);
              }
            } else {
              if (param0 != -7) {
                var3 = null;
                this.a(true, (dn) null, (byte) 100);
                return super.h(-7);
              } else {
                return super.h(-7);
              }
            }
          } else {
            if (param0 != -7) {
              var3 = null;
              this.a(true, (dn) null, (byte) 100);
              return super.h(-7);
            } else {
              return super.h(-7);
            }
          }
        } else {
          if (param0 != -7) {
            var3 = null;
            this.a(true, (dn) null, (byte) 100);
            return super.h(-7);
          } else {
            return super.h(-7);
          }
        }
    }

    private final void a(boolean param0, dn param1, byte param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        fo var5 = null;
        int var6 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              ((nm) this).field_hb = true;
              if (param1.field_b) {
                var4_ref = d.field_q;
                break L1;
              } else {
                if (null != param1.field_d) {
                  var4_ref = s.field_u;
                  if (null == ((nm) this).field_ib) {
                    break L1;
                  } else {
                    ((nm) this).field_ib.a((byte) 121);
                    break L1;
                  }
                } else {
                  var4_ref = param1.field_e;
                  if (param1.field_a != 248) {
                    break L1;
                  } else {
                    if (param0) {
                      ((nm) this).field_gb = true;
                      var4_ref = a.field_a;
                      break L1;
                    } else {
                      id.a((byte) 57);
                      ((nm) this).field_gb = true;
                      var4_ref = a.field_a;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              var5 = new fo((mn) this, pe.field_E, var4_ref);
              if (param2 < -102) {
                break L2;
              } else {
                ((nm) this).field_ib = null;
                break L2;
              }
            }
            L3: {
              if (param1.field_b) {
                if (!param1.field_g) {
                  lg discarded$2 = var5.a(0, vd.field_d, (ca) this);
                  break L3;
                } else {
                  ((nm) this).c((gm) (Object) new sc((nm) this), 33);
                  return;
                }
              } else {
                L4: {
                  if (!((nm) this).field_gb) {
                    if (param1.field_a == 5) {
                      var5.a(kl.field_n, 5177, 11);
                      var5.a(pf.field_q, 5177, 17);
                      break L4;
                    } else {
                      var5.a(qh.field_a, 5177, -1);
                      break L4;
                    }
                  } else {
                    lg discarded$3 = var5.a(0, vd.field_d, (ca) this);
                    break L4;
                  }
                }
                if (param1.field_a != 3) {
                  if (param1.field_a != 6) {
                    break L3;
                  } else {
                    var5.a(pf.field_u, 5177, 9);
                    break L3;
                  }
                } else {
                  var5.a(dc.field_b, 5177, 7);
                  break L3;
                }
              }
            }
            ((nm) this).c((gm) (Object) var5, 33);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("nm.WA(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 41);
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(232, 62, param0[0].a(79));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bq.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    bq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        Object stackIn_15_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_98_0 = null;
        Object var4;
        int var5;
        var5 = VoidHunters.field_G;
        uqb.field_h = param2 >> 1;
        if (param0) {
          stb.field_p = param3 >> 1;
          if (iha.e(0)) {
            if (param1 &&
              !upa.field_a) {
              jea.a(6045);
              if (!upa.field_a) {
                noa.field_q = uia.field_b;
                pk.field_o = kc.field_b;
                sab.field_o = hu.field_b;
                ujb.field_c = pba.field_o;
              } else {
                if (~uqb.field_h == ~kc.field_b &&
                  stb.field_p == uia.field_b) {
                  sab.field_o = hu.field_b;
                  ujb.field_c = pba.field_o;
                  return;
                }
                noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
                pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
                noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                if (null != psb.field_b) {
                  stackIn_15_0 = psb.field_b;
                } else {
                  stackIn_15_0 = igb.field_a;
                }
                var4 = stackIn_15_0;
                bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
                sab.field_o = hu.field_b;
                ujb.field_c = pba.field_o;
              }
              return;
            }
            if (!param1 &&
              upa.field_a) {
              brb.e((byte) -128);
            }
          }
          if (!upa.field_a) {
            noa.field_q = uia.field_b;
            pk.field_o = kc.field_b;
          } else {
            if (~uqb.field_h != ~kc.field_b ||
              stb.field_p != uia.field_b) {
              noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
              pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
              pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
              noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
              if (null != psb.field_b) {
                stackIn_28_0 = psb.field_b;
              } else {
                stackIn_28_0 = igb.field_a;
              }
              var4 = stackIn_28_0;
              bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
            }
          }
        } else {
          bq.a(false, true, -60, -60);
          stb.field_p = param3 >> 1;
          if (!iha.e(0)) {
            if (!upa.field_a) {
              noa.field_q = uia.field_b;
              pk.field_o = kc.field_b;
            } else {
              if (~uqb.field_h != ~kc.field_b ||
                stb.field_p != uia.field_b) {
                noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
                pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
                noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                if (null != psb.field_b) {
                  stackIn_41_0 = psb.field_b;
                } else {
                  stackIn_41_0 = igb.field_a;
                }
                var4 = stackIn_41_0;
                bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
              }
            }
          } else {
            if (param1 &&
              !upa.field_a) {
              jea.a(6045);
              if (!upa.field_a) {
                noa.field_q = uia.field_b;
                pk.field_o = kc.field_b;
                sab.field_o = hu.field_b;
                ujb.field_c = pba.field_o;
                return;
              }
              if (~uqb.field_h == ~kc.field_b &&
                stb.field_p == uia.field_b) {
                sab.field_o = hu.field_b;
                ujb.field_c = pba.field_o;
                return;
              }
              noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
              pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
              pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
              noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
              if (null != psb.field_b) {
                stackIn_83_0 = psb.field_b;
              } else {
                stackIn_83_0 = igb.field_a;
              }
              var4 = stackIn_83_0;
              bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
              sab.field_o = hu.field_b;
              ujb.field_c = pba.field_o;
              return;
            }
            if (param1) {
              if (!upa.field_a) {
                noa.field_q = uia.field_b;
                pk.field_o = kc.field_b;
              } else {
                if (~uqb.field_h != ~kc.field_b ||
                  stb.field_p != uia.field_b) {
                  noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                  pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
                  pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
                  noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                  if (null != psb.field_b) {
                    stackIn_57_0 = psb.field_b;
                  } else {
                    stackIn_57_0 = igb.field_a;
                  }
                  var4 = stackIn_57_0;
                  bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
                }
              }
            } else {
              if (!upa.field_a) {
                if (!upa.field_a) {
                  noa.field_q = uia.field_b;
                  pk.field_o = kc.field_b;
                } else {
                  if (~uqb.field_h != ~kc.field_b ||
                    stb.field_p != uia.field_b) {
                    noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                    pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
                    pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
                    noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                    if (null != psb.field_b) {
                      stackIn_70_0 = psb.field_b;
                    } else {
                      stackIn_70_0 = igb.field_a;
                    }
                    var4 = stackIn_70_0;
                    bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
                  }
                }
              } else {
                brb.e((byte) -128);
                if (!upa.field_a) {
                  noa.field_q = uia.field_b;
                  pk.field_o = kc.field_b;
                } else {
                  if (~uqb.field_h != ~kc.field_b) {
                    noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                    pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
                    pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
                    noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                    if (null != psb.field_b) {
                      stackIn_93_0 = psb.field_b;
                    } else {
                      stackIn_93_0 = igb.field_a;
                    }
                    var4 = stackIn_93_0;
                    bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
                  } else {
                    if (stb.field_p != uia.field_b) {
                      noa.field_q = noa.field_q + (-stb.field_p + uia.field_b);
                      pk.field_o = pk.field_o + (kc.field_b - uqb.field_h);
                      pk.field_o = Math.max(0, Math.min(param2 - 1, pk.field_o));
                      noa.field_q = Math.max(0, Math.min(param3 - 1, noa.field_q));
                      if (null != psb.field_b) {
                        stackIn_98_0 = psb.field_b;
                      } else {
                        stackIn_98_0 = igb.field_a;
                      }
                      var4 = stackIn_98_0;
                      bm.field_o.a((java.awt.Component) (var4), stb.field_p, uqb.field_h, 14);
                    }
                  }
                }
              }
            }
          }
        }
        sab.field_o = hu.field_b;
        ujb.field_c = pba.field_o;
    }

    static {
    }
}

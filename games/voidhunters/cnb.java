/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cnb extends rqa {
    static ij field_q;
    static int field_p;
    static int field_o;

    final static void f(byte param0) {
        if (param0 != -74) {
            field_q = null;
        }
        kma.a(mqb.field_x, true, -17833, bfa.field_p);
        kmb.field_c = true;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(219, 119));
    }

    cnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, dj param1, dj param2, int param3, int param4, String param5, boolean param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        ds stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ds stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ds stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        ds stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ds stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ds stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_19_2 = null;
        ds stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ds stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        ds stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        ds stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ds stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String stackOut_18_2 = null;
        ds stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_17_2 = null;
        L0: {
          var13 = VoidHunters.field_G;
          var14 = param1.b((byte) 41);
          var11_ref = var14;
          var11_ref = var14;
          var8 = param2.b((byte) 69);
          var11_ref = var8;
          var11_ref = var8;
          if (null == ov.field_o) {
            if (!ne.a(false, (byte) -11)) {
              return -1;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (tc.field_c == wd.field_p) {
            L2: {
              ehb.field_f = null;
              dpa.field_p.field_e = 0;
              if (param5 == null) {
                L3: {
                  ss.field_p.field_e = 0;
                  ss.field_p.d(jeb.field_b.nextInt(), 332614536);
                  ss.field_p.d(jeb.field_b.nextInt(), param4 + 332614536);
                  stackOut_13_0 = ss.field_p;
                  stackOut_13_1 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (!param1.a(true)) {
                    stackOut_15_0 = (ds) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = "";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    break L3;
                  } else {
                    stackOut_14_0 = (ds) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = (String) var14;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    break L3;
                  }
                }
                L4: {
                  ((ds) (Object) stackIn_16_0).b((byte) stackIn_16_1, stackIn_16_2);
                  stackOut_16_0 = ss.field_p;
                  stackOut_16_1 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if (!param2.a(true)) {
                    stackOut_18_0 = (ds) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = "";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L4;
                  } else {
                    stackOut_17_0 = (ds) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (String) var8;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L4;
                  }
                }
                ((ds) (Object) stackIn_19_0).b((byte) stackIn_19_1, stackIn_19_2);
                dpa.field_p.c(0, 16);
                dpa.field_p.field_e = dpa.field_p.field_e + 1;
                var9 = dpa.field_p.field_e;
                ufa.a((ds) (Object) dpa.field_p, (byte) -105, jnb.field_p, bib.field_g, ss.field_p);
                dpa.field_p.e(-var9 + dpa.field_p.field_e, -129);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  if (!param6) {
                    break L5;
                  } else {
                    var9 = var9 | 1;
                    break L5;
                  }
                }
                L6: {
                  ss.field_p.field_e = 0;
                  ss.field_p.d(jeb.field_b.nextInt(), 332614536);
                  ss.field_p.d(jeb.field_b.nextInt(), param4 ^ 332614536);
                  ss.field_p.b((byte) 0, var14);
                  ss.field_p.b((byte) 0, var8);
                  var15 = (CharSequence) (Object) param5;
                  ss.field_p.b((byte) 0, esb.a(param4 + 22, var15));
                  ss.field_p.a(param3, true);
                  ss.field_p.c(param4 + 0, param0);
                  ss.field_p.c(0, var9);
                  dpa.field_p.c(param4 + 0, 18);
                  dpa.field_p.field_e = dpa.field_p.field_e + 2;
                  var10 = dpa.field_p.field_e;
                  var11_ref = kh.a(-6465, vpa.b((byte) -114));
                  if (var11_ref != null) {
                    break L6;
                  } else {
                    var11_ref = "";
                    break L6;
                  }
                }
                dpa.field_p.a(true, var11_ref);
                ufa.a((ds) (Object) dpa.field_p, (byte) -108, jnb.field_p, bib.field_g, ss.field_p);
                dpa.field_p.a(dpa.field_p.field_e + -var10, -124);
                break L2;
              }
            }
            lnb.b(-1, 113);
            tc.field_c = bs.field_d;
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (tc.field_c != bs.field_d) {
            break L7;
          } else {
            if (boa.a(1, 30000)) {
              L8: {
                var9 = qga.field_b.e((byte) -124);
                qga.field_b.field_e = 0;
                if (-101 < var9) {
                  break L8;
                } else {
                  if (105 < var9) {
                    break L8;
                  } else {
                    tc.field_c = ct.field_a;
                    gob.field_a = new String[var9 - 100];
                    break L7;
                  }
                }
              }
              if (-249 == var9) {
                kl.a(vpa.b((byte) -124), param4 ^ 0);
                dgb.field_b = owa.field_j;
                ifb.l(param4 + -125);
                hha.field_o = false;
                return var9;
              } else {
                if (99 != var9) {
                  tc.field_c = qva.field_k;
                  vja.field_a = -1;
                  ow.field_a = var9;
                  break L7;
                } else {
                  boolean discarded$1 = boa.a(wmb.a(param4 + 24655), 30000);
                  ehb.field_f = new Boolean(cb.a(param4 + -2, (ds) (Object) qga.field_b));
                  qga.field_b.field_e = 0;
                  break L7;
                }
              }
            } else {
              break L7;
            }
          }
        }
        L9: {
          if (tc.field_c == ct.field_a) {
            var9 = 2;
            if (!boa.a(var9, param4 ^ 30000)) {
              break L9;
            } else {
              var10 = qga.field_b.e(1869);
              qga.field_b.field_e = 0;
              if (!boa.a(var10, param4 + 30000)) {
                break L9;
              } else {
                var11 = gob.field_a.length;
                var12 = 0;
                L10: while (true) {
                  if (var12 >= var11) {
                    ifb.l(-122);
                    hha.field_o = false;
                    return var11 + 100;
                  } else {
                    gob.field_a[var12] = qga.field_b.g(-1609246200);
                    var12++;
                    continue L10;
                  }
                }
              }
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (param4 == 0) {
            break L11;
          } else {
            cnb.f((byte) 86);
            break L11;
          }
        }
        L12: {
          if (tc.field_c != qva.field_k) {
            break L12;
          } else {
            if (ci.b((byte) 46)) {
              L13: {
                if (-256 == (ow.field_a ^ -1)) {
                  var9_ref = qga.field_b.m(0);
                  if (var9_ref != null) {
                    pcb.a(vpa.b((byte) -123), var9_ref, -1);
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  dgb.field_b = qga.field_b.a(-1);
                  break L13;
                }
              }
              ifb.l(-122);
              hha.field_o = false;
              return ow.field_a;
            } else {
              break L12;
            }
          }
        }
        L14: {
          if (ov.field_o != null) {
            break L14;
          } else {
            if (hha.field_o) {
              L15: {
                if (30000L < mw.e(0)) {
                  dgb.field_b = fd.field_o;
                  break L15;
                } else {
                  dgb.field_b = uv.field_f;
                  break L15;
                }
              }
              hha.field_o = false;
              return 249;
            } else {
              var9 = pcb.field_p;
              pcb.field_p = bia.field_d;
              bia.field_d = var9;
              hha.field_o = true;
              break L14;
            }
          }
        }
        return -1;
    }

    public static void e(byte param0) {
        int var1 = -18 % ((-34 - param0) / 59);
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new ij();
        field_p = 100;
        field_o = 1;
    }
}

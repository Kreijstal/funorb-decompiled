/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bba implements ntb {
    static int field_d;
    static int field_a;
    static String field_e;
    private wm[] field_b;
    private rna[] field_c;
    static String field_f;

    public final boolean a(byte param0, tv param1) {
        bba var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var3 = (bba) (Object) param1;
            var4 = -88 / ((22 - param0) / 59);
            if (dn.a((tv[]) (Object) var3.field_b, true, 1, (tv[]) (Object) ((bba) this).field_b, -4)) {
              break L1;
            } else {
              if (!dn.a((tv[]) (Object) var3.field_c, true, 1, (tv[]) (Object) ((bba) this).field_c, -73)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final void a(rsb param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        int[] var4_array = null;
        wm var5_ref_wm = null;
        int var5 = 0;
        int var6_int = 0;
        rna var6 = null;
        int var7 = 0;
        int var8 = 0;
        var7 = VoidHunters.field_G;
        if (param1 < -27) {
          L0: {
            var3 = 1;
            if (null != ((bba) this).field_b) {
              var4_int = 0;
              L1: while (true) {
                if (((bba) this).field_b.length <= var4_int) {
                  break L0;
                } else {
                  var5_ref_wm = ((bba) this).field_b[var4_int];
                  var6_int = var5_ref_wm.a(0, param0.field_e, param0.field_g) ^ var5_ref_wm.field_a ? 1 : 0;
                  if (var6_int == 0) {
                    var3 = 0;
                    var4_int++;
                    continue L1;
                  } else {
                    var4_int++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (var3 == 0) {
              break L2;
            } else {
              if (null == ((bba) this).field_c) {
                break L2;
              } else {
                L3: {
                  var4 = null;
                  if (null == ((bba) this).field_b) {
                    break L3;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= ((bba) this).field_b.length) {
                        break L3;
                      } else {
                        var4_array = ((bba) this).field_b[var5].a(param0.field_g, 120, (int[]) var4);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
                var8 = 0;
                var5 = var8;
                L5: while (true) {
                  if (var8 >= ((bba) this).field_c.length) {
                    break L2;
                  } else {
                    var6 = ((bba) this).field_c[var8];
                    var6.a(1, var4_array, param0);
                    var8++;
                    continue L5;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        Class[] var4 = null;
        dja[] var5 = null;
        Class[] var6 = null;
        dja[] var7 = null;
        Object var8 = null;
        bba var9 = null;
        L0: {
          var9 = (bba) (Object) param1;
          var4 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
          var5 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
          var9.field_b = (wm[]) (Object) hla.a(var4, (tv[]) (Object) ((bba) this).field_b, var5, -118, (tv[]) (Object) var9.field_b, 1, jv.field_d);
          if (param0 > 54) {
            break L0;
          } else {
            var8 = null;
            ((bba) this).a((tv) null, 121);
            break L0;
          }
        }
        var6 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
        var7 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
        var9.field_c = (rna[]) (Object) hla.a(var6, (tv[]) (Object) ((bba) this).field_c, var7, -120, (tv[]) (Object) var9.field_c, 1, nha.field_o);
    }

    final void a(rna param0, boolean param1) {
        ((bba) this).field_c = (rna[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((bba) this).field_c, 0, nha.field_o);
        if (!param1) {
            Object var4 = null;
            ((bba) this).a((byte) 23, (wm) null);
        }
    }

    public final void a(tv param0, int param1) {
        bba var3 = (bba) (Object) param0;
        boolean discarded$0 = tja.a((ntb[]) (Object) var3.field_b, 1, (ntb[]) (Object) var3.field_b, true, 5547);
        boolean discarded$1 = tja.a((ntb[]) (Object) var3.field_c, 1, (ntb[]) (Object) var3.field_c, true, 5547);
        int var4 = 0;
        if (dn.a((tv[]) (Object) var3.field_b, true, 1, (tv[]) (Object) var3.field_b, -64)) {
            System.out.println("MissionCondition[] conditions has changed. ");
            var4 = 1;
        }
        if (param1 >= -19) {
            return;
        }
        if (!(!dn.a((tv[]) (Object) var3.field_c, true, 1, (tv[]) (Object) var3.field_c, -13))) {
            System.out.println("MissionAction[] actions has changed. ");
            var4 = 1;
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of MissionEvent has changed");
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
            ((bba) this).a(-43, -72);
        }
        Class[] var5 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
        pjb.a(param0, (tv[]) (Object) ((bba) this).field_b, 8, 1, var5, 122);
        Class[] var4 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
        pjb.a(param0, (tv[]) (Object) ((bba) this).field_c, 8, 1, var4, 118);
    }

    final wm[] a(byte param0) {
        if (param0 >= -110) {
            Object var3 = null;
            ((bba) this).a((rsb) null, -8);
        }
        return ((bba) this).field_b;
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 > -30) {
            return;
        }
        field_e = null;
    }

    final void a(byte param0, wm param1) {
        ((bba) this).field_b = (wm[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((bba) this).field_b, 0, jv.field_d);
        if (param0 >= -97) {
            field_f = null;
        }
    }

    public final void a(faa param0, boolean param1) {
        dja[] var4 = null;
        Class[] var5 = null;
        dja[] var6 = null;
        Class[] var7 = null;
        var7 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
        var4 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
        ((bba) this).field_b = (wm[]) (Object) iq.a(var4, (tv[]) (Object) ((bba) this).field_b, var7, jv.field_d, 8, param0, 1, 108);
        if (!param1) {
          var5 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
          var6 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
          ((bba) this).field_c = (rna[]) (Object) iq.a(var6, (tv[]) (Object) ((bba) this).field_c, var5, nha.field_o, 8, param0, 1, 119);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param1 == -79) {
            break L0;
          } else {
            ((bba) this).field_b = null;
            break L0;
          }
        }
        L1: {
          if (0 > param0) {
            break L1;
          } else {
            L2: {
              if (((bba) this).field_b == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = ((bba) this).field_b.length;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_6_0;
              if (((bba) this).field_b == null) {
                break L3;
              } else {
                if (param0 < ((bba) this).field_b.length) {
                  ((bba) this).field_b = (wm[]) (Object) dt.a(jv.field_d, param0, 15667, (Object[]) (Object) ((bba) this).field_b);
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (null == ((bba) this).field_c) {
              break L1;
            } else {
              if (-var3 + param0 >= ((bba) this).field_c.length) {
                break L1;
              } else {
                ((bba) this).field_c = (rna[]) (Object) dt.a(nha.field_o, param0 - var3, 15667, (Object[]) (Object) ((bba) this).field_c);
                break L1;
              }
            }
          }
        }
    }

    final static int a(int param0, ml param1, int param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        int var7 = VoidHunters.field_G;
        if (param0 != 0) {
            return 41;
        }
        if (param1.field_d != null) {
            // if_icmpeq L37
        } else {
            return param2;
        }
        while (param3.length > param2) {
            param2++;
            var4 = param3[param2];
            // if_icmpeq L115
            param2++;
            var5 = param3[param2];
            var6 = new ml(var5);
            param1.a(1, var4, var6);
            param2 = bba.a(param0 ^ 0, var6, param2, param3);
            // if_icmpeq L115
        }
        return param2;
    }

    final rna[] c(byte param0) {
        if (param0 != -42) {
            return null;
        }
        return ((bba) this).field_c;
    }

    final void a(int param0, int param1) {
        if (param1 != -1) {
            rna[] discarded$0 = ((bba) this).c((byte) 14);
        }
        if (param0 >= 0) {
            if (((bba) this).field_b != null) {
                if (((bba) this).field_b.length > param0) {
                    ((bba) this).field_b[param0].field_a = !((bba) this).field_b[param0].field_a ? true : false;
                }
            }
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -113 % ((param0 - 32) / 63);
        if (0 > param1) {
            return 0;
        }
        int var5 = ((bba) this).field_b != null ? ((bba) this).field_b.length : 0;
        if (((bba) this).field_b != null) {
            if (param1 < ((bba) this).field_b.length) {
                return ((bba) this).field_b[param1].a((byte) -117, param2);
            }
        }
        if (null != ((bba) this).field_c) {
            if (param1 - var5 < ((bba) this).field_c.length) {
                return ((bba) this).field_c[-var5 + param1].a(param2, -125);
            }
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, pe param4) {
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            if (-1 >= (param3 ^ -1)) {
              L2: {
                if (((bba) this).field_b != null) {
                  stackOut_4_0 = ((bba) this).field_b.length;
                  stackIn_5_0 = stackOut_4_0;
                  break L2;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_5_0 = stackOut_3_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_5_0;
                if (null == ((bba) this).field_b) {
                  break L3;
                } else {
                  if (param3 < ((bba) this).field_b.length) {
                    ((bba) this).field_b[param3].a(param4, -2, param2, param0);
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (null == ((bba) this).field_c) {
                break L1;
              } else {
                if (-var6 + param3 < ((bba) this).field_c.length) {
                  ((bba) this).field_c[-var6 + param3].a(param4, false, param2, param0);
                  break L1;
                } else {
                  var6 = -7 % ((35 - param1) / 63);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          var6 = -7 % ((35 - param1) / 63);
          break L0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter name of friend to delete from list";
        field_a = 50;
        field_f = "Mode";
    }
}

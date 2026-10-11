/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class spa implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = 56 / ((-64 - param0) / 50);
        return (tv) ((Object) new mua());
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (32 < kt.field_l) {
          var1 = kt.field_l % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          nl.a(-var1 + kt.field_l, -13205);
          if (param0 != 64) {
            field_a = 29;
            return;
          }
          return;
        }
        nl.a(0, -13205);
        if (param0 != 64) {
          field_a = 29;
          return;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_a = -87;
          return (tv[]) ((Object) new mua[param1]);
        }
        return (tv[]) ((Object) new mua[param1]);
    }

    final static void a(int param0, boolean param1) {
        int var2;
        String var3;
        int var4;
        int var5;
        int var9;
        int var10;
        float var11;
        float var12;
        String var15;
        sg var16;
        lta var18;
        sg var19;
        lta var21;
        sg var22;
        lta var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int var5Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        float var11Lifetime1;
        float var12Lifetime1;
        int var5Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        float var11Lifetime2;
        float var12Lifetime2;
        String var3Lifetime1;
        String var3Lifetime2;
        String var15Lifetime1;
        String var15Lifetime2;
        if (!ck.b(false)) {
          if (param1) {
          }
          if (param0 == 0) {
            return;
          }
          spa.a(45, false);
          return;
        }
        var2 = 1;
        var3 = km.field_s;
        var15 = var3;
        var3Lifetime1 = var15;
        var15Lifetime1 = var3Lifetime1;
        var3Lifetime2 = var15Lifetime1;
        var4 = 0;
        if (vqa.field_g != null &&
          !vqa.field_g.field_N) {
          var4 = 1;
        } else {
          if (oab.field_o != 0) {
            var15Lifetime2 = cf.field_a;
            var3Lifetime2 = var15Lifetime2;
            ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
            var5 = kma.a(var2, 0, 200, var15Lifetime2);
            var16 = ae.a(wba.field_o, (byte) 41);
            var18 = new lta();
            var18.field_e = (ip.field_p.height >> 1) - (-(var5 >> 1) - ((ip.field_p.height >> 1) - (var5 >> 1) >> 1));
            var18.field_d = ip.field_p.width >> 1;
            var25 = var16.f((byte) -92);
            var9 = -var25[0] + var25[1];
            var10 = var25[3] - var25[2];
            var11 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
            var12 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
            var18.field_a = Math.min(var11, var12);
            var18.field_c = (float)((var25[0] + var25[1]) / 2);
            var18.field_b = (float)((var25[3] + var25[2]) / 2);
            var16.a(kdb.field_o * 10 % 8192, -82);
            if (vqa.field_g != null &&
              !vqa.field_g.field_N &&
              vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) != null) {
              var16.h(17704, 1);
              var16.a(false, true, (pe) null);
              var16.a(var18, 121, (pe) null);
              if (0 != sab.field_o ||
                si.field_o[83] ||
                si.field_o[84] ||
                si.field_o[13]) {
                if (var4 != 0) {
                  mgb.field_o = true;
                } else {
                  wba.field_o = null;
                  mgb.field_o = true;
                }
              }
              if (param1) {
              }
              if (param0 != 0) {
                spa.a(45, false);
              }
              return;
            }
            var16.a(false, true, (pe) null);
            var16.a(var18, 121, (pe) null);
            if (0 == sab.field_o &&
              !si.field_o[83] &&
              !si.field_o[84]) {
              if (!si.field_o[13]) {
                if (param1) {
                }
                if (param0 == 0) {
                  return;
                }
                spa.a(45, false);
                return;
              }
              if (var4 != 0) {
                mgb.field_o = true;
              } else {
                wba.field_o = null;
                mgb.field_o = true;
              }
              if (param1) {
              }
              if (param0 != 0) {
                spa.a(45, false);
              }
              return;
            }
            if (var4 != 0) {
              mgb.field_o = true;
              if (param1) {
              }
              if (param0 != 0) {
                spa.a(45, false);
              }
              return;
            }
            wba.field_o = null;
            mgb.field_o = true;
            if (param1) {
            }
            if (param0 != 0) {
              spa.a(45, false);
            }
            return;
          }
          if (0 == wgb.field_f) {
            var4 = 1;
            ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
            var5Lifetime2 = kma.a(var2, 0, 200, var3Lifetime2);
            var19 = ae.a(wba.field_o, (byte) 41);
            var21 = new lta();
            var21.field_e = (ip.field_p.height >> 1) - (-(var5Lifetime2 >> 1) - ((ip.field_p.height >> 1) - (var5Lifetime2 >> 1) >> 1));
            var21.field_d = ip.field_p.width >> 1;
            var26 = var19.f((byte) -92);
            var9Lifetime2 = -var26[0] + var26[1];
            var10Lifetime2 = var26[3] - var26[2];
            var11Lifetime2 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5Lifetime2 >> 1))) / (float)var9Lifetime2;
            var12Lifetime2 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5Lifetime2 >> 1))) / (float)var10Lifetime2;
            var21.field_a = Math.min(var11Lifetime2, var12Lifetime2);
            var21.field_c = (float)((var26[0] + var26[1]) / 2);
            var21.field_b = (float)((var26[3] + var26[2]) / 2);
            var19.a(kdb.field_o * 10 % 8192, -82);
            if (vqa.field_g != null &&
              !vqa.field_g.field_N &&
              vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) != null) {
              var19.h(17704, 1);
            }
            var19.a(false, true, (pe) null);
            var19.a(var21, 121, (pe) null);
            if (0 != sab.field_o ||
              si.field_o[83] ||
              si.field_o[84] ||
              si.field_o[13]) {
              if (var4 != 0) {
                mgb.field_o = true;
              } else {
                wba.field_o = null;
                mgb.field_o = true;
              }
            }
            if (param1) {
            }
            if (param0 != 0) {
              spa.a(45, false);
            }
            return;
          }
          var3Lifetime2 = cf.field_a;
        }
        ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
        var5Lifetime1 = kma.a(var2, 0, 200, var3Lifetime2);
        var22 = ae.a(wba.field_o, (byte) 41);
        var24 = new lta();
        var24.field_e = (ip.field_p.height >> 1) - (-(var5Lifetime1 >> 1) - ((ip.field_p.height >> 1) - (var5Lifetime1 >> 1) >> 1));
        var24.field_d = ip.field_p.width >> 1;
        var27 = var22.f((byte) -92);
        var9Lifetime1 = -var27[0] + var27[1];
        var10Lifetime1 = var27[3] - var27[2];
        var11Lifetime1 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5Lifetime1 >> 1))) / (float)var9Lifetime1;
        var12Lifetime1 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5Lifetime1 >> 1))) / (float)var10Lifetime1;
        var24.field_a = Math.min(var11Lifetime1, var12Lifetime1);
        var24.field_c = (float)((var27[0] + var27[1]) / 2);
        var24.field_b = (float)((var27[3] + var27[2]) / 2);
        var22.a(kdb.field_o * 10 % 8192, -82);
        if (vqa.field_g == null) {
          var22.a(false, true, (pe) null);
          var22.a(var24, 121, (pe) null);
          if (0 == sab.field_o &&
            !si.field_o[83] &&
            !si.field_o[84]) {
            if (si.field_o[13]) {
              if (var4 == 0) {
                wba.field_o = null;
              }
              mgb.field_o = true;
              if (param1) {
              }
              if (param0 != 0) {
                spa.a(45, false);
              }
              return;
            }
          } else {
            if (var4 == 0) {
              wba.field_o = null;
            }
            mgb.field_o = true;
          }
        } else {
          if (vqa.field_g.field_N) {
            var22.a(false, true, (pe) null);
            var22.a(var24, 121, (pe) null);
            if (0 == sab.field_o &&
              !si.field_o[83] &&
              !si.field_o[84]) {
              if (si.field_o[13]) {
                if (var4 == 0) {
                  wba.field_o = null;
                }
                mgb.field_o = true;
                if (param1) {
                }
                if (param0 != 0) {
                  spa.a(45, false);
                }
                return;
              }
            } else {
              if (var4 == 0) {
                wba.field_o = null;
              }
              mgb.field_o = true;
            }
          } else {
            if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) != null) {
              var22.h(17704, 1);
              var22.a(false, true, (pe) null);
              var22.a(var24, 121, (pe) null);
              if (0 != sab.field_o ||
                si.field_o[83] ||
                si.field_o[84] ||
                si.field_o[13]) {
                if (var4 != 0) {
                  mgb.field_o = true;
                } else {
                  wba.field_o = null;
                  mgb.field_o = true;
                }
              }
            } else {
              var22.a(false, true, (pe) null);
              var22.a(var24, 121, (pe) null);
              if (0 != sab.field_o) {
                if (var4 == 0) {
                  wba.field_o = null;
                }
                mgb.field_o = true;
              } else {
                if (si.field_o[83]) {
                  if (var4 == 0) {
                    wba.field_o = null;
                  }
                  mgb.field_o = true;
                } else {
                  if (si.field_o[84]) {
                    if (var4 == 0) {
                      wba.field_o = null;
                    }
                    mgb.field_o = true;
                  } else {
                    if (si.field_o[13]) {
                      if (var4 != 0) {
                        mgb.field_o = true;
                        if (param1) {
                        }
                        if (param0 != 0) {
                          spa.a(45, false);
                        }
                        return;
                      }
                      wba.field_o = null;
                      mgb.field_o = true;
                    }
                  }
                }
              }
            }
          }
        }
        if (param1) {
        }
        if (param0 == 0) {
          return;
        }
        spa.a(45, false);
        return;
    }

    static {
        field_a = 50;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lja implements ntb {
    static String field_c;
    int field_e;
    static int field_b;
    static int field_d;
    int field_g;
    private int field_h;
    private int field_a;
    static int field_f;

    final void a(int param0, lta param1, int[] param2, int param3, pe param4, int param5, int param6) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        anb var21 = null;
        ml var22 = null;
        mqb var23 = null;
        L0: {
          var23 = param4.h(((lja) this).field_e, -125);
          if (param6 >= 73) {
            break L0;
          } else {
            ((lja) this).field_a = 55;
            break L0;
          }
        }
        L1: {
          if (var23 != null) {
            L2: {
              var9 = skb.a(param2, 84);
              var10 = param5 + (var9 * fc.a(param0, (byte) -96) >> -1861322640);
              var11 = param3 + (eu.a(param0, 85) * var9 >> 1923524368);
              var12 = -var10 + var23.d(false);
              var13 = -var11 + var23.g((byte) 124);
              var14 = ar.a(var12, (byte) 118, var13);
              var15 = -((lja) this).field_a + var14;
              var16 = 39219;
              if (0 >= var15) {
                break L2;
              } else {
                L3: {
                  var17 = var15 * 512 / ((lja) this).field_a;
                  if (-256 > (var17 ^ -1)) {
                    var17 = 255;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var16 = 39219 + (var17 << 622535856);
                break L2;
              }
            }
            var17 = param1.a(var23.d(false), (byte) 115);
            var18 = param1.b(true, var23.g((byte) 119));
            var19 = param1.a(var10, (byte) 122);
            var20 = param1.b(true, var11);
            c.a(var18, var17, var19, var20, -16777216, var16);
            if (-1 >= (var23.l((byte) -68) ^ -1)) {
              var21 = param4.d((byte) -27, var23.l((byte) -102));
              if (var21 != null) {
                var22 = var21.field_k.c(var23.l(127), -97);
                if (var22 == null) {
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
    }

    private final void a(int param0, mqb param1) {
        if (param0 != 32) {
          return;
        } else {
          L0: {
            if (((lja) this).field_h == ls.field_r) {
              break L0;
            } else {
              ((lja) this).field_h = ls.field_r;
              param1.f(true);
              param1.a(param0 ^ 86, true);
              break L0;
            }
          }
          return;
        }
    }

    final int d(byte param0) {
        if (param0 != 126) {
            return -65;
        }
        if (1 == fra.field_a) {
            return 2048;
        }
        return ldb.field_q;
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, byte param7, pe param8, int param9, anb param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        mqb var22 = null;
        int var23 = 0;
        int var24 = 0;
        mqb var25 = null;
        L0: {
          if (param7 > 3) {
            break L0;
          } else {
            ((lja) this).field_a = 3;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 != ((lja) this).field_e) {
              break L2;
            } else {
              if (((lja) this).field_g == 0) {
                var12 = param5 + (param9 * fc.a(param4, (byte) 30) - eu.a(param4, 103) * param6 >> -285842064);
                var13 = param1 + (param9 * eu.a(param4, 43) - -(fc.a(param4, (byte) 87) * param6) >> -1960165136);
                var14 = skb.a(param2, -71);
                var15 = param5 + (fc.a(param4, (byte) -63) * var14 >> -143681328);
                var16 = (var14 * eu.a(param4, 76) >> 766985616) + param1;
                var17 = -var12 + param0;
                var18 = param3 + -var13;
                var19 = ecb.a(var18, (byte) -77, var17);
                var20 = rrb.a(22433, var19 - param4);
                if (-257 > (Math.abs(var20) ^ -1)) {
                  return;
                } else {
                  L3: {
                    ((lja) this).field_a = bia.field_c;
                    var21 = -1;
                    if (param10 instanceof sg) {
                      var21 = ((sg) (Object) param10).o((byte) -117);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var22 = new mqb(new ml(28), param10.field_l, var21);
                  var14 = skb.a(var22.field_k.i((byte) -112).field_v, 80);
                  var22.a(param4, -17);
                  var23 = fc.a(param4, (byte) -127) * var14 >> -2083378608;
                  var24 = eu.a(param4, 77) * var14 >> 55766128;
                  var22.a(var23 * 2 + var15, var24 * 2 + var16, (byte) 100);
                  param8.a((byte) 67, var22);
                  var22.field_h = param10.field_h;
                  var22.field_f = param10.field_f;
                  qba.a(20382, var15, 12, var16, 50);
                  var22.a(var16, param4, var15, joa.field_a, 1948934248);
                  param10.a(var16, rrb.a(22433, param4 - -4096), var15, joa.field_a, 1948934248);
                  ((lja) this).field_e = var22.field_l;
                  ((lja) this).field_g = pca.field_i[0].d((byte) 64);
                  ((lja) this).field_h = ((lja) this).field_a;
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          var25 = param8.h(((lja) this).field_e, -103);
          if (var25 != null) {
            L4: {
              if (-1 == var25.l((byte) 123)) {
                break L4;
              } else {
                qba.a(20382, var25.d(false), 13, var25.g((byte) -69), 50);
                break L4;
              }
            }
            this.a(32, var25);
            qba.a(20382, param5, 14, param1, 50);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final static void e(byte param0) {
        Object var2 = null;
        uhb.a((String) null, bfa.field_p, 0);
        if (param0 <= 11) {
            lja.e((byte) 76);
        }
    }

    final void a(anb param0, pe param1, int param2, boolean param3, byte param4, int param5, int param6, int[] param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        anb var17 = null;
        ml var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var21_int = 0;
        long var21 = 0L;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        mqb var33 = null;
        var32 = VoidHunters.field_G;
        var33 = param1.h(((lja) this).field_e, -126);
        if (var33 != null) {
          L0: {
            param0.d((byte) -74);
            var10 = skb.a(param7, -82);
            var11 = param5 + (var10 * fc.a(param6, (byte) -125) >> 1130576432);
            var12 = param2 - -(var10 * eu.a(param6, 39) >> -933493168);
            var13 = var33.d(false) - var11;
            var14 = var33.g((byte) -54) - var12;
            var15 = ar.a(var13, (byte) 114, var14);
            var16 = var15 - ((lja) this).field_a;
            if (-1 <= (var16 ^ -1)) {
              break L0;
            } else {
              var13 = (var13 << 12736648) / ((lja) this).field_a;
              var14 = (var14 << 1888209320) / ((lja) this).field_a;
              var17_int = var16 / Math.max(1, ((lja) this).field_a >> -272195576);
              if (bhb.field_i < var15) {
                int discarded$2 = var33.field_k.a(var33.field_k.i((byte) -112).field_p, (byte) -109);
                break L0;
              } else {
                L1: {
                  if (var17_int > nra.field_b) {
                    var17_int = nra.field_b;
                    var16 = var17_int * ((lja) this).field_a >> 311951496;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var18_int = (var16 * uua.field_o >> 1792144072) * var13;
                var19 = var18_int >> -501063160;
                var20 = var14 * (uua.field_o * var16 >> -1467857048);
                var21_int = var20 >> -1515884184;
                var33.a(-var21_int, var33.d(false), var33.g((byte) 122), (byte) -128, -var19);
                param0.a(var21_int, var11, var12, (byte) -117, var19);
                if (-1 != var33.l((byte) -106)) {
                  break L0;
                } else {
                  this.a(32, var33);
                  break L0;
                }
              }
            }
          }
          L2: {
            if (var33.l((byte) 120) >= 0) {
              var17 = param1.d((byte) -27, var33.l((byte) 121));
              if (var17 != null) {
                var18 = var17.field_k.c(var33.l(-109), -121);
                if (var18 != null) {
                  L3: {
                    if (((lja) this).field_h > bia.field_c >> 1462780513) {
                      ((lja) this).field_h = bia.field_c >> -940783295;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var19 = eu.a(var18.field_b, 126);
                  var20 = fc.a(var18.field_b, (byte) -76);
                  var21 = (long)var18.field_r + ((long)var20 * (long)var33.o(23463) - (long)var33.q(32) * (long)var19 >> -2017703088);
                  var23 = (long)var18.field_n + ((long)var33.o(23463) * (long)var19 + (long)var33.q(32) * (long)var20 >> -167801136);
                  var25 = (int)var21 + -var33.d(false);
                  var26 = (int)var23 - var33.g((byte) -29);
                  var27 = var33.c((byte) -121) + -var17.c((byte) -112);
                  var28 = var33.f(0) - var17.f(0);
                  var29 = Math.min(var33.e(false), var17.e(false) / 4);
                  var30 = (var25 - var27) * var29 / 2;
                  var31 = (-var28 + var26) * var29 / 2;
                  var33.a(var31, var33.d(false), var33.g((byte) 124), (byte) -118, var30);
                  var17.a(-var31, (int)var21, (int)var23, (byte) -123, -var30);
                  break L2;
                } else {
                  var33.f(true);
                  return;
                }
              } else {
                var33.f(true);
                return;
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (((lja) this).field_a <= ((lja) this).field_h) {
              break L4;
            } else {
              L5: {
                ((lja) this).field_a = ((lja) this).field_a - ds.field_d;
                if (((lja) this).field_h <= ((lja) this).field_a) {
                  break L5;
                } else {
                  ((lja) this).field_a = ((lja) this).field_h;
                  break L5;
                }
              }
              if (((lja) this).field_h != ls.field_r) {
                break L4;
              } else {
                if (0 <= var33.l((byte) -34)) {
                  var33.f(true);
                  var33.field_f = 0;
                  var33.field_h = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
          L6: {
            if (param3) {
              int discarded$3 = var33.field_k.a(var33.field_k.i((byte) -112).field_p, (byte) -114);
              break L6;
            } else {
              break L6;
            }
          }
          var10 = 51 % ((param4 - 69) / 57);
          return;
        } else {
          L7: {
            if (((lja) this).field_e != -1) {
              ((lja) this).field_e = -1;
              param0.d((byte) -85);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (-1 <= (((lja) this).field_g ^ -1)) {
              break L8;
            } else {
              ((lja) this).field_g = ((lja) this).field_g - 1;
              param0.d((byte) 40);
              break L8;
            }
          }
          var10 = 51 % ((param4 - 69) / 57);
          return;
        }
    }

    public static void c(byte param0) {
        int var1 = 87 % ((46 - param0) / 63);
        field_c = null;
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((lja) this).field_e, 32);
        if (param1 >= -109) {
            ((lja) this).field_a = -1;
        }
        param0.a(-632, ((lja) this).field_h, 32);
        param0.a(-632, ((lja) this).field_a, 32);
        param0.a(-632, ((lja) this).field_g, 32);
    }

    final boolean b(byte param0) {
        if (param0 != -113) {
            return true;
        }
        return ((lja) this).field_e == -1 ? true : false;
    }

    public lja() {
        ((lja) this).field_e = -1;
    }

    final int a(byte param0) {
        if (param0 != 12) {
            field_d = -53;
        }
        return dla.field_c;
    }

    final void a(pe param0, int param1) {
        if (param1 != 19278) {
            Object var4 = null;
            ((lja) this).a(-123, (lta) null, (int[]) null, -18, (pe) null, 75, 40);
        }
        mqb var3 = param0.h(((lja) this).field_e, 101);
        if (!(var3 == null)) {
            var3.n(620);
            ((lja) this).field_e = -1;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        lja var5 = null;
        var5 = (lja) (Object) param0;
        if (param1 > -19) {
          return;
        } else {
          L0: {
            var4 = 0;
            if (var5.field_e == var5.field_e) {
              break L0;
            } else {
              var4 = 1;
              System.out.println("int hook_id has changed. before=" + var5.field_e + ", now=" + var5.field_e);
              break L0;
            }
          }
          L1: {
            if (var5.field_h == var5.field_h) {
              break L1;
            } else {
              System.out.println("int target_rope_length has changed. before=" + var5.field_h + ", now=" + var5.field_h);
              var4 = 1;
              break L1;
            }
          }
          L2: {
            if (var5.field_a == var5.field_a) {
              break L2;
            } else {
              System.out.println("int rope_length has changed. before=" + var5.field_a + ", now=" + var5.field_a);
              var4 = 1;
              break L2;
            }
          }
          L3: {
            if (var5.field_g != var5.field_g) {
              System.out.println("int reload has changed. before=" + var5.field_g + ", now=" + var5.field_g);
              var4 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var4 != 0) {
              System.out.println("This instance of GrappleLauncherBehaviour has changed");
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        ((lja) this).field_e = param0.i(0, 32);
        ((lja) this).field_h = param0.i(0, 32);
        ((lja) this).field_a = param0.i(0, 32);
        ((lja) this).field_g = param0.i(0, 32);
        if (param1) {
            ((lja) this).field_g = -16;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        lja var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var3 = -37 % ((param0 - 22) / 59);
            var4 = (lja) (Object) param1;
            if (var4.field_e != var4.field_e) {
              break L1;
            } else {
              if (var4.field_h != var4.field_h) {
                break L1;
              } else {
                if (var4.field_a != var4.field_a) {
                  break L1;
                } else {
                  if (var4.field_g == var4.field_g) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        lja var6 = (lja) (Object) param1;
        lja var7 = var6;
        var7.field_h = var6.field_h;
        if (param0 <= 54) {
            Object var4 = null;
            ((lja) this).a(-126, -1, (int[]) null, -127, 86, -67, -61, (byte) 75, (pe) null, -84, (anb) null);
        }
        var7.field_e = var6.field_e;
        var7.field_g = var6.field_g;
        var7.field_a = var6.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Win by destroying the enemy VIP";
        field_b = 80;
        field_d = 1;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private gr field_i;
    static kp field_g;
    private int field_d;
    private int field_c;
    private int field_b;
    private int field_a;
    private int field_e;
    private int field_h;
    static String[] field_f;

    private final String b(int param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            boolean discarded$2 = this.a(-107, (byte) -6);
            break L0;
          }
        }
        var3 = "";
        L1: while (true) {
          if ((param0 ^ -1) > -1001) {
            return param0 + var3;
          } else {
            var4 = param0 % 1000;
            var6 = var4 + var3;
            param0 = param0 / 1000;
            if (var4 < 10) {
              var3 = kp.field_b + "00" + var6;
              continue L1;
            } else {
              if ((var4 ^ -1) <= -101) {
                var3 = kp.field_b + var6;
                continue L1;
              } else {
                var3 = kp.field_b + "0" + var6;
                continue L1;
              }
            }
          }
        }
    }

    public static void c(byte param0) {
        field_g = null;
        field_f = null;
        if (param0 < 82) {
            nk.c((byte) 16);
        }
    }

    private final void a(int param0, int param1, int param2, ha param3, int param4, byte param5) {
        int var10 = AceOfSkies.field_G ? 1 : 0;
        param1 = param1 * param4 >> -175919416;
        int var7 = 15;
        param3.d(10, param1 + 1, 8 + param2, -5782, -861274112, param0 + -2);
        param0 = param0 - var7;
        param4 = param4 + (var7 << 1999271329);
        dl.field_n[0].a(param0, param2);
        dl.field_n[2].a(-dl.field_n[2].d() + (param0 - -param4), param2);
        bo var8 = fa.a(param3, true);
        param4 = param4 + param0 - dl.field_n[2].d();
        int var9 = param0;
        param0 = param0 + dl.field_n[0].d();
        var8.a(param4, param0, dl.field_n[2].c() + param2, param2, 126);
        while (param4 > param0) {
            dl.field_n[1].a(param0, param2);
            param0 = param0 + dl.field_n[1].d();
        }
        if (param5 >= -11) {
            this.a(-86);
        }
        var8.a(true);
        dl.field_n[3].a(var9 + param1, param2);
    }

    private final int a(int param0, boolean param1) {
        L0: {
          if ((((nk) this).field_d ^ -1) != -3) {
            break L0;
          } else {
            if (cn.b(true)) {
              break L0;
            } else {
              if (3 > param0) {
                return -6 + bk.field_e[((nk) this).field_d];
              } else {
                return -6 + (bk.field_e[((nk) this).field_d] - -oo.field_Y[((nk) this).field_d]);
              }
            }
          }
        }
        L1: {
          if (2 != ((nk) this).field_d) {
            break L1;
          } else {
            if (!cn.b(true)) {
              break L1;
            } else {
              return -6 + (oo.field_Y[((nk) this).field_d] * param0 + bk.field_e[((nk) this).field_d]);
            }
          }
        }
        if (3 == ((nk) this).field_d) {
          return bk.field_e[((nk) this).field_d] + -32;
        } else {
          L2: {
            if (4 == ((nk) this).field_d) {
              break L2;
            } else {
              if (((nk) this).field_d != 5) {
                L3: {
                  if (param1) {
                    break L3;
                  } else {
                    this.a(true, -26, -69);
                    break L3;
                  }
                }
                return oo.field_Y[((nk) this).field_d] * param0 + bk.field_e[((nk) this).field_d];
              } else {
                break L2;
              }
            }
          }
          if ((ua.field_l[((nk) this).field_d].length ^ -1) < -2) {
            return 382 - -(param0 * (12 + oo.field_Y[((nk) this).field_d])) + -4;
          } else {
            return -4 + (oo.field_Y[((nk) this).field_d] * param0 + 430);
          }
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, ha param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        ha stackIn_16_3 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        ha stackIn_17_3 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        ha stackIn_18_3 = null;
        int stackIn_18_4 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        ha stackIn_19_3 = null;
        int stackIn_19_4 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        ha stackIn_20_3 = null;
        int stackIn_20_4 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        ha stackIn_21_3 = null;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        ha stackOut_15_3 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        ha stackOut_17_3 = null;
        int stackOut_17_4 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        ha stackOut_16_3 = null;
        int stackOut_16_4 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        ha stackOut_18_3 = null;
        int stackOut_18_4 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        ha stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        ha stackOut_19_3 = null;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var16 = AceOfSkies.field_G ? 1 : 0;
          var6 = param0 + this.a(param1, true);
          var7 = this.a(param1, 200);
          int discarded$2 = this.c(param2 + 116, param1);
          var8 = ua.field_l[((nk) this).field_d][param1];
          var9 = du.field_p[var8];
          if (var9 != null) {
            break L0;
          } else {
            var9 = "ERROR: missing text";
            break L0;
          }
        }
        L1: {
          var10 = this.c(118, param1) + -var7;
          int discarded$3 = this.b(true, param1);
          if (!param3) {
            stackOut_4_0 = -12046068;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = -7247318;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var11 = stackIn_5_0;
            var12 = -16;
            if (-13 == var8) {
              break L3;
            } else {
              if (-14 != var8) {
                L4: {
                  L5: {
                    if (20 == var8) {
                      break L5;
                    } else {
                      if (var8 != -22) {
                        this.a(var6, param4, param2 ^ -103, var10, var7);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    stackOut_15_0 = this;
                    stackOut_15_1 = var10;
                    stackOut_15_2 = var7;
                    stackOut_15_3 = (ha) param4;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    if (-21 != var8) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = stackIn_17_2;
                      stackOut_17_3 = (ha) (Object) stackIn_17_3;
                      stackOut_17_4 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      stackIn_18_3 = stackOut_17_3;
                      stackIn_18_4 = stackOut_17_4;
                      break L6;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = stackIn_16_2;
                      stackOut_16_3 = (ha) (Object) stackIn_16_3;
                      stackOut_16_4 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      stackIn_18_4 = stackOut_16_4;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = (ha) (Object) stackIn_18_3;
                    stackOut_18_4 = stackIn_18_4;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    stackIn_20_4 = stackOut_18_4;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    stackIn_19_4 = stackOut_18_4;
                    if (cs.field_a != 0) {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = stackIn_20_2;
                      stackOut_20_3 = (ha) (Object) stackIn_20_3;
                      stackOut_20_4 = stackIn_20_4;
                      stackOut_20_5 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      stackIn_21_3 = stackOut_20_3;
                      stackIn_21_4 = stackOut_20_4;
                      stackIn_21_5 = stackOut_20_5;
                      break L7;
                    } else {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = stackIn_19_2;
                      stackOut_19_3 = (ha) (Object) stackIn_19_3;
                      stackOut_19_4 = stackIn_19_4;
                      stackOut_19_5 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      stackIn_21_3 = stackOut_19_3;
                      stackIn_21_4 = stackOut_19_4;
                      stackIn_21_5 = stackOut_19_5;
                      break L7;
                    }
                  }
                  this.a(stackIn_21_1, stackIn_21_2, (ha) (Object) stackIn_21_3, (stackIn_21_4 ^ stackIn_21_5) != 0, var6, 24063);
                  break L4;
                }
                se.field_c.a(param2 + 95, var11, -1, (var12 >> 197427713) + (var6 - -kn.field_b.field_j - -11), (var10 >> -565286591) + var7, var9.toLowerCase());
                break L2;
              } else {
                break L3;
              }
            }
          }
          L8: {
            this.a(var6, param4, -86, var10, var7);
            var13 = oq.field_K + 137;
            var7 -= 8;
            var14 = var7 + (-var13 + var10 >> -2021587487);
            se.field_c.a(var9.toLowerCase(), var11, -1, (var10 >> -2063133375) + (var7 + -15), 11 + ((var12 >> 1122151841) + (kn.field_b.field_j + var6)), (byte) 92);
            var14 = var14 + (16 + oq.field_K);
            if (-13 != (var8 ^ -1)) {
              stackOut_10_0 = l.field_c;
              stackIn_11_0 = stackOut_10_0;
              break L8;
            } else {
              stackOut_9_0 = gn.field_a;
              stackIn_11_0 = stackOut_9_0;
              break L8;
            }
          }
          var15 = stackIn_11_0;
          this.a(var14, var15, 3 + var6, param4, 130, (byte) -55);
          break L2;
        }
        L9: {
          if (param2 == 4) {
            break L9;
          } else {
            field_f = (String[]) null;
            break L9;
          }
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (param0 <= -56) {
          var4 = 0;
          L0: while (true) {
            if (ua.field_l[((nk) this).field_d].length <= var4) {
              return -1;
            } else {
              var5 = this.a(var4, true);
              if (this.a(var4, (byte) -17)) {
                if (param1 >= this.a(var4, 200)) {
                  if (this.c(123, var4) > param1) {
                    if (var5 <= param2) {
                      if (param2 < var5 + this.b(true, var4)) {
                        return var4;
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 82;
        }
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        uc var13_ref = null;
        String[] var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22_int = 0;
        String var22 = null;
        int var23_int = 0;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        ha var30 = null;
        String var32 = null;
        int[] var35 = null;
        String stackIn_37_0 = null;
        String stackOut_36_0 = null;
        String stackOut_35_0 = null;
        L0: {
          var28 = AceOfSkies.field_G ? 1 : 0;
          var30 = pk.field_wb.a((byte) 90);
          var4 = 0;
          if (param0 == -9621) {
            break L0;
          } else {
            field_f = (String[]) null;
            break L0;
          }
        }
        L1: {
          var5 = -1;
          var6 = -16777216;
          var7 = 120;
          var8 = 108 + param1;
          var9 = 400;
          var10 = 280;
          if (2 != fb.field_e) {
            break L1;
          } else {
            var7 -= 10;
            var9 += 20;
            break L1;
          }
        }
        L2: {
          if ((fb.field_e ^ -1) == -4) {
            var9 += 20;
            var7 -= 10;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          this.a(40 + var10, (byte) 86, var7 - 20, 40 + var9, var30, -20 + var8);
          var11 = mf.field_a;
          if ((oc.field_e ^ -1) != -2) {
            break L3;
          } else {
            var11 = wl.field_zc;
            break L3;
          }
        }
        L4: {
          if (2 == oc.field_e) {
            var11 = jo.field_l;
            var12 = var11;
            var12 = var11;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          this.a(param1, (byte) -122, var11);
          if (!cn.b(true)) {
            L6: {
              if (null == ql.field_r) {
                ql.field_r = vo.a((byte) 127, 3, 10, 1, cs.field_a);
                break L6;
              } else {
                break L6;
              }
            }
            var13_ref = ql.field_r;
            if (((uc) var13_ref).field_i) {
              if (null != ((uc) var13_ref).field_e) {
                var12 = df.field_g;
                var14 = ((uc) var13_ref).field_e[oc.field_e];
                var35 = ((uc) var13_ref).field_h[oc.field_e];
                var16 = ca.a(var13_ref, (byte) 113, oc.field_e, to.field_r);
                int discarded$1 = kn.field_b.a((byte) 94, "10. ");
                var17 = param1 + (hi.field_v.field_j + 140);
                var18 = 310;
                var17 -= 20;
                var19 = 128;
                var20 = 512;
                var21 = var5;
                rb.field_j.a(var21, -1, 20 + var19, ob.field_f, 18731, var17);
                rb.field_j.a(101, var21, -1, var17, var18 + (var20 + -320) / 4, ao.field_a);
                rb.field_j.a(fd.field_c, var21, -1, var20, var17, (byte) 92);
                var17 += 20;
                var29 = 0;
                var4 = var29;
                L7: while (true) {
                  if (var29 >= 10) {
                    if (sg.field_c == null) {
                      break L5;
                    } else {
                      if (sg.field_c.field_q <= 0) {
                        break L5;
                      } else {
                        if (var16 == -1) {
                          var19 = 128;
                          var20 = 512;
                          var30.d(16, 20 + var20 + -var19, var17 - 12, -5782, -7247318, var19 + -10);
                          var21 = -256;
                          rb.field_j.a(var5, var5, 19 - -var19, fj.field_a, 18731, var17);
                          rb.field_j.a(var6, var6, 20 - -var19, fj.field_a, 18731, -1 + var17);
                          rb.field_j.a(var21, -1, 20 - -var19, fj.field_a, 18731, var17);
                          var22 = this.b(sg.field_c.field_q, true);
                          rb.field_j.a(var22, var5, var5, -1 + var20, var17, (byte) 92);
                          rb.field_j.a(var22, var6, var6, var20, -1 + var17, (byte) 92);
                          rb.field_j.a(var22, var21, -1, var20, var17, (byte) 92);
                          var23 = Integer.toString(sg.field_c.field_b) + "%";
                          rb.field_j.a(121, var5, var5, var17, -1 + (var20 + var19 >> -1826995711) - -35, var23);
                          rb.field_j.a(param0 + 9746, var6, var6, var17 - 1, 35 + (var19 + var20 >> 747678433), var23);
                          rb.field_j.a(111, var21, -1, var17, (var20 + var19 >> -1503917695) - -35, var23);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    var19 = 128;
                    var20 = 512;
                    if (var14[var29] != null) {
                      L8: {
                        var21 = -12046068;
                        var22_int = var35[var29] / 100;
                        var21 = -2250240;
                        var23_int = var35[var29] % 100;
                        var24 = var14[var29];
                        if (var16 == var29) {
                          var30.d(16, var20 + (20 - var19), -12 + var17, param0 ^ 13057, -7247318, var19 + -10);
                          var21 = -256;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      rb.field_j.a(var5, var5, -1 + (20 - -var19), var24, 18731, var17);
                      var25 = var29 + 1 + ". ";
                      rb.field_j.a(var6, var6, 20 - -var19, var24, param0 ^ -27840, -1 + var17);
                      rb.field_j.a(var21, -1, var19 + 20, var24, param0 + 28352, var17);
                      rb.field_j.a(var25, var5, var5, 20 + (var19 + -1), var17, (byte) 92);
                      rb.field_j.a(var25, var6, var6, var19 + 20, -1 + var17, (byte) 92);
                      rb.field_j.a(var25, var21, -1, 20 - -var19, var17, (byte) 92);
                      var26 = this.b(var22_int, true);
                      rb.field_j.a(var26, var5, var5, var20 - 1, var17, (byte) 92);
                      rb.field_j.a(var26, var6, var6, var20, var17 - 1, (byte) 92);
                      rb.field_j.a(var26, var21, -1, var20, var17, (byte) 92);
                      var27 = Integer.toString(var23_int) + "%";
                      rb.field_j.a(121, var5, var5, var17, -1 + ((var19 + var20 >> -481635135) - -35), var27);
                      rb.field_j.a(param0 ^ -9704, var6, var6, -1 + var17, (var19 + var20 >> 938485409) - -35, var27);
                      var12 = "";
                      rb.field_j.a(124, var21, -1, var17, 35 + (var19 + var20 >> -795531807), var27);
                      var17 += 20;
                      var29++;
                      continue L7;
                    } else {
                      var17 += 20;
                      var29++;
                      continue L7;
                    }
                  }
                }
              } else {
                var12 = ul.field_t;
                break L5;
              }
            } else {
              var12 = jr.field_r;
              break L5;
            }
          } else {
            var12 = df.field_g;
            break L5;
          }
        }
        L9: {
          var13 = kn.field_b.field_j + (param1 - -140 - -100);
          rb.field_j.a(117, var5, -1, var13, 320, var12);
          if (!cn.b(true)) {
            stackOut_36_0 = fs.field_f;
            stackIn_37_0 = stackOut_36_0;
            break L9;
          } else {
            stackOut_35_0 = bt.field_c;
            stackIn_37_0 = stackOut_35_0;
            break L9;
          }
        }
        var32 = (String) (Object) stackIn_37_0;
        var12 = var32;
        rb.field_j.a(113, var5, -1, 220 + param1 - (-140 + -hi.field_v.field_j), 320, var32);
    }

    private final boolean a(int param0, byte param1) {
        if (!(((nk) this).field_d != 3)) {
            if (0 == param0) {
                if (!(0 != vq.field_w)) {
                    return false;
                }
            }
            if (param0 == 2) {
                if (!(vq.field_w != -1 + io.field_a.length)) {
                    return false;
                }
            }
        }
        if (param1 != -17) {
            return false;
        }
        if (-3 == (((nk) this).field_d ^ -1)) {
            if (!(2 > ln.field_d)) {
                return true;
            }
            if (param0 != 5) {
                // if_icmpne L105
            }
            if (!kh.field_a) {
                return false;
            }
        }
        return true;
    }

    final static java.awt.Container b(byte param0) {
        if (null != si.field_d) {
            return (java.awt.Container) (Object) si.field_d;
        }
        if (param0 < 126) {
            String var2 = (String) null;
            uf discarded$0 = nk.a((byte) 67, -122, (wl) null, (String) null);
        }
        return (java.awt.Container) (Object) bm.m(118);
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        if (-1 == (((nk) this).field_d ^ -1)) {
            if (!(((nk) this).field_i.field_g == 0)) {
                var3 = ((nk) this).field_i.field_g;
            }
        }
        if (param1 != 1) {
            return;
        }
        if (-2 == ((nk) this).field_d) {
            if (-1 != ((nk) this).field_i.field_g) {
                if (0 != po.field_h) {
                    var3 = ((nk) this).field_i.field_g;
                }
            }
        }
        if (!(-4 != ((nk) this).field_d)) {
            var3 = 2;
        }
        ((nk) this).field_i.a(param0, this.a(param1 + -77, ic.field_b, cf.field_g), 0, var3);
        ((nk) this).field_e = -1;
    }

    private final void a(int param0, byte param1, int param2, int param3, ha param4, int param5) {
        int var15 = AceOfSkies.field_G ? 1 : 0;
        bo var16 = fa.a(param4, true);
        var16.a(param3 + (param2 - 5), 5 + param2, -5 + (param5 - -param0), param5 + 5, -71);
        int var8 = 0;
        while (var8 < param0 - 10) {
            qk.field_i.b(param2 - -5, var8 + (param5 + 5), -10 + param3, qk.field_i.c());
            var8 = var8 + qk.field_i.c();
        }
        var16.a(true);
        ha var9 = param4;
        int var10 = param2;
        int var11 = param5;
        int var12 = param3;
        if (param1 != 86) {
            this.a(-92);
        }
        int var13 = param0;
        pa[] var14 = ko.field_g;
        hb.a(var11, 0, var10, 1, 1, var12, var13, var9, (byte) 104, var14);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          var4 = ua.field_l[((nk) this).field_d][param2];
          if (((nk) this).field_i.e((byte) 125)) {
            rh discarded$7 = bm.a((byte) -70, gg.field_a);
            break L0;
          } else {
            if (var4 == ((nk) this).field_a) {
              break L0;
            } else {
              ((nk) this).field_a = var4;
              rh discarded$8 = bm.a((byte) -70, kq.field_b);
              break L0;
            }
          }
        }
        if (param1 == 3) {
          L1: {
            var5 = var4;
            if (var5 != -1) {
              if (-20 != var5) {
                if ((var5 ^ -1) != -23) {
                  if (var5 == -2) {
                    if (!((nk) this).field_i.e((byte) 114)) {
                      break L1;
                    } else {
                      eu.a((byte) 33, -1, param0);
                      sg.field_c.e(-112);
                      co.field_b = 0;
                      break L1;
                    }
                  } else {
                    if (5 != var5) {
                      if (16 == var5) {
                        if (((nk) this).field_i.e((byte) 120)) {
                          eu.a((byte) -117, 0, param0);
                          r.field_n = 0;
                          hg.field_D = 0;
                          sb.field_c.c(268435455);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (14 == var5) {
                          if (!((nk) this).field_i.e((byte) 127)) {
                            break L1;
                          } else {
                            eu.a((byte) 98, 4, param0);
                            co.field_b = ((nk) this).field_d;
                            break L1;
                          }
                        } else {
                          if (-4 == var5) {
                            if (((nk) this).field_i.e((byte) 82)) {
                              vq.field_w = 0;
                              eu.a((byte) -94, 3, param0);
                              co.field_b = ((nk) this).field_d;
                              break L1;
                            } else {
                              break L1;
                            }
                          } else {
                            if (6 == var5) {
                              if (((nk) this).field_i.e((byte) 104)) {
                                eu.a((byte) -80, co.field_b, param0);
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              if (-3 != (var5 ^ -1)) {
                                if (12 == var5) {
                                  L2: {
                                    if (!((nk) this).field_i.d(55)) {
                                      break L2;
                                    } else {
                                      rt.b(0, (byte) -117);
                                      rh discarded$9 = lq.a(fd.field_b[3], 110);
                                      break L2;
                                    }
                                  }
                                  L3: {
                                    if (((nk) this).field_i.b(-99)) {
                                      rt.b(256, (byte) 59);
                                      rh discarded$10 = lq.a(fd.field_b[3], param1 ^ -10);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    if (((nk) this).field_i.a(-78)) {
                                      r.e(param1 + -14601);
                                      rh discarded$11 = lq.a(fd.field_b[3], 70);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (((nk) this).field_i.b((byte) -102)) {
                                      dq.a((byte) -2);
                                      rh discarded$12 = lq.a(fd.field_b[3], -126);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  if (((nk) this).field_i.a((byte) 98)) {
                                    L6: {
                                      var5 = 137 + oq.field_K;
                                      var6 = (this.a(param2, param1 + 197) - -this.c(param1 + 121, param2) + -var5 >> 38244609) - -oq.field_K + 8;
                                      var7 = ic.field_b + -var6 << -1845905119;
                                      if (-1 <= (var7 ^ -1)) {
                                        rt.b(0, (byte) 70);
                                        break L6;
                                      } else {
                                        if (256 <= var7) {
                                          rt.b(256, (byte) -114);
                                          break L6;
                                        } else {
                                          rt.b(var7, (byte) -123);
                                          break L6;
                                        }
                                      }
                                    }
                                    if (-1 > (((nk) this).field_h ^ -1)) {
                                      break L1;
                                    } else {
                                      rh discarded$13 = lq.a(fd.field_b[3], 81);
                                      ((nk) this).field_h = 10;
                                      break L1;
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (var5 != -14) {
                                    if (-5 == var5) {
                                      if (((nk) this).field_i.e((byte) 126)) {
                                        if (jf.field_a != null) {
                                          tt.b(-32546);
                                          break L1;
                                        } else {
                                          ql.a((byte) -103, param0);
                                          break L1;
                                        }
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if ((var5 ^ -1) != -8) {
                                        if ((var5 ^ -1) != -9) {
                                          if ((var5 ^ -1) != -10) {
                                            if ((var5 ^ -1) == -11) {
                                              if (((nk) this).field_i.e((byte) 87)) {
                                                oc.field_e = 2;
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              if (15 == var5) {
                                                if (!((nk) this).field_i.e((byte) 97)) {
                                                  break L1;
                                                } else {
                                                  L7: {
                                                    if (((nk) this).field_d == 4) {
                                                      break L7;
                                                    } else {
                                                      if (((nk) this).field_d == 2) {
                                                        break L7;
                                                      } else {
                                                        if ((((nk) this).field_d ^ -1) == -7) {
                                                          L8: {
                                                            stackOut_125_0 = param1 + 25365;
                                                            stackOut_125_1 = 6;
                                                            stackIn_127_0 = stackOut_125_0;
                                                            stackIn_127_1 = stackOut_125_1;
                                                            stackIn_126_0 = stackOut_125_0;
                                                            stackIn_126_1 = stackOut_125_1;
                                                            if (0 == r.field_n) {
                                                              stackOut_127_0 = stackIn_127_0;
                                                              stackOut_127_1 = stackIn_127_1;
                                                              stackOut_127_2 = 2;
                                                              stackIn_128_0 = stackOut_127_0;
                                                              stackIn_128_1 = stackOut_127_1;
                                                              stackIn_128_2 = stackOut_127_2;
                                                              break L8;
                                                            } else {
                                                              stackOut_126_0 = stackIn_126_0;
                                                              stackOut_126_1 = stackIn_126_1;
                                                              stackOut_126_2 = 5;
                                                              stackIn_128_0 = stackOut_126_0;
                                                              stackIn_128_1 = stackOut_126_1;
                                                              stackIn_128_2 = stackOut_126_2;
                                                              break L8;
                                                            }
                                                          }
                                                          nf.a(stackIn_128_0, stackIn_128_1, stackIn_128_2);
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  nf.a(25368, ((nk) this).field_d, ((nk) this).field_d);
                                                  break L1;
                                                }
                                              } else {
                                                if (var5 != 18) {
                                                  if (17 != var5) {
                                                    if (11 == var5) {
                                                      if (((nk) this).field_i.e((byte) 113)) {
                                                        L9: {
                                                          if (jf.field_a == null) {
                                                            break L9;
                                                          } else {
                                                            tt.b(-32546);
                                                            break L9;
                                                          }
                                                        }
                                                        rr.a((byte) -56, bm.m(param1 + 106));
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    } else {
                                                      if (-21 == (var5 ^ -1)) {
                                                        if (((nk) this).field_i.e((byte) 106)) {
                                                          ql.field_r = null;
                                                          cs.field_a = 1;
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      } else {
                                                        if (21 == var5) {
                                                          if (!((nk) this).field_i.e((byte) 110)) {
                                                            break L1;
                                                          } else {
                                                            cs.field_a = 0;
                                                            ql.field_r = null;
                                                            break L1;
                                                          }
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (!((nk) this).field_i.e((byte) 112)) {
                                                      break L1;
                                                    } else {
                                                      if (!this.a(param2, (byte) -17)) {
                                                        break L1;
                                                      } else {
                                                        vq.field_w = vq.field_w + 1;
                                                        if (!this.a(param2, (byte) -17)) {
                                                          ((nk) this).field_i.field_g = 0;
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (!((nk) this).field_i.e((byte) 101)) {
                                                    break L1;
                                                  } else {
                                                    if (this.a(param2, (byte) -17)) {
                                                      vq.field_w = vq.field_w - 1;
                                                      if (this.a(param2, (byte) -17)) {
                                                        break L1;
                                                      } else {
                                                        ((nk) this).field_i.field_g = 2;
                                                        break L1;
                                                      }
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (((nk) this).field_i.e((byte) 88)) {
                                              oc.field_e = 1;
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          }
                                        } else {
                                          if (((nk) this).field_i.e((byte) 124)) {
                                            oc.field_e = 0;
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      } else {
                                        if (!((nk) this).field_i.e((byte) 82)) {
                                          break L1;
                                        } else {
                                          sg.field_c.a(param0, false, 100);
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    L10: {
                                      if (((nk) this).field_i.d(param1 + 50)) {
                                        ve.a((byte) 43, 0);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (((nk) this).field_i.b(-39)) {
                                        ve.a((byte) 43, 256);
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (((nk) this).field_i.a(param1 + -11)) {
                                        lj.a(100);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (((nk) this).field_i.b((byte) -102)) {
                                        wk.c((byte) -118);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    if (((nk) this).field_i.a((byte) 119)) {
                                      var5 = 128 + oq.field_K + 9;
                                      var6 = (-var5 + this.a(param2, 200) - -this.c(param1 ^ 124, param2) >> 2081852321) - (-oq.field_K + -8);
                                      var7 = ic.field_b + -var6 << 2069087649;
                                      if (-1 > (var7 ^ -1)) {
                                        if ((var7 ^ -1) > -257) {
                                          ve.a((byte) 43, var7);
                                          break L1;
                                        } else {
                                          ve.a((byte) 43, 256);
                                          break L1;
                                        }
                                      } else {
                                        ve.a((byte) 43, 0);
                                        break L1;
                                      }
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                if (!((nk) this).field_i.e((byte) 98)) {
                                  break L1;
                                } else {
                                  eu.a((byte) 90, 2, param0);
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (!((nk) this).field_i.e((byte) 86)) {
                        break L1;
                      } else {
                        eu.a((byte) 115, 0, param0);
                        break L1;
                      }
                    }
                  }
                } else {
                  if (!((nk) this).field_i.e((byte) 81)) {
                    break L1;
                  } else {
                    eu.a((byte) 122, 7, param0);
                    co.field_b = 0;
                    break L1;
                  }
                }
              } else {
                if (((nk) this).field_i.e((byte) 104)) {
                  sg.field_c.a(61, true);
                  eu.a((byte) 78, -1, param0);
                  co.field_b = ((nk) this).field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              if (!((nk) this).field_i.e((byte) 84)) {
                break L1;
              } else {
                sg.field_c.a(101, false);
                eu.a((byte) -96, -1, param0);
                co.field_b = ((nk) this).field_d;
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != 200) {
            int discarded$0 = this.b(false, -104);
        }
        if ((((nk) this).field_d ^ -1) == -3) {
            if (!cn.b(true)) {
                return dt.field_a[((nk) this).field_d] - -(200 * (param0 % 3));
            }
        }
        if (-3 == (((nk) this).field_d ^ -1)) {
            if (!(!cn.b(true))) {
                return dt.field_a[((nk) this).field_d] - 100;
            }
        }
        if ((((nk) this).field_d ^ -1) == -4) {
            return 200 * param0 + 20;
        }
        if (((nk) this).field_d != 4) {
            // if_icmpeq L126
        } else {
            return 120;
        }
        return dt.field_a[((nk) this).field_d];
    }

    private final void a(int param0, int param1, ha param2, boolean param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        bo var11 = null;
        bo var12 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        if (param5 == 24063) {
          mb.field_u[0].a(param1, param4);
          mb.field_u[2].a(-mb.field_u[2].d() + (param0 + param1), param4);
          var11 = fa.a(param2, true);
          var12 = var11;
          var8 = param0 + param1 + -mb.field_u[2].d();
          param1 = param1 + mb.field_u[0].d();
          var12.a(var8, param1, param4 + mb.field_u[2].c(), param4, 102);
          L0: while (true) {
            if (var8 <= param1) {
              L1: {
                var12.a(true);
                jm.field_a[21].b(param1 + 3, 9 + param4, 16, 16);
                jm.field_a[21].b(-param0 + (20 + param1), 9 + param4, 16, 16);
                uc.field_o[0].b(param1 - -3, 9 + param4, 16, 16);
                uc.field_o[0].b(-param0 + param1 + 20, 9 + param4, 16, 16);
                if (param3) {
                  uc.field_o[1].a(-15 + param1, -12 + param4, 1, 0, 2);
                  uc.field_o[1].a(-param0 + param1 + 1, -12 + param4, 1, 0, 2);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              mb.field_u[1].a(param1, param4);
              param1 = param1 + mb.field_u[1].d();
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (-101 >= (cd.field_f ^ -1)) {
            break L0;
          } else {
            cd.field_f = cd.field_f + 1;
            break L0;
          }
        }
        L1: {
          if ((((nk) this).field_h ^ -1) < -1) {
            ((nk) this).field_h = ((nk) this).field_h - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: while (true) {
          if (!ek.a((byte) -126)) {
            L3: {
              if (param0 == -25039) {
                break L3;
              } else {
                ((nk) this).field_c = 31;
                break L3;
              }
            }
            L4: {
              ((nk) this).field_i.a(this.a(-66, ln.field_c, lq.field_a), this.a(param0 + 24945, ic.field_b, cf.field_g), -24702);
              if (((nk) this).field_i.field_g != -1) {
                this.a(true, 3, ((nk) this).field_i.field_g);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (vj.field_d == 0) {
                break L5;
              } else {
                ((nk) this).field_c = ln.field_c;
                ((nk) this).field_b = lq.field_a;
                break L5;
              }
            }
            return;
          } else {
            L6: {
              if (bk.field_f != -51) {
                break L6;
              } else {
                if (!lp.field_a[81]) {
                  break L6;
                } else {
                  if (-3 <= ln.field_d) {
                    mj.field_b = mj.field_b ^ true;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            if (-14 == (bk.field_f ^ -1)) {
              if (1 != ((nk) this).field_d) {
                if ((((nk) this).field_d ^ -1) != -7) {
                  eu.a((byte) 37, co.field_b, false);
                  continue L2;
                } else {
                  continue L2;
                }
              } else {
                eu.a((byte) -126, -1, false);
                sg.field_c.e(param0 ^ 24995);
                co.field_b = 0;
                continue L2;
              }
            } else {
              this.a(param0 + 29185);
              if (((nk) this).field_i.field_g != -1) {
                this.a(false, 3, ((nk) this).field_i.field_g);
                continue L2;
              } else {
                continue L2;
              }
            }
          }
        }
    }

    private final int b(boolean param0, int param1) {
        if (!param0) {
            return 39;
        }
        return 30;
    }

    final static uf a(byte param0, int param1, wl param2, String param3) {
        int var4 = jaggl.OpenGL.glGenProgramARB();
        jaggl.OpenGL.glBindProgramARB(param1, var4);
        jaggl.OpenGL.glProgramStringARB(param1, 34933, param3);
        jaggl.OpenGL.glGetIntegerv(34379, ik.field_m, 0);
        if (param0 <= 22) {
            nk.a((byte) -82, 1, false);
        }
        if (0 != (ik.field_m[0] ^ -1)) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            return null;
        }
        jaggl.OpenGL.glBindProgramARB(param1, 0);
        return new uf(param2, param1, var4);
    }

    final static void a(byte param0, gk param1, gk param2) {
        ka.field_a = qg.a((byte) 3, param1, "", "frame");
        rg.field_F = qg.a((byte) 3, param1, "", "button_raised");
        wt.field_h = qg.a((byte) 3, param1, "", "button_frame");
        bo.field_a = (hc) (Object) gl.a(param1, "b12", "", param2, param0 ^ -48);
        if (param0 != -56) {
            field_g = (kp) null;
        }
    }

    private final void a(int param0, ha param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = AceOfSkies.field_G ? 1 : 0;
        bo var18 = fa.a(param1, true);
        var18.a(-5 + (param3 + param2), 5 + param2, param5 + param4 - 5, param4 + 5, -21);
        int var9 = 0;
        while (param5 - 10 > var9) {
            qk.field_i.a(5 + param2, param4 + var9 - -5, -10 + param3, qk.field_i.c(), 2, param6, 0);
            var9 = var9 + qk.field_i.c();
        }
        var18.a(true);
        ha var10 = param1;
        int var11 = param2;
        int var12 = param4;
        int var13 = param3;
        int var14 = param5;
        int var16 = -25 % ((-20 - param0) / 40);
        pa[] var15 = ko.field_g;
        hb.a(var12, 0, var11, 1, 1, var13, var14, var10, (byte) 98, var15);
    }

    final void a(int param0, ha param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        da stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        da stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        da stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        da stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        da stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        da stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        da stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        da stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        da stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        da stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        da stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        da stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        int stackIn_32_6 = 0;
        int stackIn_32_7 = 0;
        int stackIn_32_8 = 0;
        da stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        int stackIn_33_6 = 0;
        da stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_34_6 = 0;
        da stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_35_6 = 0;
        int stackIn_35_7 = 0;
        da stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_36_5 = 0;
        int stackIn_36_6 = 0;
        int stackIn_36_7 = 0;
        da stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        int stackIn_37_7 = 0;
        da stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_38_5 = 0;
        int stackIn_38_6 = 0;
        int stackIn_38_7 = 0;
        int stackIn_38_8 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        da stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        da stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        da stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        da stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        da stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        da stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        da stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        da stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        da stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        da stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_29_6 = 0;
        int stackOut_29_7 = 0;
        da stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        int stackOut_31_6 = 0;
        int stackOut_31_7 = 0;
        int stackOut_31_8 = 0;
        da stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_30_6 = 0;
        int stackOut_30_7 = 0;
        int stackOut_30_8 = 0;
        da stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        int stackOut_32_6 = 0;
        da stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_34_6 = 0;
        int stackOut_34_7 = 0;
        da stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        int stackOut_33_6 = 0;
        int stackOut_33_7 = 0;
        da stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_35_5 = 0;
        int stackOut_35_6 = 0;
        int stackOut_35_7 = 0;
        da stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        int stackOut_37_6 = 0;
        int stackOut_37_7 = 0;
        int stackOut_37_8 = 0;
        da stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        int stackOut_36_6 = 0;
        int stackOut_36_7 = 0;
        int stackOut_36_8 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        L0: {
          L1: {
            var10 = AceOfSkies.field_G ? 1 : 0;
            var4 = 25;
            var5 = 12;
            if (((nk) this).field_d == 0) {
              break L1;
            } else {
              if (1 == ((nk) this).field_d) {
                break L1;
              } else {
                if ((((nk) this).field_d ^ -1) == -8) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          this.a(oo.field_Y[((nk) this).field_d] * ua.field_l[((nk) this).field_d].length + 2 * var5, (byte) 86, -var4 + dt.field_a[((nk) this).field_d], ak.field_f[((nk) this).field_d] - (dt.field_a[((nk) this).field_d] + -(var4 * 2)), param1, bk.field_e[((nk) this).field_d] + (-var5 + param0));
          break L0;
        }
        L2: {
          if (-3 < (ln.field_d ^ -1)) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var6 = stackIn_8_0;
          if (param2 == -4) {
            break L3;
          } else {
            ((nk) this).field_b = -36;
            break L3;
          }
        }
        L4: {
          if ((((nk) this).field_d ^ -1) == -2) {
            this.a(param0, (byte) 81, kg.field_c);
            break L4;
          } else {
            if ((((nk) this).field_d ^ -1) != -8) {
              if ((((nk) this).field_d ^ -1) == -3) {
                this.d(-9621, param0);
                break L4;
              } else {
                if (((nk) this).field_d == -4) {
                  this.b(197427713, param0);
                  break L4;
                } else {
                  if (((nk) this).field_d == 4) {
                    this.b(false, param0, param2 + -123);
                    break L4;
                  } else {
                    if (-6 != ((nk) this).field_d) {
                      if ((((nk) this).field_d ^ -1) == -7) {
                        L5: {
                          bk.field_e[((nk) this).field_d] = 230;
                          var7 = param0 + -40 + (kn.field_b.field_j + 200);
                          var8 = 255;
                          var9 = kn.field_b.field_i + kn.field_b.field_a + 4;
                          rb.field_j.a(112, var8 << -728168328 | 16777215, -1, var7, 320, gg.field_i);
                          stackOut_20_0 = rb.field_j;
                          stackOut_20_1 = 126;
                          stackOut_20_2 = var8 << 998263256 | 16777215;
                          stackOut_20_3 = -1;
                          stackOut_20_4 = var7 + var9;
                          stackOut_20_5 = 320;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_22_2 = stackOut_20_2;
                          stackIn_22_3 = stackOut_20_3;
                          stackIn_22_4 = stackOut_20_4;
                          stackIn_22_5 = stackOut_20_5;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          stackIn_21_2 = stackOut_20_2;
                          stackIn_21_3 = stackOut_20_3;
                          stackIn_21_4 = stackOut_20_4;
                          stackIn_21_5 = stackOut_20_5;
                          if (r.field_n == 0) {
                            stackOut_22_0 = (da) (Object) stackIn_22_0;
                            stackOut_22_1 = stackIn_22_1;
                            stackOut_22_2 = stackIn_22_2;
                            stackOut_22_3 = stackIn_22_3;
                            stackOut_22_4 = stackIn_22_4;
                            stackOut_22_5 = stackIn_22_5;
                            stackOut_22_6 = 0;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            stackIn_23_2 = stackOut_22_2;
                            stackIn_23_3 = stackOut_22_3;
                            stackIn_23_4 = stackOut_22_4;
                            stackIn_23_5 = stackOut_22_5;
                            stackIn_23_6 = stackOut_22_6;
                            break L5;
                          } else {
                            stackOut_21_0 = (da) (Object) stackIn_21_0;
                            stackOut_21_1 = stackIn_21_1;
                            stackOut_21_2 = stackIn_21_2;
                            stackOut_21_3 = stackIn_21_3;
                            stackOut_21_4 = stackIn_21_4;
                            stackOut_21_5 = stackIn_21_5;
                            stackOut_21_6 = 1;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            stackIn_23_2 = stackOut_21_2;
                            stackIn_23_3 = stackOut_21_3;
                            stackIn_23_4 = stackOut_21_4;
                            stackIn_23_5 = stackOut_21_5;
                            stackIn_23_6 = stackOut_21_6;
                            break L5;
                          }
                        }
                        L6: {
                          stackOut_23_0 = (da) (Object) stackIn_23_0;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = stackIn_23_2;
                          stackOut_23_3 = stackIn_23_3;
                          stackOut_23_4 = stackIn_23_4;
                          stackOut_23_5 = stackIn_23_5;
                          stackOut_23_6 = stackIn_23_6;
                          stackOut_23_7 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_25_2 = stackOut_23_2;
                          stackIn_25_3 = stackOut_23_3;
                          stackIn_25_4 = stackOut_23_4;
                          stackIn_25_5 = stackOut_23_5;
                          stackIn_25_6 = stackOut_23_6;
                          stackIn_25_7 = stackOut_23_7;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          stackIn_24_2 = stackOut_23_2;
                          stackIn_24_3 = stackOut_23_3;
                          stackIn_24_4 = stackOut_23_4;
                          stackIn_24_5 = stackOut_23_5;
                          stackIn_24_6 = stackOut_23_6;
                          stackIn_24_7 = stackOut_23_7;
                          if (0 == or.field_a) {
                            stackOut_25_0 = (da) (Object) stackIn_25_0;
                            stackOut_25_1 = stackIn_25_1;
                            stackOut_25_2 = stackIn_25_2;
                            stackOut_25_3 = stackIn_25_3;
                            stackOut_25_4 = stackIn_25_4;
                            stackOut_25_5 = stackIn_25_5;
                            stackOut_25_6 = stackIn_25_6;
                            stackOut_25_7 = stackIn_25_7;
                            stackOut_25_8 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            stackIn_26_2 = stackOut_25_2;
                            stackIn_26_3 = stackOut_25_3;
                            stackIn_26_4 = stackOut_25_4;
                            stackIn_26_5 = stackOut_25_5;
                            stackIn_26_6 = stackOut_25_6;
                            stackIn_26_7 = stackOut_25_7;
                            stackIn_26_8 = stackOut_25_8;
                            break L6;
                          } else {
                            stackOut_24_0 = (da) (Object) stackIn_24_0;
                            stackOut_24_1 = stackIn_24_1;
                            stackOut_24_2 = stackIn_24_2;
                            stackOut_24_3 = stackIn_24_3;
                            stackOut_24_4 = stackIn_24_4;
                            stackOut_24_5 = stackIn_24_5;
                            stackOut_24_6 = stackIn_24_6;
                            stackOut_24_7 = stackIn_24_7;
                            stackOut_24_8 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            stackIn_26_2 = stackOut_24_2;
                            stackIn_26_3 = stackOut_24_3;
                            stackIn_26_4 = stackOut_24_4;
                            stackIn_26_5 = stackOut_24_5;
                            stackIn_26_6 = stackOut_24_6;
                            stackIn_26_7 = stackOut_24_7;
                            stackIn_26_8 = stackOut_24_8;
                            break L6;
                          }
                        }
                        L7: {
                          ((da) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, st.a(stackIn_26_6 != 0, stackIn_26_7 != 0, stackIn_26_8 != 0, false));
                          stackOut_26_0 = rb.field_j;
                          stackOut_26_1 = param2 + 121;
                          stackOut_26_2 = 16777215 | var8 << 1060891160;
                          stackOut_26_3 = -1;
                          stackOut_26_4 = 30 + var7 - -(var9 * 5);
                          stackOut_26_5 = 320;
                          stackIn_28_0 = stackOut_26_0;
                          stackIn_28_1 = stackOut_26_1;
                          stackIn_28_2 = stackOut_26_2;
                          stackIn_28_3 = stackOut_26_3;
                          stackIn_28_4 = stackOut_26_4;
                          stackIn_28_5 = stackOut_26_5;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          stackIn_27_2 = stackOut_26_2;
                          stackIn_27_3 = stackOut_26_3;
                          stackIn_27_4 = stackOut_26_4;
                          stackIn_27_5 = stackOut_26_5;
                          if (r.field_n == 0) {
                            stackOut_28_0 = (da) (Object) stackIn_28_0;
                            stackOut_28_1 = stackIn_28_1;
                            stackOut_28_2 = stackIn_28_2;
                            stackOut_28_3 = stackIn_28_3;
                            stackOut_28_4 = stackIn_28_4;
                            stackOut_28_5 = stackIn_28_5;
                            stackOut_28_6 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            stackIn_29_2 = stackOut_28_2;
                            stackIn_29_3 = stackOut_28_3;
                            stackIn_29_4 = stackOut_28_4;
                            stackIn_29_5 = stackOut_28_5;
                            stackIn_29_6 = stackOut_28_6;
                            break L7;
                          } else {
                            stackOut_27_0 = (da) (Object) stackIn_27_0;
                            stackOut_27_1 = stackIn_27_1;
                            stackOut_27_2 = stackIn_27_2;
                            stackOut_27_3 = stackIn_27_3;
                            stackOut_27_4 = stackIn_27_4;
                            stackOut_27_5 = stackIn_27_5;
                            stackOut_27_6 = 1;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_29_1 = stackOut_27_1;
                            stackIn_29_2 = stackOut_27_2;
                            stackIn_29_3 = stackOut_27_3;
                            stackIn_29_4 = stackOut_27_4;
                            stackIn_29_5 = stackOut_27_5;
                            stackIn_29_6 = stackOut_27_6;
                            break L7;
                          }
                        }
                        L8: {
                          stackOut_29_0 = (da) (Object) stackIn_29_0;
                          stackOut_29_1 = stackIn_29_1;
                          stackOut_29_2 = stackIn_29_2;
                          stackOut_29_3 = stackIn_29_3;
                          stackOut_29_4 = stackIn_29_4;
                          stackOut_29_5 = stackIn_29_5;
                          stackOut_29_6 = stackIn_29_6;
                          stackOut_29_7 = 121;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_31_1 = stackOut_29_1;
                          stackIn_31_2 = stackOut_29_2;
                          stackIn_31_3 = stackOut_29_3;
                          stackIn_31_4 = stackOut_29_4;
                          stackIn_31_5 = stackOut_29_5;
                          stackIn_31_6 = stackOut_29_6;
                          stackIn_31_7 = stackOut_29_7;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          stackIn_30_2 = stackOut_29_2;
                          stackIn_30_3 = stackOut_29_3;
                          stackIn_30_4 = stackOut_29_4;
                          stackIn_30_5 = stackOut_29_5;
                          stackIn_30_6 = stackOut_29_6;
                          stackIn_30_7 = stackOut_29_7;
                          if (or.field_a == 0) {
                            stackOut_31_0 = (da) (Object) stackIn_31_0;
                            stackOut_31_1 = stackIn_31_1;
                            stackOut_31_2 = stackIn_31_2;
                            stackOut_31_3 = stackIn_31_3;
                            stackOut_31_4 = stackIn_31_4;
                            stackOut_31_5 = stackIn_31_5;
                            stackOut_31_6 = stackIn_31_6;
                            stackOut_31_7 = stackIn_31_7;
                            stackOut_31_8 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            stackIn_32_2 = stackOut_31_2;
                            stackIn_32_3 = stackOut_31_3;
                            stackIn_32_4 = stackOut_31_4;
                            stackIn_32_5 = stackOut_31_5;
                            stackIn_32_6 = stackOut_31_6;
                            stackIn_32_7 = stackOut_31_7;
                            stackIn_32_8 = stackOut_31_8;
                            break L8;
                          } else {
                            stackOut_30_0 = (da) (Object) stackIn_30_0;
                            stackOut_30_1 = stackIn_30_1;
                            stackOut_30_2 = stackIn_30_2;
                            stackOut_30_3 = stackIn_30_3;
                            stackOut_30_4 = stackIn_30_4;
                            stackOut_30_5 = stackIn_30_5;
                            stackOut_30_6 = stackIn_30_6;
                            stackOut_30_7 = stackIn_30_7;
                            stackOut_30_8 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            stackIn_32_2 = stackOut_30_2;
                            stackIn_32_3 = stackOut_30_3;
                            stackIn_32_4 = stackOut_30_4;
                            stackIn_32_5 = stackOut_30_5;
                            stackIn_32_6 = stackOut_30_6;
                            stackIn_32_7 = stackOut_30_7;
                            stackIn_32_8 = stackOut_30_8;
                            break L8;
                          }
                        }
                        L9: {
                          ((da) (Object) stackIn_32_0).a(stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4, stackIn_32_5, ci.a(stackIn_32_6 != 0, (byte) stackIn_32_7, stackIn_32_8 != 0, false));
                          stackOut_32_0 = rb.field_j;
                          stackOut_32_1 = 119;
                          stackOut_32_2 = 16777215 | var8 << -703615112;
                          stackOut_32_3 = -1;
                          stackOut_32_4 = 60 + (var9 * 8 + var7);
                          stackOut_32_5 = 320;
                          stackOut_32_6 = -93;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          stackIn_34_2 = stackOut_32_2;
                          stackIn_34_3 = stackOut_32_3;
                          stackIn_34_4 = stackOut_32_4;
                          stackIn_34_5 = stackOut_32_5;
                          stackIn_34_6 = stackOut_32_6;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          stackIn_33_2 = stackOut_32_2;
                          stackIn_33_3 = stackOut_32_3;
                          stackIn_33_4 = stackOut_32_4;
                          stackIn_33_5 = stackOut_32_5;
                          stackIn_33_6 = stackOut_32_6;
                          if (r.field_n == 0) {
                            stackOut_34_0 = (da) (Object) stackIn_34_0;
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = stackIn_34_2;
                            stackOut_34_3 = stackIn_34_3;
                            stackOut_34_4 = stackIn_34_4;
                            stackOut_34_5 = stackIn_34_5;
                            stackOut_34_6 = stackIn_34_6;
                            stackOut_34_7 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            stackIn_35_2 = stackOut_34_2;
                            stackIn_35_3 = stackOut_34_3;
                            stackIn_35_4 = stackOut_34_4;
                            stackIn_35_5 = stackOut_34_5;
                            stackIn_35_6 = stackOut_34_6;
                            stackIn_35_7 = stackOut_34_7;
                            break L9;
                          } else {
                            stackOut_33_0 = (da) (Object) stackIn_33_0;
                            stackOut_33_1 = stackIn_33_1;
                            stackOut_33_2 = stackIn_33_2;
                            stackOut_33_3 = stackIn_33_3;
                            stackOut_33_4 = stackIn_33_4;
                            stackOut_33_5 = stackIn_33_5;
                            stackOut_33_6 = stackIn_33_6;
                            stackOut_33_7 = 1;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            stackIn_35_2 = stackOut_33_2;
                            stackIn_35_3 = stackOut_33_3;
                            stackIn_35_4 = stackOut_33_4;
                            stackIn_35_5 = stackOut_33_5;
                            stackIn_35_6 = stackOut_33_6;
                            stackIn_35_7 = stackOut_33_7;
                            break L9;
                          }
                        }
                        L10: {
                          stackOut_35_0 = (da) (Object) stackIn_35_0;
                          stackOut_35_1 = stackIn_35_1;
                          stackOut_35_2 = stackIn_35_2;
                          stackOut_35_3 = stackIn_35_3;
                          stackOut_35_4 = stackIn_35_4;
                          stackOut_35_5 = stackIn_35_5;
                          stackOut_35_6 = stackIn_35_6;
                          stackOut_35_7 = stackIn_35_7;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          stackIn_37_3 = stackOut_35_3;
                          stackIn_37_4 = stackOut_35_4;
                          stackIn_37_5 = stackOut_35_5;
                          stackIn_37_6 = stackOut_35_6;
                          stackIn_37_7 = stackOut_35_7;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          stackIn_36_3 = stackOut_35_3;
                          stackIn_36_4 = stackOut_35_4;
                          stackIn_36_5 = stackOut_35_5;
                          stackIn_36_6 = stackOut_35_6;
                          stackIn_36_7 = stackOut_35_7;
                          if (or.field_a == 0) {
                            stackOut_37_0 = (da) (Object) stackIn_37_0;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = stackIn_37_2;
                            stackOut_37_3 = stackIn_37_3;
                            stackOut_37_4 = stackIn_37_4;
                            stackOut_37_5 = stackIn_37_5;
                            stackOut_37_6 = stackIn_37_6;
                            stackOut_37_7 = stackIn_37_7;
                            stackOut_37_8 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            stackIn_38_2 = stackOut_37_2;
                            stackIn_38_3 = stackOut_37_3;
                            stackIn_38_4 = stackOut_37_4;
                            stackIn_38_5 = stackOut_37_5;
                            stackIn_38_6 = stackOut_37_6;
                            stackIn_38_7 = stackOut_37_7;
                            stackIn_38_8 = stackOut_37_8;
                            break L10;
                          } else {
                            stackOut_36_0 = (da) (Object) stackIn_36_0;
                            stackOut_36_1 = stackIn_36_1;
                            stackOut_36_2 = stackIn_36_2;
                            stackOut_36_3 = stackIn_36_3;
                            stackOut_36_4 = stackIn_36_4;
                            stackOut_36_5 = stackIn_36_5;
                            stackOut_36_6 = stackIn_36_6;
                            stackOut_36_7 = stackIn_36_7;
                            stackOut_36_8 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            stackIn_38_2 = stackOut_36_2;
                            stackIn_38_3 = stackOut_36_3;
                            stackIn_38_4 = stackOut_36_4;
                            stackIn_38_5 = stackOut_36_5;
                            stackIn_38_6 = stackOut_36_6;
                            stackIn_38_7 = stackOut_36_7;
                            stackIn_38_8 = stackOut_36_8;
                            break L10;
                          }
                        }
                        ((da) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4, stackIn_38_5, av.a((byte) stackIn_38_6, stackIn_38_7 != 0, stackIn_38_8 != 0, false));
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      this.b(true, param0, param2 + -120);
                      break L4;
                    }
                  }
                }
              }
            } else {
              this.a(param0, (byte) -89, sd.field_m);
              break L4;
            }
          }
        }
        L11: {
          L12: {
            if (var6 == 0) {
              break L12;
            } else {
              if (lp.field_a[70]) {
                break L11;
              } else {
                if (lp.field_a[69]) {
                  break L11;
                } else {
                  break L12;
                }
              }
            }
          }
          var7 = 0;
          L13: while (true) {
            if (((nk) this).field_i.field_c <= var7) {
              break L11;
            } else {
              if (this.a(var7, (byte) -17)) {
                L14: {
                  stackOut_51_0 = this;
                  stackOut_51_1 = param0;
                  stackOut_51_2 = var7;
                  stackOut_51_3 = 4;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  stackIn_53_3 = stackOut_51_3;
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  stackIn_52_3 = stackOut_51_3;
                  if (var7 != ((nk) this).field_i.field_g) {
                    stackOut_53_0 = this;
                    stackOut_53_1 = stackIn_53_1;
                    stackOut_53_2 = stackIn_53_2;
                    stackOut_53_3 = stackIn_53_3;
                    stackOut_53_4 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    stackIn_54_2 = stackOut_53_2;
                    stackIn_54_3 = stackOut_53_3;
                    stackIn_54_4 = stackOut_53_4;
                    break L14;
                  } else {
                    stackOut_52_0 = this;
                    stackOut_52_1 = stackIn_52_1;
                    stackOut_52_2 = stackIn_52_2;
                    stackOut_52_3 = stackIn_52_3;
                    stackOut_52_4 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    stackIn_54_2 = stackOut_52_2;
                    stackIn_54_3 = stackOut_52_3;
                    stackIn_54_4 = stackOut_52_4;
                    break L14;
                  }
                }
                this.a(stackIn_54_1, stackIn_54_2, stackIn_54_3, stackIn_54_4 != 0, param1);
                var7++;
                continue L13;
              } else {
                var7++;
                continue L13;
              }
            }
          }
        }
        L15: {
          if (((nk) this).field_d != 0) {
            break L15;
          } else {
            mp.field_h.a(44, 30 + param0);
            break L15;
          }
        }
    }

    private final void b(boolean param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        boolean[] var12 = null;
        boolean[] var13 = null;
        boolean[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var18_ref = null;
        pa var19_ref = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        ha var24 = null;
        ha var25 = null;
        int stackIn_7_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        L0: {
          var23 = AceOfSkies.field_G ? 1 : 0;
          if (param2 < -121) {
            break L0;
          } else {
            var24 = (ha) null;
            this.a(-106, 49, 71, false, (ha) null);
            break L0;
          }
        }
        L1: {
          var25 = pk.field_wb.a((byte) 84);
          var5 = -1;
          var6 = 0;
          var7 = 50;
          var8 = param1 + 108;
          var9 = 540;
          var10 = 312;
          this.a(var10, (byte) 86, var7, var9, var25, var8);
          var11 = ro.field_p;
          if (!param0) {
            break L1;
          } else {
            var11 = pm.field_d;
            break L1;
          }
        }
        L2: {
          this.a(param1, (byte) 75, var11);
          var12 = new boolean[]{false, false, false, false, false, false, false, false, false};
          var13 = new boolean[]{false, false, false, false, false, false, true, true, true};
          var14 = new boolean[]{false, false, false, false, false, false, true, true, true};
          var7 = 75;
          var15 = param1 + 127;
          if (!param0) {
            stackOut_6_0 = hg.field_D;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          } else {
            stackOut_5_0 = r.field_n;
            stackIn_7_0 = stackOut_5_0;
            break L2;
          }
        }
        var16 = stackIn_7_0;
        var17 = -1;
        var18 = 0;
        L3: while (true) {
          if (-1 + lb.field_a.length <= var18) {
            L4: {
              if (param1 != 0) {
                var17 = -1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 > ((nk) this).field_e) {
                break L5;
              } else {
                var17 = ((nk) this).field_e;
                break L5;
              }
            }
            L6: {
              if (-1 == var17) {
                var18 = param1 + 264;
                rb.field_j.a(96, var5, -1, var18, 320, sl.field_q);
                rb.field_j.a(126, var5, -1, var18 - -(kn.field_b.field_j * 3 >> 733533601), 320, ef.field_g);
                if (!cn.b(true)) {
                  break L6;
                } else {
                  rb.field_j.a(112, var5, -1, var18 + 6 * kn.field_b.field_j, 320, bt.field_c);
                  break L6;
                }
              } else {
                L7: {
                  var7 = 470;
                  var15 = param1 + 220;
                  rb.field_j.a(101, -5622785, -16777216, var15, var7, jk.field_c);
                  var15 += 24;
                  var18_ref = Integer.toString(100 * qe.field_f[var17]);
                  if (!var13[var17]) {
                    break L7;
                  } else {
                    if (-1 == (1 << var17 & var16 ^ -1)) {
                      var18_ref = fh.field_g;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  L9: {
                    rb.field_j.a(124, var5, var6, var15, var7, var18_ref);
                    var15 = 280 + param1;
                    var7 = 470;
                    rb.field_j.a(127, -5622785, -16777216, var15, var7, sd.field_e);
                    if (!var13[var17]) {
                      break L9;
                    } else {
                      if (0 == (1 << var17 & var16)) {
                        var15 += 32;
                        rb.field_j.a(111, -1, -16777216, var15, var7, var18_ref);
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var7 = var7 - ((qe.field_f[var17] - 1) * lg.field_k.d() / 6 - -(lg.field_k.d() / 2) >> -523148318);
                  var19 = 0;
                  L10: while (true) {
                    if (qe.field_f[var17] <= var19) {
                      break L8;
                    } else {
                      lg.field_k.b(var7, 12 + var15, 32, 32);
                      var7 = var7 + (lg.field_k.d() / 3 >> -1501850814);
                      var19++;
                      continue L10;
                    }
                  }
                }
                L11: {
                  if (0 == (var16 & 1 << var17)) {
                    stackOut_60_0 = 0;
                    stackIn_61_0 = stackOut_60_0;
                    break L11;
                  } else {
                    stackOut_59_0 = 1;
                    stackIn_61_0 = stackOut_59_0;
                    break L11;
                  }
                }
                L12: {
                  var19 = stackIn_61_0;
                  var7 = 170;
                  var15 = 220 + param1;
                  if (var19 != 0) {
                    rb.field_j.a(111, -14483644, var6, var15, var7, sk.field_d);
                    break L12;
                  } else {
                    rb.field_j.a(114, -56764, var6, var15, var7, jm.field_b);
                    break L12;
                  }
                }
                L13: {
                  var20 = 160;
                  var18_ref = hn.field_b[var17];
                  var15 += 10;
                  if (!var13[var17]) {
                    break L13;
                  } else {
                    if (-1 != (var16 & 1 << var17 ^ -1)) {
                      break L13;
                    } else {
                      var18_ref = pe.field_c;
                      break L13;
                    }
                  }
                }
                L14: {
                  int discarded$1 = rb.field_j.a(0, -(var20 / 2) + var7, var5, true, var6, 1, 8 + var15, hi.field_v.field_j, 0, (pa[]) null, (aa) null, 0, (int[]) null, var20, 480, var18_ref);
                  var7 = 320;
                  var15 = 350 - -param1;
                  rb.field_j.a(118, var5, var6, var15, var7, lb.field_a[var17]);
                  var21 = param1 + 200;
                  if (var19 == 0) {
                    L15: {
                      if (qr.field_a > 0) {
                        break L15;
                      } else {
                        if (!var12[var17]) {
                          break L15;
                        } else {
                          ut.field_c.a(256, var21, 0, var5, 1);
                          break L14;
                        }
                      }
                    }
                    dh.field_k.a(256, var21, 0, var5, 1);
                    break L14;
                  } else {
                    aa.field_a[var17].a(256, var21, 0, var5, 1);
                    break L14;
                  }
                }
                L16: {
                  L17: {
                    var22 = 360 + param1;
                    if (cn.b(true)) {
                      break L17;
                    } else {
                      if (!param0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var22 -= 20;
                  break L16;
                }
                rb.field_j.a(123, var5, -1, var22 - -(kn.field_b.field_j * 3 >> 1315301025), 320, ef.field_g);
                break L6;
              }
            }
            return;
          } else {
            L18: {
              var19_ref = null;
              if ((var16 & 1 << var18) != 0) {
                var19_ref = aa.field_a[var18];
                break L18;
              } else {
                if (!param0) {
                  if (!var14[var18]) {
                    L19: {
                      if ((qr.field_a ^ -1) < -1) {
                        break L19;
                      } else {
                        if (!var12[var18]) {
                          break L19;
                        } else {
                          var19_ref = ut.field_c;
                          break L18;
                        }
                      }
                    }
                    var19_ref = dh.field_k;
                    break L18;
                  } else {
                    var18++;
                    continue L3;
                  }
                } else {
                  var18++;
                  continue L3;
                }
              }
            }
            L20: {
              var20 = var7;
              var21 = var15;
              if (var20 > ic.field_b) {
                break L20;
              } else {
                if (var20 - -48 < ic.field_b) {
                  break L20;
                } else {
                  if (cf.field_g < var21) {
                    break L20;
                  } else {
                    if (cf.field_g <= var21 + 48) {
                      uc.field_o[1].a(-28 + var20, var21 - 30, 108, 108, 0, 2004318071, 2);
                      var17 = var18;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
            }
            L21: {
              if (((nk) this).field_e != var18) {
                break L21;
              } else {
                uc.field_o[1].a(-28 + var20, -30 + var21, 108, 108, 1, 0, 2);
                break L21;
              }
            }
            L22: {
              var19_ref.a(var20, var21, 48, 48, 0, var5, 1);
              if (((nk) this).field_c < var20) {
                break L22;
              } else {
                if (((nk) this).field_c > 48 + var20) {
                  break L22;
                } else {
                  if (var21 > ((nk) this).field_b) {
                    break L22;
                  } else {
                    if (var21 + 48 >= ((nk) this).field_b) {
                      ((nk) this).field_c = -1;
                      if (((nk) this).field_e != var18) {
                        ((nk) this).field_e = var18;
                        break L22;
                      } else {
                        ((nk) this).field_e = -1;
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                }
              }
            }
            if (var14[var18]) {
              if ((1 << var18 & var16) == 0) {
                var18++;
                continue L3;
              } else {
                var7 += 55;
                var18++;
                continue L3;
              }
            } else {
              var7 += 55;
              var18++;
              continue L3;
            }
          }
        }
    }

    final static int a(byte param0) {
        if (-3 >= (bl.field_c ^ -1)) {
          if (param0 == 68) {
            L0: {
              if (0 != fb.field_e) {
                L1: {
                  if (ij.field_h != null) {
                    if (ij.field_h.b((byte) -105)) {
                      if (ij.field_h.a("", param0 + -168)) {
                        if (!ij.field_h.c("", -14012)) {
                          return 29;
                        } else {
                          break L1;
                        }
                      } else {
                        return 29;
                      }
                    } else {
                      return 14;
                    }
                  } else {
                    break L1;
                  }
                }
                if (!oi.field_a.b((byte) 83)) {
                  return 43;
                } else {
                  if (!oi.field_a.c("commonui", param0 + -14080)) {
                    return 57;
                  } else {
                    if (uj.field_b.b((byte) 89)) {
                      if (!uj.field_b.c("commonui", -14012)) {
                        return 80;
                      } else {
                        if (cf.field_f.b((byte) -13)) {
                          if (!cf.field_f.b(param0 + -68)) {
                            return 86;
                          } else {
                            break L0;
                          }
                        } else {
                          return 82;
                        }
                      }
                    } else {
                      return 71;
                    }
                  }
                }
              } else {
                if (!oi.field_a.b((byte) 82)) {
                  return 20;
                } else {
                  if (oi.field_a.c("commonui", -14012)) {
                    if (!uj.field_b.b((byte) 93)) {
                      return 50;
                    } else {
                      if (uj.field_b.c("commonui", param0 + -14080)) {
                        if (cf.field_f.b((byte) -63)) {
                          if (cf.field_f.b(0)) {
                            break L0;
                          } else {
                            return 80;
                          }
                        } else {
                          return 70;
                        }
                      } else {
                        return 60;
                      }
                    }
                  } else {
                    return 40;
                  }
                }
              }
            }
            return 100;
          } else {
            return 56;
          }
        } else {
          return 0;
        }
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        int[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ha var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        da stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        pa[] stackIn_15_3 = null;
        da stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        pa[] stackIn_16_3 = null;
        da stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        pa[] stackIn_17_3 = null;
        int stackIn_17_4 = 0;
        da stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        pa[] stackOut_14_3 = null;
        da stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        pa[] stackOut_16_3 = null;
        int stackOut_16_4 = 0;
        da stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        pa[] stackOut_15_3 = null;
        int stackOut_15_4 = 0;
        L0: {
          var15 = AceOfSkies.field_G ? 1 : 0;
          var16 = pk.field_wb.a((byte) 77);
          var4 = -1;
          var5 = 50;
          var6 = 90 + param1;
          var7 = 540;
          if (param0 == 197427713) {
            break L0;
          } else {
            ((nk) this).field_a = 4;
            break L0;
          }
        }
        var8 = 284;
        this.a(40 + var8, (byte) 86, -20 + var5, var7 - -40, var16, var6 + -20);
        this.a(param1, (byte) 76, bt.field_b);
        var9 = 20;
        var10 = new String[50];
        var20 = new int[ac.field_f.length];
        var19 = var20;
        var18 = var19;
        var17 = var18;
        var11 = var17;
        var12_int = 0;
        L1: while (true) {
          if (var12_int >= ac.field_f.length) {
            var12 = new int[50];
            var13 = 0;
            L2: while (true) {
              if (var13 >= 50) {
                var13 = hi.field_v.a(-102, ac.field_f, var12, var10, sn.a(io.field_a[vq.field_w], 120, new String[1]));
                var14 = 0;
                L3: while (true) {
                  if (var14 >= var13) {
                    se.field_c.a(0, var4, var11, (byte) -110, -10 + (var8 + var6), om.a(io.field_a.length, 1 + vq.field_w, (byte) 66), var7 + var5 + -10, ac.field_f);
                    return;
                  } else {
                    if (!var10[var14].startsWith("<b>")) {
                      L4: {
                        stackOut_14_0 = rb.field_j;
                        stackOut_14_1 = var4;
                        stackOut_14_2 = 0;
                        stackOut_14_3 = ac.field_f;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        if ((vq.field_w ^ -1) != -6) {
                          stackOut_16_0 = (da) (Object) stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = stackIn_16_2;
                          stackOut_16_3 = (pa[]) (Object) stackIn_16_3;
                          stackOut_16_4 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          stackIn_17_3 = stackOut_16_3;
                          stackIn_17_4 = stackOut_16_4;
                          break L4;
                        } else {
                          stackOut_15_0 = (da) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = (pa[]) (Object) stackIn_15_3;
                          stackOut_15_4 = 64;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          stackIn_17_3 = stackOut_15_3;
                          stackIn_17_4 = stackOut_15_4;
                          break L4;
                        }
                      }
                      ((da) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, (pa[]) (Object) stackIn_17_3, stackIn_17_4 + (12 + var5), 0, var10[var14], var6 + var8 / 2 + var9 * (var14 - var13 / 2), var20);
                      var14++;
                      continue L3;
                    } else {
                      se.field_c.a(var4, 0, ac.field_f, var5 - -12, 0, var10[var14], var9 * (var14 - var13 / 2) + (10 - (-var6 - var8 / 2)), var20);
                      var14++;
                      continue L3;
                    }
                  }
                }
              } else {
                var12[var13] = -24 + var7;
                if (-6 == (vq.field_w ^ -1)) {
                  var12[var13] = var12[var13] - 64;
                  var13++;
                  continue L2;
                } else {
                  var13++;
                  continue L2;
                }
              }
            }
          } else {
            var20[var12_int] = 10;
            var12_int++;
            continue L1;
          }
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        String[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String stackIn_81_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        String[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String stackOut_80_2 = null;
        String[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        String stackOut_79_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_89_0 = 0;
        String stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        L0: {
          var9 = AceOfSkies.field_G ? 1 : 0;
          cu.field_r = true;
          ol.field_c = param1;
          if (ol.field_c != 0) {
            if ((ol.field_c ^ -1) != -2) {
              if (-3 == ol.field_c) {
                var3 = ff.a(qk.field_g, sn.a(ij.field_i, 123, new String[1]), st.field_b, -3, nh.field_c);
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3) {
                      break L2;
                    } else {
                      if (!"<%0>".equals((Object) (Object) st.field_b[var5])) {
                        var5++;
                        continue L1;
                      } else {
                        var4 = var5;
                        break L2;
                      }
                    }
                  }
                  if (-1 != var4) {
                    es.field_a = new String[var4];
                    au.a((Object[]) (Object) st.field_b, 0, (Object[]) (Object) es.field_a, 0, var4);
                    cc.field_b = new String[-var4 + (var3 - 1)];
                    au.a((Object[]) (Object) st.field_b, 1 + var4, (Object[]) (Object) cc.field_b, 0, -1 + -var4 + var3);
                    var3 = ff.a(qk.field_g, sn.a(dh.field_d, 105, new String[1]), st.field_b, -3, nh.field_c);
                    var4 = -1;
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var3) {
                          break L4;
                        } else {
                          if ("<%0>".equals((Object) (Object) st.field_b[var5])) {
                            var4 = var5;
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (-1 == var4) {
                        throw new IllegalStateException();
                      } else {
                        L5: {
                          cn.field_z = new String[var4];
                          au.a((Object[]) (Object) st.field_b, 0, (Object[]) (Object) cn.field_z, 0, var4);
                          gp.field_v = new String[-1 + var3 - var4];
                          au.a((Object[]) (Object) st.field_b, var4 + 1, (Object[]) (Object) gp.field_v, 0, -1 + var3 - var4);
                          if (es.field_a.length >= cn.field_z.length) {
                            stackOut_63_0 = es.field_a.length;
                            stackIn_64_0 = stackOut_63_0;
                            break L5;
                          } else {
                            stackOut_62_0 = cn.field_z.length;
                            stackIn_64_0 = stackOut_62_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_64_0;
                          if (gp.field_v.length <= cc.field_b.length) {
                            stackOut_66_0 = cc.field_b.length;
                            stackIn_67_0 = stackOut_66_0;
                            break L6;
                          } else {
                            stackOut_65_0 = gp.field_v.length;
                            stackIn_67_0 = stackOut_65_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_67_0;
                        var7 = 7 + var5 - -var6;
                        ne.field_g = new String[var7];
                        rn.field_a = new int[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (var7 <= var8) {
                            ne.field_g[1] = du.field_n;
                            ne.field_g[0] = qg.field_b;
                            rm.field_g = new int[2];
                            rn.field_a[1] = 0;
                            rm.field_g[1] = 2;
                            ne.field_g[5] = "";
                            rm.field_g[0] = 5;
                            rn.field_a[3] = 1;
                            ne.field_g[2] = dk.field_a;
                            ne.field_g[4] = li.field_b;
                            ne.field_g[3] = vl.field_a;
                            var8 = 0;
                            L8: while (true) {
                              if (var5 <= var8) {
                                ne.field_g[6 + var5] = null;
                                rn.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (var8 >= var6) {
                                    rb.field_e = kh.a(-115);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_78_0 = ne.field_g;
                                      stackOut_78_1 = var5 + (7 + var8);
                                      stackIn_80_0 = stackOut_78_0;
                                      stackIn_80_1 = stackOut_78_1;
                                      stackIn_79_0 = stackOut_78_0;
                                      stackIn_79_1 = stackOut_78_1;
                                      if (gp.field_v.length <= var8) {
                                        stackOut_80_0 = (String[]) (Object) stackIn_80_0;
                                        stackOut_80_1 = stackIn_80_1;
                                        stackOut_80_2 = "";
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        stackIn_81_2 = stackOut_80_2;
                                        break L10;
                                      } else {
                                        stackOut_79_0 = (String[]) (Object) stackIn_79_0;
                                        stackOut_79_1 = stackIn_79_1;
                                        stackOut_79_2 = gp.field_v[var8];
                                        stackIn_81_0 = stackOut_79_0;
                                        stackIn_81_1 = stackOut_79_1;
                                        stackIn_81_2 = stackOut_79_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_81_0[stackIn_81_1] = (String) (Object) stackIn_81_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_72_0 = ne.field_g;
                                  stackOut_72_1 = 6 + var8;
                                  stackIn_74_0 = stackOut_72_0;
                                  stackIn_74_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if ((-var5 + (cn.field_z.length + var8) ^ -1) > -1) {
                                    stackOut_74_0 = (String[]) (Object) stackIn_74_0;
                                    stackOut_74_1 = stackIn_74_1;
                                    stackOut_74_2 = "";
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    stackIn_75_2 = stackOut_74_2;
                                    break L11;
                                  } else {
                                    stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                    stackOut_73_1 = stackIn_73_1;
                                    stackOut_73_2 = cn.field_z[-var5 + (var8 - -cn.field_z.length)];
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    stackIn_75_2 = stackOut_73_2;
                                    break L11;
                                  }
                                }
                                stackIn_75_0[stackIn_75_1] = (String) (Object) stackIn_75_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            rn.field_a[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              } else {
                if (-4 != ol.field_c) {
                  if (4 == ol.field_c) {
                    var3 = ff.a(qk.field_g, tt.field_b, st.field_b, -3, nh.field_c);
                    var4 = 2 + var3;
                    rn.field_a = new int[var4];
                    ne.field_g = new String[var4];
                    var5 = 0;
                    L12: while (true) {
                      if (var4 <= var5) {
                        rm.field_g = new int[1];
                        var5 = 0;
                        L13: while (true) {
                          if (var3 <= var5) {
                            ne.field_g[-2 + var4] = "";
                            ne.field_g[-1 + var4] = ne.field_e;
                            rn.field_a[var4 - 1] = 0;
                            rm.field_g[0] = 5;
                            break L0;
                          } else {
                            ne.field_g[var5] = st.field_b[var5];
                            var5++;
                            continue L13;
                          }
                        }
                      } else {
                        rn.field_a[var5] = -1;
                        var5++;
                        continue L12;
                      }
                    }
                  } else {
                    if (ol.field_c != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = ff.a(qk.field_g, ur.field_c, st.field_b, -3, nh.field_c);
                      var4 = 3 - -var3;
                      rn.field_a = new int[var4];
                      ne.field_g = new String[var4];
                      var5 = 0;
                      L14: while (true) {
                        if (var4 <= var5) {
                          rm.field_g = new int[2];
                          var5 = 0;
                          L15: while (true) {
                            if (var5 >= var3) {
                              ne.field_g[-3 + var4] = "";
                              ne.field_g[var4 + -2] = lj.field_a;
                              rn.field_a[var4 + -2] = 0;
                              rm.field_g[0] = 3;
                              ne.field_g[var4 - 1] = ne.field_e;
                              rn.field_a[var4 - 1] = 1;
                              rm.field_g[1] = 5;
                              break L0;
                            } else {
                              ne.field_g[var5] = st.field_b[var5];
                              var5++;
                              continue L15;
                            }
                          }
                        } else {
                          rn.field_a[var5] = -1;
                          var5++;
                          continue L14;
                        }
                      }
                    }
                  }
                } else {
                  L16: {
                    if (pt.field_b.field_q) {
                      var3 = ff.a(qk.field_g, jm.field_c, st.field_b, -3, nh.field_c);
                      break L16;
                    } else {
                      var3 = ff.a(qk.field_g, ht.field_h, st.field_b, -3, nh.field_c);
                      break L16;
                    }
                  }
                  var4 = var3 + 2;
                  ne.field_g = new String[var4];
                  rn.field_a = new int[var4];
                  var5 = 0;
                  L17: while (true) {
                    if (var5 >= var4) {
                      rm.field_g = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (var3 <= var5) {
                          ne.field_g[var4 + -2] = "";
                          ne.field_g[var4 - 1] = ne.field_e;
                          rn.field_a[var4 + -1] = 0;
                          rm.field_g[0] = 5;
                          break L0;
                        } else {
                          ne.field_g[var5] = st.field_b[var5];
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      rn.field_a[var5] = -1;
                      var5++;
                      continue L17;
                    }
                  }
                }
              }
            } else {
              var3 = ff.a(qk.field_g, ad.field_V, st.field_b, -3, nh.field_c);
              var4 = 2 - -var3;
              ne.field_g = new String[var4];
              rn.field_a = new int[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  rm.field_g = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var3 <= var5) {
                      ne.field_g[var4 - 2] = "";
                      ne.field_g[-1 + var4] = ne.field_e;
                      rn.field_a[var4 - 1] = 0;
                      rm.field_g[0] = 5;
                      break L0;
                    } else {
                      ne.field_g[var5] = st.field_b[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  rn.field_a[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3 = ff.a(qk.field_g, ad.field_V, st.field_b, -3, nh.field_c);
            var4 = 3 + var3;
            ne.field_g = new String[var4];
            rn.field_a = new int[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                rm.field_g = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3 <= var5) {
                    ne.field_g[var4 + -3] = "";
                    ne.field_g[-2 + var4] = rj.field_a;
                    rn.field_a[-2 + var4] = 0;
                    rm.field_g[0] = 4;
                    ne.field_g[-1 + var4] = ne.field_e;
                    rn.field_a[-1 + var4] = 1;
                    rm.field_g[1] = 5;
                    break L0;
                  } else {
                    ne.field_g[var5] = st.field_b[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                rn.field_a[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        pr.field_b.field_c = rm.field_g.length;
        if (param0 == -119) {
          var3 = 0;
          var4 = 0;
          L23: while (true) {
            if (var4 >= ne.field_g.length) {
              L24: {
                if (-3 == ol.field_c) {
                  var10 = es.field_a;
                  var5 = 0;
                  L25: while (true) {
                    if (var5 >= var10.length) {
                      var11 = cc.field_b;
                      var5 = 0;
                      L26: while (true) {
                        if (var5 >= var11.length) {
                          break L24;
                        } else {
                          var13 = var11[var5];
                          var7 = kp.a(true, var13, false);
                          if (var7 > var3) {
                            var3 = var7;
                            var5++;
                            continue L26;
                          } else {
                            var5++;
                            continue L26;
                          }
                        }
                      }
                    } else {
                      var12 = var10[var5];
                      var7 = kp.a(true, var12, false);
                      if (var7 > var3) {
                        var3 = var7;
                        var5++;
                        continue L25;
                      } else {
                        var5++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  break L24;
                }
              }
              ac.field_c = ri.field_a + -(var3 >> 1970386817);
              ro.field_q = (pp.field_a + as.field_c << 1556578945) * pr.field_b.field_c;
              je.field_a = -(var3 >> 1637743777) + (ri.field_a + var3);
              var4 = 0;
              L27: while (true) {
                if (var4 >= ne.field_g.length) {
                  pt.field_a = -(ro.field_q >> -1638816255) + md.field_o;
                  nb.field_b = new int[ne.field_g.length][];
                  var4 = 0;
                  var5 = pt.field_a;
                  L28: while (true) {
                    if (ne.field_g.length <= var4) {
                      L29: {
                        if (ol.field_c == 2) {
                          pr.field_b.a(param2, -1, 0, -1);
                          break L29;
                        } else {
                          pr.field_b.a(param2, rc.b((byte) -80, ic.field_b, cf.field_g), 0, 0);
                          break L29;
                        }
                      }
                      return;
                    } else {
                      var6 = rn.field_a[var4];
                      if (var6 >= 0) {
                        var7 = kp.a(true, ne.field_g[var4], true);
                        var8 = -(var7 >> 631150049) + ri.field_a;
                        var5 = var5 + pp.field_a;
                        nb.field_b[var4] = new int[4];
                        nb.field_b[var4][0] = var8 - ud.field_g;
                        nb.field_b[var4][1] = var5;
                        nb.field_b[var4][2] = var7 + (ud.field_g << 44828897);
                        var5 = var5 + (lp.field_h + (as.field_c << -1480950047) + pp.field_a);
                        nb.field_b[var4][3] = lp.field_h - -(as.field_c << 1722033569);
                        var4++;
                        continue L28;
                      } else {
                        var5 = var5 + ce.field_u;
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: {
                    stackOut_107_0 = ro.field_q;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_108_0 = stackOut_107_0;
                    if (0 > rn.field_a[var4]) {
                      stackOut_109_0 = stackIn_109_0;
                      stackOut_109_1 = ce.field_u;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      break L30;
                    } else {
                      stackOut_108_0 = stackIn_108_0;
                      stackOut_108_1 = lp.field_h;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_110_1 = stackOut_108_1;
                      break L30;
                    }
                  }
                  ro.field_q = stackIn_110_0 + stackIn_110_1;
                  var4++;
                  continue L27;
                }
              }
            } else {
              L31: {
                stackOut_87_0 = 1;
                stackOut_87_1 = ne.field_g[var4];
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                if (-1 < rn.field_a[var4]) {
                  stackOut_89_0 = stackIn_89_0;
                  stackOut_89_1 = (String) (Object) stackIn_89_1;
                  stackOut_89_2 = 0;
                  stackIn_90_0 = stackOut_89_0;
                  stackIn_90_1 = stackOut_89_1;
                  stackIn_90_2 = stackOut_89_2;
                  break L31;
                } else {
                  stackOut_88_0 = stackIn_88_0;
                  stackOut_88_1 = (String) (Object) stackIn_88_1;
                  stackOut_88_2 = 1;
                  stackIn_90_0 = stackOut_88_0;
                  stackIn_90_1 = stackOut_88_1;
                  stackIn_90_2 = stackOut_88_2;
                  break L31;
                }
              }
              var5 = kp.a(stackIn_90_0 != 0, (String) (Object) stackIn_90_1, stackIn_90_2 != 0);
              if (var3 < var5) {
                var3 = var5;
                var4++;
                continue L23;
              } else {
                var4++;
                continue L23;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, String param2) {
        int var4 = 104 % ((param1 - 5) / 54);
        int var5 = 90 + dp.field_h.a((byte) 94, param2);
        this.a(82, pk.field_wb.a((byte) 75), -(var5 >> -282139487) + 320, var5, param0 + 26, 60, 1442840524);
        kn.field_a.a(111, -12046068, -1, 67 + param0, 320, param2);
    }

    private final void a(int param0, ha param1, int param2, int param3, int param4) {
        int var8 = AceOfSkies.field_G ? 1 : 0;
        mb.field_u[0].a(param4, param0);
        mb.field_u[2].a(-mb.field_u[2].d() + (param4 + param3), param0);
        bo var10 = fa.a(param1, true);
        bo var11 = var10;
        param3 = param4 - -param3 + -mb.field_u[2].d();
        param4 = param4 + mb.field_u[0].d();
        var11.a(param3, param4, param0 - -mb.field_u[2].c(), param0, 120);
        while (param4 < param3) {
            mb.field_u[1].a(param4, param0);
            param4 = param4 + mb.field_u[1].d();
        }
        var11.a(true);
        int var7 = -128 % ((param2 - -32) / 50);
    }

    nk(int param0) {
        ((nk) this).field_c = -1;
        ((nk) this).field_e = -1;
        ((nk) this).field_d = param0;
        ((nk) this).field_i = new gr(ua.field_l[param0].length);
    }

    private final void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (((nk) this).field_d != 2) {
            break L0;
          } else {
            if (cn.b(true)) {
              break L0;
            } else {
              L1: {
                if (kh.field_a) {
                  break L1;
                } else {
                  if (-3 < (ln.field_d ^ -1)) {
                    L2: {
                      if (bk.field_f == 96) {
                        L3: {
                          if (((nk) this).field_i.field_g < 0) {
                            break L3;
                          } else {
                            if (-5 != ((nk) this).field_i.field_g) {
                              if (((nk) this).field_i.field_g == 0) {
                                ((nk) this).field_i.a((byte) -102, 2);
                                break L2;
                              } else {
                                if (-5 != ((nk) this).field_i.field_g) {
                                  ((nk) this).field_i.a((byte) -125, ((nk) this).field_i.field_g + -1);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        ((nk) this).field_i.a((byte) -101, 0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L4: {
                      if (bk.field_f == 97) {
                        L5: {
                          if (((nk) this).field_i.field_g < 0) {
                            break L5;
                          } else {
                            if (-5 == ((nk) this).field_i.field_g) {
                              break L5;
                            } else {
                              if (((nk) this).field_i.field_g < 2) {
                                ((nk) this).field_i.a((byte) -100, 1 + ((nk) this).field_i.field_g);
                                break L4;
                              } else {
                                if (-3 != ((nk) this).field_i.field_g) {
                                  break L4;
                                } else {
                                  ((nk) this).field_i.a((byte) -102, 0);
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        ((nk) this).field_i.a((byte) -128, 2);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      if (99 != bk.field_f) {
                        break L6;
                      } else {
                        L7: {
                          if (0 > ((nk) this).field_i.field_g) {
                            break L7;
                          } else {
                            if ((((nk) this).field_i.field_g ^ -1) >= -3) {
                              ((nk) this).field_i.a((byte) -119, 4);
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        ((nk) this).field_i.a((byte) -122, oc.field_e);
                        break L6;
                      }
                    }
                    L8: {
                      if (bk.field_f != -99) {
                        break L8;
                      } else {
                        if (-5 == ((nk) this).field_i.field_g) {
                          ((nk) this).field_i.a((byte) -108, oc.field_e);
                          break L8;
                        } else {
                          ((nk) this).field_i.a((byte) -100, 4);
                          break L8;
                        }
                      }
                    }
                    ((nk) this).field_i.d((byte) 126);
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              L9: {
                if (bk.field_f == 96) {
                  if (((nk) this).field_i.field_g < 0) {
                    ((nk) this).field_i.a((byte) -117, 3);
                    break L9;
                  } else {
                    ((nk) this).field_i.a((byte) -101, qg.a((byte) -60, 3, ((nk) this).field_i.field_g + -1) + ((nk) this).field_i.field_g / 3 * 3);
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
              L10: {
                if (bk.field_f != -98) {
                  break L10;
                } else {
                  L11: {
                    if (((nk) this).field_i.field_g < 0) {
                      ((nk) this).field_i.a((byte) -114, 5);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 > ((nk) this).field_i.field_g) {
                      ((nk) this).field_i.a((byte) -107, 4);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ((nk) this).field_i.a((byte) -126, qg.a((byte) -98, 3, 1 + ((nk) this).field_i.field_g) + ((nk) this).field_i.field_g / 3 * 3);
                  break L10;
                }
              }
              L13: {
                if (99 == bk.field_f) {
                  L14: {
                    if (-1 >= (((nk) this).field_i.field_g ^ -1)) {
                      break L14;
                    } else {
                      ((nk) this).field_i.a((byte) -99, 1);
                      break L14;
                    }
                  }
                  L15: {
                    if ((((nk) this).field_i.field_g ^ -1) > -1) {
                      ((nk) this).field_i.a((byte) -121, 4);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  ((nk) this).field_i.a((byte) -113, qg.a((byte) 118, 6, ((nk) this).field_i.field_g + 3));
                  break L13;
                } else {
                  break L13;
                }
              }
              L16: {
                if ((bk.field_f ^ -1) != -99) {
                  break L16;
                } else {
                  L17: {
                    if (0 > ((nk) this).field_i.field_g) {
                      ((nk) this).field_i.a((byte) -121, 4);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((((nk) this).field_i.field_g ^ -1) > -1) {
                      ((nk) this).field_i.a((byte) -100, 4);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  ((nk) this).field_i.a((byte) -101, qg.a((byte) -78, 6, -3 + ((nk) this).field_i.field_g));
                  break L16;
                }
              }
              ((nk) this).field_i.d((byte) 124);
              return;
            }
          }
        }
        if (((nk) this).field_d == 3) {
          L19: {
            ((nk) this).field_i.c((byte) -74);
            if (bk.field_f == 96) {
              break L19;
            } else {
              if (-98 != (bk.field_f ^ -1)) {
                return;
              } else {
                break L19;
              }
            }
          }
          L20: while (true) {
            if (this.a(((nk) this).field_i.field_g, (byte) -17)) {
              return;
            } else {
              ((nk) this).field_i.c((byte) -85);
              continue L20;
            }
          }
        } else {
          L21: {
            ((nk) this).field_i.a(true);
            if (param0 == 4146) {
              break L21;
            } else {
              int discarded$1 = this.a(-33, 41);
              break L21;
            }
          }
          L22: {
            L23: {
              if (-99 == (bk.field_f ^ -1)) {
                break L23;
              } else {
                if (bk.field_f == 99) {
                  break L23;
                } else {
                  break L22;
                }
              }
            }
            L24: while (true) {
              if (this.a(((nk) this).field_i.field_g, (byte) -17)) {
                break L22;
              } else {
                ((nk) this).field_i.a(true);
                continue L24;
              }
            }
          }
          return;
        }
    }

    private final int c(int param0, int param1) {
        ha var4 = null;
        L0: {
          if (-3 != (((nk) this).field_d ^ -1)) {
            break L0;
          } else {
            if (cn.b(true)) {
              break L0;
            } else {
              return 180 + this.a(param1, 200);
            }
          }
        }
        L1: {
          if (((nk) this).field_d != -3) {
            break L1;
          } else {
            if (cn.b(true)) {
              return 100 + ak.field_f[((nk) this).field_d];
            } else {
              break L1;
            }
          }
        }
        if (-4 != ((nk) this).field_d) {
          L2: {
            if (param0 > 108) {
              break L2;
            } else {
              var4 = (ha) null;
              this.a(31, -24, -94, false, (ha) null);
              break L2;
            }
          }
          L3: {
            if ((((nk) this).field_d ^ -1) == -5) {
              break L3;
            } else {
              if (5 != ((nk) this).field_d) {
                return ak.field_f[((nk) this).field_d];
              } else {
                break L3;
              }
            }
          }
          return this.a(param1, 200) - -400;
        } else {
          return this.a(param1, 200) - -200;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = new kp();
    }
}

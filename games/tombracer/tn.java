/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends vg {
    byte[] field_j;
    byte[] field_l;
    int field_i;
    short[] field_g;
    bq[] field_m;
    static iv field_n;
    u[] field_h;
    private int[] field_k;
    byte[] field_f;

    final void a(boolean param0) {
        this.field_k = null;
        if (param0) {
            tn.a(-65);
        }
    }

    final boolean a(int param0, byte[] param1, nda param2, int[] param3) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              if (param0 == -5853) {
                break L1;
              } else {
                this.field_f = (byte[]) null;
                break L1;
              }
            }
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              if (128 <= var8) {
                stackIn_21_0 = var5_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param1 == null) {
                      break L4;
                    } else {
                      if (0 != param1[var8]) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_k[var8];
                  if (-1 != (var9 ^ -1)) {
                    L5: {
                      if (var6 == var9) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if (0 != (var9 & 1)) {
                            var7 = param2.a((byte) -32, param3, var9 >> -197324734);
                            break L6;
                          } else {
                            var7 = param2.a(var9 >> 1581606882, param3, 0);
                            break L6;
                          }
                        }
                        if (var7 != null) {
                          break L5;
                        } else {
                          var5_int = 0;
                          break L5;
                        }
                      }
                    }
                    if (var7 != null) {
                      this.field_h[var8] = (u) (var7);
                      this.field_k[var8] = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("tn.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 != 94) {
            field_n = (iv) null;
        }
    }

    final static String a(int param0) {
        if (param0 != -10918) {
            tn.a(120);
        }
        if ((cga.field_f ^ -1) > -3) {
            return ub.field_b;
        }
        if (nja.field_J != null) {
            if (!(nja.field_J.b(-60))) {
                return hra.field_c;
            }
            return voa.field_s;
        }
        if (!(tk.field_b.b(-97))) {
            return cv.field_r;
        }
        if (!tk.field_b.c("commonui", param0 ^ 10971)) {
            return q.field_o + " - " + tk.field_b.a("commonui", true) + "%";
        }
        if (!hm.field_n.b(-99)) {
            return hua.field_a;
        }
        if (!(hm.field_n.c("commonui", -128))) {
            return vja.field_b + " - " + hm.field_n.a("commonui", true) + "%";
        }
        if (!vc.field_p.b(param0 + 10827)) {
            return wt.field_b;
        }
        if (!(vc.field_p.a(0))) {
            return th.field_u + " - " + vc.field_p.a(true) + "%";
        }
        return dt.field_n;
    }

    tn(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        bq dupTemp$8 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        String stackIn_207_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        bq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        bq var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28_int = 0;
        bq var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        uia var38 = null;
        byte[] var39 = null;
        bq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        bq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        bq var48 = null;
        bq var49 = null;
        bq var50 = null;
        bq var51 = null;
        bq var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        try {
          L0: {
            this.field_l = new byte[128];
            this.field_h = new u[128];
            this.field_j = new byte[128];
            this.field_k = new int[128];
            this.field_f = new byte[128];
            this.field_m = new bq[128];
            this.field_g = new short[128];
            var38 = new uia(param0);
            var3 = 0;
            L1: while (true) {
              if (-1 == (var38.field_g[var3 + var38.field_h] ^ -1)) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var38.field_h = var38.field_h + 1;
                    var3++;
                    var5 = var38.field_h;
                    var38.field_h = var38.field_h + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_g[var38.field_h + var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var6++;
                            var38.field_h = var38.field_h + 1;
                            var8 = var38.field_h;
                            var38.field_h = var38.field_h + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (0 == var38.field_g[var9 + var38.field_h]) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var11_int >= var9) {
                                    L7: {
                                      var9++;
                                      var38.field_h = var38.field_h + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (1 >= var9) {
                                        var12 = var9;
                                        break L7;
                                      } else {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.h(255);
                                              if (-1 != (var15_int ^ -1)) {
                                                L10: {
                                                  if (var13_int < var15_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              } else {
                                                incrementValue$0 = var12;
                                                var12++;
                                                var13_int = incrementValue$0;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    var13 = new bq[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.h(255);
                                          if ((var14 ^ -1) >= -1) {
                                            stackIn_39_0 = null;
                                            break L12;
                                          } else {
                                            stackIn_39_0 = new byte[2 * var14];
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var46 = stackIn_39_0;
                                          var15 = var46;
                                          var14 = var38.h(255);
                                          if ((var14 ^ -1) < -1) {
                                            stackIn_42_0 = new byte[2 * var14];
                                            break L13;
                                          } else {
                                            stackIn_42_0 = null;
                                            break L13;
                                          }
                                        }
                                        var58 = stackIn_42_0;
                                        var47 = var58;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_g[var17 + var38.field_h] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var38.field_h = var38.field_h + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (-129 >= (var20 ^ -1)) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (128 <= var23) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if ((var24 ^ -1) <= -129) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var25_int ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var26) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= 128) {
                                                                            this.field_i = 1 + var38.h(255);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (null == var15) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var46.length <= var27) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.c((byte) 63);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (var16 == null) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if (var58.length <= var27) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.c((byte) 44);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        L30: {
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.h(255);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var46.length) {
                                                                                                var27 = var46[0];
                                                                                                var28_int = var46[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var46.length <= var29) {
                                                                                                        var15 = null;
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_j[var30] = (byte)(32 + this.field_j[var30] * var28_int >> 1447188390);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15[var29 - -1];
                                                                                                        var32 = (var30 + -var27) / 2 + (var30 - var27) * var28_int;
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var30 <= var33) {
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            var28_int = var31;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = go.e(-1, var32, -var27 + var30);
                                                                                                            this.field_j[var33] = (byte)(var34 * this.field_j[var33] - -32 >> -555708954);
                                                                                                            var32 = var32 + (-var28_int + var31);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_j[var29] = (byte)(32 + this.field_j[var29] * var28_int >> -516278554);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = 1 + var19 - -var38.h(255);
                                                                                                var15[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 != null) {
                                                                                            var19 = var38.h(255);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var58.length) {
                                                                                                var27 = var58[0];
                                                                                                var28_int = var58[1] << -221185055;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var58.length <= var29) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            var27 = 0;
                                                                                                            L41: while (true) {
                                                                                                              if (var27 >= var12) {
                                                                                                                break L36;
                                                                                                              } else {
                                                                                                                var13[var27].field_n = var38.h(255);
                                                                                                                var27++;
                                                                                                                continue L41;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            L42: {
                                                                                                              var31 = var28_int + (this.field_l[var30] & 255);
                                                                                                              if (0 <= var31) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            L43: {
                                                                                                              if (128 >= var31) {
                                                                                                                break L43;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L43;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_l[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var16[var29 - -1] << 137960641;
                                                                                                        var32 = var28_int * (-var27 + var30) + (-var27 + var30) / 2;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L44: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var28_int = var31;
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L45: {
                                                                                                              var34 = go.e(-1, var32, -var27 + var30);
                                                                                                              var35 = var34 + (255 & this.field_l[var37]);
                                                                                                              if ((var35 ^ -1) <= -1) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            L46: {
                                                                                                              if (-129 <= (var35 ^ -1)) {
                                                                                                                break L46;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L46;
                                                                                                              }
                                                                                                            }
                                                                                                            var32 = var32 + (var31 + -var28_int);
                                                                                                            this.field_l[var37] = (byte)var35;
                                                                                                            var37++;
                                                                                                            continue L44;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L47: {
                                                                                                      var30 = (this.field_l[var29] & 255) - -var28_int;
                                                                                                      if ((var30 ^ -1) <= -1) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    L48: {
                                                                                                      if (-129 <= (var30 ^ -1)) {
                                                                                                        break L48;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L48;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_l[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.h(255) + (var19 + 1);
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                break L36;
                                                                                              } else {
                                                                                                var13[var27].field_n = var38.h(255);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L53: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var52 = var13[var27];
                                                                                                          if ((var52.field_l ^ -1) >= -1) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var52.field_j = var38.h(255);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L53;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L55: {
                                                                                                      var51 = var13[var27];
                                                                                                      if (var51.field_d <= 0) {
                                                                                                        break L55;
                                                                                                      } else {
                                                                                                        var51.field_l = var38.h(255);
                                                                                                        break L55;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_d = var38.h(255);
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L56: {
                                                                                              var50 = var13[var27];
                                                                                              var28 = var50;
                                                                                              if (var50.field_m == null) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_i = var38.h(255);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            L57: {
                                                                                              if (null == var50.field_g) {
                                                                                                break L57;
                                                                                              } else {
                                                                                                var28.field_f = var38.h(255);
                                                                                                break L57;
                                                                                              }
                                                                                            }
                                                                                            L58: {
                                                                                              if (0 >= var28.field_n) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var28.field_c = var38.h(255);
                                                                                                break L58;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L59: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_m == null) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var49.field_m.length <= var29) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = var38.h(255) + (1 + var19);
                                                                                                var49.field_m[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L60;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L61: {
                                                                                      var48 = var13[var27];
                                                                                      var28 = var48;
                                                                                      if (null == var48.field_g) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var29 >= var48.field_g.length) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = 1 + (var19 + var38.h(255));
                                                                                            var48.field_g[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L62;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L63: {
                                                                                  var45 = var13[var27];
                                                                                  if (null == var45.field_m) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var29 >= var45.field_m.length) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_m[var29] = var38.c((byte) 124);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (null == var45.field_g) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (-2 + var45.field_g.length <= var29) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_g[var29] = var38.c((byte) 81);
                                                                                        var29 += 2;
                                                                                        continue L66;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L67: {
                                                                              if (0 != var20) {
                                                                                break L67;
                                                                              } else {
                                                                                L68: {
                                                                                  if (var54.length <= var21) {
                                                                                    var20 = -1;
                                                                                    break L68;
                                                                                  } else {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L68;
                                                                                  }
                                                                                }
                                                                                if (-1 <= (this.field_k[var27] ^ -1)) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = var38.h(255) - -1;
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_j[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (0 == this.field_k[var26]) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (var20 != 0) {
                                                                                break L70;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 < var57.length) {
                                                                                  incrementValue$2 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$2];
                                                                                  break L70;
                                                                                } else {
                                                                                  var20 = -1;
                                                                                  break L70;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_m[var26] = (bq) (var25);
                                                                            break L69;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L71: {
                                                                      if (this.field_k[var25_int] == 0) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (-1 != (var20 ^ -1)) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_g[incrementValue$3] + 16 << -679212414;
                                                                            if (var21 >= var56.length) {
                                                                              var20 = -1;
                                                                              break L72;
                                                                            } else {
                                                                              incrementValue$4 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$4];
                                                                              break L72;
                                                                            }
                                                                          }
                                                                        }
                                                                        this.field_l[var25_int] = (byte)var24;
                                                                        var20--;
                                                                        break L71;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (this.field_k[var24] == 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (-1 != (var20 ^ -1)) {
                                                                        break L74;
                                                                      } else {
                                                                        incrementValue$5 = var5;
                                                                        var5++;
                                                                        var23 = -1 + var38.field_g[incrementValue$5];
                                                                        if (var21 >= var55.length) {
                                                                          var20 = -1;
                                                                          break L74;
                                                                        } else {
                                                                          incrementValue$6 = var21;
                                                                          var21++;
                                                                          var20 = var4[incrementValue$6];
                                                                          break L74;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    this.field_f[var24] = (byte)var23;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (-1 != (var20 ^ -1)) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var54.length > var21) {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.b((byte) -123);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_g[var23] = (short)(this.field_g[var23] + (sea.c(-1 + var22, 2) << 9434510));
                                                            var20--;
                                                            this.field_k[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.h(255);
                                                        this.field_g[var20] = (short)(this.field_g[var20] + (var19 << -2073954968));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.h(255);
                                                    this.field_g[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.c((byte) 86);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L77: {
                                          dupTemp$8 = new bq();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.h(255);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L77;
                                          } else {
                                            var15_ref.field_m = new byte[2 * var16_int];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.h(255);
                                          if (0 >= var16_int) {
                                            break L78;
                                          } else {
                                            var15_ref.field_g = new byte[2 + 2 * var16_int];
                                            var40.field_g[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.c((byte) 124);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var38.c((byte) 63);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var38.c((byte) 49);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var2 = decompiledCaughtException;
            stackIn_206_0 = (RuntimeException) (var2);

            stackIn_206_1 = new StringBuilder().append("tn.<init>(");

            if (param0 == null) {
              stackIn_207_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackIn_207_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackIn_207_2 = "null";
              break L79;
            } else {
              stackIn_207_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackIn_207_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackIn_207_2 = "{...}";
              break L79;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_207_0), stackIn_207_2 + ')');
        }
    }

    static {
    }
}

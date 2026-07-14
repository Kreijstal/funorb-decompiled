/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class ti extends ba implements wc {
    static int field_O;
    private uh field_N;
    private int field_M;

    final String d(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          if (((ti) this).field_g) {
            if (null == ((ti) this).field_q) {
              return null;
            } else {
              ll.a(uc.field_C - (((ti) this).field_M + -((ti) this).field_k), true, ll.field_y);
              return ((ti) this).field_q;
            }
          } else {
            return null;
          }
        } else {
          var3 = null;
          ((ti) this).a(57, 60, -66, (lk) null);
          if (((ti) this).field_g) {
            if (null == ((ti) this).field_q) {
              return null;
            } else {
              ll.a(uc.field_C - (((ti) this).field_M + -((ti) this).field_k), true, ll.field_y);
              return ((ti) this).field_q;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        if (param0 != -1) {
          field_O = 53;
          ((ti) this).field_M = -param1 + (uc.field_C - ((ti) this).field_r);
          return;
        } else {
          ((ti) this).field_M = -param1 + (uc.field_C - ((ti) this).field_r);
          return;
        }
    }

    final void a(uh param0, boolean param1) {
        Object var4 = null;
        if (!param1) {
          var4 = null;
          ti.a((Throwable) null, (byte) 122, (String) null);
          ((ti) this).field_N = param0;
          return;
        } else {
          ((ti) this).field_N = param0;
          return;
        }
    }

    final void h(byte param0) {
        super.h(param0);
        if (!(null == ((ti) this).field_N)) {
            ((ti) this).field_N.d((byte) 115);
        }
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            mk var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            si stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            si stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            si stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            String stackIn_16_5 = null;
            Throwable decompiledCaughtException = null;
            si stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            si stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            si stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            String stackOut_14_5 = null;
            var6 = Bounce.field_N;
            try {
              L0: {
                var3_ref = "";
                if (param0 != null) {
                  var3_ref = ae.a((byte) -114, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param2 != null) {
                  L2: {
                    if (param0 == null) {
                      break L2;
                    } else {
                      var3_ref = var3_ref + " | ";
                      break L2;
                    }
                  }
                  var3_ref = var3_ref + param2;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param1 == 100) {
                ej.a(param1 ^ 0, var3_ref);
                var7 = ak.a(param1 + -57, ":", "%3a", var3_ref);
                var8 = ak.a(15, "@", "%40", var7);
                var9 = ak.a(88, "&", "%26", var8);
                var10 = ak.a(param1 ^ 48, "#", "%23", var9);
                if (gk.field_j != null) {
                  L3: {
                    stackOut_13_0 = jj.field_a;
                    stackOut_13_1 = null;
                    stackOut_13_2 = null;
                    stackOut_13_3 = gk.field_j.getCodeBase();
                    stackOut_13_4 = new StringBuilder().append("clienterror.ws?c=").append(nd.field_E).append("&u=");
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    stackIn_15_4 = stackOut_13_4;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    if (ke.field_m != null) {
                      stackOut_15_0 = (si) (Object) stackIn_15_0;
                      stackOut_15_1 = null;
                      stackOut_15_2 = null;
                      stackOut_15_3 = (java.net.URL) (Object) stackIn_15_3;
                      stackOut_15_4 = (StringBuilder) (Object) stackIn_15_4;
                      stackOut_15_5 = ke.field_m;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      stackIn_16_4 = stackOut_15_4;
                      stackIn_16_5 = stackOut_15_5;
                      break L3;
                    } else {
                      stackOut_14_0 = (si) (Object) stackIn_14_0;
                      stackOut_14_1 = null;
                      stackOut_14_2 = null;
                      stackOut_14_3 = (java.net.URL) (Object) stackIn_14_3;
                      stackOut_14_4 = (StringBuilder) (Object) stackIn_14_4;
                      stackOut_14_5 = "" + al.field_h;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      stackIn_16_4 = stackOut_14_4;
                      stackIn_16_5 = stackOut_14_5;
                      break L3;
                    }
                  }
                  new java.net.URL(stackIn_16_3, stackIn_16_5 + "&v1=" + si.field_r + "&v2=" + si.field_d + "&e=" + var10);
                  var4 = ((si) (Object) stackIn_16_0).a(stackIn_16_1, false);
                  L4: while (true) {
                    if (0 != var4.field_f) {
                      L5: {
                        if (1 == var4.field_f) {
                          var5 = (DataInputStream) var4.field_e;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      wh.a(1L, 19406);
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void l(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        oh var9 = null;
        int var10 = 0;
        int stackIn_15_0 = 0;
        String stackIn_21_0 = null;
        int stackIn_25_0 = 0;
        String stackIn_31_0 = null;
        int stackIn_37_0 = 0;
        oh stackIn_42_0 = null;
        int stackIn_62_0 = 0;
        String stackIn_68_0 = null;
        int stackIn_72_0 = 0;
        String stackIn_78_0 = null;
        int stackIn_84_0 = 0;
        oh stackIn_89_0 = null;
        int stackIn_105_0 = 0;
        String stackIn_111_0 = null;
        int stackIn_115_0 = 0;
        String stackIn_121_0 = null;
        int stackIn_127_0 = 0;
        oh stackIn_132_0 = null;
        int stackIn_152_0 = 0;
        String stackIn_158_0 = null;
        int stackIn_162_0 = 0;
        String stackIn_168_0 = null;
        int stackIn_174_0 = 0;
        oh stackIn_179_0 = null;
        int stackIn_196_0 = 0;
        oh stackIn_201_0 = null;
        int stackIn_222_0 = 0;
        String stackIn_228_0 = null;
        int stackIn_232_0 = 0;
        String stackIn_238_0 = null;
        int stackIn_244_0 = 0;
        oh stackIn_249_0 = null;
        int stackIn_261_0 = 0;
        int stackIn_266_0 = 0;
        String stackIn_272_0 = null;
        int stackIn_278_0 = 0;
        oh stackIn_283_0 = null;
        int stackIn_304_0 = 0;
        String stackIn_310_0 = null;
        int stackIn_314_0 = 0;
        String stackIn_320_0 = null;
        int stackIn_326_0 = 0;
        oh stackIn_331_0 = null;
        String stackIn_343_0 = null;
        int stackIn_347_0 = 0;
        int stackIn_354_0 = 0;
        oh stackIn_359_0 = null;
        int stackIn_380_0 = 0;
        String stackIn_386_0 = null;
        int stackIn_390_0 = 0;
        String stackIn_396_0 = null;
        int stackIn_402_0 = 0;
        oh stackIn_407_0 = null;
        String stackIn_419_0 = null;
        int stackIn_425_0 = 0;
        oh stackIn_430_0 = null;
        int stackIn_453_0 = 0;
        String stackIn_459_0 = null;
        int stackIn_463_0 = 0;
        String stackIn_469_0 = null;
        int stackIn_475_0 = 0;
        oh stackIn_480_0 = null;
        int stackOut_260_0 = 0;
        int stackOut_259_0 = 0;
        String stackOut_342_0 = null;
        String stackOut_341_0 = null;
        int stackOut_265_0 = 0;
        int stackOut_264_0 = 0;
        String stackOut_271_0 = null;
        String stackOut_270_0 = null;
        int stackOut_277_0 = 0;
        int stackOut_276_0 = 0;
        oh stackOut_282_0 = null;
        oh stackOut_281_0 = null;
        int stackOut_303_0 = 0;
        int stackOut_302_0 = 0;
        String stackOut_309_0 = null;
        String stackOut_308_0 = null;
        int stackOut_313_0 = 0;
        int stackOut_312_0 = 0;
        String stackOut_319_0 = null;
        String stackOut_318_0 = null;
        int stackOut_325_0 = 0;
        int stackOut_324_0 = 0;
        oh stackOut_330_0 = null;
        oh stackOut_329_0 = null;
        int stackOut_346_0 = 0;
        int stackOut_345_0 = 0;
        String stackOut_418_0 = null;
        String stackOut_417_0 = null;
        int stackOut_353_0 = 0;
        int stackOut_352_0 = 0;
        oh stackOut_358_0 = null;
        oh stackOut_357_0 = null;
        int stackOut_379_0 = 0;
        int stackOut_378_0 = 0;
        String stackOut_385_0 = null;
        String stackOut_384_0 = null;
        int stackOut_389_0 = 0;
        int stackOut_388_0 = 0;
        String stackOut_395_0 = null;
        String stackOut_394_0 = null;
        int stackOut_401_0 = 0;
        int stackOut_400_0 = 0;
        oh stackOut_406_0 = null;
        oh stackOut_405_0 = null;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        oh stackOut_200_0 = null;
        oh stackOut_199_0 = null;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        String stackOut_227_0 = null;
        String stackOut_226_0 = null;
        int stackOut_231_0 = 0;
        int stackOut_230_0 = 0;
        String stackOut_237_0 = null;
        String stackOut_236_0 = null;
        int stackOut_243_0 = 0;
        int stackOut_242_0 = 0;
        oh stackOut_248_0 = null;
        oh stackOut_247_0 = null;
        int stackOut_424_0 = 0;
        int stackOut_423_0 = 0;
        oh stackOut_429_0 = null;
        oh stackOut_428_0 = null;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        String stackOut_110_0 = null;
        String stackOut_109_0 = null;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        String stackOut_120_0 = null;
        String stackOut_119_0 = null;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        oh stackOut_131_0 = null;
        oh stackOut_130_0 = null;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        String stackOut_157_0 = null;
        String stackOut_156_0 = null;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        String stackOut_167_0 = null;
        String stackOut_166_0 = null;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        oh stackOut_178_0 = null;
        oh stackOut_177_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        String stackOut_20_0 = null;
        String stackOut_19_0 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String stackOut_30_0 = null;
        String stackOut_29_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        oh stackOut_41_0 = null;
        oh stackOut_40_0 = null;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        String stackOut_67_0 = null;
        String stackOut_66_0 = null;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        String stackOut_77_0 = null;
        String stackOut_76_0 = null;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        oh stackOut_88_0 = null;
        oh stackOut_87_0 = null;
        int stackOut_452_0 = 0;
        int stackOut_451_0 = 0;
        String stackOut_458_0 = null;
        String stackOut_457_0 = null;
        int stackOut_462_0 = 0;
        int stackOut_461_0 = 0;
        String stackOut_468_0 = null;
        String stackOut_467_0 = null;
        int stackOut_474_0 = 0;
        int stackOut_473_0 = 0;
        oh stackOut_479_0 = null;
        oh stackOut_478_0 = null;
        var10 = Bounce.field_N;
        var1 = jl.field_a;
        if (param0 == 6) {
          L0: {
            var2 = 0;
            if (ne.field_u != 2) {
              break L0;
            } else {
              L1: {
                var3_long = fa.a(-23) + -gd.field_a;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (0 > var2) {
                  break L1;
                } else {
                  var3 = 0;
                  if (se.field_E.length > var3) {
                    var4 = m.field_a[var3];
                    if (var4 < 0) {
                      L2: {
                        var5 = bc.field_a;
                        var6 = se.field_E[var3];
                        if (-3 != (ne.field_u ^ -1)) {
                          break L2;
                        } else {
                          if ((var2 ^ -1) == -2) {
                            L3: {
                              if (t.field_r.length > eb.field_E.length) {
                                stackOut_260_0 = t.field_r.length;
                                stackIn_261_0 = stackOut_260_0;
                                break L3;
                              } else {
                                stackOut_259_0 = eb.field_E.length;
                                stackIn_261_0 = stackOut_259_0;
                                break L3;
                              }
                            }
                            L4: {
                              var7 = stackIn_261_0;
                              if (6 > var3) {
                                break L4;
                              } else {
                                if (var3 < var7 + 6) {
                                  L5: {
                                    if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                      stackOut_342_0 = "";
                                      stackIn_343_0 = stackOut_342_0;
                                      break L5;
                                    } else {
                                      stackOut_341_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                      stackIn_343_0 = stackOut_341_0;
                                      break L5;
                                    }
                                  }
                                  var6_ref = stackIn_343_0;
                                  break L4;
                                } else {
                                  L6: {
                                    if (ll.field_E.length >= vb.field_k.length) {
                                      stackOut_265_0 = ll.field_E.length;
                                      stackIn_266_0 = stackOut_265_0;
                                      break L6;
                                    } else {
                                      stackOut_264_0 = vb.field_k.length;
                                      stackIn_266_0 = stackOut_264_0;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    var8 = stackIn_266_0;
                                    if (var3 < 7 - -var7) {
                                      break L7;
                                    } else {
                                      if (var3 < var8 + (var7 + 7)) {
                                        L8: {
                                          if (var3 - 7 + -var7 < ll.field_E.length) {
                                            stackOut_271_0 = ll.field_E[-7 + var3 + -var7];
                                            stackIn_272_0 = stackOut_271_0;
                                            break L8;
                                          } else {
                                            stackOut_270_0 = "";
                                            stackIn_272_0 = stackOut_270_0;
                                            break L8;
                                          }
                                        }
                                        var6_ref = stackIn_272_0;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (-2 != var4) {
                                      break L9;
                                    } else {
                                      var6_ref = Integer.toString(var2);
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if ((var4 ^ -1) > -1) {
                                      stackOut_277_0 = 0;
                                      stackIn_278_0 = stackOut_277_0;
                                      break L10;
                                    } else {
                                      stackOut_276_0 = 1;
                                      stackIn_278_0 = stackOut_276_0;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    var7 = vh.a(stackIn_278_0 != 0, var6_ref, true);
                                    var8 = bi.field_h + -(var7 >> 1449418177);
                                    if (-1 >= (var4 ^ -1)) {
                                      L12: {
                                        var1 = var1 + hj.field_a;
                                        if (cf.field_f.field_b != var4) {
                                          stackOut_282_0 = d.field_F;
                                          stackIn_283_0 = stackOut_282_0;
                                          break L12;
                                        } else {
                                          stackOut_281_0 = le.field_a;
                                          stackIn_283_0 = stackOut_281_0;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        var9 = stackIn_283_0;
                                        if (var9 != null) {
                                          var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var1 = var1 + cl.field_m;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L14: {
                                    if (var4 < 0) {
                                      ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                      var1 = var1 + k.field_D;
                                      break L14;
                                    } else {
                                      jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                      var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                      var3++;
                                      break L14;
                                    }
                                  }
                                  var3++;
                                  var3++;
                                  var3++;
                                  var2 = 0;
                                  var3 = 0;
                                  L15: while (true) {
                                    if (se.field_E.length <= var3) {
                                      return;
                                    } else {
                                      L16: {
                                        var4 = m.field_a[var3];
                                        if (var4 < 0) {
                                          var5 = bc.field_a;
                                          break L16;
                                        } else {
                                          if (var4 != cf.field_f.field_b) {
                                            var5 = de.field_f;
                                            break L16;
                                          } else {
                                            var5 = ag.field_c;
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        var6 = se.field_E[var3];
                                        if (-3 != (ne.field_u ^ -1)) {
                                          break L17;
                                        } else {
                                          if ((var2 ^ -1) == -2) {
                                            L18: {
                                              if (t.field_r.length > eb.field_E.length) {
                                                stackOut_303_0 = t.field_r.length;
                                                stackIn_304_0 = stackOut_303_0;
                                                break L18;
                                              } else {
                                                stackOut_302_0 = eb.field_E.length;
                                                stackIn_304_0 = stackOut_302_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var7 = stackIn_304_0;
                                              if (6 > var3) {
                                                break L19;
                                              } else {
                                                if (var3 < var7 + 6) {
                                                  L20: {
                                                    if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                                      stackOut_309_0 = "";
                                                      stackIn_310_0 = stackOut_309_0;
                                                      break L20;
                                                    } else {
                                                      stackOut_308_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                                      stackIn_310_0 = stackOut_308_0;
                                                      break L20;
                                                    }
                                                  }
                                                  var6_ref = stackIn_310_0;
                                                  break L19;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L21: {
                                              if (ll.field_E.length >= vb.field_k.length) {
                                                stackOut_313_0 = ll.field_E.length;
                                                stackIn_314_0 = stackOut_313_0;
                                                break L21;
                                              } else {
                                                stackOut_312_0 = vb.field_k.length;
                                                stackIn_314_0 = stackOut_312_0;
                                                break L21;
                                              }
                                            }
                                            var8 = stackIn_314_0;
                                            if (var3 < 7 - -var7) {
                                              break L17;
                                            } else {
                                              if (var3 < var8 + (var7 + 7)) {
                                                L22: {
                                                  if (var3 - 7 + -var7 < ll.field_E.length) {
                                                    stackOut_319_0 = ll.field_E[-7 + var3 + -var7];
                                                    stackIn_320_0 = stackOut_319_0;
                                                    break L22;
                                                  } else {
                                                    stackOut_318_0 = "";
                                                    stackIn_320_0 = stackOut_318_0;
                                                    break L22;
                                                  }
                                                }
                                                var6_ref = stackIn_320_0;
                                                break L17;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L23: {
                                        if (-2 != var4) {
                                          break L23;
                                        } else {
                                          var6_ref = Integer.toString(var2);
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        if ((var4 ^ -1) > -1) {
                                          stackOut_325_0 = 0;
                                          stackIn_326_0 = stackOut_325_0;
                                          break L24;
                                        } else {
                                          stackOut_324_0 = 1;
                                          stackIn_326_0 = stackOut_324_0;
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        var7 = vh.a(stackIn_326_0 != 0, var6_ref, true);
                                        var8 = bi.field_h + -(var7 >> 1449418177);
                                        if (-1 >= (var4 ^ -1)) {
                                          L26: {
                                            var1 = var1 + hj.field_a;
                                            if (cf.field_f.field_b != var4) {
                                              stackOut_330_0 = d.field_F;
                                              stackIn_331_0 = stackOut_330_0;
                                              break L26;
                                            } else {
                                              stackOut_329_0 = le.field_a;
                                              stackIn_331_0 = stackOut_329_0;
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            var9 = stackIn_331_0;
                                            if (var9 != null) {
                                              var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var1 = var1 + cl.field_m;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      if (var4 < 0) {
                                        ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                        var1 = var1 + k.field_D;
                                        var3++;
                                        continue L15;
                                      } else {
                                        jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                        var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                        var3++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L28: {
                              if (ll.field_E.length >= vb.field_k.length) {
                                stackOut_346_0 = ll.field_E.length;
                                stackIn_347_0 = stackOut_346_0;
                                break L28;
                              } else {
                                stackOut_345_0 = vb.field_k.length;
                                stackIn_347_0 = stackOut_345_0;
                                break L28;
                              }
                            }
                            var8 = stackIn_347_0;
                            if (var3 < 7 - -var7) {
                              break L2;
                            } else {
                              if (var3 < var8 + (var7 + 7)) {
                                L29: {
                                  if (var3 - 7 + -var7 < ll.field_E.length) {
                                    stackOut_418_0 = ll.field_E[-7 + var3 + -var7];
                                    stackIn_419_0 = stackOut_418_0;
                                    break L29;
                                  } else {
                                    stackOut_417_0 = "";
                                    stackIn_419_0 = stackOut_417_0;
                                    break L29;
                                  }
                                }
                                var6_ref = stackIn_419_0;
                                break L2;
                              } else {
                                L30: {
                                  if (-2 != var4) {
                                    break L30;
                                  } else {
                                    var6_ref = Integer.toString(var2);
                                    break L30;
                                  }
                                }
                                L31: {
                                  if ((var4 ^ -1) > -1) {
                                    stackOut_353_0 = 0;
                                    stackIn_354_0 = stackOut_353_0;
                                    break L31;
                                  } else {
                                    stackOut_352_0 = 1;
                                    stackIn_354_0 = stackOut_352_0;
                                    break L31;
                                  }
                                }
                                L32: {
                                  var7 = vh.a(stackIn_354_0 != 0, var6_ref, true);
                                  var8 = bi.field_h + -(var7 >> 1449418177);
                                  if (-1 >= (var4 ^ -1)) {
                                    L33: {
                                      var1 = var1 + hj.field_a;
                                      if (cf.field_f.field_b != var4) {
                                        stackOut_358_0 = d.field_F;
                                        stackIn_359_0 = stackOut_358_0;
                                        break L33;
                                      } else {
                                        stackOut_357_0 = le.field_a;
                                        stackIn_359_0 = stackOut_357_0;
                                        break L33;
                                      }
                                    }
                                    L34: {
                                      var9 = stackIn_359_0;
                                      if (var9 != null) {
                                        var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    var1 = var1 + cl.field_m;
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                                L35: {
                                  if (var4 < 0) {
                                    ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                    var1 = var1 + k.field_D;
                                    break L35;
                                  } else {
                                    jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                    var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                    var3++;
                                    break L35;
                                  }
                                }
                                var3++;
                                var3++;
                                var3++;
                                var2 = 0;
                                var3 = 0;
                                L36: while (true) {
                                  if (se.field_E.length <= var3) {
                                    return;
                                  } else {
                                    L37: {
                                      var4 = m.field_a[var3];
                                      if (var4 < 0) {
                                        var5 = bc.field_a;
                                        break L37;
                                      } else {
                                        if (var4 != cf.field_f.field_b) {
                                          var5 = de.field_f;
                                          break L37;
                                        } else {
                                          var5 = ag.field_c;
                                          break L37;
                                        }
                                      }
                                    }
                                    L38: {
                                      var6 = se.field_E[var3];
                                      if (-3 != (ne.field_u ^ -1)) {
                                        break L38;
                                      } else {
                                        if ((var2 ^ -1) == -2) {
                                          L39: {
                                            if (t.field_r.length > eb.field_E.length) {
                                              stackOut_379_0 = t.field_r.length;
                                              stackIn_380_0 = stackOut_379_0;
                                              break L39;
                                            } else {
                                              stackOut_378_0 = eb.field_E.length;
                                              stackIn_380_0 = stackOut_378_0;
                                              break L39;
                                            }
                                          }
                                          L40: {
                                            var7 = stackIn_380_0;
                                            if (6 > var3) {
                                              break L40;
                                            } else {
                                              if (var3 < var7 + 6) {
                                                L41: {
                                                  if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                                    stackOut_385_0 = "";
                                                    stackIn_386_0 = stackOut_385_0;
                                                    break L41;
                                                  } else {
                                                    stackOut_384_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                                    stackIn_386_0 = stackOut_384_0;
                                                    break L41;
                                                  }
                                                }
                                                var6_ref = stackIn_386_0;
                                                break L40;
                                              } else {
                                                break L40;
                                              }
                                            }
                                          }
                                          L42: {
                                            if (ll.field_E.length >= vb.field_k.length) {
                                              stackOut_389_0 = ll.field_E.length;
                                              stackIn_390_0 = stackOut_389_0;
                                              break L42;
                                            } else {
                                              stackOut_388_0 = vb.field_k.length;
                                              stackIn_390_0 = stackOut_388_0;
                                              break L42;
                                            }
                                          }
                                          var8 = stackIn_390_0;
                                          if (var3 < 7 - -var7) {
                                            break L38;
                                          } else {
                                            if (var3 < var8 + (var7 + 7)) {
                                              L43: {
                                                if (var3 - 7 + -var7 < ll.field_E.length) {
                                                  stackOut_395_0 = ll.field_E[-7 + var3 + -var7];
                                                  stackIn_396_0 = stackOut_395_0;
                                                  break L43;
                                                } else {
                                                  stackOut_394_0 = "";
                                                  stackIn_396_0 = stackOut_394_0;
                                                  break L43;
                                                }
                                              }
                                              var6_ref = stackIn_396_0;
                                              break L38;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    L44: {
                                      if (-2 != var4) {
                                        break L44;
                                      } else {
                                        var6_ref = Integer.toString(var2);
                                        break L44;
                                      }
                                    }
                                    L45: {
                                      if ((var4 ^ -1) > -1) {
                                        stackOut_401_0 = 0;
                                        stackIn_402_0 = stackOut_401_0;
                                        break L45;
                                      } else {
                                        stackOut_400_0 = 1;
                                        stackIn_402_0 = stackOut_400_0;
                                        break L45;
                                      }
                                    }
                                    L46: {
                                      var7 = vh.a(stackIn_402_0 != 0, var6_ref, true);
                                      var8 = bi.field_h + -(var7 >> 1449418177);
                                      if (-1 >= (var4 ^ -1)) {
                                        L47: {
                                          var1 = var1 + hj.field_a;
                                          if (cf.field_f.field_b != var4) {
                                            stackOut_406_0 = d.field_F;
                                            stackIn_407_0 = stackOut_406_0;
                                            break L47;
                                          } else {
                                            stackOut_405_0 = le.field_a;
                                            stackIn_407_0 = stackOut_405_0;
                                            break L47;
                                          }
                                        }
                                        L48: {
                                          var9 = stackIn_407_0;
                                          if (var9 != null) {
                                            var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                        var1 = var1 + cl.field_m;
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                    if (var4 < 0) {
                                      ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                      var1 = var1 + k.field_D;
                                      var3++;
                                      continue L36;
                                    } else {
                                      jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                      var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                      var3++;
                                      continue L36;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L49: {
                              if (-2 != var4) {
                                break L49;
                              } else {
                                var6_ref = Integer.toString(var2);
                                break L49;
                              }
                            }
                            L50: {
                              if ((var4 ^ -1) > -1) {
                                stackOut_195_0 = 0;
                                stackIn_196_0 = stackOut_195_0;
                                break L50;
                              } else {
                                stackOut_194_0 = 1;
                                stackIn_196_0 = stackOut_194_0;
                                break L50;
                              }
                            }
                            L51: {
                              var7 = vh.a(stackIn_196_0 != 0, var6_ref, true);
                              var8 = bi.field_h + -(var7 >> 1449418177);
                              if (-1 >= (var4 ^ -1)) {
                                L52: {
                                  var1 = var1 + hj.field_a;
                                  if (cf.field_f.field_b != var4) {
                                    stackOut_200_0 = d.field_F;
                                    stackIn_201_0 = stackOut_200_0;
                                    break L52;
                                  } else {
                                    stackOut_199_0 = le.field_a;
                                    stackIn_201_0 = stackOut_199_0;
                                    break L52;
                                  }
                                }
                                L53: {
                                  var9 = stackIn_201_0;
                                  if (var9 != null) {
                                    var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                    break L53;
                                  } else {
                                    break L53;
                                  }
                                }
                                var1 = var1 + cl.field_m;
                                break L51;
                              } else {
                                break L51;
                              }
                            }
                            L54: {
                              if (var4 < 0) {
                                ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                var1 = var1 + k.field_D;
                                break L54;
                              } else {
                                jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                var3++;
                                break L54;
                              }
                            }
                            var3++;
                            var3++;
                            var3++;
                            var2 = 0;
                            var3 = 0;
                            L55: while (true) {
                              if (se.field_E.length <= var3) {
                                return;
                              } else {
                                L56: {
                                  var4 = m.field_a[var3];
                                  if (var4 < 0) {
                                    var5 = bc.field_a;
                                    break L56;
                                  } else {
                                    if (var4 != cf.field_f.field_b) {
                                      var5 = de.field_f;
                                      break L56;
                                    } else {
                                      var5 = ag.field_c;
                                      break L56;
                                    }
                                  }
                                }
                                L57: {
                                  var6 = se.field_E[var3];
                                  if (-3 != (ne.field_u ^ -1)) {
                                    break L57;
                                  } else {
                                    if ((var2 ^ -1) == -2) {
                                      L58: {
                                        if (t.field_r.length > eb.field_E.length) {
                                          stackOut_221_0 = t.field_r.length;
                                          stackIn_222_0 = stackOut_221_0;
                                          break L58;
                                        } else {
                                          stackOut_220_0 = eb.field_E.length;
                                          stackIn_222_0 = stackOut_220_0;
                                          break L58;
                                        }
                                      }
                                      L59: {
                                        var7 = stackIn_222_0;
                                        if (6 > var3) {
                                          break L59;
                                        } else {
                                          if (var3 < var7 + 6) {
                                            L60: {
                                              if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                                stackOut_227_0 = "";
                                                stackIn_228_0 = stackOut_227_0;
                                                break L60;
                                              } else {
                                                stackOut_226_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                                stackIn_228_0 = stackOut_226_0;
                                                break L60;
                                              }
                                            }
                                            var6_ref = stackIn_228_0;
                                            break L59;
                                          } else {
                                            break L59;
                                          }
                                        }
                                      }
                                      L61: {
                                        if (ll.field_E.length >= vb.field_k.length) {
                                          stackOut_231_0 = ll.field_E.length;
                                          stackIn_232_0 = stackOut_231_0;
                                          break L61;
                                        } else {
                                          stackOut_230_0 = vb.field_k.length;
                                          stackIn_232_0 = stackOut_230_0;
                                          break L61;
                                        }
                                      }
                                      var8 = stackIn_232_0;
                                      if (var3 < 7 - -var7) {
                                        break L57;
                                      } else {
                                        if (var3 < var8 + (var7 + 7)) {
                                          L62: {
                                            if (var3 - 7 + -var7 < ll.field_E.length) {
                                              stackOut_237_0 = ll.field_E[-7 + var3 + -var7];
                                              stackIn_238_0 = stackOut_237_0;
                                              break L62;
                                            } else {
                                              stackOut_236_0 = "";
                                              stackIn_238_0 = stackOut_236_0;
                                              break L62;
                                            }
                                          }
                                          var6_ref = stackIn_238_0;
                                          break L57;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                                L63: {
                                  if (-2 != var4) {
                                    break L63;
                                  } else {
                                    var6_ref = Integer.toString(var2);
                                    break L63;
                                  }
                                }
                                L64: {
                                  if ((var4 ^ -1) > -1) {
                                    stackOut_243_0 = 0;
                                    stackIn_244_0 = stackOut_243_0;
                                    break L64;
                                  } else {
                                    stackOut_242_0 = 1;
                                    stackIn_244_0 = stackOut_242_0;
                                    break L64;
                                  }
                                }
                                L65: {
                                  var7 = vh.a(stackIn_244_0 != 0, var6_ref, true);
                                  var8 = bi.field_h + -(var7 >> 1449418177);
                                  if (-1 >= (var4 ^ -1)) {
                                    L66: {
                                      var1 = var1 + hj.field_a;
                                      if (cf.field_f.field_b != var4) {
                                        stackOut_248_0 = d.field_F;
                                        stackIn_249_0 = stackOut_248_0;
                                        break L66;
                                      } else {
                                        stackOut_247_0 = le.field_a;
                                        stackIn_249_0 = stackOut_247_0;
                                        break L66;
                                      }
                                    }
                                    L67: {
                                      var9 = stackIn_249_0;
                                      if (var9 != null) {
                                        var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                        break L67;
                                      } else {
                                        break L67;
                                      }
                                    }
                                    var1 = var1 + cl.field_m;
                                    break L65;
                                  } else {
                                    break L65;
                                  }
                                }
                                if (var4 < 0) {
                                  ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                  var1 = var1 + k.field_D;
                                  var3++;
                                  continue L55;
                                } else {
                                  jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                  var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                  var3++;
                                  continue L55;
                                }
                              }
                            }
                          }
                        }
                      }
                      L68: {
                        if (-2 != var4) {
                          break L68;
                        } else {
                          var6_ref = Integer.toString(var2);
                          break L68;
                        }
                      }
                      L69: {
                        if ((var4 ^ -1) > -1) {
                          stackOut_424_0 = 0;
                          stackIn_425_0 = stackOut_424_0;
                          break L69;
                        } else {
                          stackOut_423_0 = 1;
                          stackIn_425_0 = stackOut_423_0;
                          break L69;
                        }
                      }
                      L70: {
                        var7 = vh.a(stackIn_425_0 != 0, var6_ref, true);
                        var8 = bi.field_h + -(var7 >> 1449418177);
                        if (-1 >= (var4 ^ -1)) {
                          L71: {
                            var1 = var1 + hj.field_a;
                            if (cf.field_f.field_b != var4) {
                              stackOut_429_0 = d.field_F;
                              stackIn_430_0 = stackOut_429_0;
                              break L71;
                            } else {
                              stackOut_428_0 = le.field_a;
                              stackIn_430_0 = stackOut_428_0;
                              break L71;
                            }
                          }
                          L72: {
                            var9 = stackIn_430_0;
                            if (var9 != null) {
                              var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                              break L72;
                            } else {
                              break L72;
                            }
                          }
                          var1 = var1 + cl.field_m;
                          break L70;
                        } else {
                          break L70;
                        }
                      }
                      L73: {
                        if (var4 < 0) {
                          ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                          var1 = var1 + k.field_D;
                          break L73;
                        } else {
                          jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                          var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                          var3++;
                          break L73;
                        }
                      }
                      var3++;
                      var3++;
                      var3++;
                      break L1;
                    } else {
                      if (var4 != cf.field_f.field_b) {
                        L74: {
                          var5 = de.field_f;
                          var6 = se.field_E[var3];
                          if (-3 != (ne.field_u ^ -1)) {
                            break L74;
                          } else {
                            if ((var2 ^ -1) == -2) {
                              L75: {
                                if (t.field_r.length > eb.field_E.length) {
                                  stackOut_104_0 = t.field_r.length;
                                  stackIn_105_0 = stackOut_104_0;
                                  break L75;
                                } else {
                                  stackOut_103_0 = eb.field_E.length;
                                  stackIn_105_0 = stackOut_103_0;
                                  break L75;
                                }
                              }
                              L76: {
                                var7 = stackIn_105_0;
                                if (6 > var3) {
                                  break L76;
                                } else {
                                  if (var3 < var7 + 6) {
                                    L77: {
                                      if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                        stackOut_110_0 = "";
                                        stackIn_111_0 = stackOut_110_0;
                                        break L77;
                                      } else {
                                        stackOut_109_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                        stackIn_111_0 = stackOut_109_0;
                                        break L77;
                                      }
                                    }
                                    var6_ref = stackIn_111_0;
                                    break L76;
                                  } else {
                                    break L76;
                                  }
                                }
                              }
                              L78: {
                                if (ll.field_E.length >= vb.field_k.length) {
                                  stackOut_114_0 = ll.field_E.length;
                                  stackIn_115_0 = stackOut_114_0;
                                  break L78;
                                } else {
                                  stackOut_113_0 = vb.field_k.length;
                                  stackIn_115_0 = stackOut_113_0;
                                  break L78;
                                }
                              }
                              var8 = stackIn_115_0;
                              if (var3 < 7 - -var7) {
                                break L74;
                              } else {
                                if (var3 < var8 + (var7 + 7)) {
                                  L79: {
                                    if (var3 - 7 + -var7 < ll.field_E.length) {
                                      stackOut_120_0 = ll.field_E[-7 + var3 + -var7];
                                      stackIn_121_0 = stackOut_120_0;
                                      break L79;
                                    } else {
                                      stackOut_119_0 = "";
                                      stackIn_121_0 = stackOut_119_0;
                                      break L79;
                                    }
                                  }
                                  var6_ref = stackIn_121_0;
                                  break L74;
                                } else {
                                  break L74;
                                }
                              }
                            } else {
                              break L74;
                            }
                          }
                        }
                        L80: {
                          if (-2 != var4) {
                            break L80;
                          } else {
                            var6_ref = Integer.toString(var2);
                            break L80;
                          }
                        }
                        L81: {
                          if ((var4 ^ -1) > -1) {
                            stackOut_126_0 = 0;
                            stackIn_127_0 = stackOut_126_0;
                            break L81;
                          } else {
                            stackOut_125_0 = 1;
                            stackIn_127_0 = stackOut_125_0;
                            break L81;
                          }
                        }
                        L82: {
                          var7 = vh.a(stackIn_127_0 != 0, var6_ref, true);
                          var8 = bi.field_h + -(var7 >> 1449418177);
                          if (-1 >= (var4 ^ -1)) {
                            L83: {
                              var1 = var1 + hj.field_a;
                              if (cf.field_f.field_b != var4) {
                                stackOut_131_0 = d.field_F;
                                stackIn_132_0 = stackOut_131_0;
                                break L83;
                              } else {
                                stackOut_130_0 = le.field_a;
                                stackIn_132_0 = stackOut_130_0;
                                break L83;
                              }
                            }
                            L84: {
                              var9 = stackIn_132_0;
                              if (var9 != null) {
                                var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                break L84;
                              } else {
                                break L84;
                              }
                            }
                            var1 = var1 + cl.field_m;
                            break L82;
                          } else {
                            break L82;
                          }
                        }
                        L85: {
                          if (var4 < 0) {
                            ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                            var1 = var1 + k.field_D;
                            break L85;
                          } else {
                            jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                            var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                            var3++;
                            break L85;
                          }
                        }
                        L86: {
                          var3++;
                          var3++;
                          var3++;
                          var2 = 0;
                          var3 = 0;
                          if (se.field_E.length <= var3) {
                            break L86;
                          } else {
                            L87: {
                              var4 = m.field_a[var3];
                              if (var4 < 0) {
                                var5 = bc.field_a;
                                break L87;
                              } else {
                                if (var4 != cf.field_f.field_b) {
                                  var5 = de.field_f;
                                  break L87;
                                } else {
                                  var5 = ag.field_c;
                                  break L87;
                                }
                              }
                            }
                            L88: {
                              var6 = se.field_E[var3];
                              if (-3 != (ne.field_u ^ -1)) {
                                break L88;
                              } else {
                                if ((var2 ^ -1) == -2) {
                                  L89: {
                                    if (t.field_r.length > eb.field_E.length) {
                                      stackOut_151_0 = t.field_r.length;
                                      stackIn_152_0 = stackOut_151_0;
                                      break L89;
                                    } else {
                                      stackOut_150_0 = eb.field_E.length;
                                      stackIn_152_0 = stackOut_150_0;
                                      break L89;
                                    }
                                  }
                                  L90: {
                                    var7 = stackIn_152_0;
                                    if (6 > var3) {
                                      break L90;
                                    } else {
                                      if (var3 < var7 + 6) {
                                        L91: {
                                          if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                            stackOut_157_0 = "";
                                            stackIn_158_0 = stackOut_157_0;
                                            break L91;
                                          } else {
                                            stackOut_156_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                            stackIn_158_0 = stackOut_156_0;
                                            break L91;
                                          }
                                        }
                                        var6_ref = stackIn_158_0;
                                        break L90;
                                      } else {
                                        break L90;
                                      }
                                    }
                                  }
                                  L92: {
                                    if (ll.field_E.length >= vb.field_k.length) {
                                      stackOut_161_0 = ll.field_E.length;
                                      stackIn_162_0 = stackOut_161_0;
                                      break L92;
                                    } else {
                                      stackOut_160_0 = vb.field_k.length;
                                      stackIn_162_0 = stackOut_160_0;
                                      break L92;
                                    }
                                  }
                                  var8 = stackIn_162_0;
                                  if (var3 < 7 - -var7) {
                                    break L88;
                                  } else {
                                    if (var3 < var8 + (var7 + 7)) {
                                      L93: {
                                        if (var3 - 7 + -var7 < ll.field_E.length) {
                                          stackOut_167_0 = ll.field_E[-7 + var3 + -var7];
                                          stackIn_168_0 = stackOut_167_0;
                                          break L93;
                                        } else {
                                          stackOut_166_0 = "";
                                          stackIn_168_0 = stackOut_166_0;
                                          break L93;
                                        }
                                      }
                                      var6_ref = stackIn_168_0;
                                      break L88;
                                    } else {
                                      break L88;
                                    }
                                  }
                                } else {
                                  break L88;
                                }
                              }
                            }
                            L94: {
                              if (-2 != var4) {
                                break L94;
                              } else {
                                var6_ref = Integer.toString(var2);
                                break L94;
                              }
                            }
                            L95: {
                              if ((var4 ^ -1) > -1) {
                                stackOut_173_0 = 0;
                                stackIn_174_0 = stackOut_173_0;
                                break L95;
                              } else {
                                stackOut_172_0 = 1;
                                stackIn_174_0 = stackOut_172_0;
                                break L95;
                              }
                            }
                            L96: {
                              var7 = vh.a(stackIn_174_0 != 0, var6_ref, true);
                              var8 = bi.field_h + -(var7 >> 1449418177);
                              if (-1 >= (var4 ^ -1)) {
                                L97: {
                                  var1 = var1 + hj.field_a;
                                  if (cf.field_f.field_b != var4) {
                                    stackOut_178_0 = d.field_F;
                                    stackIn_179_0 = stackOut_178_0;
                                    break L97;
                                  } else {
                                    stackOut_177_0 = le.field_a;
                                    stackIn_179_0 = stackOut_177_0;
                                    break L97;
                                  }
                                }
                                L98: {
                                  var9 = stackIn_179_0;
                                  if (var9 != null) {
                                    var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                    break L98;
                                  } else {
                                    break L98;
                                  }
                                }
                                var1 = var1 + cl.field_m;
                                break L96;
                              } else {
                                break L96;
                              }
                            }
                            L99: {
                              if (var4 < 0) {
                                ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                var1 = var1 + k.field_D;
                                break L99;
                              } else {
                                jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                var3++;
                                break L99;
                              }
                            }
                            var3++;
                            var3++;
                            var3++;
                            break L86;
                          }
                        }
                        return;
                      } else {
                        L100: {
                          var5 = ag.field_c;
                          var6 = se.field_E[var3];
                          if (-3 != (ne.field_u ^ -1)) {
                            break L100;
                          } else {
                            if ((var2 ^ -1) == -2) {
                              L101: {
                                if (t.field_r.length > eb.field_E.length) {
                                  stackOut_14_0 = t.field_r.length;
                                  stackIn_15_0 = stackOut_14_0;
                                  break L101;
                                } else {
                                  stackOut_13_0 = eb.field_E.length;
                                  stackIn_15_0 = stackOut_13_0;
                                  break L101;
                                }
                              }
                              L102: {
                                var7 = stackIn_15_0;
                                if (6 > var3) {
                                  break L102;
                                } else {
                                  if (var3 < var7 + 6) {
                                    L103: {
                                      if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                        stackOut_20_0 = "";
                                        stackIn_21_0 = stackOut_20_0;
                                        break L103;
                                      } else {
                                        stackOut_19_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                        stackIn_21_0 = stackOut_19_0;
                                        break L103;
                                      }
                                    }
                                    var6_ref = stackIn_21_0;
                                    break L102;
                                  } else {
                                    break L102;
                                  }
                                }
                              }
                              L104: {
                                if (ll.field_E.length >= vb.field_k.length) {
                                  stackOut_24_0 = ll.field_E.length;
                                  stackIn_25_0 = stackOut_24_0;
                                  break L104;
                                } else {
                                  stackOut_23_0 = vb.field_k.length;
                                  stackIn_25_0 = stackOut_23_0;
                                  break L104;
                                }
                              }
                              var8 = stackIn_25_0;
                              if (var3 < 7 - -var7) {
                                break L100;
                              } else {
                                if (var3 < var8 + (var7 + 7)) {
                                  L105: {
                                    if (var3 - 7 + -var7 < ll.field_E.length) {
                                      stackOut_30_0 = ll.field_E[-7 + var3 + -var7];
                                      stackIn_31_0 = stackOut_30_0;
                                      break L105;
                                    } else {
                                      stackOut_29_0 = "";
                                      stackIn_31_0 = stackOut_29_0;
                                      break L105;
                                    }
                                  }
                                  var6_ref = stackIn_31_0;
                                  break L100;
                                } else {
                                  break L100;
                                }
                              }
                            } else {
                              break L100;
                            }
                          }
                        }
                        L106: {
                          if (-2 != var4) {
                            break L106;
                          } else {
                            var6_ref = Integer.toString(var2);
                            break L106;
                          }
                        }
                        L107: {
                          if ((var4 ^ -1) > -1) {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            break L107;
                          } else {
                            stackOut_35_0 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            break L107;
                          }
                        }
                        L108: {
                          var7 = vh.a(stackIn_37_0 != 0, var6_ref, true);
                          var8 = bi.field_h + -(var7 >> 1449418177);
                          if (-1 >= (var4 ^ -1)) {
                            L109: {
                              var1 = var1 + hj.field_a;
                              if (cf.field_f.field_b != var4) {
                                stackOut_41_0 = d.field_F;
                                stackIn_42_0 = stackOut_41_0;
                                break L109;
                              } else {
                                stackOut_40_0 = le.field_a;
                                stackIn_42_0 = stackOut_40_0;
                                break L109;
                              }
                            }
                            L110: {
                              var9 = stackIn_42_0;
                              if (var9 != null) {
                                var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                break L110;
                              } else {
                                break L110;
                              }
                            }
                            var1 = var1 + cl.field_m;
                            break L108;
                          } else {
                            break L108;
                          }
                        }
                        L111: {
                          if (var4 < 0) {
                            ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                            var1 = var1 + k.field_D;
                            break L111;
                          } else {
                            jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                            var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                            var3++;
                            break L111;
                          }
                        }
                        L112: {
                          var3++;
                          var3++;
                          var3++;
                          var2 = 0;
                          var3 = 0;
                          if (se.field_E.length <= var3) {
                            break L112;
                          } else {
                            L113: {
                              var4 = m.field_a[var3];
                              if (var4 < 0) {
                                var5 = bc.field_a;
                                break L113;
                              } else {
                                if (var4 != cf.field_f.field_b) {
                                  var5 = de.field_f;
                                  break L113;
                                } else {
                                  var5 = ag.field_c;
                                  break L113;
                                }
                              }
                            }
                            L114: {
                              var6 = se.field_E[var3];
                              if (-3 != (ne.field_u ^ -1)) {
                                break L114;
                              } else {
                                if ((var2 ^ -1) == -2) {
                                  L115: {
                                    if (t.field_r.length > eb.field_E.length) {
                                      stackOut_61_0 = t.field_r.length;
                                      stackIn_62_0 = stackOut_61_0;
                                      break L115;
                                    } else {
                                      stackOut_60_0 = eb.field_E.length;
                                      stackIn_62_0 = stackOut_60_0;
                                      break L115;
                                    }
                                  }
                                  L116: {
                                    var7 = stackIn_62_0;
                                    if (6 > var3) {
                                      break L116;
                                    } else {
                                      if (var3 < var7 + 6) {
                                        L117: {
                                          if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                                            stackOut_67_0 = "";
                                            stackIn_68_0 = stackOut_67_0;
                                            break L117;
                                          } else {
                                            stackOut_66_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                            stackIn_68_0 = stackOut_66_0;
                                            break L117;
                                          }
                                        }
                                        var6_ref = stackIn_68_0;
                                        break L116;
                                      } else {
                                        break L116;
                                      }
                                    }
                                  }
                                  L118: {
                                    if (ll.field_E.length >= vb.field_k.length) {
                                      stackOut_71_0 = ll.field_E.length;
                                      stackIn_72_0 = stackOut_71_0;
                                      break L118;
                                    } else {
                                      stackOut_70_0 = vb.field_k.length;
                                      stackIn_72_0 = stackOut_70_0;
                                      break L118;
                                    }
                                  }
                                  var8 = stackIn_72_0;
                                  if (var3 < 7 - -var7) {
                                    break L114;
                                  } else {
                                    if (var3 < var8 + (var7 + 7)) {
                                      L119: {
                                        if (var3 - 7 + -var7 < ll.field_E.length) {
                                          stackOut_77_0 = ll.field_E[-7 + var3 + -var7];
                                          stackIn_78_0 = stackOut_77_0;
                                          break L119;
                                        } else {
                                          stackOut_76_0 = "";
                                          stackIn_78_0 = stackOut_76_0;
                                          break L119;
                                        }
                                      }
                                      var6_ref = stackIn_78_0;
                                      break L114;
                                    } else {
                                      break L114;
                                    }
                                  }
                                } else {
                                  break L114;
                                }
                              }
                            }
                            L120: {
                              if (-2 != var4) {
                                break L120;
                              } else {
                                var6_ref = Integer.toString(var2);
                                break L120;
                              }
                            }
                            L121: {
                              if ((var4 ^ -1) > -1) {
                                stackOut_83_0 = 0;
                                stackIn_84_0 = stackOut_83_0;
                                break L121;
                              } else {
                                stackOut_82_0 = 1;
                                stackIn_84_0 = stackOut_82_0;
                                break L121;
                              }
                            }
                            L122: {
                              var7 = vh.a(stackIn_84_0 != 0, var6_ref, true);
                              var8 = bi.field_h + -(var7 >> 1449418177);
                              if (-1 >= (var4 ^ -1)) {
                                L123: {
                                  var1 = var1 + hj.field_a;
                                  if (cf.field_f.field_b != var4) {
                                    stackOut_88_0 = d.field_F;
                                    stackIn_89_0 = stackOut_88_0;
                                    break L123;
                                  } else {
                                    stackOut_87_0 = le.field_a;
                                    stackIn_89_0 = stackOut_87_0;
                                    break L123;
                                  }
                                }
                                L124: {
                                  var9 = stackIn_89_0;
                                  if (var9 != null) {
                                    var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                                    break L124;
                                  } else {
                                    break L124;
                                  }
                                }
                                var1 = var1 + cl.field_m;
                                break L122;
                              } else {
                                break L122;
                              }
                            }
                            L125: {
                              if (var4 < 0) {
                                ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                                var1 = var1 + k.field_D;
                                break L125;
                              } else {
                                jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                                var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                                var3++;
                                break L125;
                              }
                            }
                            var3++;
                            var3++;
                            var3++;
                            break L112;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              var2 = 0;
              break L0;
            }
          }
          var3 = 0;
          L126: while (true) {
            if (se.field_E.length <= var3) {
              return;
            } else {
              L127: {
                var4 = m.field_a[var3];
                if (var4 < 0) {
                  var5 = bc.field_a;
                  break L127;
                } else {
                  if (var4 != cf.field_f.field_b) {
                    var5 = de.field_f;
                    break L127;
                  } else {
                    var5 = ag.field_c;
                    break L127;
                  }
                }
              }
              L128: {
                var6 = se.field_E[var3];
                if (-3 != (ne.field_u ^ -1)) {
                  break L128;
                } else {
                  if ((var2 ^ -1) == -2) {
                    L129: {
                      if (t.field_r.length > eb.field_E.length) {
                        stackOut_452_0 = t.field_r.length;
                        stackIn_453_0 = stackOut_452_0;
                        break L129;
                      } else {
                        stackOut_451_0 = eb.field_E.length;
                        stackIn_453_0 = stackOut_451_0;
                        break L129;
                      }
                    }
                    L130: {
                      var7 = stackIn_453_0;
                      if (6 > var3) {
                        break L130;
                      } else {
                        if (var3 < var7 + 6) {
                          L131: {
                            if ((eb.field_E.length + (var3 + -6 - var7) ^ -1) > -1) {
                              stackOut_458_0 = "";
                              stackIn_459_0 = stackOut_458_0;
                              break L131;
                            } else {
                              stackOut_457_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                              stackIn_459_0 = stackOut_457_0;
                              break L131;
                            }
                          }
                          var6_ref = stackIn_459_0;
                          break L130;
                        } else {
                          break L130;
                        }
                      }
                    }
                    L132: {
                      if (ll.field_E.length >= vb.field_k.length) {
                        stackOut_462_0 = ll.field_E.length;
                        stackIn_463_0 = stackOut_462_0;
                        break L132;
                      } else {
                        stackOut_461_0 = vb.field_k.length;
                        stackIn_463_0 = stackOut_461_0;
                        break L132;
                      }
                    }
                    var8 = stackIn_463_0;
                    if (var3 < 7 - -var7) {
                      break L128;
                    } else {
                      if (var3 < var8 + (var7 + 7)) {
                        L133: {
                          if (var3 - 7 + -var7 < ll.field_E.length) {
                            stackOut_468_0 = ll.field_E[-7 + var3 + -var7];
                            stackIn_469_0 = stackOut_468_0;
                            break L133;
                          } else {
                            stackOut_467_0 = "";
                            stackIn_469_0 = stackOut_467_0;
                            break L133;
                          }
                        }
                        var6_ref = stackIn_469_0;
                        break L128;
                      } else {
                        break L128;
                      }
                    }
                  } else {
                    break L128;
                  }
                }
              }
              L134: {
                if (-2 != var4) {
                  break L134;
                } else {
                  var6_ref = Integer.toString(var2);
                  break L134;
                }
              }
              L135: {
                if ((var4 ^ -1) > -1) {
                  stackOut_474_0 = 0;
                  stackIn_475_0 = stackOut_474_0;
                  break L135;
                } else {
                  stackOut_473_0 = 1;
                  stackIn_475_0 = stackOut_473_0;
                  break L135;
                }
              }
              L136: {
                var7 = vh.a(stackIn_475_0 != 0, var6_ref, true);
                var8 = bi.field_h + -(var7 >> 1449418177);
                if (-1 >= (var4 ^ -1)) {
                  L137: {
                    var1 = var1 + hj.field_a;
                    if (cf.field_f.field_b != var4) {
                      stackOut_479_0 = d.field_F;
                      stackIn_480_0 = stackOut_479_0;
                      break L137;
                    } else {
                      stackOut_478_0 = le.field_a;
                      stackIn_480_0 = stackOut_478_0;
                      break L137;
                    }
                  }
                  L138: {
                    var9 = stackIn_480_0;
                    if (var9 != null) {
                      var9.a(var1, -kk.field_z + var8, (kk.field_z << -88972767) + var7, param0 ^ -21909, (cl.field_m << 51936449) + pb.field_j);
                      break L138;
                    } else {
                      break L138;
                    }
                  }
                  var1 = var1 + cl.field_m;
                  break L136;
                } else {
                  break L136;
                }
              }
              if (var4 < 0) {
                ba.field_E.b(var6_ref, var8, qd.field_b + var1, var5, -1);
                var1 = var1 + k.field_D;
                var3++;
                continue L126;
              } else {
                jc.field_h.b(var6_ref, var8, ed.field_d + var1, var5, -1);
                var1 = var1 + (cl.field_m - -hj.field_a + pb.field_j);
                var3++;
                continue L126;
              }
            }
          }
        } else {
          return;
        }
    }

    public final uh a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((ti) this).field_N;
    }

    ti(String param0, sk param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        bc.field_a = param2;
        de.field_f = param0;
        ag.field_c = param1;
        if (param3 != 102) {
            field_O = 92;
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class spa implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mua stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        mua stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 56 / ((-64 - param0) / 50);
            stackOut_0_0 = new mua();
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "spa.A(" + param0 + ')');
        }
        return (tv) (Object) stackIn_1_0;
    }

    final static void b(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (32 >= kt.field_l) {
                  break L2;
                } else {
                  L3: {
                    var1_int = kt.field_l % 32;
                    if (var1_int != 0) {
                      break L3;
                    } else {
                      var1_int = 32;
                      break L3;
                    }
                  }
                  nl.a(-var1_int + kt.field_l, -13205);
                  if (VoidHunters.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              nl.a(0, -13205);
              break L1;
            }
            L4: {
              if (param0 == 64) {
                break L4;
              } else {
                field_a = 29;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) (Object) runtimeException, "spa.D(" + param0 + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        RuntimeException var3 = null;
        mua[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        mua[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 11995) {
                break L1;
              } else {
                field_a = -87;
                break L1;
              }
            }
            stackOut_3_0 = new mua[param1];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "spa.B(" + param0 + ',' + param1 + ')');
        }
        return (tv[]) (Object) stackIn_4_0;
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        sg var6 = null;
        lta var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!ck.b(false)) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        var2_int = 1;
                        var3 = km.field_s;
                        var4 = 0;
                        if (vqa.field_g == null) {
                          break L5;
                        } else {
                          if (!vqa.field_g.field_N) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (oab.field_o != 0) {
                        break L3;
                      } else {
                        if (0 != wgb.field_f) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var4 = 1;
                    if (VoidHunters.field_G == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  var3 = cf.field_a;
                  break L2;
                }
                L6: {
                  ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
                  var5 = kma.a(var2_int, 0, 200, var3);
                  var6 = ae.a(wba.field_o, (byte) 41);
                  var7 = new lta();
                  var7.field_e = (ip.field_p.height >> -1012681151) - (-(var5 >> -1759423135) - ((ip.field_p.height >> 1982741537) - (var5 >> 1180520417) >> 1255731457));
                  var7.field_d = ip.field_p.width >> -75924511;
                  var8 = var6.f((byte) -92);
                  var9 = -var8[0] + var8[1];
                  var10 = var8[3] - var8[2];
                  var11 = (-32.0f + (float)((ip.field_p.height >> -1123245791) - (var5 >> -1325434239))) / (float)var9;
                  var12 = (-32.0f + (float)((ip.field_p.height >> 1201749153) - (var5 >> -506414719))) / (float)var10;
                  var7.field_a = Math.min(var11, var12);
                  var7.field_c = (float)((var8[0] - -var8[1]) / 2);
                  var7.field_b = (float)((var8[3] + var8[2]) / 2);
                  var6.a(kdb.field_o * 10 % 8192, -82);
                  if (vqa.field_g == null) {
                    break L6;
                  } else {
                    if (vqa.field_g.field_N) {
                      break L6;
                    } else {
                      if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                        break L6;
                      } else {
                        var6.h(17704, 1);
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  var6.a(false, true, (pe) null);
                  var6.a(var7, 121, (pe) null);
                  if (0 != sab.field_o) {
                    break L7;
                  } else {
                    if (si.field_o[83]) {
                      break L7;
                    } else {
                      if (si.field_o[84]) {
                        break L7;
                      } else {
                        if (!si.field_o[13]) {
                          break L1;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                L8: {
                  if (var4 != 0) {
                    break L8;
                  } else {
                    wba.field_o = null;
                    break L8;
                  }
                }
                mgb.field_o = true;
                break L1;
              }
            }
            L9: {
              if (param1) {
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param0 == 0) {
                break L10;
              } else {
                spa.a(45, false);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "spa.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 50;
    }
}

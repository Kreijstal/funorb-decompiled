/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends c implements bp {
    static int field_ib;
    static String field_eb;
    static ak field_cb;
    static int field_db;
    static int field_fb;
    static int field_bb;
    static ak field_kb;
    static ak field_lb;
    static String field_jb;
    private ml field_gb;
    private int field_hb;

    gk(String param0, fn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2, ng param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((gk) this).field_hb = uf.field_d - (((gk) this).field_z + param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gk.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final ml a(int param0) {
        if (param0 != 1) {
            field_fb = -57;
        }
        return ((gk) this).field_gb;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param0;
              var6 = param4 + param1;
              if (t.field_e < param0) {
                stackOut_5_0 = param0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = t.field_e;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_6_0;
              if (param1 > t.field_f) {
                stackOut_8_0 = param1;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = t.field_f;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_9_0;
              if (t.field_h > var5_int) {
                stackOut_11_0 = var5_int;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = t.field_h;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_12_0;
              if (t.field_a > var6) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = t.field_a;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_15_0;
              if (t.field_e > param0) {
                break L5;
              } else {
                if (t.field_h <= param0) {
                  break L5;
                } else {
                  var11 = param0 + var8 * t.field_j;
                  var12 = var10 + 1 + -var8 >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      t.field_k[var11] = 16777215;
                      var11 = var11 + t.field_j * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (param1 < t.field_f) {
                break L7;
              } else {
                if (var6 >= t.field_a) {
                  break L7;
                } else {
                  var11 = var7 + param1 * t.field_j;
                  var12 = -var7 + 1 - -var9 >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      t.field_k[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (t.field_e > var5_int) {
                break L9;
              } else {
                if (var5_int >= t.field_h) {
                  break L9;
                } else {
                  var11 = var5_int + ((-param0 + var5_int & 1) + var8) * t.field_j;
                  var12 = -var8 + var10 + 1 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      t.field_k[var11] = 16777215;
                      var11 = var11 + 2 * t.field_j;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (t.field_f > param1) {
                break L11;
              } else {
                if (t.field_a <= var6) {
                  break L11;
                } else {
                  var11 = var7 + (t.field_j * var6 - -(-param1 + var6 & 1));
                  var12 = var9 + (1 - var7) >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      t.field_k[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "gk.W(" + param0 + ',' + param1 + ',' + -128 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void f() {
        field_eb = null;
        field_kb = null;
        field_jb = null;
        field_lb = null;
        field_cb = null;
    }

    final void a(byte param0, ml param1) {
        try {
            if (param0 <= 16) {
                ((gk) this).field_hb = 89;
            }
            ((gk) this).field_gb = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gk.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (!((gk) this).field_D) {
            return null;
        }
        if (null == ((gk) this).field_l) {
            return null;
        }
        if (param0 <= 16) {
            field_cb = null;
        }
        int discarded$0 = 5818;
        nk.a(bg.field_k, ((gk) this).field_E - ((gk) this).field_hb + uf.field_d);
        return ((gk) this).field_l;
    }

    final static byte[] b(CharSequence param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_66_0 = (byte[]) var3;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        if (var5 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var5) {
                        break L5;
                      } else {
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var5 == 8364) {
                      var3[var4] = (byte) -128;
                      break L2;
                    } else {
                      if (var5 != 8218) {
                        if (402 != var5) {
                          if (8222 == var5) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (var5 != 8230) {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (710 == var5) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var5 != 352) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (338 == var5) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var5 != 381) {
                                              if (8216 != var5) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (8220 == var5) {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (var5 != 732) {
                                                              if (8482 == var5) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (382 != var5) {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
                            } else {
                              var3[var4] = (byte) -123;
                              break L2;
                            }
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L2;
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("gk.CA(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + 353 + ')');
        }
        return stackIn_67_0;
    }

    final void n(int param0) {
        super.n(param0);
        if (((gk) this).field_gb != null) {
            ((gk) this).field_gb.b(2048);
        }
        if (param0 != 1392153825) {
            Object var3 = null;
            ((gk) this).a(-125, 48, -57, (ng) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = "No";
        field_bb = 0;
        field_jb = "Account created successfully!";
    }
}

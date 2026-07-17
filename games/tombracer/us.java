/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class us {
    private boolean field_d;
    private String field_a;
    private boolean field_b;
    static sla field_e;
    static String field_c;

    final boolean c(int param0) {
        int var2 = -59 % ((param0 - -57) / 37);
        return ((us) this).field_b;
    }

    final boolean b(int param0) {
        if (param0 < 42) {
            return false;
        }
        return ((us) this).field_d;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            var9 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                var5_ref = param1.getFile();
                if (param0 >= 29) {
                  break L0;
                } else {
                  field_c = null;
                  break L0;
                }
              }
              var6 = 0;
              L1: while (true) {
                L2: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      if (param3 >= 0) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      var6 = var7_int;
                      continue L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L4;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (0 > var7_int) {
                      break L4;
                    } else {
                      if (param4 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    }
                  }
                }
                L5: {
                  L6: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    if (param2 != null) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L1;
                    } else {
                      var6 = var7_int;
                      continue L1;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                  if (0 >= param3) {
                    break L7;
                  } else {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                    break L7;
                  }
                }
                L8: {
                  if (param4 == null) {
                    break L8;
                  } else {
                    if (param4.length() > 0) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param4);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param2 == null) {
                    break L9;
                  } else {
                    if (param2.length() <= 0) {
                      break L9;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param2);
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5_ref.length() > var6) {
                    StringBuilder discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L10;
                  }
                }
                try {
                  L11: {
                    stackOut_41_0 = new java.net.URL(param1, var7.toString());
                    stackIn_42_0 = stackOut_41_0;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_43_0 = (java.net.URL) param1;
                  stackIn_44_0 = stackOut_43_0;
                  return stackIn_44_0;
                }
                return stackIn_42_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) var5;
                stackOut_45_1 = new StringBuilder().append("us.D(").append(param0).append(44);
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param1 == null) {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L12;
                } else {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L12;
                }
              }
              L13: {
                stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44);
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param2 == null) {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L13;
                } else {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L13;
                }
              }
              L14: {
                stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44).append(param3).append(44);
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param4 == null) {
                  stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                  stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L14;
                } else {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L14;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(byte param0) {
        if (param0 < 78) {
            field_e = null;
        }
        return ((us) this).field_a;
    }

    final void a(int param0, boolean param1) {
        ((us) this).field_b = param1 ? true : false;
        int var3 = 97 % ((13 - param0) / 39);
        ((us) this).field_d = true;
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_69_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var2_int = param0.length();
              var3 = new byte[var2_int];
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackOut_69_0 = (byte[]) var3;
                  stackIn_70_0 = stackOut_69_0;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (var5 <= 0) {
                          break L4;
                        } else {
                          if (128 > var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var5 < 160) {
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
                        if (8218 == var5) {
                          var3[var4] = (byte) -126;
                          break L2;
                        } else {
                          if (402 == var5) {
                            var3[var4] = (byte) -125;
                            break L2;
                          } else {
                            if (var5 != 8222) {
                              if (8230 != var5) {
                                if (8224 != var5) {
                                  if (8225 != var5) {
                                    if (var5 != 710) {
                                      if (var5 == 8240) {
                                        var3[var4] = (byte) -119;
                                        break L2;
                                      } else {
                                        if (var5 == 352) {
                                          var3[var4] = (byte) -118;
                                          break L2;
                                        } else {
                                          if (var5 == 8249) {
                                            var3[var4] = (byte) -117;
                                            break L2;
                                          } else {
                                            if (338 == var5) {
                                              var3[var4] = (byte) -116;
                                              break L2;
                                            } else {
                                              if (var5 != 381) {
                                                if (var5 == 8216) {
                                                  var3[var4] = (byte) -111;
                                                  break L2;
                                                } else {
                                                  if (8217 != var5) {
                                                    if (var5 != 8220) {
                                                      if (var5 == 8221) {
                                                        var3[var4] = (byte) -108;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8226) {
                                                          var3[var4] = (byte) -107;
                                                          break L2;
                                                        } else {
                                                          if (8211 == var5) {
                                                            var3[var4] = (byte) -106;
                                                            break L2;
                                                          } else {
                                                            if (8212 != var5) {
                                                              if (var5 == 732) {
                                                                var3[var4] = (byte) -104;
                                                                break L2;
                                                              } else {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte) -103;
                                                                  break L2;
                                                                } else {
                                                                  if (353 != var5) {
                                                                    if (var5 != 8250) {
                                                                      if (339 == var5) {
                                                                        var3[var4] = (byte) -100;
                                                                        break L2;
                                                                      } else {
                                                                        if (382 == var5) {
                                                                          var3[var4] = (byte) -98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 == 376) {
                                                                            var3[var4] = (byte) -97;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte) 63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -105;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -114;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte) -120;
                                      break L2;
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
                            } else {
                              var3[var4] = (byte) -124;
                              break L2;
                            }
                          }
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
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("us.G(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param1 + 41);
        }
        return stackIn_70_0;
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, jea param1, jea param2) {
        if (param1.field_J == null) {
            param1.field_J = new vna();
        }
        if (null == param2.field_J) {
            param2.field_J = new vna();
        }
        if (!(hia.field_s != null)) {
            hia.field_s = new af(64);
        }
        if (bla.field_G == null) {
            bla.field_G = new af(64);
        }
        wv.field_l = param2.field_J;
        if (param0 != -8250) {
            return;
        }
        try {
            fla.field_f = param1.field_J;
            ub.b(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "us.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    us(String param0) {
        ((us) this).field_b = false;
        ((us) this).field_d = false;
        try {
            ((us) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "us.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new sla();
        field_c = "Please select your treasure";
    }
}

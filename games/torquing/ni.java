/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends q {
    int field_k;
    static sm[] field_l;
    byte[] field_j;

    final static void a(nj param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            var2 = Torquing.field_v;
            synchronized (var2) {
              L1: {
                L2: {
                  Torquing.field_v.field_r.b(param0);
                  if (param1) {
                    break L2;
                  } else {
                    field_l = (sm[]) null;
                    break L2;
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("ni.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var6_int = -param2 + param5;
              if (param3 == -12421) {
                break L1;
              } else {
                field_l = (sm[]) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param1.charAt(var7 + param2);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 == 8364) {
                      param4[param0 - -var7] = (byte)-128;
                      break L3;
                    } else {
                      if (var8 != 8218) {
                        if (402 != var8) {
                          if (var8 != 8222) {
                            if (var8 != 8230) {
                              if (8224 == var8) {
                                param4[param0 - -var7] = (byte)-122;
                                break L3;
                              } else {
                                if (var8 == 8225) {
                                  param4[param0 - -var7] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var8 == 710) {
                                    param4[param0 + var7] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (8240 != var8) {
                                      if (352 != var8) {
                                        if (8249 == var8) {
                                          param4[param0 - -var7] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var8 == 338) {
                                            param4[param0 + var7] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (381 == var8) {
                                              param4[var7 + param0] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var8 != 8216) {
                                                if (8217 == var8) {
                                                  param4[param0 - -var7] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var8 != 8220) {
                                                    if (var8 != 8221) {
                                                      if (var8 == 8226) {
                                                        param4[var7 + param0] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param4[var7 + param0] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (var8 != 8482) {
                                                                if (var8 != 353) {
                                                                  if (8250 == var8) {
                                                                    param4[var7 + param0] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param4[param0 + var7] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 == var8) {
                                                                        param4[var7 + param0] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var8 == 376) {
                                                                          param4[param0 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          param4[var7 + param0] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  param4[var7 + param0] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                param4[param0 + var7] = (byte)-103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              param4[var7 + param0] = (byte)-104;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          param4[param0 - -var7] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      param4[var7 + param0] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param4[param0 + var7] = (byte)-109;
                                                    break L3;
                                                  }
                                                }
                                              } else {
                                                param4[param0 + var7] = (byte)-111;
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        param4[var7 + param0] = (byte)-118;
                                        break L3;
                                      }
                                    } else {
                                      param4[var7 + param0] = (byte)-119;
                                      break L3;
                                    }
                                  }
                                }
                              }
                            } else {
                              param4[param0 + var7] = (byte)-123;
                              break L3;
                            }
                          } else {
                            param4[param0 - -var7] = (byte)-124;
                            break L3;
                          }
                        } else {
                          param4[param0 + var7] = (byte)-125;
                          break L3;
                        }
                      } else {
                        param4[var7 + param0] = (byte)-126;
                        break L3;
                      }
                    }
                  }
                  param4[var7 + param0] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("ni.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, long param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            nj var8 = null;
            String var9 = null;
            String var10 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param1.getParameter("cookiehost");
                      var7 = var9;
                      var7 = var9;
                      var10 = param4 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                      var7 = var10;
                      var7 = var10;
                      if (param0 >= 69) {
                        break L2;
                      } else {
                        var8 = (nj) null;
                        ni.a((nj) null, false);
                        break L2;
                      }
                    }
                    L3: {
                      if (param3 >= 0L) {
                        var7 = var10 + "; Expires=" + ka.a(param3 * 1000L + km.b(-1), -2) + "; Max-Age=" + param3;
                        break L3;
                      } else {
                        var7 = var10 + "; Discard;";
                        break L3;
                      }
                    }
                    hp.a("document.cookie=\"" + var7 + "\"", 27476, param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("ni.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static k a(int param0, int param1) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        k[] var5 = vc.c(0);
        k[] var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
            if ((var5[var3].field_g ^ -1) == (param1 ^ -1)) {
                return var5[var3];
            }
        }
        if (param0 >= 74) {
            return null;
        }
        field_l = (sm[]) null;
        return null;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 >= -25) {
            field_l = (sm[]) null;
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param0.getGraphics();
                mk.field_b.a(86, param2, param1, var4);
                var4.dispose();
                var5 = -27 / ((69 - param3) / 50);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param0.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref2);

            stackIn_6_1 = new StringBuilder().append("ni.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
    }
}

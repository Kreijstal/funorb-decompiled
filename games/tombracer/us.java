/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    private boolean field_d;
    private String field_a;
    private boolean field_b;
    static sla field_e;
    static String field_c;

    final boolean c(int param0) {
        int var2 = -59 % ((param0 - -57) / 37);
        return this.field_b;
    }

    final boolean b(int param0) {
        if (param0 < 42) {
            return false;
        }
        return this.field_d;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            StringBuilder stackIn_53_1 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var5 = param1.getFile();
                  if (param0 >= 29) {
                    break L1;
                  } else {
                    field_c = (String) null;
                    break L1;
                  }
                }
                var6 = 0;
                L2: while (true) {
                  L3: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) <= -1) {
                        if (-1 >= (param3 ^ -1)) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) <= -1) {
                        var6 = var7_int;
                        continue L2;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                      break L5;
                    } else {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (0 > var7_int) {
                        break L5;
                      } else {
                        if (param4 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L7;
                      } else {
                        if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L2;
                      } else {
                        var6 = var7_int;
                        continue L2;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (0 >= param3) {
                      break L8;
                    } else {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param3));
                      break L8;
                    }
                  }
                  L9: {
                    if (param4 == null) {
                      break L9;
                    } else {
                      if ((param4.length() ^ -1) < -1) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param4);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param2 == null) {
                      break L10;
                    } else {
                      if (param2.length() <= 0) {
                        break L10;
                      } else {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param2);
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var5.length() > var6) {
                      discarded$7 = var7.append(var5.substring(var6, var5.length()));
                      break L11;
                    } else {
                      discarded$8 = var7.append('/');
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackIn_42_0 = new java.net.URL(param1, var7.toString());
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_44_0 = (java.net.URL) (param1);
                    return stackIn_44_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_47_0 = (RuntimeException) (var5_ref);

                stackIn_47_1 = new StringBuilder().append("us.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L13;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

                if (param2 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L14;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "null";
                  break L15;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "{...}";
                  break L15;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_48_0), stackIn_54_2 + ')');
            }
            return stackIn_42_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(byte param0) {
        if (param0 < 78) {
            field_e = (sla) null;
        }
        return this.field_a;
    }

    final void a(int param0, boolean param1) {
        this.field_b = param1 ? true : false;
        int var3 = 97 % ((13 - param0) / 39);
        this.field_d = true;
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var2_int = param0.length();
              var3 = new byte[var2_int];
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackIn_70_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
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
                        var3[var4] = (byte)-128;
                        break L2;
                      } else {
                        if (8218 == var5) {
                          var3[var4] = (byte)-126;
                          break L2;
                        } else {
                          if (402 == var5) {
                            var3[var4] = (byte)-125;
                            break L2;
                          } else {
                            if (var5 != 8222) {
                              if (8230 != var5) {
                                if (8224 != var5) {
                                  if (8225 != var5) {
                                    if (var5 != 710) {
                                      if (var5 == 8240) {
                                        var3[var4] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (var5 == 352) {
                                          var3[var4] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (var5 == 8249) {
                                            var3[var4] = (byte)-117;
                                            break L2;
                                          } else {
                                            if (338 == var5) {
                                              var3[var4] = (byte)-116;
                                              break L2;
                                            } else {
                                              if (var5 != 381) {
                                                if (var5 == 8216) {
                                                  var3[var4] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (8217 != var5) {
                                                    if (var5 != 8220) {
                                                      if (var5 == 8221) {
                                                        var3[var4] = (byte)-108;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8226) {
                                                          var3[var4] = (byte)-107;
                                                          break L2;
                                                        } else {
                                                          if (8211 == var5) {
                                                            var3[var4] = (byte)-106;
                                                            break L2;
                                                          } else {
                                                            if (8212 != var5) {
                                                              if (var5 == 732) {
                                                                var3[var4] = (byte)-104;
                                                                break L2;
                                                              } else {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (353 != var5) {
                                                                    if (var5 != 8250) {
                                                                      if (339 == var5) {
                                                                        var3[var4] = (byte)-100;
                                                                        break L2;
                                                                      } else {
                                                                        if (382 == var5) {
                                                                          var3[var4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 == 376) {
                                                                            var3[var4] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-105;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-114;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte)-120;
                                      break L2;
                                    }
                                  } else {
                                    var3[var4] = (byte)-121;
                                    break L2;
                                  }
                                } else {
                                  var3[var4] = (byte)-122;
                                  break L2;
                                }
                              } else {
                                var3[var4] = (byte)-123;
                                break L2;
                              }
                            } else {
                              var3[var4] = (byte)-124;
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
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var2);

            stackIn_73_1 = new StringBuilder().append("us.G(");

            if (param0 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != -1) {
            field_c = (String) null;
        }
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
            throw tba.a((Throwable) ((Object) runtimeException), "us.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    us(String param0) {
        this.field_b = false;
        this.field_d = false;
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "us.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new sla();
        field_c = "Please select your treasure";
    }
}

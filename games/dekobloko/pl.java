/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private ng field_a;
    static String field_c;
    private ji field_g;
    static String field_e;
    static String field_f;
    private ji field_d;
    private ng field_b;

    final ud a(String param0, String param1, int param2) {
        RuntimeException var4 = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.field_a = (ng) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, (int[]) null, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("pl.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0) {
        if (param0 != 3970) {
            field_c = (String) null;
            jc.a((byte) 103);
            return;
        }
        jc.a((byte) 103);
    }

    final ud a(int param0, int param1, int param2) {
        int var4 = -17 % ((-2 - param0) / 57);
        return this.a(121, param2, (int[]) null, param1);
    }

    final static java.net.URL a(String param0, String param1, boolean param2, java.net.URL param3, int param4) {
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
            java.net.URL stackIn_28_0 = null;
            java.net.URL stackIn_43_0 = null;
            java.net.URL stackIn_45_0 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            StringBuilder stackIn_51_1 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            StringBuilder stackIn_54_1 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = client.field_A ? 1 : 0;
            try {
              L0: {
                var5 = param3.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (-1 >= (var7_int ^ -1)) {
                        if (0 <= param4) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (-1 < (var7_int ^ -1)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 > var7_int) {
                          break L5;
                        } else {
                          if (param1 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (0 <= var7_int) {
                        if (param0 == null) {
                          break L3;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var7 = new StringBuilder(var6);
                    if (!param2) {
                      L8: {
                        discarded$0 = var7.append(var5.substring(0, var6));
                        if (-1 <= (param4 ^ -1)) {
                          break L8;
                        } else {
                          discarded$1 = var7.append("/l=");
                          discarded$2 = var7.append(Integer.toString(param4));
                          break L8;
                        }
                      }
                      L9: {
                        if (param1 == null) {
                          break L9;
                        } else {
                          if ((param1.length() ^ -1) < -1) {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param1);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param0 == null) {
                          break L10;
                        } else {
                          if (0 < param0.length()) {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param0);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var6 >= var5.length()) {
                          discarded$7 = var7.append('/');
                          break L11;
                        } else {
                          discarded$8 = var7.append(var5.substring(var6, var5.length()));
                          break L11;
                        }
                      }
                      try {
                        L12: {
                          stackIn_43_0 = new java.net.URL(param3, var7.toString());
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_45_0 = (java.net.URL) (param3);
                        return stackIn_45_0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_28_0 = (java.net.URL) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_48_0 = (RuntimeException) (var5_ref);

                stackIn_48_1 = new StringBuilder().append("pl.I(");

                if (param0 == null) {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "null";
                  break L13;
                } else {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');

                if (param1 == null) {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "null";
                  break L14;
                } else {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackIn_55_2 = "null";
                  break L15;
                } else {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackIn_55_2 = "{...}";
                  break L15;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_55_2 + ',' + param4 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_28_0;
            } else {
              return stackIn_43_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final ud a(String param0, int[] param1, String param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        ud stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 <= -17) {
                break L1;
              } else {
                var7 = (String) null;
                this.a((String) null, (String) null, 126);
                break L1;
              }
            }
            var5_int = this.field_d.b(-1, param2);
            if (0 <= var5_int) {
              var6 = this.field_d.a(var5_int, 13030, param0);
              if ((var6 ^ -1) <= -1) {
                stackIn_9_0 = this.a(var6, param1, var5_int, -15027);
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pl.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final ud a(byte param0, String param1, String param2) {
        RuntimeException var4 = null;
        ud stackIn_2_0 = null;
        ud stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 101) {
              stackIn_4_0 = this.a(param2, (int[]) null, param1, (byte) -75);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ud) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("pl.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 81 % ((param0 - -78) / 33);
        field_f = null;
    }

    private final ud a(String param0, int[] param1, String param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_7_0 = null;
        ud stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_g.b(-1, param0);
              if (param3) {
                break L1;
              } else {
                this.field_a = (ng) null;
                break L1;
              }
            }
            if (0 <= var5_int) {
              var6 = this.field_g.a(var5_int, 13030, param2);
              if (var6 >= 0) {
                stackIn_9_0 = this.a(119, var5_int, param1, var6);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pl.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ud) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    private final ud a(int param0, int[] param1, int param2, int param3) {
        va dupTemp$0 = null;
        ud stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        ud stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        ud stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        va var9 = null;
        va var10 = null;
        try {
          L0: {
            var5_int = param0 ^ (65532 & param2 << 58549220 | param2 >>> 391646732);
            var5_int = var5_int | param2 << 13351536;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (ud) ((Object) this.field_b.a(var6, 126));
            if (var8 == null) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if ((param1[0] ^ -1) < -1) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                dupTemp$0 = (va) ((Object) this.field_a.a(var6, 55));
                var10 = dupTemp$0;
                var9 = dupTemp$0;
                if (var10 != null) {
                  break L2;
                } else {
                  var9 = va.a(this.field_d, param2, param0);
                  if (var9 != null) {
                    this.field_a.a(var6, param3 ^ 15026, var9);
                    break L2;
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              if (param3 == -15027) {
                var8 = var9.a(param1);
                if (var8 != null) {
                  var9.b((byte) 101);
                  this.field_b.a(var6, -1, var8);
                  stackIn_19_0 = (ud) (var8);
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  stackIn_17_0 = null;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_14_0 = (ud) null;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = (ud) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("pl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ud) ((Object) stackIn_10_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (ud) ((Object) stackIn_17_0);
                } else {
                  return stackIn_19_0;
                }
              }
            }
          }
        }
    }

    private final ud a(int param0, int param1, int[] param2, int param3) {
        ud dupTemp$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        bi var9 = null;
        ud var10 = null;
        ud var11 = null;
        ud stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        ud stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param3 ^ (param1 << 1515294692 & 65531 | param1 >>> -487058036);
              var5_int = var5_int | param1 << 1656051856;
              if (param0 >= 113) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            var6 = (long)var5_int;
            dupTemp$1 = (ud) ((Object) this.field_b.a(var6, 106));
            var11 = dupTemp$1;
            var8 = dupTemp$1;
            if (var11 == null) {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if ((param2[0] ^ -1) < -1) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var9 = bi.a(this.field_g, param1, param3);
              if (var9 != null) {
                L3: {
                  var10 = var9.b();
                  var8 = var10;
                  this.field_b.a(var6, -1, var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var10.field_o.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_16_0 = (ud) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = (ud) (var11);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("pl.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_11_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final ud b(int param0, int param1, int param2) {
        if (param2 != -1) {
            return (ud) null;
        }
        return this.a(param0, (int[]) null, param1, -15027);
    }

    pl(ji param0, ji param1) {
        this.field_a = new ng(256);
        this.field_b = new ng(256);
        try {
            this.field_d = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "New Game";
        field_f = "You need to play 1 more rated game to unlock this option.";
        field_e = "Add <%0> to friend list";
    }
}

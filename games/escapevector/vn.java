/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vn {
    int field_d;
    static al field_g;
    static hh field_c;
    static cn field_e;
    int field_h;
    static String field_b;
    static int[][] field_a;
    java.awt.Image field_f;
    int[] field_i;

    public static void a(byte param0) {
        field_a = (int[][]) null;
        field_g = null;
        if (param0 < 72) {
            return;
        }
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void a(int param0) {
        if (param0 <= 105) {
            vn.a((byte) -18);
        }
        em.a(this.field_i, this.field_d, this.field_h);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        lj var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        String var8 = null;
        byte[] var9 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (0 < param1) {
                var9 = new byte[param2];
                var4 = var9;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param2) {
                    break L1;
                  } else {
                    var9[var5_int] = param0[param1 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = param0;
                break L1;
              }
            }
            L3: {
              var5 = new lj();
              var5.b(false);
              var5.a((long)(8 * param2), var4, 2);
              var6 = new byte[64];
              var5.a(0, var6, false);
              if (param3 == 0) {
                break L3;
              } else {
                var8 = (String) null;
                vn.a((byte) 62, (String) null);
                break L3;
              }
            }
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("vn.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static d a(byte param0, String param1) {
        RuntimeException var2 = null;
        d stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 24) {
                break L1;
              } else {
                field_g = (al) null;
                break L1;
              }
            }
            stackIn_3_0 = new d(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vn.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static java.net.URL a(String param0, int param1, String param2, java.net.URL param3, int param4) {
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
            java.net.URL stackIn_29_0 = null;
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
            var9 = EscapeVector.field_A;
            try {
              L0: {
                var5 = param3.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        if ((param1 ^ -1) <= -1) {
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
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 <= var7_int) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 + 1);
                        if ((var7_int ^ -1) > -1) {
                          break L5;
                        } else {
                          if (param2 == null) {
                            break L3;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        }
                      } else {
                        break L5;
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
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        if (param0 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var7 = new StringBuilder(var6);
                    if (param4 == 1) {
                      L8: {
                        discarded$0 = var7.append(var5.substring(0, var6));
                        if (param1 > 0) {
                          discarded$1 = var7.append("/l=");
                          discarded$2 = var7.append(Integer.toString(param1));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (param2 == null) {
                          break L9;
                        } else {
                          if (-1 <= (param2.length() ^ -1)) {
                            break L9;
                          } else {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param2);
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param0 == null) {
                          break L10;
                        } else {
                          if (-1 <= (param0.length() ^ -1)) {
                            break L10;
                          } else {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param0);
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
                      stackIn_29_0 = (java.net.URL) null;
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

                stackIn_48_1 = new StringBuilder().append("vn.H(");

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


                stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',');

                if (param2 == null) {
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


                stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');

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
              throw t.a((Throwable) ((Object) stackIn_49_0), stackIn_55_2 + ',' + param4 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_29_0;
            } else {
              return stackIn_43_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static long a(byte param0, CharSequence param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param1.length();
              if (param0 >= 47) {
                break L1;
              } else {
                field_g = (al) null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(-64 + var6);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (122 < var6) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(-97 + (var6 + 1));
                          break L4;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L4;
                    } else {
                      if (57 >= var6) {
                        var2_long = var2_long + (long)(var6 + -21);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2_long < 177917621779460413L) {
                    var5++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (-1L != (var2_long % 37L ^ -1L)) {
                    break L8;
                  } else {
                    if (0L == var2_long) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackIn_23_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("vn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    static {
        field_g = new al();
        field_b = "That name is not available";
        field_e = new cn();
        field_a = new int[][]{new int[]{0, 1}, new int[]{2}, new int[]{3}};
    }
}

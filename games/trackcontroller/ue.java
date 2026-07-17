/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ue {
    static String field_a;
    private fc field_d;
    private ja field_b;
    static String[] field_c;

    final fc a(int param0) {
        fc var2 = ((ue) this).field_b.field_d.field_e;
        if (param0 <= 43) {
            ((ue) this).field_b = null;
        }
        if (var2 == ((ue) this).field_b.field_d) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_e;
        return var2;
    }

    final fc a(boolean param0, fc param1) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        fc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((ue) this).field_b.field_d.field_e;
                break L1;
              }
            }
            if (var3 != ((ue) this).field_b.field_d) {
              if (param0) {
                ((ue) this).field_d = var3.field_e;
                stackOut_9_0 = (fc) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (fc) (Object) stackIn_8_0;
              }
            } else {
              ((ue) this).field_d = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (fc) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ue.A(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final static String a(int param0, CharSequence[] param1, byte param2, int param3) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_24_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              if (param3 != 1) {
                var4_int = param0 + param3;
                var5 = 0;
                if (param2 == 57) {
                  var6_int = param0;
                  L1: while (true) {
                    if (var6_int >= var4_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param0;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackOut_24_0 = var6.toString();
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              StringBuilder discarded$5 = var6.append(var8);
                              break L3;
                            } else {
                              StringBuilder discarded$6 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param1[var6_int];
                        if (var7_ref_CharSequence != null) {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        } else {
                          var5 += 4;
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (String) (Object) stackIn_11_0;
                }
              } else {
                var10 = param1[param0];
                var4 = var10;
                if (var4 == null) {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  return ((Object) (Object) var10).toString();
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4_ref;
            stackOut_26_1 = new StringBuilder().append("ue.C(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_25_0;
    }

    final fc a(byte param0, fc param1) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        Object stackIn_7_0 = null;
        fc stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -37) {
                break L1;
              } else {
                var4 = null;
                java.net.URL discarded$2 = ue.a((java.net.URL) null, 89, (String) null, 12, (String) null);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                var3 = ((ue) this).field_b.field_d.field_h;
                break L2;
              } else {
                var3 = param1;
                break L2;
              }
            }
            if (var3 != ((ue) this).field_b.field_d) {
              ((ue) this).field_d = var3.field_h;
              stackOut_8_0 = (fc) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((ue) this).field_d = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (fc) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ue.I(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final static java.net.URL a(java.net.URL param0, int param1, String param2, int param3, String param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            int var8 = 0;
            Exception var9 = null;
            int var10 = 0;
            java.net.URL stackIn_41_0 = null;
            java.net.URL stackIn_43_0 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            java.net.URL stackOut_42_0 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            var10 = TrackController.field_F ? 1 : 0;
            try {
              var5_ref = param0.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (0 <= param3) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', 1 + var6);
                  if (var7_int < 0) {
                    break L4;
                  } else {
                    if (param4 != null) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L6: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                  if (param3 > 0) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var8 = 108 % ((param1 - -59) / 50);
                  if (param2 == null) {
                    break L7;
                  } else {
                    if (param2.length() < -1) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param4 == null) {
                    break L8;
                  } else {
                    if (-1 < param4.length()) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param4);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (var6 < var5_ref.length()) {
                    StringBuilder discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L9;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L9;
                  }
                }
                try {
                  L10: {
                    stackOut_40_0 = new java.net.URL(param0, var7.toString());
                    stackIn_41_0 = stackOut_40_0;
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9 = (Exception) (Object) decompiledCaughtException;
                  var9.printStackTrace();
                  stackOut_42_0 = (java.net.URL) param0;
                  stackIn_43_0 = stackOut_42_0;
                  return stackIn_43_0;
                }
                return stackIn_41_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_44_0 = (RuntimeException) var5;
                stackOut_44_1 = new StringBuilder().append("ue.J(");
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param0 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L11;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L11;
                }
              }
              L12: {
                stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param1).append(44);
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param2 == null) {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L12;
                } else {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L12;
                }
              }
              L13: {
                stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44).append(param3).append(44);
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param4 == null) {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L13;
                } else {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L13;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fc e(int param0) {
        fc var2 = ((ue) this).field_d;
        if (!(var2 != ((ue) this).field_b.field_d)) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_h;
        if (param0 != 37) {
            field_a = null;
        }
        return var2;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -119) {
            field_c = null;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        param1 = -65 & param1;
        int var4 = ud.a((byte) 54, param1);
        if (param2 != 91) {
            boolean discarded$0 = ue.a(-77, '');
        }
        u discarded$1 = nl.a(e.a(param1, -1932340400, var4), true, -257, param0, 0, var4, param3, param1);
    }

    final static String a(long param0, byte param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = TrackController.field_F ? 1 : 0;
        if (param0 <= 0L) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = lg.field_b[(int)(-(37L * param0) + var7)];
            if (!(95 != var9)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$4 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param1 <= 28) {
            Object var12 = null;
            ue.a((String) null, true);
        }
        return var6.toString();
    }

    final fc c(int param0) {
        fc var2 = ((ue) this).field_d;
        if (!(((ue) this).field_b.field_d != var2)) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_e;
        if (param0 > -8) {
            fc discarded$0 = ((ue) this).e(-30);
        }
        return var2;
    }

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        } else {
          if (!vl.a(param1, 18102)) {
            L0: {
              if (param1 == 45) {
                break L0;
              } else {
                if (param1 == 160) {
                  break L0;
                } else {
                  if (param1 == 32) {
                    break L0;
                  } else {
                    if (param1 == 95) {
                      break L0;
                    } else {
                      if (param0 == -16490) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
            return true;
          } else {
            return true;
          }
        }
    }

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ab.field_b = param0;
              qc.b(12, (byte) -42);
              if (!param1) {
                break L1;
              } else {
                String discarded$2 = ue.a(-17L, (byte) 10);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ue.L(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final fc d(int param0) {
        fc var2 = ((ue) this).field_b.field_d.field_h;
        int var3 = 61 / ((38 - param0) / 34);
        if (!(((ue) this).field_b.field_d != var2)) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_h;
        return var2;
    }

    ue(ja param0) {
        try {
            ((ue) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ue.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}

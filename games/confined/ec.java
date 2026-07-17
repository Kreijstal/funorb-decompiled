/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ec extends RuntimeException {
    static String field_a;
    String field_c;
    static String field_d;
    static long field_e;
    Throwable field_b;

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (ra.a(var3, 119) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("ec.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 3 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(jb param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 1;
              if (da.field_e == param0) {
                break L1;
              } else {
                if (da.field_e.field_e <= 0) {
                  break L1;
                } else {
                  var2_int = var2_int != 0 & da.field_e.a(false) ? 1 : 0;
                  break L1;
                }
              }
            }
            L2: {
              if (null == hh.field_d) {
                break L2;
              } else {
                if (hh.field_d == param0) {
                  break L2;
                } else {
                  if (0 < hh.field_d.field_e) {
                    var2_int = var2_int != 0 & hh.field_d.a(false) ? 1 : 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (null == bg.field_a) {
                break L3;
              } else {
                if (param0 == bg.field_a) {
                  break L3;
                } else {
                  if (bg.field_a.field_e > 0) {
                    var2_int = var2_int != 0 & bg.field_a.a(false) ? 1 : 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if (param1 == 0) {
              L4: {
                if (ji.field_e == null) {
                  break L4;
                } else {
                  if (param0 == ji.field_e) {
                    break L4;
                  } else {
                    if (ji.field_e.field_e > 0) {
                      var2_int = var2_int != 0 & ji.field_e.a(false) ? 1 : 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (null == va.field_b) {
                  break L5;
                } else {
                  if (va.field_b == param0) {
                    break L5;
                  } else {
                    if (va.field_b.field_e <= 0) {
                      break L5;
                    } else {
                      var2_int = var2_int != 0 & va.field_b.a(false) ? 1 : 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (var2_int != 0) {
                  L7: {
                    if (param0 == null) {
                      break L7;
                    } else {
                      if (param0.field_e >= 14) {
                        break L7;
                      } else {
                        param0.field_e = param0.field_e + 1;
                        break L7;
                      }
                    }
                  }
                  if (param0 == null) {
                    break L6;
                  } else {
                    if (param0.field_e <= 14) {
                      break L6;
                    } else {
                      param0.field_e = param0.field_e - 1;
                      break L6;
                    }
                  }
                } else {
                  break L6;
                }
              }
              L8: {
                if (null == bg.field_a) {
                  break L8;
                } else {
                  if (kc.field_o) {
                    break L8;
                  } else {
                    if (bg.field_a.field_e != 0) {
                      break L8;
                    } else {
                      bg.field_a = null;
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (null == ji.field_e) {
                  break L9;
                } else {
                  if (bj.field_m) {
                    break L9;
                  } else {
                    if (ji.field_e.field_e != 0) {
                      break L9;
                    } else {
                      ji.field_e = null;
                      break L9;
                    }
                  }
                }
              }
              L10: {
                if (va.field_b == null) {
                  break L10;
                } else {
                  if (gh.field_k) {
                    break L10;
                  } else {
                    if (va.field_b.field_e != 0) {
                      break L10;
                    } else {
                      va.field_b = null;
                      break L10;
                    }
                  }
                }
              }
              L11: {
                if (null == hh.field_d) {
                  break L11;
                } else {
                  if (qf.field_e) {
                    break L11;
                  } else {
                    if (hh.field_d.field_e == 0) {
                      hh.field_d = null;
                      break L11;
                    } else {
                      return;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("ec.D(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L12;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L12;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param1 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_a = null;
    }

    final static void a(byte param0) {
        Object var2 = null;
        im.a((byte) -77);
        if (param0 != 126) {
          var2 = null;
          java.net.URL discarded$2 = ec.a(19, (String) null, (java.net.URL) null, (String) null, -53);
          jd.field_c = true;
          rk.field_f = true;
          vg.field_Z.g((byte) 109);
          r.a((byte) 97, false, wc.field_jc);
          return;
        } else {
          jd.field_c = true;
          rk.field_f = true;
          vg.field_Z.g((byte) 109);
          r.a((byte) 97, false, wc.field_jc);
          return;
        }
    }

    final static java.net.URL a(int param0, String param1, java.net.URL param2, String param3, int param4) {
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
            var9 = Confined.field_J ? 1 : 0;
            try {
              var5_ref = param2.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 <= var7_int) {
                        if (param0 < 0) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int < 0) {
                        break L4;
                      } else {
                        if (param3 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      }
                    } else {
                      break L4;
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
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (0 > var7_int) {
                      break L5;
                    } else {
                      if (param1 == null) {
                        break L1;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      }
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                    if (param0 > 0) {
                      StringBuilder discarded$10 = var7.append("/l=");
                      StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (param3 == null) {
                      break L8;
                    } else {
                      if (param3.length() > 0) {
                        StringBuilder discarded$12 = var7.append("/p=");
                        StringBuilder discarded$13 = var7.append(param3);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (param1 == null) {
                      break L9;
                    } else {
                      if (0 >= param1.length()) {
                        break L9;
                      } else {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param1);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var5_ref.length() <= var6) {
                      StringBuilder discarded$16 = var7.append(47);
                      break L10;
                    } else {
                      StringBuilder discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L10;
                    }
                  }
                  L11: {
                    if (param4 == -1) {
                      break L11;
                    } else {
                      ec.a((byte) -10);
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackOut_41_0 = new java.net.URL(param2, var7.toString());
                      stackIn_42_0 = stackOut_41_0;
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_43_0 = (java.net.URL) param2;
                    stackIn_44_0 = stackOut_43_0;
                    return stackIn_44_0;
                  }
                  return stackIn_42_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) var5;
                stackOut_45_1 = new StringBuilder().append("ec.E(").append(param0).append(44);
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
                  break L13;
                } else {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L13;
                }
              }
              L14: {
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
                  break L14;
                } else {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L14;
                }
              }
              L15: {
                stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param3 == null) {
                  stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                  stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L15;
                } else {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L15;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ec(Throwable param0, String param1) {
        ((ec) this).field_b = param0;
        ((ec) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Loading...";
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}

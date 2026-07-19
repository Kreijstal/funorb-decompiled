/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static String field_a;

    final static void a(byte param0) {
        if (jh.field_z != -pf.field_A + 0) {
          if (jh.field_z != 250 + -pf.field_A) {
            jh.field_z = jh.field_z + 1;
            if (param0 != -3) {
              field_a = (String) null;
              return;
            } else {
              return;
            }
          } else {
            jh.field_z = jh.field_z + 1;
            if (param0 != -3) {
              field_a = (String) null;
              return;
            } else {
              return;
            }
          }
        } else {
          jh.field_z = jh.field_z + 1;
          if (param0 != -3) {
            field_a = (String) null;
            return;
          } else {
            return;
          }
        }
    }

    final static java.net.URL a(int param0, String param1, java.net.URL param2, int param3, String param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
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
            var9 = Torquing.field_u;
            try {
              L0: {
                var5_ref = param2.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (var7_int < 0) {
                        break L2;
                      } else {
                        if (0 <= param0) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                  }
                  L3: {
                    if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (-1 < (var7_int ^ -1)) {
                        break L3;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        if (param4 == null) {
                          var6 = var7_int;
                          continue L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L4;
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
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (param1 != null) {
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
                    discarded$9 = var7.append(var5_ref.substring(0, var6));
                    if (-1 <= (param0 ^ -1)) {
                      break L7;
                    } else {
                      discarded$10 = var7.append("/l=");
                      discarded$11 = var7.append(Integer.toString(param0));
                      break L7;
                    }
                  }
                  L8: {
                    if (param4 == null) {
                      break L8;
                    } else {
                      if (param4.length() > 0) {
                        discarded$12 = var7.append("/p=");
                        discarded$13 = var7.append(param4);
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
                      if (-1 > (param1.length() ^ -1)) {
                        discarded$14 = var7.append("/s=");
                        discarded$15 = var7.append(param1);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param3 == 47) {
                      break L10;
                    } else {
                      field_a = (String) null;
                      break L10;
                    }
                  }
                  L11: {
                    if (var6 >= var5_ref.length()) {
                      discarded$16 = var7.append('/');
                      break L11;
                    } else {
                      discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackOut_40_0 = new java.net.URL(param2, var7.toString());
                      stackIn_41_0 = stackOut_40_0;
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_42_0 = (java.net.URL) (param2);
                    stackIn_43_0 = stackOut_42_0;
                    return stackIn_43_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_44_0 = (RuntimeException) (var5);
                stackOut_44_1 = new StringBuilder().append("pg.C(").append(param0).append(',');
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param1 == null) {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L13;
                } else {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L13;
                }
              }
              L14: {
                stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param2 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L14;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L14;
                }
              }
              L15: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param4 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L15;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L15;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
            }
            return stackIn_41_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dn a(int param0, String param1, int param2) {
        dn var3 = null;
        RuntimeException var3_ref = null;
        dn stackIn_2_0 = null;
        dn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_3_0 = null;
        dn stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new dn(false);
            var3.field_a = param0;
            var3.field_e = param1;
            if (param2 == -1) {
              stackOut_3_0 = (dn) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (dn) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("pg.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(boolean param0, la param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = param1.c(-19375);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("pg.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_a = null;
        if (param0 != 47) {
            discarded$0 = pg.a(-90, (byte) 40);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Torquing.field_u;
        pd.field_c = 0;
        up.field_a = null;
        rd.field_x = null;
        var2 = tl.field_u;
        tl.field_u = gi.field_c;
        if (param0 != 51) {
          if (50 != param0) {
            nn.field_c.field_k = 1;
            nn.field_c.field_g = nn.field_c.field_g + 1;
            gi.field_c = var2;
            if (param1 < -27) {
              L0: {
                if (2 > nn.field_c.field_g) {
                  break L0;
                } else {
                  if (param0 != 51) {
                    break L0;
                  } else {
                    return 2;
                  }
                }
              }
              if (2 > nn.field_c.field_g) {
                if ((nn.field_c.field_g ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (-51 == (param0 ^ -1)) {
                  return 5;
                } else {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              field_a = (String) null;
              if (2 <= nn.field_c.field_g) {
                if (param0 == 51) {
                  return 2;
                } else {
                  if (2 > nn.field_c.field_g) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (-51 == (param0 ^ -1)) {
                      return 5;
                    } else {
                      if ((nn.field_c.field_g ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  }
                }
              } else {
                if (2 > nn.field_c.field_g) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 == (param0 ^ -1)) {
                    return 5;
                  } else {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              }
            }
          } else {
            nn.field_c.field_k = 5;
            nn.field_c.field_g = nn.field_c.field_g + 1;
            gi.field_c = var2;
            if (param1 < -27) {
              if (2 <= nn.field_c.field_g) {
                if (param0 != 51) {
                  if (2 > nn.field_c.field_g) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (-51 != (param0 ^ -1)) {
                      if ((nn.field_c.field_g ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              } else {
                if (2 > nn.field_c.field_g) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 != (param0 ^ -1)) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              }
            } else {
              field_a = (String) null;
              if (2 <= nn.field_c.field_g) {
                if (param0 != 51) {
                  if (2 > nn.field_c.field_g) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (-51 != (param0 ^ -1)) {
                      if ((nn.field_c.field_g ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              } else {
                if (2 > nn.field_c.field_g) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 != (param0 ^ -1)) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              }
            }
          }
        } else {
          nn.field_c.field_k = 2;
          nn.field_c.field_g = nn.field_c.field_g + 1;
          gi.field_c = var2;
          if (param1 >= -27) {
            field_a = (String) null;
            if (2 <= nn.field_c.field_g) {
              if (param0 != 51) {
                if (2 > nn.field_c.field_g) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (-51 != (param0 ^ -1)) {
                    if ((nn.field_c.field_g ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                return 2;
              }
            } else {
              if (2 > nn.field_c.field_g) {
                if ((nn.field_c.field_g ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (-51 != (param0 ^ -1)) {
                  if ((nn.field_c.field_g ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          } else {
            L1: {
              if (2 > nn.field_c.field_g) {
                break L1;
              } else {
                if (param0 != 51) {
                  break L1;
                } else {
                  return 2;
                }
              }
            }
            if (2 > nn.field_c.field_g) {
              if ((nn.field_c.field_g ^ -1) <= -5) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (-51 != (param0 ^ -1)) {
                if ((nn.field_c.field_g ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                return 5;
              }
            }
          }
        }
    }

    static {
        field_a = "Waiting for textures";
    }
}

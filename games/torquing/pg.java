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
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_41_0 = null;
            java.net.URL stackIn_43_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            StringBuilder stackIn_49_1 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            StringBuilder stackIn_52_1 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = Torquing.field_u;
            try {
              L0: {
                var5 = param2.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (var7_int < 0) {
                        break L2;
                      } else {
                        if (0 <= param0) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                  }
                  L3: {
                    if (var5.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
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
                    if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        if (param4 == null) {
                          var6 = var7_int;
                          continue L1;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (param1 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (-1 <= (param0 ^ -1)) {
                      break L7;
                    } else {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param0));
                      break L7;
                    }
                  }
                  L8: {
                    if (param4 == null) {
                      break L8;
                    } else {
                      if (param4.length() > 0) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param4);
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
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param1);
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
                      stackIn_41_0 = new java.net.URL(param2, var7.toString());
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_43_0 = (java.net.URL) (param2);
                    return stackIn_43_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_46_0 = (RuntimeException) (var5_ref);

                stackIn_46_1 = new StringBuilder().append("pg.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "null";
                  break L13;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');

                if (param2 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "null";
                  break L14;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "null";
                  break L15;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "{...}";
                  break L15;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_47_0), stackIn_53_2 + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new dn(false);
            var3.field_a = param0;
            var3.field_e = param1;
            if (param2 == -1) {
              stackIn_4_0 = (dn) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (dn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("pg.B(").append(param0).append(',');

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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = param1.c(-19375);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("pg.A(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 47) {
            pg.a(-90, (byte) 40);
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
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

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
        fc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        fc stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var2 = ((ue) this).field_b.field_d.field_e;
              if (param0 > 43) {
                break L1;
              } else {
                ((ue) this).field_b = null;
                break L1;
              }
            }
            if (var2 != ((ue) this).field_b.field_d) {
              ((ue) this).field_d = var2.field_e;
              stackOut_6_0 = (fc) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              ((ue) this).field_d = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (fc) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2_ref, "ue.G(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final fc a(boolean param0, fc param1) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        fc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 != null) {
                  break L2;
                } else {
                  var3 = ((ue) this).field_b.field_d.field_e;
                  if (!TrackController.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L1;
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ue.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
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
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        Object stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
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
                    L2: {
                      if (var6_int >= var4_int) {
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            var7_ref_CharSequence = param1[var6_int];
                            if (var7_ref_CharSequence != null) {
                              break L4;
                            } else {
                              var5 += 4;
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L3;
                        }
                        var6_int++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6 = new StringBuilder(var5);
                    var7 = param0;
                    L5: while (true) {
                      L6: {
                        if (var7 >= var4_int) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              var8 = param1[var7];
                              if (null != var8) {
                                break L8;
                              } else {
                                StringBuilder discarded$5 = var6.append("null");
                                if (var9 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            StringBuilder discarded$6 = var6.append(var8);
                            break L7;
                          }
                          var7++;
                          if (var9 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackOut_32_0 = var6.toString();
                      stackIn_33_0 = stackOut_32_0;
                      break L0;
                    }
                  }
                } else {
                  stackOut_13_0 = null;
                  stackIn_14_0 = stackOut_13_0;
                  return (String) (Object) stackIn_14_0;
                }
              } else {
                var4 = param1[param0];
                if (null == var4) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  stackOut_10_0 = ((Object) (Object) var4).toString();
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
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
          L9: {
            var4_ref = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var4_ref;
            stackOut_34_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L9;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_33_0;
    }

    final fc a(byte param0, fc param1) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        fc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -37) {
                break L1;
              } else {
                java.net.URL discarded$2 = ue.a((java.net.URL) null, 89, (String) null, 12, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  var3 = param1;
                  if (!TrackController.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = ((ue) this).field_b.field_d.field_h;
              break L2;
            }
            if (var3 != ((ue) this).field_b.field_d) {
              ((ue) this).field_d = var3.field_h;
              stackOut_9_0 = (fc) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              ((ue) this).field_d = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (fc) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ue.I(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
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
            java.net.URL stackIn_58_0 = null;
            java.net.URL stackIn_60_0 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            String stackIn_65_2 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_57_0 = null;
            java.net.URL stackOut_59_0 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            String stackOut_62_2 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var10 = TrackController.field_F ? 1 : 0;
            try {
              var5_ref = param0.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      L2: {
                        if (0 <= param3) {
                          break L2;
                        } else {
                          var6 = var7_int;
                          if (var10 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      if (var10 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L3;
                    } else {
                      var6 = var7_int;
                      if (var10 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L4;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      L5: {
                        if (param2 != null) {
                          break L5;
                        } else {
                          var6 = var7_int;
                          if (var10 == 0) {
                            continue L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      if (var10 == 0) {
                        continue L0;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  L7: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L7;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L8;
                    } else {
                      L9: {
                        if (param4 != null) {
                          break L9;
                        } else {
                          var6 = var7_int;
                          if (var10 == 0) {
                            continue L0;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      if (var10 == 0) {
                        continue L0;
                      } else {
                        break L8;
                      }
                    }
                  }
                  break L6;
                }
                L10: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                  if (param3 > 0) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var8 = 108 % ((param1 - -59) / 50);
                  if (param2 == null) {
                    break L11;
                  } else {
                    if (param2.length() > 0) {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (null == param4) {
                    break L12;
                  } else {
                    if (param4.length() > 0) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param4);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  L14: {
                    if (var6 < var5_ref.length()) {
                      break L14;
                    } else {
                      StringBuilder discarded$16 = var7.append('/');
                      if (var10 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  StringBuilder discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                  break L13;
                }
                try {
                  L15: {
                    stackOut_57_0 = new java.net.URL(param0, var7.toString());
                    stackIn_58_0 = stackOut_57_0;
                    break L15;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9 = (Exception) (Object) decompiledCaughtException;
                  var9.printStackTrace();
                  stackOut_59_0 = (java.net.URL) param0;
                  stackIn_60_0 = stackOut_59_0;
                  return stackIn_60_0;
                }
                return stackIn_58_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L16: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_61_0 = (RuntimeException) var5;
                stackOut_61_1 = new StringBuilder().append("ue.J(");
                stackIn_64_0 = stackOut_61_0;
                stackIn_64_1 = stackOut_61_1;
                stackIn_62_0 = stackOut_61_0;
                stackIn_62_1 = stackOut_61_1;
                if (param0 == null) {
                  stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                  stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                  stackOut_64_2 = "null";
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  stackIn_65_2 = stackOut_64_2;
                  break L16;
                } else {
                  stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                  stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                  stackOut_62_2 = "{...}";
                  stackIn_65_0 = stackOut_62_0;
                  stackIn_65_1 = stackOut_62_1;
                  stackIn_65_2 = stackOut_62_2;
                  break L16;
                }
              }
              L17: {
                stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',').append(param1).append(',');
                stackIn_68_0 = stackOut_65_0;
                stackIn_68_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (param2 == null) {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L17;
                } else {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "{...}";
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_69_1 = stackOut_66_1;
                  stackIn_69_2 = stackOut_66_2;
                  break L17;
                }
              }
              L18: {
                stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param3).append(',');
                stackIn_72_0 = stackOut_69_0;
                stackIn_72_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param4 == null) {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "null";
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  break L18;
                } else {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "{...}";
                  stackIn_73_0 = stackOut_70_0;
                  stackIn_73_1 = stackOut_70_1;
                  stackIn_73_2 = stackOut_70_2;
                  break L18;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fc e(int param0) {
        fc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        fc stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        fc stackOut_8_0 = null;
        try {
          L0: {
            var2 = ((ue) this).field_d;
            if (var2 == ((ue) this).field_b.field_d) {
              ((ue) this).field_d = null;
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (fc) (Object) stackIn_4_0;
            } else {
              L1: {
                ((ue) this).field_d = var2.field_h;
                if (param0 == 37) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              stackOut_8_0 = (fc) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2_ref, "ue.D(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    public static void b(int param0) {
        try {
            field_a = null;
            field_c = null;
            if (param0 >= -119) {
                field_c = null;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ue.K(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1 = -65 & param1;
              var4_int = ud.a((byte) 54, param1);
              if (param2 == 91) {
                break L1;
              } else {
                boolean discarded$4 = ue.a(-77, '');
                break L1;
              }
            }
            u discarded$5 = nl.a(e.a(param1, -1932340400, var4_int), true, -257, param0, 0, var4_int, param3, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) (Object) runtimeException, "ue.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(long param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        String stackIn_31_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        byte stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        String stackOut_30_0 = null;
        Object stackOut_7_0 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0L) {
                break L1;
              } else {
                if (param0 >= 6582952005840035281L) {
                  break L1;
                } else {
                  if (param0 % 37L == 0L) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (String) (Object) stackIn_13_0;
                  } else {
                    var3_int = 0;
                    var4 = param0;
                    L2: while (true) {
                      L3: {
                        if (var4 == 0L) {
                          break L3;
                        } else {
                          var3_int++;
                          var4 = var4 / 37L;
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var6 = new StringBuilder(var3_int);
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (0L == param0) {
                              break L6;
                            } else {
                              var7 = param0;
                              param0 = param0 / 37L;
                              var9 = lg.field_b[(int)(-(37L * param0) + var7)];
                              stackOut_19_0 = 95;
                              stackOut_19_1 = var9;
                              stackIn_27_0 = stackOut_19_0;
                              stackIn_27_1 = stackOut_19_1;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              if (var11 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  if (stackIn_20_0 == stackIn_20_1) {
                                    var10 = -1 + var6.length();
                                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                                    var9 = 160;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                StringBuilder discarded$2 = var6.append((char) var9);
                                if (var11 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          StringBuilder discarded$3 = var6.reverse();
                          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                          stackOut_26_0 = param1;
                          stackOut_26_1 = 28;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L5;
                        }
                        L8: {
                          if (stackIn_27_0 > stackIn_27_1) {
                            break L8;
                          } else {
                            ue.a((String) null, true);
                            break L8;
                          }
                        }
                        stackOut_30_0 = var6.toString();
                        stackIn_31_0 = stackOut_30_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_7_0 = null;
            stackIn_8_0 = stackOut_7_0;
            return (String) (Object) stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "ue.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    final fc c(int param0) {
        fc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        fc stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        fc stackOut_8_0 = null;
        try {
          L0: {
            var2 = ((ue) this).field_d;
            if (((ue) this).field_b.field_d == var2) {
              ((ue) this).field_d = null;
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (fc) (Object) stackIn_4_0;
            } else {
              L1: {
                ((ue) this).field_d = var2.field_e;
                if (param0 <= -8) {
                  break L1;
                } else {
                  fc discarded$2 = ((ue) this).e(-30);
                  break L1;
                }
              }
              stackOut_8_0 = (fc) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2_ref, "ue.F(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (!vl.a(param1, 18102)) {
                L1: {
                  if (param1 == 45) {
                    break L1;
                  } else {
                    if (param1 == 160) {
                      break L1;
                    } else {
                      if (param1 == 32) {
                        break L1;
                      } else {
                        if (param1 == 95) {
                          break L1;
                        } else {
                          if (param0 == -16490) {
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            break L0;
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0 != 0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "ue.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
                String discarded$3 = ue.a(-17L, (byte) 10);
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final fc d(int param0) {
        fc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_4_0 = null;
        fc stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        fc stackOut_5_0 = null;
        try {
          L0: {
            var2 = ((ue) this).field_b.field_d.field_h;
            var3 = 61 / ((38 - param0) / 34);
            if (((ue) this).field_b.field_d == var2) {
              ((ue) this).field_d = null;
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (fc) (Object) stackIn_4_0;
            } else {
              ((ue) this).field_d = var2.field_h;
              stackOut_5_0 = (fc) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2_ref, "ue.B(" + param0 + ')');
        }
        return stackIn_6_0;
    }

    ue(ja param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ue) this).field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ue.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
    }
}

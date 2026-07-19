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
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            StringBuilder discarded$18 = null;
            StringBuilder discarded$19 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
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
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            java.net.URL stackOut_45_0 = null;
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
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            String stackOut_55_2 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            var9 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var5_ref = param1.getFile();
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
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) <= -1) {
                        L4: {
                          if (-1 >= (param3 ^ -1)) {
                            break L4;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if ((var7_int ^ -1) <= -1) {
                        var6 = var7_int;
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L6;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (0 > var7_int) {
                        break L6;
                      } else {
                        L7: {
                          if (param4 != null) {
                            break L7;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L9;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      L10: {
                        if (param2 != null) {
                          break L10;
                        } else {
                          var6 = var7_int;
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    var7 = new StringBuilder(var6);
                    discarded$10 = var7.append(var5_ref.substring(0, var6));
                    if (0 >= param3) {
                      break L11;
                    } else {
                      discarded$11 = var7.append("/l=");
                      discarded$12 = var7.append(Integer.toString(param3));
                      break L11;
                    }
                  }
                  L12: {
                    if (param4 == null) {
                      break L12;
                    } else {
                      if ((param4.length() ^ -1) < -1) {
                        discarded$13 = var7.append("/p=");
                        discarded$14 = var7.append(param4);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (param2 == null) {
                      break L13;
                    } else {
                      if (param2.length() <= 0) {
                        break L13;
                      } else {
                        discarded$15 = var7.append("/s=");
                        discarded$16 = var7.append(param2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5_ref.length() > var6) {
                      discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L14;
                    } else {
                      discarded$18 = var7.append('/');
                      if (var9 == 0) {
                        break L14;
                      } else {
                        discarded$19 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L14;
                      }
                    }
                  }
                  try {
                    L15: {
                      stackOut_43_0 = new java.net.URL(param1, var7.toString());
                      stackIn_44_0 = stackOut_43_0;
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_45_0 = (java.net.URL) (param1);
                    stackIn_46_0 = stackOut_45_0;
                    return stackIn_46_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L16: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_47_0 = (RuntimeException) (var5);
                stackOut_47_1 = new StringBuilder().append("us.D(").append(param0).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param1 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L16;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L16;
                }
              }
              L17: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param2 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L17;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L17;
                }
              }
              L18: {
                stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param3).append(',');
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                if (param4 == null) {
                  stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                  stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackOut_55_2 = "null";
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  break L18;
                } else {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "{...}";
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  break L18;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
            }
            return stackIn_44_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(byte param0) {
        if (param0 < 78) {
            field_e = (sla) null;
            return this.field_a;
        }
        return this.field_a;
    }

    final void a(int param0, boolean param1) {
        this.field_b = param1 ? true : false;
        int var3 = 97 % ((13 - param0) / 39);
        this.field_d = true;
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_98_0 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_97_0 = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var2_int = param0.length();
              var3 = new byte[var2_int];
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var4 >= var2_int) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          var5 = param0.charAt(var4);
                          if (var5 <= 0) {
                            break L5;
                          } else {
                            if (128 > var5) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var5 < 160) {
                            break L6;
                          } else {
                            if (var5 <= 255) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var5 == 8364) {
                            break L7;
                          } else {
                            L8: {
                              if (8218 == var5) {
                                break L8;
                              } else {
                                L9: {
                                  if (402 == var5) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (var5 != 8222) {
                                        break L10;
                                      } else {
                                        var3[var4] = (byte)-124;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (8230 != var5) {
                                        break L11;
                                      } else {
                                        var3[var4] = (byte)-123;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (8224 != var5) {
                                        break L12;
                                      } else {
                                        var3[var4] = (byte)-122;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (8225 != var5) {
                                        break L13;
                                      } else {
                                        var3[var4] = (byte)-121;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (var5 != 710) {
                                        break L14;
                                      } else {
                                        var3[var4] = (byte)-120;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (var5 == 8240) {
                                        break L15;
                                      } else {
                                        L16: {
                                          if (var5 == 352) {
                                            break L16;
                                          } else {
                                            L17: {
                                              if (var5 == 8249) {
                                                break L17;
                                              } else {
                                                L18: {
                                                  if (338 == var5) {
                                                    break L18;
                                                  } else {
                                                    L19: {
                                                      if (var5 != 381) {
                                                        break L19;
                                                      } else {
                                                        var3[var4] = (byte)-114;
                                                        if (var6 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    L20: {
                                                      if (var5 == 8216) {
                                                        break L20;
                                                      } else {
                                                        L21: {
                                                          if (8217 != var5) {
                                                            break L21;
                                                          } else {
                                                            var3[var4] = (byte)-110;
                                                            if (var6 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L21;
                                                            }
                                                          }
                                                        }
                                                        L22: {
                                                          if (var5 != 8220) {
                                                            break L22;
                                                          } else {
                                                            var3[var4] = (byte)-109;
                                                            if (var6 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        L23: {
                                                          if (var5 == 8221) {
                                                            break L23;
                                                          } else {
                                                            L24: {
                                                              if (var5 == 8226) {
                                                                break L24;
                                                              } else {
                                                                L25: {
                                                                  if (8211 == var5) {
                                                                    break L25;
                                                                  } else {
                                                                    L26: {
                                                                      if (8212 != var5) {
                                                                        break L26;
                                                                      } else {
                                                                        var3[var4] = (byte)-105;
                                                                        if (var6 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L26;
                                                                        }
                                                                      }
                                                                    }
                                                                    L27: {
                                                                      if (var5 == 732) {
                                                                        break L27;
                                                                      } else {
                                                                        L28: {
                                                                          if (var5 == 8482) {
                                                                            break L28;
                                                                          } else {
                                                                            L29: {
                                                                              if (353 != var5) {
                                                                                break L29;
                                                                              } else {
                                                                                var3[var4] = (byte)-102;
                                                                                if (var6 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L29;
                                                                                }
                                                                              }
                                                                            }
                                                                            L30: {
                                                                              if (var5 != 8250) {
                                                                                break L30;
                                                                              } else {
                                                                                var3[var4] = (byte)-101;
                                                                                if (var6 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L30;
                                                                                }
                                                                              }
                                                                            }
                                                                            L31: {
                                                                              if (339 == var5) {
                                                                                break L31;
                                                                              } else {
                                                                                L32: {
                                                                                  if (382 == var5) {
                                                                                    break L32;
                                                                                  } else {
                                                                                    L33: {
                                                                                      if (var5 == 376) {
                                                                                        break L33;
                                                                                      } else {
                                                                                        var3[var4] = (byte)63;
                                                                                        if (var6 == 0) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          break L33;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var3[var4] = (byte)-97;
                                                                                    if (var6 == 0) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      break L32;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var3[var4] = (byte)-98;
                                                                                if (var6 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L31;
                                                                                }
                                                                              }
                                                                            }
                                                                            var3[var4] = (byte)-100;
                                                                            if (var6 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L28;
                                                                            }
                                                                          }
                                                                        }
                                                                        var3[var4] = (byte)-103;
                                                                        if (var6 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L27;
                                                                        }
                                                                      }
                                                                    }
                                                                    var3[var4] = (byte)-104;
                                                                    if (var6 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L25;
                                                                    }
                                                                  }
                                                                }
                                                                var3[var4] = (byte)-106;
                                                                if (var6 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            var3[var4] = (byte)-107;
                                                            if (var6 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        var3[var4] = (byte)-108;
                                                        if (var6 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    var3[var4] = (byte)-111;
                                                    if (var6 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                var3[var4] = (byte)-116;
                                                if (var6 == 0) {
                                                  break L3;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            var3[var4] = (byte)-117;
                                            if (var6 == 0) {
                                              break L3;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var3[var4] = (byte)-118;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var3[var4] = (byte)-119;
                                    if (var6 == 0) {
                                      break L3;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var3[var4] = (byte)-125;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var3[var4] = (byte)-126;
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var3[var4] = (byte)-128;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      var3[var4] = (byte)var5;
                      break L3;
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_97_0 = (byte[]) (var3);
                stackIn_98_0 = stackOut_97_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (byte[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var2 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) (var2);
            stackOut_99_1 = new StringBuilder().append("us.G(");
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param0 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L34;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L34;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_98_0;
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

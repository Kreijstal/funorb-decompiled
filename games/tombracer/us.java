/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class us {
    private boolean field_d;
    private String field_a;
    private boolean field_b;
    static sla field_e;
    static String field_c;

    final boolean c(int param0) {
        int var2 = -59 % ((param0 - -57) / 37);
        return ((us) this).field_b;
    }

    final boolean b(int param0) {
        if (param0 < 42) {
            return false;
        }
        return ((us) this).field_d;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            L0: {
              var9 = TombRacer.field_G ? 1 : 0;
              var5 = param1.getFile();
              if (param0 >= 29) {
                break L0;
              } else {
                field_c = null;
                break L0;
              }
            }
            var6 = 0;
            L1: while (true) {
              L2: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int <= -1) {
                    if (-1 <= param3) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L1;
                    } else {
                      var6 = var7_int;
                      continue L1;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if ((var7_int ^ -1) <= -1) {
                    var6 = var7_int;
                    continue L1;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L4;
                } else {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (0 > var7_int) {
                    break L4;
                  } else {
                    if (param4 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L1;
                    } else {
                      var6 = var7_int;
                      continue L1;
                    }
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
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param2 != null) {
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
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (0 >= param3) {
                  break L7;
                } else {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                  break L7;
                }
              }
              L8: {
                if (param4 == null) {
                  if (param2 == null) {
                    break L8;
                  } else {
                    if (param2.length() <= 0) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/s=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L8;
                    }
                  }
                } else {
                  if (param2 == null) {
                    break L8;
                  } else {
                    if (param2.length() <= 0) {
                      break L8;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param2);
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (var5.length() > var6) {
                  StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(47);
                  break L9;
                }
              }
              try {
                stackOut_41_0 = new java.net.URL(param1, var7.toString());
                stackIn_42_0 = stackOut_41_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_42_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(byte param0) {
        if (param0 < 78) {
            field_e = null;
        }
        return ((us) this).field_a;
    }

    final void a(int param0, boolean param1) {
        ((us) this).field_b = param1 ? true : false;
        int var3 = 97 % ((13 - param0) / 39);
        ((us) this).field_d = true;
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!param1) {
          var2 = param0.length();
          var3 = new byte[var2];
          var4 = 0;
          L0: while (true) {
            if (var4 >= var2) {
              return var3;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param0.charAt(var4);
                    if (var5 <= 0) {
                      break L3;
                    } else {
                      if (128 > var5) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 < 160) {
                      break L4;
                    } else {
                      if (var5 <= 255) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var5 == 8364) {
                    var3[var4] = (byte)-128;
                    break L1;
                  } else {
                    if (8218 == var5) {
                      var3[var4] = (byte)-126;
                      break L1;
                    } else {
                      if (402 == var5) {
                        var3[var4] = (byte)-125;
                        break L1;
                      } else {
                        if (var5 != 8222) {
                          if (8230 != var5) {
                            if (8224 != var5) {
                              if (8225 != var5) {
                                if (var5 != 710) {
                                  if (var5 == 8240) {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  } else {
                                    if (var5 == 352) {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    } else {
                                      if (var5 == 8249) {
                                        var3[var4] = (byte)-117;
                                        break L1;
                                      } else {
                                        if (338 == var5) {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        } else {
                                          if (var5 != 381) {
                                            if (var5 == 8216) {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            } else {
                                              if (8217 != var5) {
                                                if (var5 != 8220) {
                                                  if (var5 == 8221) {
                                                    var3[var4] = (byte)-108;
                                                    break L1;
                                                  } else {
                                                    if (var5 == 8226) {
                                                      var3[var4] = (byte)-107;
                                                      break L1;
                                                    } else {
                                                      if (8211 == var5) {
                                                        var3[var4] = (byte)-106;
                                                        break L1;
                                                      } else {
                                                        if (8212 != var5) {
                                                          if (var5 == 732) {
                                                            var3[var4] = (byte)-104;
                                                            break L1;
                                                          } else {
                                                            if (var5 == 8482) {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            } else {
                                                              if (353 != var5) {
                                                                if (var5 != 8250) {
                                                                  if (339 == var5) {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  } else {
                                                                    if (382 == var5) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L1;
                                                                    } else {
                                                                      if (var5 == 376) {
                                                                        var3[var4] = (byte)-97;
                                                                        break L1;
                                                                      } else {
                                                                        var3[var4] = (byte)63;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-101;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-102;
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                }
                                              } else {
                                                var3[var4] = (byte)-110;
                                                break L1;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-114;
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                }
                              } else {
                                var3[var4] = (byte)-121;
                                break L1;
                              }
                            } else {
                              var3[var4] = (byte)-122;
                              break L1;
                            }
                          } else {
                            var3[var4] = (byte)-123;
                            break L1;
                          }
                        } else {
                          var3[var4] = (byte)-124;
                          break L1;
                        }
                      }
                    }
                  }
                }
                var3[var4] = (byte)var5;
                break L1;
              }
              var4++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != -1) {
            field_c = null;
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
        fla.field_f = param1.field_J;
        ub.b(0);
    }

    us(String param0) {
        ((us) this).field_b = false;
        ((us) this).field_d = false;
        ((us) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new sla();
        field_c = "Please select your treasure";
    }
}

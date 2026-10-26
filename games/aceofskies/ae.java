/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends sk {
    static boolean field_f;
    static String field_g;
    static String[] upgradeLabels;

    final void a(boolean param0) {
        if (!param0) {
          ae.c((byte) -120);
        }
    }

    final static void a(oh param0, int param1, byte param2) {
        CipherPacketBuffer var3 = q.outgoingPacket;
        var3.writeCipheredOpcode(84, param1);
        var3.writeByte(param2 - 1336879945, 2);
        var3.writeByte(-1336879960, 0);
        if (param2 != -15) {
          return;
        }
        try {
          var3.writeByte(-1336879960, param0.field_e);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ae.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
          jj var5 = (jj) null;
          this.a(-40, -118, (jj) null);
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
          field_g = (String) null;
        }
    }

    public static void c(byte param0) {
        upgradeLabels = null;
        if (param0 != 15) {
          field_g = (String) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          return true;
        }
        return false;
    }

    ae(bf param0) {
        super(param0);
    }

    final void a(int param0, int param1, jj param2) {
        try {
          this.field_b.a(param2, -9135);
          if (param1 < 66) {
            jj var5 = (jj) null;
            this.a(-11, 5, (jj) null);
          }
          this.field_b.b(param0, false);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ae.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 <= 2) {
          upgradeLabels = (String[]) null;
        }
    }

    final static byte a(char param0, int param1) {
        int var2;
        int var3;
        int var3Lifetime1;
        if (param0 <= 0) {
          if (param0 >= 160 &&
            255 >= param0) {
            var2 = (byte)param0;
          } else {
            if (param0 != 8364) {
              if (param0 != 8218) {
                if (param0 == 402) {
                  var2 = -125;
                  var3 = -105 % ((-44 - param1) / 59);
                  return (byte) var2;
                }
                if (8222 != param0) {
                  if (param0 == 8230) {
                    var2 = -123;
                    var3 = -105 % ((-44 - param1) / 59);
                    return (byte) var2;
                  }
                  if (param0 == 8224) {
                    var2 = -122;
                    var3 = -105 % ((-44 - param1) / 59);
                    return (byte) var2;
                  }
                  if (param0 != 8225) {
                    if (param0 != 710) {
                      if (8240 != param0) {
                        if (param0 != 352) {
                          if (param0 == 8249) {
                            var2 = -117;
                            var3 = -105 % ((-44 - param1) / 59);
                            return (byte) var2;
                          }
                          if (param0 == 338) {
                            var2 = -116;
                            var3 = -105 % ((-44 - param1) / 59);
                            return (byte) var2;
                          }
                          if (param0 == 381) {
                            var2 = -114;
                            var3 = -105 % ((-44 - param1) / 59);
                            return (byte) var2;
                          }
                          if (param0 != 8216) {
                            if (param0 != 8217) {
                              if (param0 != 8220) {
                                if (8221 == param0) {
                                  var2 = -108;
                                  var3 = -105 % ((-44 - param1) / 59);
                                  return (byte) var2;
                                }
                                if (param0 == 8226) {
                                  var2 = -107;
                                } else {
                                  if (8211 != param0) {
                                    if (param0 == 8212) {
                                      var2 = -105;
                                    } else {
                                      if (param0 == 732) {
                                        var2 = -104;
                                      } else {
                                        if (param0 == 8482) {
                                          var2 = -103;
                                        } else {
                                          if (param0 == 353) {
                                            var2 = -102;
                                          } else {
                                            if (8250 != param0) {
                                              if (param0 != 339) {
                                                if (param0 == 382) {
                                                  var2 = -98;
                                                } else {
                                                  var2 = (376 != param0) ? 63 : -97;
                                                }
                                              } else {
                                                var2 = -100;
                                              }
                                            } else {
                                              var2 = -101;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -106;
                                  }
                                }
                              } else {
                                var2 = -109;
                              }
                            } else {
                              var2 = -110;
                            }
                          } else {
                            var2 = -111;
                          }
                        } else {
                          var2 = -118;
                        }
                      } else {
                        var2 = -119;
                      }
                    } else {
                      var2 = -120;
                    }
                  } else {
                    var2 = -121;
                  }
                } else {
                  var2 = -124;
                }
              } else {
                var2 = -126;
              }
            } else {
              var2 = -128;
            }
          }
        } else {
          if (param0 < 128) {
            var2 = (byte)param0;
          } else {
            if (param0 < 160) {
              if (param0 != 8364) {
                if (param0 != 8218) {
                  if (param0 == 402) {
                    var2 = -125;
                  } else {
                    if (8222 != param0) {
                      if (param0 == 8230) {
                        var2 = -123;
                      } else {
                        if (param0 == 8224) {
                          var2 = -122;
                        } else {
                          if (param0 != 8225) {
                            if (param0 != 710) {
                              if (8240 != param0) {
                                if (param0 != 352) {
                                  if (param0 == 8249) {
                                    var2 = -117;
                                  } else {
                                    if (param0 == 338) {
                                      var2 = -116;
                                    } else {
                                      if (param0 == 381) {
                                        var2 = -114;
                                      } else {
                                        if (param0 != 8216) {
                                          if (param0 != 8217) {
                                            if (param0 != 8220) {
                                              if (8221 == param0) {
                                                var2 = -108;
                                              } else {
                                                if (param0 == 8226) {
                                                  var2 = -107;
                                                } else {
                                                  if (8211 != param0) {
                                                    if (param0 == 8212) {
                                                      var2 = -105;
                                                    } else {
                                                      if (param0 == 732) {
                                                        var2 = -104;
                                                      } else {
                                                        if (param0 == 8482) {
                                                          var2 = -103;
                                                        } else {
                                                          if (param0 == 353) {
                                                            var2 = -102;
                                                          } else {
                                                            if (8250 != param0) {
                                                              if (param0 != 339) {
                                                                if (param0 == 382) {
                                                                  var2 = -98;
                                                                } else {
                                                                  var2 = (376 != param0) ? 63 : -97;
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -109;
                                            }
                                          } else {
                                            var2 = -110;
                                          }
                                        } else {
                                          var2 = -111;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -118;
                                }
                              } else {
                                var2 = -119;
                              }
                            } else {
                              var2 = -120;
                            }
                          } else {
                            var2 = -121;
                          }
                        }
                      }
                    } else {
                      var2 = -124;
                    }
                  }
                } else {
                  var2 = -126;
                }
              } else {
                var2 = -128;
              }
            } else {
              if (255 >= param0) {
                var2 = (byte)param0;
                var3 = -105 % ((-44 - param1) / 59);
                return (byte) var2;
              }
              if (param0 != 8364) {
                if (param0 != 8218) {
                  if (param0 == 402) {
                    var2 = -125;
                    var3 = -105 % ((-44 - param1) / 59);
                    return (byte) var2;
                  }
                  if (8222 != param0) {
                    if (param0 == 8230) {
                      var2 = -123;
                      var3 = -105 % ((-44 - param1) / 59);
                      return (byte) var2;
                    }
                    if (param0 == 8224) {
                      var2 = -122;
                      var3 = -105 % ((-44 - param1) / 59);
                      return (byte) var2;
                    }
                    if (param0 != 8225) {
                      if (param0 != 710) {
                        if (8240 != param0) {
                          if (param0 != 352) {
                            if (param0 == 8249) {
                              var2 = -117;
                              var3 = -105 % ((-44 - param1) / 59);
                              return (byte) var2;
                            }
                            if (param0 == 338) {
                              var2 = -116;
                              var3 = -105 % ((-44 - param1) / 59);
                              return (byte) var2;
                            }
                            if (param0 == 381) {
                              var2 = -114;
                              var3 = -105 % ((-44 - param1) / 59);
                              return (byte) var2;
                            }
                            if (param0 != 8216) {
                              if (param0 != 8217) {
                                if (param0 != 8220) {
                                  if (8221 == param0) {
                                    var2 = -108;
                                    var3 = -105 % ((-44 - param1) / 59);
                                    return (byte) var2;
                                  }
                                  if (param0 == 8226) {
                                    var2 = -107;
                                    var3 = -105 % ((-44 - param1) / 59);
                                    return (byte) var2;
                                  }
                                  if (8211 != param0) {
                                    if (param0 == 8212) {
                                      var2 = -105;
                                      var3 = -105 % ((-44 - param1) / 59);
                                      return (byte) var2;
                                    }
                                    if (param0 == 732) {
                                      var2 = -104;
                                      var3 = -105 % ((-44 - param1) / 59);
                                      return (byte) var2;
                                    }
                                    if (param0 == 8482) {
                                      var2 = -103;
                                      var3 = -105 % ((-44 - param1) / 59);
                                      return (byte) var2;
                                    }
                                    if (param0 == 353) {
                                      var2 = -102;
                                      var3 = -105 % ((-44 - param1) / 59);
                                      return (byte) var2;
                                    }
                                    if (8250 != param0) {
                                      if (param0 != 339) {
                                        if (param0 == 382) {
                                          var2 = -98;
                                          var3 = -105 % ((-44 - param1) / 59);
                                          return (byte) var2;
                                        }
                                        var2 = (376 != param0) ? 63 : -97;
                                      } else {
                                        var2 = -100;
                                      }
                                    } else {
                                      var2 = -101;
                                    }
                                  } else {
                                    var2 = -106;
                                  }
                                } else {
                                  var2 = -109;
                                }
                              } else {
                                var2 = -110;
                              }
                            } else {
                              var2 = -111;
                            }
                          } else {
                            var2 = -118;
                          }
                        } else {
                          var2 = -119;
                        }
                      } else {
                        var2 = -120;
                      }
                    } else {
                      var2 = -121;
                    }
                  } else {
                    var2 = -124;
                  }
                } else {
                  var2 = -126;
                }
              } else {
                var2 = -128;
              }
            }
          }
        }
        var3Lifetime1 = -105 % ((-44 - param1) / 59);
        return (byte) var2;
    }

    final static void a(int param0, PacketBuffer param1, boolean param2, rk param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          bb var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            if (param2) {
              ae.a('￫', 105);
            }
            var18 = new bb();
            var18.field_g = param1.readUnsignedByte(99);
            var18.field_j = param1.readInt((byte) 127);
            var18.field_k = new byte[var18.field_g][][];
            var18.field_l = new int[var18.field_g];
            var18.field_e = new int[var18.field_g];
            var18.field_h = new en[var18.field_g];
            var18.field_i = new int[var18.field_g];
            var18.field_f = new en[var18.field_g];
            for (var5 = 0; var18.field_g > var5; var5++) {
              try {
                var6_int = param1.readUnsignedByte(-74);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param1.readNullTerminatedText(-17883);
                    var21 = param1.readNullTerminatedText(-17883);
                    var9 = param1.readUnsignedByte(-60);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param1.readNullTerminatedText(-17883);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param1.readInt((byte) 117);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.a(0, 7186, var13, var22[var12_int]);
                      }
                    }
                    var18.field_l[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = pe.a(var10[var17], 1);
                      var17++;
                    }
                    var18.field_h[var5] = param3.a(pe.a(var20, 1), var12, var21, true);
                    var18.field_k[var5] = var22;
                  }
                } else {
                  var16 = param1.readNullTerminatedText(-17883);
                  var7 = var16;
                  var15 = param1.readNullTerminatedText(-17883);
                  var8 = var15;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param1.readInt((byte) 117);
                  }
                  var18.field_l[var5] = var6_int;
                  var18.field_i[var5] = var9;
                  var18.field_f[var5] = param3.a(var15, pe.a(var16, 1), 9);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_e[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_e[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_e[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_e[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_e[var5] = -5;
              }
            }
            av.field_c.addLast(66, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_39_0 = var4;
            stackIn_39_1 = new StringBuilder().append("ae.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = false;
        field_g = "The account name you use to access RuneScape and other Jagex.com games";
        upgradeLabels = new String[]{"***Speed Upgraded!***", "***Rate of Fire Upgraded!***", "***Manoeuvrability Upgraded!***", "***Armour Upgraded!***", "***Extra Life!***", "***Backup has arrived!***", "***Score Multiplier!***"};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qo extends qa {
    static String field_s;
    static int[] field_r;
    static th field_q;
    static int field_u;
    static String field_t;

    final static byte[] a(CharSequence param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param0.length();
        var3 = new byte[var2];
        if (param1 == -116) {
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param0.charAt(var4);
                    if (var5 <= 0) {
                      break L3;
                    } else {
                      if (var5 < 128) {
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
                      if (var5 > 255) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var5 != 8364) {
                    if (var5 == 8218) {
                      var3[var4] = (byte)-126;
                      break L1;
                    } else {
                      if (402 != var5) {
                        if (var5 == 8222) {
                          var3[var4] = (byte)-124;
                          break L1;
                        } else {
                          if (8230 == var5) {
                            var3[var4] = (byte)-123;
                            break L1;
                          } else {
                            if (var5 == 8224) {
                              var3[var4] = (byte)-122;
                              break L1;
                            } else {
                              if (var5 == 8225) {
                                var3[var4] = (byte)-121;
                                break L1;
                              } else {
                                if (710 == var5) {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                } else {
                                  if (8240 != var5) {
                                    if (var5 != 352) {
                                      if (var5 == 8249) {
                                        var3[var4] = (byte)-117;
                                        break L1;
                                      } else {
                                        if (var5 == 338) {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        } else {
                                          if (var5 == 381) {
                                            var3[var4] = (byte)-114;
                                            break L1;
                                          } else {
                                            if (8216 == var5) {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            } else {
                                              if (var5 == 8217) {
                                                var3[var4] = (byte)-110;
                                                break L1;
                                              } else {
                                                if (var5 == 8220) {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                } else {
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
                                                        if (8212 == var5) {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        } else {
                                                          if (var5 == 732) {
                                                            var3[var4] = (byte)-104;
                                                            break L1;
                                                          } else {
                                                            if (8482 != var5) {
                                                              if (var5 != 353) {
                                                                if (8250 != var5) {
                                                                  if (var5 == 339) {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  } else {
                                                                    if (var5 == 382) {
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
                                                            } else {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    }
                                  } else {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var3[var4] = (byte)-125;
                        break L1;
                      }
                    }
                  } else {
                    var3[var4] = (byte)-128;
                    break L1;
                  }
                }
                var3[var4] = (byte)var5;
                var4++;
                break L1;
              }
              var4++;
              continue L0;
            }
          }
        } else {
          L5: {
            field_q = null;
            var4 = 0;
            if (var2 <= var4) {
              break L5;
            } else {
              L6: {
                L7: {
                  L8: {
                    var5 = param0.charAt(var4);
                    if (var5 <= 0) {
                      break L8;
                    } else {
                      if (var5 < 128) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5 < 160) {
                      break L9;
                    } else {
                      if (var5 > 255) {
                        break L9;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      L12: {
                        L13: {
                          L14: {
                            L15: {
                              L16: {
                                L17: {
                                  L18: {
                                    L19: {
                                      L20: {
                                        L21: {
                                          L22: {
                                            L23: {
                                              L24: {
                                                L25: {
                                                  L26: {
                                                    L27: {
                                                      L28: {
                                                        L29: {
                                                          L30: {
                                                            L31: {
                                                              L32: {
                                                                L33: {
                                                                  L34: {
                                                                    L35: {
                                                                      L36: {
                                                                        if (var5 != 8364) {
                                                                          if (var5 == 8218) {
                                                                            var3[var4] = (byte)-126;
                                                                            break L10;
                                                                          } else {
                                                                            if (402 != var5) {
                                                                              if (var5 == 8222) {
                                                                                var3[var4] = (byte)-124;
                                                                                break L11;
                                                                              } else {
                                                                                if (8230 == var5) {
                                                                                  var3[var4] = (byte)-123;
                                                                                  break L12;
                                                                                } else {
                                                                                  if (var5 == 8224) {
                                                                                    var3[var4] = (byte)-122;
                                                                                    break L13;
                                                                                  } else {
                                                                                    if (var5 == 8225) {
                                                                                      var3[var4] = (byte)-121;
                                                                                      break L14;
                                                                                    } else {
                                                                                      if (710 == var5) {
                                                                                        var3[var4] = (byte)-120;
                                                                                        break L15;
                                                                                      } else {
                                                                                        if (8240 != var5) {
                                                                                          if (var5 != 352) {
                                                                                            if (var5 == 8249) {
                                                                                              var3[var4] = (byte)-117;
                                                                                              break L16;
                                                                                            } else {
                                                                                              if (var5 == 338) {
                                                                                                var3[var4] = (byte)-116;
                                                                                                break L17;
                                                                                              } else {
                                                                                                if (var5 == 381) {
                                                                                                  var3[var4] = (byte)-114;
                                                                                                  break L18;
                                                                                                } else {
                                                                                                  if (8216 == var5) {
                                                                                                    var3[var4] = (byte)-111;
                                                                                                    break L19;
                                                                                                  } else {
                                                                                                    if (var5 == 8217) {
                                                                                                      var3[var4] = (byte)-110;
                                                                                                      break L20;
                                                                                                    } else {
                                                                                                      if (var5 == 8220) {
                                                                                                        var3[var4] = (byte)-109;
                                                                                                        break L21;
                                                                                                      } else {
                                                                                                        if (var5 == 8221) {
                                                                                                          var3[var4] = (byte)-108;
                                                                                                          break L22;
                                                                                                        } else {
                                                                                                          if (var5 == 8226) {
                                                                                                            var3[var4] = (byte)-107;
                                                                                                            break L23;
                                                                                                          } else {
                                                                                                            if (8211 == var5) {
                                                                                                              var3[var4] = (byte)-106;
                                                                                                              break L24;
                                                                                                            } else {
                                                                                                              if (8212 == var5) {
                                                                                                                var3[var4] = (byte)-105;
                                                                                                                break L25;
                                                                                                              } else {
                                                                                                                if (var5 == 732) {
                                                                                                                  var3[var4] = (byte)-104;
                                                                                                                  break L26;
                                                                                                                } else {
                                                                                                                  if (8482 != var5) {
                                                                                                                    if (var5 != 353) {
                                                                                                                      if (8250 != var5) {
                                                                                                                        if (var5 == 339) {
                                                                                                                          var3[var4] = (byte)-100;
                                                                                                                          break L27;
                                                                                                                        } else {
                                                                                                                          if (var5 == 382) {
                                                                                                                            var3[var4] = (byte)-98;
                                                                                                                            break L28;
                                                                                                                          } else {
                                                                                                                            if (var5 == 376) {
                                                                                                                              var3[var4] = (byte)-97;
                                                                                                                              break L29;
                                                                                                                            } else {
                                                                                                                              var3[var4] = (byte)63;
                                                                                                                              break L30;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        var3[var4] = (byte)-101;
                                                                                                                        break L31;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      var3[var4] = (byte)-102;
                                                                                                                      break L32;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    var3[var4] = (byte)-103;
                                                                                                                    break L33;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var3[var4] = (byte)-118;
                                                                                            break L34;
                                                                                          }
                                                                                        } else {
                                                                                          var3[var4] = (byte)-119;
                                                                                          break L35;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              var3[var4] = (byte)-125;
                                                                              break L36;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          var3[var4] = (byte)-128;
                                                                          var4++;
                                                                          break L36;
                                                                        }
                                                                      }
                                                                      var4++;
                                                                      break L35;
                                                                    }
                                                                    var4++;
                                                                    break L34;
                                                                  }
                                                                  var4++;
                                                                  break L33;
                                                                }
                                                                var4++;
                                                                break L32;
                                                              }
                                                              var4++;
                                                              break L31;
                                                            }
                                                            var4++;
                                                            break L30;
                                                          }
                                                          var4++;
                                                          break L29;
                                                        }
                                                        var4++;
                                                        break L28;
                                                      }
                                                      var4++;
                                                      break L27;
                                                    }
                                                    var4++;
                                                    break L26;
                                                  }
                                                  var4++;
                                                  break L25;
                                                }
                                                var4++;
                                                break L24;
                                              }
                                              var4++;
                                              break L23;
                                            }
                                            var4++;
                                            break L22;
                                          }
                                          var4++;
                                          break L21;
                                        }
                                        var4++;
                                        break L20;
                                      }
                                      var4++;
                                      break L19;
                                    }
                                    var4++;
                                    break L18;
                                  }
                                  var4++;
                                  break L17;
                                }
                                var4++;
                                break L16;
                              }
                              var4++;
                              break L15;
                            }
                            var4++;
                            break L14;
                          }
                          var4++;
                          break L13;
                        }
                        var4++;
                        break L12;
                      }
                      var4++;
                      break L11;
                    }
                    var4++;
                    break L10;
                  }
                  var4++;
                  break L6;
                }
                var3[var4] = (byte)var5;
                var4++;
                break L6;
              }
              var4++;
              var4++;
              break L5;
            }
          }
          return var3;
        }
    }

    final static void b(boolean param0, int param1) {
        ga var2 = null;
        var2 = ma.field_a;
        var2.b((byte) -35, param1);
        var2.a(-50, 1);
        var2.a(123, 2);
        if (!param0) {
          qo.b(true, -60);
          return;
        } else {
          return;
        }
    }

    qo() {
    }

    public static void b(boolean param0) {
        field_q = null;
        field_r = null;
        if (param0) {
            return;
        }
        field_t = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Log in";
        field_u = 0;
        field_q = new th();
        field_t = "Menu";
    }
}

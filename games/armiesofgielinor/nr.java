/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nr {
    static ru[] field_c;
    static d field_e;
    static int[] field_a;
    static String field_d;
    wk[] field_b;
    static String field_f;

    void a(byte param0, int param1, int param2, int param3, int param4) {
        i.a(((nr) this).field_b, param1, param2, (byte) -47, param4, param3);
        if (param0 != -111) {
            field_a = null;
        }
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param1) {
          L0: {
            var2 = param0.length();
            var3 = new byte[var2];
            var4 = 0;
            if (var2 <= var4) {
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param0.charAt(var4);
                    if (0 >= var5) {
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
                    if (160 > var5) {
                      break L4;
                    } else {
                      if (var5 > 255) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L5: {
                    if (var5 == 8364) {
                      var3[var4] = (byte)-128;
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
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
                                                                          if (8218 != var5) {
                                                                            if (var5 != 402) {
                                                                              if (var5 == 8222) {
                                                                                var3[var4] = (byte)-124;
                                                                                break L6;
                                                                              } else {
                                                                                if (8230 != var5) {
                                                                                  if (var5 == 8224) {
                                                                                    var3[var4] = (byte)-122;
                                                                                    break L7;
                                                                                  } else {
                                                                                    if (var5 != 8225) {
                                                                                      if (var5 != 710) {
                                                                                        if (var5 != 8240) {
                                                                                          if (352 != var5) {
                                                                                            if (var5 == 8249) {
                                                                                              var3[var4] = (byte)-117;
                                                                                              break L8;
                                                                                            } else {
                                                                                              if (var5 == 338) {
                                                                                                var3[var4] = (byte)-116;
                                                                                                break L9;
                                                                                              } else {
                                                                                                if (var5 == 381) {
                                                                                                  var3[var4] = (byte)-114;
                                                                                                  break L10;
                                                                                                } else {
                                                                                                  if (var5 != 8216) {
                                                                                                    if (var5 == 8217) {
                                                                                                      var3[var4] = (byte)-110;
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      if (var5 == 8220) {
                                                                                                        var3[var4] = (byte)-109;
                                                                                                        break L12;
                                                                                                      } else {
                                                                                                        if (var5 == 8221) {
                                                                                                          var3[var4] = (byte)-108;
                                                                                                          break L13;
                                                                                                        } else {
                                                                                                          if (8226 != var5) {
                                                                                                            if (8211 == var5) {
                                                                                                              var3[var4] = (byte)-106;
                                                                                                              break L14;
                                                                                                            } else {
                                                                                                              if (var5 != 8212) {
                                                                                                                if (var5 != 732) {
                                                                                                                  if (var5 == 8482) {
                                                                                                                    var3[var4] = (byte)-103;
                                                                                                                    break L15;
                                                                                                                  } else {
                                                                                                                    if (var5 == 353) {
                                                                                                                      var3[var4] = (byte)-102;
                                                                                                                      break L16;
                                                                                                                    } else {
                                                                                                                      if (var5 != 8250) {
                                                                                                                        if (339 == var5) {
                                                                                                                          var3[var4] = (byte)-100;
                                                                                                                          break L17;
                                                                                                                        } else {
                                                                                                                          if (382 != var5) {
                                                                                                                            if (var5 != 376) {
                                                                                                                              var3[var4] = (byte)63;
                                                                                                                              break L18;
                                                                                                                            } else {
                                                                                                                              var3[var4] = (byte)-97;
                                                                                                                              break L19;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            var3[var4] = (byte)-98;
                                                                                                                            break L20;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        var3[var4] = (byte)-101;
                                                                                                                        break L21;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  var3[var4] = (byte)-104;
                                                                                                                  break L22;
                                                                                                                }
                                                                                                              } else {
                                                                                                                var3[var4] = (byte)-105;
                                                                                                                break L23;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            var3[var4] = (byte)-107;
                                                                                                            break L24;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var3[var4] = (byte)-111;
                                                                                                    break L25;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var3[var4] = (byte)-118;
                                                                                            break L26;
                                                                                          }
                                                                                        } else {
                                                                                          var3[var4] = (byte)-119;
                                                                                          break L27;
                                                                                        }
                                                                                      } else {
                                                                                        var3[var4] = (byte)-120;
                                                                                        break L28;
                                                                                      }
                                                                                    } else {
                                                                                      var3[var4] = (byte)-121;
                                                                                      break L29;
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  var3[var4] = (byte)-123;
                                                                                  break L30;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              var3[var4] = (byte)-125;
                                                                              break L31;
                                                                            }
                                                                          } else {
                                                                            var3[var4] = (byte)-126;
                                                                            var4++;
                                                                            break L31;
                                                                          }
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
                              break L9;
                            }
                            var4++;
                            break L8;
                          }
                          var4++;
                          break L7;
                        }
                        var4++;
                        break L6;
                      }
                      var4++;
                      break L5;
                    }
                  }
                  var4++;
                  break L1;
                }
                var3[var4] = (byte)var5;
                var4++;
                break L1;
              }
              var4++;
              var4++;
              break L0;
            }
          }
          return var3;
        } else {
          field_a = null;
          var2 = param0.length();
          var3 = new byte[var2];
          var4 = 0;
          L32: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              L33: {
                L34: {
                  L35: {
                    var5 = param0.charAt(var4);
                    if (0 >= var5) {
                      break L35;
                    } else {
                      if (var5 < 128) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    if (160 > var5) {
                      break L36;
                    } else {
                      if (var5 > 255) {
                        break L36;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (var5 == 8364) {
                    var3[var4] = (byte)-128;
                    break L33;
                  } else {
                    if (8218 != var5) {
                      if (var5 != 402) {
                        if (var5 == 8222) {
                          var3[var4] = (byte)-124;
                          break L33;
                        } else {
                          if (8230 != var5) {
                            if (var5 == 8224) {
                              var3[var4] = (byte)-122;
                              break L33;
                            } else {
                              if (var5 != 8225) {
                                if (var5 != 710) {
                                  if (var5 != 8240) {
                                    if (352 != var5) {
                                      if (var5 == 8249) {
                                        var3[var4] = (byte)-117;
                                        break L33;
                                      } else {
                                        if (var5 == 338) {
                                          var3[var4] = (byte)-116;
                                          break L33;
                                        } else {
                                          if (var5 == 381) {
                                            var3[var4] = (byte)-114;
                                            break L33;
                                          } else {
                                            if (var5 != 8216) {
                                              if (var5 == 8217) {
                                                var3[var4] = (byte)-110;
                                                break L33;
                                              } else {
                                                if (var5 == 8220) {
                                                  var3[var4] = (byte)-109;
                                                  break L33;
                                                } else {
                                                  if (var5 == 8221) {
                                                    var3[var4] = (byte)-108;
                                                    break L33;
                                                  } else {
                                                    if (8226 != var5) {
                                                      if (8211 == var5) {
                                                        var3[var4] = (byte)-106;
                                                        break L33;
                                                      } else {
                                                        if (var5 != 8212) {
                                                          if (var5 != 732) {
                                                            if (var5 == 8482) {
                                                              var3[var4] = (byte)-103;
                                                              break L33;
                                                            } else {
                                                              if (var5 == 353) {
                                                                var3[var4] = (byte)-102;
                                                                break L33;
                                                              } else {
                                                                if (var5 != 8250) {
                                                                  if (339 == var5) {
                                                                    var3[var4] = (byte)-100;
                                                                    break L33;
                                                                  } else {
                                                                    if (382 != var5) {
                                                                      if (var5 != 376) {
                                                                        var3[var4] = (byte)63;
                                                                        break L33;
                                                                      } else {
                                                                        var3[var4] = (byte)-97;
                                                                        break L33;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-98;
                                                                      break L33;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-101;
                                                                  break L33;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-104;
                                                            break L33;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-105;
                                                          break L33;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-107;
                                                      break L33;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte)-111;
                                              break L33;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte)-118;
                                      break L33;
                                    }
                                  } else {
                                    var3[var4] = (byte)-119;
                                    break L33;
                                  }
                                } else {
                                  var3[var4] = (byte)-120;
                                  break L33;
                                }
                              } else {
                                var3[var4] = (byte)-121;
                                break L33;
                              }
                            }
                          } else {
                            var3[var4] = (byte)-123;
                            break L33;
                          }
                        }
                      } else {
                        var3[var4] = (byte)-125;
                        break L33;
                      }
                    } else {
                      var3[var4] = (byte)-126;
                      break L33;
                    }
                  }
                }
                var3[var4] = (byte)var5;
                var4++;
                break L33;
              }
              var4++;
              continue L32;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != -119) {
          field_e = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          return;
        }
    }

    nr(wk[] param0) {
        ((nr) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{15, 20, 30, 40, 100};
        field_d = "All games";
        field_f = "Apply";
    }
}

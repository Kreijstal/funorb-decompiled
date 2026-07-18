/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    private vh field_d;
    static int field_i;
    static String field_c;
    static String field_e;
    private long field_b;
    private vh[] field_h;
    static String[] field_f;
    private int field_g;
    static String field_a;

    final vh c(byte param0) {
        vh var2 = null;
        vh var3 = null;
        int var4 = Terraphoenix.field_V;
        if (((vb) this).field_d == null) {
            return null;
        }
        if (param0 >= -9) {
            ((vb) this).a(true, (vh) null, -18L);
            var2 = ((vb) this).field_h[(int)(((vb) this).field_b & (long)(-1 + ((vb) this).field_g))];
            while (var2 != ((vb) this).field_d) {
                if (!(~((vb) this).field_d.field_m != ~((vb) this).field_b)) {
                    var3 = ((vb) this).field_d;
                    ((vb) this).field_d = ((vb) this).field_d.field_o;
                    return var3;
                }
                ((vb) this).field_d = ((vb) this).field_d.field_o;
            }
            ((vb) this).field_d = null;
            return null;
        }
        var2 = ((vb) this).field_h[(int)(((vb) this).field_b & (long)(-1 + ((vb) this).field_g))];
        while (var2 != ((vb) this).field_d) {
            if (!(~((vb) this).field_d.field_m != ~((vb) this).field_b)) {
                var3 = ((vb) this).field_d;
                ((vb) this).field_d = ((vb) this).field_d.field_o;
                return var3;
            }
            ((vb) this).field_d = ((vb) this).field_d.field_o;
        }
        ((vb) this).field_d = null;
        return null;
    }

    final static String b(byte param0) {
        if (!(uh.field_H >= 2)) {
            return c.field_i;
        }
        if (!(bl.field_a == null)) {
            if (!(bl.field_a.a(0))) {
                return si.field_hb;
            }
            return qb.field_e;
        }
        if (!bi.field_d.a(0)) {
            return be.field_w;
        }
        if (!(bi.field_d.a(-3, "commonui"))) {
            return bl.field_d + " - " + bi.field_d.b(-120, "commonui") + "%";
        }
        if (!(ph.field_q.a(0))) {
            return field_a;
        }
        if (!(ph.field_q.a(-3, "commonui"))) {
            return ki.field_S + " - " + ph.field_q.b(-99, "commonui") + "%";
        }
        if (!(ch.field_g.a(0))) {
            return jj.field_d;
        }
        if (!ch.field_g.b((byte) -128)) {
            return li.field_b + " - " + ch.field_g.a((byte) 127) + "%";
        }
        return vd.field_o;
    }

    final static boolean a(int param0) {
        return i.field_a.a(true);
    }

    final vh a(int param0, long param1) {
        vh var5 = null;
        int var6 = Terraphoenix.field_V;
        ((vb) this).field_b = param1;
        vh var4 = ((vb) this).field_h[(int)((long)(((vb) this).field_g + -1) & param1)];
        ((vb) this).field_d = var4.field_o;
        while (var4 != ((vb) this).field_d) {
            if (~param1 == ~((vb) this).field_d.field_m) {
                var5 = ((vb) this).field_d;
                ((vb) this).field_d = ((vb) this).field_d.field_o;
                return var5;
            }
            ((vb) this).field_d = ((vb) this).field_d.field_o;
        }
        if (param0 < 25) {
            ((vb) this).field_g = 79;
            ((vb) this).field_d = null;
            return null;
        }
        ((vb) this).field_d = null;
        return null;
    }

    final void a(boolean param0, vh param1, long param2) {
        vh var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null == param1.field_i) {
                break L1;
              } else {
                param1.c((byte) 13);
                break L1;
              }
            }
            L2: {
              var5 = ((vb) this).field_h[(int)((long)(-1 + ((vb) this).field_g) & param2)];
              param1.field_i = var5.field_i;
              param1.field_o = var5;
              param1.field_i.field_o = param1;
              param1.field_o.field_i = param1;
              param1.field_m = param2;
              if (!param0) {
                break L2;
              } else {
                field_i = -113;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("vb.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (param1 > 0) {
          if (param1 >= 128) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                var2 = (byte)param1;
                return (byte) var2;
              } else {
                L0: {
                  if (8364 == param1) {
                    var2 = -128;
                    break L0;
                  } else {
                    if (param1 != 8218) {
                      if (param1 != 402) {
                        if (param1 == 8222) {
                          var2 = -124;
                          return (byte) var2;
                        } else {
                          if (param1 == 8230) {
                            var2 = -123;
                            return (byte) var2;
                          } else {
                            if (param1 != 8224) {
                              if (param1 != 8225) {
                                if (param1 != 710) {
                                  if (8240 != param1) {
                                    if (param1 == 352) {
                                      var2 = -118;
                                      return (byte) var2;
                                    } else {
                                      if (param1 == 8249) {
                                        var2 = -117;
                                        return (byte) var2;
                                      } else {
                                        if (338 != param1) {
                                          if (param1 == 381) {
                                            var2 = -114;
                                            return (byte) var2;
                                          } else {
                                            if (8216 == param1) {
                                              var2 = -111;
                                              return (byte) var2;
                                            } else {
                                              if (param1 != 8217) {
                                                if (param1 != 8220) {
                                                  if (8221 == param1) {
                                                    var2 = -108;
                                                    return (byte) var2;
                                                  } else {
                                                    if (param1 != 8226) {
                                                      if (param1 == 8211) {
                                                        var2 = -106;
                                                        return (byte) var2;
                                                      } else {
                                                        if (8212 != param1) {
                                                          if (param1 != 732) {
                                                            if (8482 == param1) {
                                                              var2 = -103;
                                                              return (byte) var2;
                                                            } else {
                                                              if (param1 != 353) {
                                                                if (param1 == 8250) {
                                                                  var2 = -101;
                                                                  return (byte) var2;
                                                                } else {
                                                                  if (param1 != 339) {
                                                                    if (param1 != 382) {
                                                                      if (param1 != 376) {
                                                                        var2 = 63;
                                                                        return (byte) var2;
                                                                      } else {
                                                                        var2 = -97;
                                                                        return (byte) var2;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    var2 = -100;
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L0;
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          break L0;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            }
                                          }
                                        } else {
                                          var2 = -116;
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -119;
                                    break L0;
                                  }
                                } else {
                                  var2 = -120;
                                  break L0;
                                }
                              } else {
                                var2 = -121;
                                break L0;
                              }
                            } else {
                              var2 = -122;
                              break L0;
                            }
                          }
                        }
                      } else {
                        var2 = -125;
                        break L0;
                      }
                    } else {
                      var2 = -126;
                      break L0;
                    }
                  }
                }
                return (byte) var2;
              }
            } else {
              L1: {
                if (8364 == param1) {
                  var2 = -128;
                  break L1;
                } else {
                  if (param1 != 8218) {
                    if (param1 != 402) {
                      if (param1 == 8222) {
                        var2 = -124;
                        return (byte) var2;
                      } else {
                        if (param1 == 8230) {
                          var2 = -123;
                          return (byte) var2;
                        } else {
                          if (param1 != 8224) {
                            if (param1 != 8225) {
                              if (param1 != 710) {
                                if (8240 != param1) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    return (byte) var2;
                                  } else {
                                    if (param1 == 8249) {
                                      var2 = -117;
                                      return (byte) var2;
                                    } else {
                                      if (338 != param1) {
                                        if (param1 == 381) {
                                          var2 = -114;
                                          return (byte) var2;
                                        } else {
                                          if (8216 == param1) {
                                            var2 = -111;
                                            return (byte) var2;
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (8221 == param1) {
                                                  var2 = -108;
                                                  return (byte) var2;
                                                } else {
                                                  if (param1 != 8226) {
                                                    if (param1 == 8211) {
                                                      var2 = -106;
                                                      return (byte) var2;
                                                    } else {
                                                      if (8212 != param1) {
                                                        if (param1 != 732) {
                                                          if (8482 == param1) {
                                                            var2 = -103;
                                                            return (byte) var2;
                                                          } else {
                                                            if (param1 != 353) {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                                return (byte) var2;
                                                              } else {
                                                                if (param1 != 339) {
                                                                  if (param1 != 382) {
                                                                    if (param1 != 376) {
                                                                      var2 = 63;
                                                                      return (byte) var2;
                                                                    } else {
                                                                      var2 = -97;
                                                                      return (byte) var2;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  var2 = -100;
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -116;
                                        break L1;
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  break L1;
                                }
                              } else {
                                var2 = -120;
                                break L1;
                              }
                            } else {
                              var2 = -121;
                              break L1;
                            }
                          } else {
                            var2 = -122;
                            break L1;
                          }
                        }
                      }
                    } else {
                      var2 = -125;
                      break L1;
                    }
                  } else {
                    var2 = -126;
                    break L1;
                  }
                }
              }
              return (byte) var2;
            }
          } else {
            var2 = (byte)param1;
            return (byte) var2;
          }
        } else {
          L2: {
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (param1 > 255) {
                  break L3;
                } else {
                  var2 = (byte)param1;
                  break L2;
                }
              }
            }
            if (8364 == param1) {
              var2 = -128;
              break L2;
            } else {
              if (param1 != 8218) {
                if (param1 != 402) {
                  if (param1 == 8222) {
                    var2 = -124;
                    return (byte) var2;
                  } else {
                    if (param1 == 8230) {
                      var2 = -123;
                      return (byte) var2;
                    } else {
                      if (param1 != 8224) {
                        if (param1 != 8225) {
                          if (param1 != 710) {
                            if (8240 != param1) {
                              if (param1 == 352) {
                                var2 = -118;
                                return (byte) var2;
                              } else {
                                if (param1 == 8249) {
                                  var2 = -117;
                                  return (byte) var2;
                                } else {
                                  if (338 != param1) {
                                    if (param1 == 381) {
                                      var2 = -114;
                                      return (byte) var2;
                                    } else {
                                      if (8216 == param1) {
                                        var2 = -111;
                                        return (byte) var2;
                                      } else {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (8221 == param1) {
                                              var2 = -108;
                                              break L2;
                                            } else {
                                              if (param1 != 8226) {
                                                if (param1 == 8211) {
                                                  var2 = -106;
                                                  break L2;
                                                } else {
                                                  if (8212 != param1) {
                                                    if (param1 != 732) {
                                                      if (8482 == param1) {
                                                        var2 = -103;
                                                        break L2;
                                                      } else {
                                                        if (param1 != 353) {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                            break L2;
                                                          } else {
                                                            if (param1 != 339) {
                                                              if (param1 != 382) {
                                                                if (param1 != 376) {
                                                                  var2 = 63;
                                                                  break L2;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var2 = -107;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var2 = -109;
                                            break L2;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -116;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              var2 = -119;
                              break L2;
                            }
                          } else {
                            var2 = -120;
                            break L2;
                          }
                        } else {
                          var2 = -121;
                          break L2;
                        }
                      } else {
                        var2 = -122;
                        break L2;
                      }
                    }
                  }
                } else {
                  var2 = -125;
                  break L2;
                }
              } else {
                var2 = -126;
                break L2;
              }
            }
          }
          return (byte) var2;
        }
    }

    vb(int param0) {
        int var2 = 0;
        vh var3 = null;
        ((vb) this).field_g = param0;
        ((vb) this).field_h = new vh[param0];
        for (var2 = 0; var2 < param0; var2++) {
            vh dupTemp$0 = new vh();
            var3 = dupTemp$0;
            ((vb) this).field_h[var2] = dupTemp$0;
            var3.field_i = var3;
            var3.field_o = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Keyboard shortcuts", "EQUIP SCREEN", "<col=fcfe7f>Arrow keys -</col> Switch soldiers", "INGAME", "<col=fcfe7f>-</col> Toggle schematic mode", "<col=fcfe7f>-</col> Toggle minimap", "<col=fcfe7f>-</col> Toggle icons", "<col=fcfe7f>-</col> Toggle names", "<col=fcfe7f>-</col> Activate sprint mode", "<col=fcfe7f>-</col> Reload selected weapon", "<col=fcfe7f>-</col> Next soldier", "<col=fcfe7f>-</col> Centre on soldier", "<col=fcfe7f>-</col> Cycles through visible enemies", "<col=fcfe7f>-</col> Toggle autofire mode", "<col=fcfe7f>-</col> Toggle grenade mode", "<col=fcfe7f>-</col> Turn to face cursor", "<col=fcfe7f>-</col> Change levels", "<col=fcfe7f>Arrow keys -</col> Scroll map", "<col=fcfe7f>-</col> Return to walk mode"};
        field_i = 25;
        field_e = "Map Key";
        field_c = "You cannot save before the final mission.";
        field_a = "Waiting for fonts";
    }
}

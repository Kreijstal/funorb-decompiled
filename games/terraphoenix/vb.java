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
        vh var2Lifetime1;
        vh var3Lifetime1;
        if (this.field_d == null) {
          return null;
        }
        if (param0 >= -9) {
          this.a(true, (vh) null, -18L);
          var2 = this.field_h[(int)(this.field_b & (long)(-1 + this.field_g))];
          while (var2 != this.field_d) {
            if (~this.field_d.field_m == ~this.field_b) {
              var3 = this.field_d;
              this.field_d = this.field_d.field_o;
              return var3;
            }
            this.field_d = this.field_d.field_o;
          }
          this.field_d = null;
          return null;
        }
        var2Lifetime1 = this.field_h[(int)(this.field_b & (long)(-1 + this.field_g))];
        while (var2Lifetime1 != this.field_d) {
          if (~this.field_d.field_m == ~this.field_b) {
            var3Lifetime1 = this.field_d;
            this.field_d = this.field_d.field_o;
            return var3Lifetime1;
          }
          this.field_d = this.field_d.field_o;
        }
        this.field_d = null;
        return null;
    }

    final static String b(byte param0) {
        if (uh.field_H < 2) {
          return c.field_i;
        }
        if (param0 != -27) {
          vb.a(-69);
        }
        if (bl.field_a != null) {
          if (!bl.field_a.a(0)) {
            return si.field_hb;
          }
          return qb.field_e;
        }
        if (!bi.field_d.a(0)) {
          return be.field_w;
        }
        if (!bi.field_d.a(-3, "commonui")) {
          return bl.field_d + " - " + bi.field_d.b(-120, "commonui") + "%";
        }
        if (!ph.field_q.a(0)) {
          return field_a;
        }
        if (!ph.field_q.a(-3, "commonui")) {
          return ki.field_S + " - " + ph.field_q.b(param0 ^ 120, "commonui") + "%";
        }
        if (!ch.field_g.a(param0 ^ -27)) {
          return jj.field_d;
        }
        if (ch.field_g.b((byte) -128)) {
          return vd.field_o;
        }
        return li.field_b + " - " + ch.field_g.a((byte) 127) + "%";
    }

    final static boolean a(int param0) {
        if (param0 != -353) {
          return false;
        }
        return i.field_a.a(true);
    }

    final vh a(int param0, long param1) {
        vh var5 = null;
        int var6 = Terraphoenix.field_V;
        this.field_b = param1;
        vh var4 = this.field_h[(int)((long)(this.field_g - 1) & param1)];
        this.field_d = var4.field_o;
        while (var4 != this.field_d) {
          if (~param1 == ~this.field_d.field_m) {
            var5 = this.field_d;
            this.field_d = this.field_d.field_o;
            return var5;
          }
          this.field_d = this.field_d.field_o;
        }
        if (param0 < 25) {
          this.field_g = 79;
          this.field_d = null;
          return null;
        }
        this.field_d = null;
        return null;
    }

    final void a(boolean param0, vh param1, long param2) {
        vh var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param1.field_i) {
            param1.c((byte) 13);
          }
          var5 = this.field_h[(int)((long)(-1 + this.field_g) & param2)];
          param1.field_i = var5.field_i;
          param1.field_o = var5;
          param1.field_i.field_o = param1;
          param1.field_o.field_i = param1;
          param1.field_m = param2;
          if (param0) {
            field_i = -113;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("vb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 <= 46) {
          field_c = (String) null;
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        }
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var3 = Terraphoenix.field_V;
        if (param0 != -128) {
          return (byte) -25;
        }
        if (param1 <= 0) {
          if (param1 >= 160 &&
            param1 <= 255) {
            var2 = (byte)param1;
          } else {
            if (8364 == param1) {
              var2 = -128;
            } else {
              if (param1 != 8218) {
                if (param1 != 402) {
                  if (param1 == 8222) {
                    var2 = -124;
                    return (byte) var2;
                  }
                  if (param1 == 8230) {
                    var2 = -123;
                    return (byte) var2;
                  }
                  if (param1 != 8224) {
                    if (param1 != 8225) {
                      if (param1 != 710) {
                        if (8240 != param1) {
                          if (param1 == 352) {
                            var2 = -118;
                            return (byte) var2;
                          }
                          if (param1 == 8249) {
                            var2 = -117;
                            return (byte) var2;
                          }
                          if (338 != param1) {
                            if (param1 == 381) {
                              var2 = -114;
                              return (byte) var2;
                            }
                            if (8216 == param1) {
                              var2 = -111;
                              return (byte) var2;
                            }
                            if (param1 != 8217) {
                              if (param1 != 8220) {
                                if (8221 == param1) {
                                  var2 = -108;
                                } else {
                                  if (param1 != 8226) {
                                    if (param1 == 8211) {
                                      var2 = -106;
                                    } else {
                                      if (8212 != param1) {
                                        if (param1 != 732) {
                                          if (8482 == param1) {
                                            var2 = -103;
                                          } else {
                                            if (param1 != 353) {
                                              if (param1 == 8250) {
                                                var2 = -101;
                                              } else {
                                                if (param1 != 339) {
                                                  if (param1 != 382) {
                                                    var2 = (param1 != 376) ? 63 : -97;
                                                  } else {
                                                    var2 = -98;
                                                  }
                                                } else {
                                                  var2 = -100;
                                                }
                                              }
                                            } else {
                                              var2 = -102;
                                            }
                                          }
                                        } else {
                                          var2 = -104;
                                        }
                                      } else {
                                        var2 = -105;
                                      }
                                    }
                                  } else {
                                    var2 = -107;
                                  }
                                }
                              } else {
                                var2 = -109;
                              }
                            } else {
                              var2 = -110;
                            }
                          } else {
                            var2 = -116;
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
                    var2 = -122;
                  }
                } else {
                  var2 = -125;
                }
              } else {
                var2 = -126;
              }
            }
          }
          return (byte) var2;
        }
        if (param1 < 128) {
          var2Lifetime1 = (byte)param1;
          return (byte) var2Lifetime1;
        }
        if (param1 >= 160 &&
          param1 <= 255) {
          var2Lifetime2 = (byte)param1;
          return (byte) var2Lifetime2;
        }
        if (8364 == param1) {
          var2Lifetime3 = -128;
        } else {
          if (param1 != 8218) {
            if (param1 != 402) {
              if (param1 == 8222) {
                var2Lifetime3 = -124;
              } else {
                if (param1 == 8230) {
                  var2Lifetime3 = -123;
                } else {
                  if (param1 != 8224) {
                    if (param1 != 8225) {
                      if (param1 != 710) {
                        if (8240 != param1) {
                          if (param1 == 352) {
                            var2Lifetime3 = -118;
                          } else {
                            if (param1 == 8249) {
                              var2Lifetime3 = -117;
                            } else {
                              if (338 != param1) {
                                if (param1 == 381) {
                                  var2Lifetime3 = -114;
                                } else {
                                  if (8216 == param1) {
                                    var2Lifetime3 = -111;
                                  } else {
                                    if (param1 != 8217) {
                                      if (param1 != 8220) {
                                        if (8221 == param1) {
                                          var2Lifetime3 = -108;
                                        } else {
                                          if (param1 != 8226) {
                                            if (param1 == 8211) {
                                              var2Lifetime3 = -106;
                                            } else {
                                              if (8212 != param1) {
                                                if (param1 != 732) {
                                                  if (8482 == param1) {
                                                    var2Lifetime3 = -103;
                                                  } else {
                                                    if (param1 != 353) {
                                                      if (param1 == 8250) {
                                                        var2Lifetime3 = -101;
                                                      } else {
                                                        if (param1 != 339) {
                                                          if (param1 != 382) {
                                                            if (param1 != 376) {
                                                              var2Lifetime3 = 63;
                                                            } else {
                                                              var2Lifetime3 = -97;
                                                            }
                                                          } else {
                                                            var2Lifetime3 = -98;
                                                          }
                                                        } else {
                                                          var2Lifetime3 = -100;
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime3 = -102;
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime3 = -104;
                                                }
                                              } else {
                                                var2Lifetime3 = -105;
                                              }
                                            }
                                          } else {
                                            var2Lifetime3 = -107;
                                          }
                                        }
                                      } else {
                                        var2Lifetime3 = -109;
                                      }
                                    } else {
                                      var2Lifetime3 = -110;
                                    }
                                  }
                                }
                              } else {
                                var2Lifetime3 = -116;
                              }
                            }
                          }
                        } else {
                          var2Lifetime3 = -119;
                        }
                      } else {
                        var2Lifetime3 = -120;
                      }
                    } else {
                      var2Lifetime3 = -121;
                    }
                  } else {
                    var2Lifetime3 = -122;
                  }
                }
              }
            } else {
              var2Lifetime3 = -125;
            }
          } else {
            var2Lifetime3 = -126;
          }
        }
        return (byte) var2Lifetime3;
    }

    vb(int param0) {
        int var2 = 0;
        vh dupTemp$0 = null;
        vh var3 = null;
        this.field_g = param0;
        this.field_h = new vh[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new vh();
          var3 = dupTemp$0;
          this.field_h[var2] = dupTemp$0;
          var3.field_i = var3;
          var3.field_o = var3;
        }
    }

    static {
        field_f = new String[]{"Keyboard shortcuts", "EQUIP SCREEN", "<col=fcfe7f>Arrow keys -</col> Switch soldiers", "INGAME", "<col=fcfe7f>-</col> Toggle schematic mode", "<col=fcfe7f>-</col> Toggle minimap", "<col=fcfe7f>-</col> Toggle icons", "<col=fcfe7f>-</col> Toggle names", "<col=fcfe7f>-</col> Activate sprint mode", "<col=fcfe7f>-</col> Reload selected weapon", "<col=fcfe7f>-</col> Next soldier", "<col=fcfe7f>-</col> Centre on soldier", "<col=fcfe7f>-</col> Cycles through visible enemies", "<col=fcfe7f>-</col> Toggle autofire mode", "<col=fcfe7f>-</col> Toggle grenade mode", "<col=fcfe7f>-</col> Turn to face cursor", "<col=fcfe7f>-</col> Change levels", "<col=fcfe7f>Arrow keys -</col> Scroll map", "<col=fcfe7f>-</col> Return to walk mode"};
        field_i = 25;
        field_e = "Map Key";
        field_c = "You cannot save before the final mission.";
        field_a = "Waiting for fonts";
    }
}

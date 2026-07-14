/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lf {
    int field_a;
    private b field_e;
    int field_d;
    int field_c;
    int field_b;

    final static void a(byte param0) {
        bd var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oj var6 = null;
        int var7 = 0;
        int var8 = 0;
        bd var9 = null;
        bd stackIn_5_0 = null;
        Object stackOut_4_0 = null;
        bd stackOut_3_0 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var4 = -61 / ((-66 - param0) / 51);
        var5 = 0;
        L0: while (true) {
          if (var5 >= el.field_j) {
            return;
          } else {
            L1: {
              var6 = mm.field_m[var5];
              if (!var6.field_b) {
                stackOut_4_0 = null;
                stackIn_5_0 = (bd) (Object) stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var6.g(-28);
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var9 = stackIn_5_0;
            var1 = var9;
            if (var1 != null) {
              var2 = var6.f((byte) 120);
              var3 = var6.f(121);
              if (var2 >= -96) {
                if (var3 >= -96) {
                  if (-737 <= (var2 ^ -1)) {
                    if (576 >= var3) {
                      kf.a(eh.field_a.field_D, 0, eh.field_a.field_D.length);
                      eh.field_a.a();
                      var9.a(true, 128, (int)var6.field_c, 48, 48);
                      var7 = 0;
                      L2: while (true) {
                        if (eh.field_a.field_D.length <= var7) {
                          eh.field_a.e(1);
                          si.d(32, 32, 0, 0, eh.field_a.field_u, eh.field_a.field_r);
                          o.field_n.b((byte) -98);
                          eh.field_a.b(var2 + -12 - 48, -48 + (-12 + var3), 92);
                          var5++;
                          continue L0;
                        } else {
                          if (eh.field_a.field_D[var7] != 0) {
                            eh.field_a.field_D[var7] = 1;
                            var7++;
                            continue L2;
                          } else {
                            var7++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    void a(int param0, int param1, oj param2) {
        if (param1 != 576) {
            Object var5 = null;
            ((lf) this).a(49, 28, (oj) null);
        }
        if (((lf) this).field_c == param0) {
            // if_icmple L81
            ((lf) this).field_d = ((lf) this).field_d + 1;
        } else {
            if (!(((lf) this).field_d <= ((lf) this).field_b)) {
                ((lf) this).field_d = ((lf) this).field_d - 1;
            }
        }
    }

    final void a(int param0) {
        if (null != ((lf) this).field_e) {
            eh.field_c.a((tj) (Object) ((lf) this).field_e);
            ((lf) this).field_e = null;
        }
        if (param0 != 18421) {
            ((lf) this).field_e = null;
        }
    }

    lf(int param0, int param1, int param2) {
        ((lf) this).field_a = param2;
        ((lf) this).field_c = param0;
        ((lf) this).field_b = param1;
        ((lf) this).field_d = ((lf) this).field_b;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 80 % ((param0 - 32) / 39);
        im.field_e.a(0, 0, (byte) 126);
    }

    lf() {
    }

    final void b(int param0) {
        if (-1 <= (((lf) this).field_d ^ -1)) {
            // ifnull L121
            eh.field_c.a((tj) (Object) ((lf) this).field_e);
            ((lf) this).field_e = null;
        } else {
            if (null == ((lf) this).field_e) {
                if (null != ua.field_c) {
                    if (-1 + ua.field_c.length > ((lf) this).field_c) {
                        if (!(null == ua.field_c[-1 + ((lf) this).field_c])) {
                            ((lf) this).field_e = b.a(ua.field_c[-1 + ((lf) this).field_c], 100, ((lf) this).field_d);
                            ((lf) this).field_e.d(-1);
                            eh.field_c.b((tj) (Object) ((lf) this).field_e);
                        }
                    }
                }
            }
        }
        if (param0 <= 25) {
            lf.a((byte) -50);
        }
        if (!(((lf) this).field_e == null)) {
            ((lf) this).field_e.f(((lf) this).field_d * uh.field_i / 64);
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var2 = param1.length();
        var3 = new byte[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            if (param0 == 113) {
              return var3;
            } else {
              return null;
            }
          } else {
            L1: {
              L2: {
                L3: {
                  var5 = param1.charAt(var4);
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
                        if (var5 != 8230) {
                          if (var5 != 8224) {
                            if (8225 == var5) {
                              var3[var4] = (byte)-121;
                              break L1;
                            } else {
                              if (var5 == 710) {
                                var3[var4] = (byte)-120;
                                break L1;
                              } else {
                                if (8240 != var5) {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L1;
                                  } else {
                                    if (8249 == var5) {
                                      var3[var4] = (byte)-117;
                                      break L1;
                                    } else {
                                      if (338 == var5) {
                                        var3[var4] = (byte)-116;
                                        break L1;
                                      } else {
                                        if (381 == var5) {
                                          var3[var4] = (byte)-114;
                                          break L1;
                                        } else {
                                          if (8216 != var5) {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L1;
                                            } else {
                                              if (8220 != var5) {
                                                if (8221 != var5) {
                                                  if (8226 == var5) {
                                                    var3[var4] = (byte)-107;
                                                    break L1;
                                                  } else {
                                                    if (8211 != var5) {
                                                      if (var5 != 8212) {
                                                        if (var5 != 732) {
                                                          if (var5 != 8482) {
                                                            if (var5 != 353) {
                                                              if (8250 != var5) {
                                                                if (var5 == 339) {
                                                                  var3[var4] = (byte)-100;
                                                                  break L1;
                                                                } else {
                                                                  if (var5 != 382) {
                                                                    if (var5 == 376) {
                                                                      var3[var4] = (byte)-97;
                                                                      break L1;
                                                                    } else {
                                                                      var3[var4] = (byte)63;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L1;
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
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-106;
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L1;
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L1;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-111;
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-119;
                                  break L1;
                                }
                              }
                            }
                          } else {
                            var3[var4] = (byte)-122;
                            break L1;
                          }
                        } else {
                          var3[var4] = (byte)-123;
                          break L1;
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
              break L1;
            }
            var4++;
            continue L0;
          }
        }
    }

    static {
    }
}

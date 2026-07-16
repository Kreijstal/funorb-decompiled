/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends sh implements ta {
    private qh field_Ab;
    static long field_Gb;
    static mg field_Eb;
    static String field_Cb;
    private boolean field_Fb;
    private boolean field_Bb;
    static boolean field_Db;

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        if (((b) this).field_Bb) {
          vc.a(true, false, -16113);
          return;
        } else {
          L0: {
            ul.a(param0 + 3344);
            ((b) this).h(true);
            if (param0 == 12085) {
              break L0;
            } else {
              boolean discarded$2 = ((b) this).f(59);
              break L0;
            }
          }
          return;
        }
    }

    final void l(int param0) {
        if (param0 >= -85) {
          ((b) this).field_Bb = false;
          this.a(lc.a(248, ma.field_d, 29493), true, 113);
          return;
        } else {
          this.a(lc.a(248, ma.field_d, 29493), true, 113);
          return;
        }
    }

    b(je param0, qh param1) {
        super(param0, on.field_b, aj.field_e, false, false);
        ((b) this).field_Ab = param1;
    }

    final static mg[] a(String param0, eh param1, int param2, String param3) {
        mg[] var5 = ke.a(32, param1, param0, param3);
        mg[] var4 = var5;
        var5[3].field_z = var5[3].field_p;
        var5[1].field_u = var5[1].field_w;
        var5[5].field_z = var5[5].field_p;
        var5[param2].field_u = var5[7].field_w;
        return var4;
    }

    public static void j(byte param0) {
        field_Cb = null;
        if (param0 != -22) {
            field_Gb = 0L;
            field_Eb = null;
            return;
        }
        field_Eb = null;
    }

    private final void a(ck param0, boolean param1, int param2) {
        String var4 = null;
        sf var5 = null;
        int var6 = 0;
        sf var7 = null;
        String var8 = null;
        sf var9 = null;
        sf var10 = null;
        String var11 = null;
        sf var12 = null;
        sf var15 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        ((b) this).field_Fb = true;
        if (param2 > 97) {
          L0: {
            L1: {
              if (param0.field_a) {
                break L1;
              } else {
                L2: {
                  if (param0.field_b == null) {
                    break L2;
                  } else {
                    var8 = dm.field_t;
                    if (null != ((b) this).field_Ab) {
                      ((b) this).field_Ab.a((byte) -72);
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var10 = new sf((sh) this, on.field_b, var8);
                        if (!param0.field_a) {
                          if (((b) this).field_Bb) {
                            tg discarded$18 = var10.a((cd) this, 260, md.field_c);
                            if (-4 == (param0.field_g ^ -1)) {
                              var10.a(7, qh.field_N, (byte) 127);
                              ((b) this).b((fi) (Object) var10, (byte) -53);
                              return;
                            } else {
                              if (param0.field_g != 6) {
                                ((b) this).b((fi) (Object) var10, (byte) -53);
                                return;
                              } else {
                                var10.a(9, o.field_f, (byte) 126);
                                var10.a(7, qh.field_N, (byte) 127);
                                ((b) this).b((fi) (Object) var10, (byte) -53);
                                return;
                              }
                            }
                          } else {
                            if (param0.field_g != 5) {
                              var10.a(-1, jl.field_D, (byte) 127);
                              tg discarded$19 = var10.a((cd) this, 260, md.field_c);
                              if (-4 == (param0.field_g ^ -1)) {
                                var10.a(7, qh.field_N, (byte) 127);
                                ((b) this).b((fi) (Object) var10, (byte) -53);
                                return;
                              } else {
                                if (param0.field_g != 6) {
                                  ((b) this).b((fi) (Object) var10, (byte) -53);
                                  return;
                                } else {
                                  var10.a(9, o.field_f, (byte) 126);
                                  ((b) this).b((fi) (Object) var10, (byte) -53);
                                  return;
                                }
                              }
                            } else {
                              var10.a(11, rn.field_g, (byte) 126);
                              var10.a(17, og.field_k, (byte) 127);
                              var10.a(-1, jl.field_D, (byte) 127);
                              tg discarded$20 = var10.a((cd) this, 260, md.field_c);
                              if (-4 == (param0.field_g ^ -1)) {
                                var10.a(7, qh.field_N, (byte) 127);
                                ((b) this).b((fi) (Object) var10, (byte) -53);
                                return;
                              } else {
                                if (param0.field_g != 6) {
                                  ((b) this).b((fi) (Object) var10, (byte) -53);
                                  return;
                                } else {
                                  var10.a(9, o.field_f, (byte) 126);
                                  var10.a(7, qh.field_N, (byte) 127);
                                  ((b) this).b((fi) (Object) var10, (byte) -53);
                                  return;
                                }
                              }
                            }
                          }
                        } else {
                          if (!param0.field_d) {
                            tg discarded$21 = var10.a((cd) this, 260, md.field_c);
                            ((b) this).b((fi) (Object) var10, (byte) -53);
                            return;
                          } else {
                            ((b) this).b((fi) (Object) new ok((b) this), (byte) -53);
                            return;
                          }
                        }
                      }
                    } else {
                      L3: {
                        var9 = new sf((sh) this, on.field_b, var8);
                        if (!param0.field_a) {
                          break L3;
                        } else {
                          if (!param0.field_d) {
                            tg discarded$22 = var9.a((cd) this, 260, md.field_c);
                            if (var6 != 0) {
                              break L3;
                            } else {
                              ((b) this).b((fi) (Object) var9, (byte) -53);
                              return;
                            }
                          } else {
                            ((b) this).b((fi) (Object) new ok((b) this), (byte) -53);
                            return;
                          }
                        }
                      }
                      L4: {
                        if (((b) this).field_Bb) {
                          tg discarded$23 = var9.a((cd) this, 260, md.field_c);
                          break L4;
                        } else {
                          L5: {
                            if (param0.field_g != 5) {
                              break L5;
                            } else {
                              var9.a(11, rn.field_g, (byte) 126);
                              var9.a(17, og.field_k, (byte) 127);
                              break L5;
                            }
                          }
                          var9.a(-1, jl.field_D, (byte) 127);
                          tg discarded$24 = var9.a((cd) this, 260, md.field_c);
                          break L4;
                        }
                      }
                      if (-4 == (param0.field_g ^ -1)) {
                        var9.a(7, qh.field_N, (byte) 127);
                        ((b) this).b((fi) (Object) var9, (byte) -53);
                        return;
                      } else {
                        if (param0.field_g == 6) {
                          var9.a(9, o.field_f, (byte) 126);
                          var9.a(7, qh.field_N, (byte) 127);
                          ((b) this).b((fi) (Object) var9, (byte) -53);
                          return;
                        } else {
                          ((b) this).b((fi) (Object) var9, (byte) -53);
                          return;
                        }
                      }
                    }
                  }
                }
                var11 = param0.field_e;
                var4 = var11;
                if (-249 == (param0.field_g ^ -1)) {
                  L6: {
                    if (!param1) {
                      mj.f(0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((b) this).field_Bb = true;
                  var4 = ma.field_d;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  L7: {
                    var12 = new sf((sh) this, on.field_b, var11);
                    var5 = var12;
                    if (!param0.field_a) {
                      break L7;
                    } else {
                      if (!param0.field_d) {
                        tg discarded$25 = var12.a((cd) this, 260, md.field_c);
                        if (var6 != 0) {
                          break L7;
                        } else {
                          ((b) this).b((fi) (Object) var5, (byte) -53);
                          return;
                        }
                      } else {
                        ((b) this).b((fi) (Object) new ok((b) this), (byte) -53);
                        return;
                      }
                    }
                  }
                  if (((b) this).field_Bb) {
                    tg discarded$26 = var12.a((cd) this, 260, md.field_c);
                    if (-4 == (param0.field_g ^ -1)) {
                      var12.a(7, qh.field_N, (byte) 127);
                      ((b) this).b((fi) (Object) var12, (byte) -53);
                      return;
                    } else {
                      if (param0.field_g != 6) {
                        ((b) this).b((fi) (Object) var12, (byte) -53);
                        return;
                      } else {
                        var12.a(9, o.field_f, (byte) 126);
                        var12.a(7, qh.field_N, (byte) 127);
                        ((b) this).b((fi) (Object) var12, (byte) -53);
                        return;
                      }
                    }
                  } else {
                    if (param0.field_g == 5) {
                      var12.a(11, rn.field_g, (byte) 126);
                      var12.a(17, og.field_k, (byte) 127);
                      if (var6 == 0) {
                        if (-4 == (param0.field_g ^ -1)) {
                          var12.a(7, qh.field_N, (byte) 127);
                          ((b) this).b((fi) (Object) var5, (byte) -53);
                          return;
                        } else {
                          if (param0.field_g != 6) {
                            ((b) this).b((fi) (Object) var5, (byte) -53);
                            return;
                          } else {
                            var12.a(9, o.field_f, (byte) 126);
                            if (var6 == 0) {
                              ((b) this).b((fi) (Object) var5, (byte) -53);
                              return;
                            } else {
                              var12.a(7, qh.field_N, (byte) 127);
                              ((b) this).b((fi) (Object) var5, (byte) -53);
                              return;
                            }
                          }
                        }
                      } else {
                        var12.a(-1, jl.field_D, (byte) 127);
                        tg discarded$27 = var12.a((cd) this, 260, md.field_c);
                        if (-4 == (param0.field_g ^ -1)) {
                          var12.a(7, qh.field_N, (byte) 127);
                          ((b) this).b((fi) (Object) var5, (byte) -53);
                          return;
                        } else {
                          if (param0.field_g != 6) {
                            ((b) this).b((fi) (Object) var5, (byte) -53);
                            return;
                          } else {
                            var12.a(9, o.field_f, (byte) 126);
                            if (var6 != 0) {
                              var12.a(7, qh.field_N, (byte) 127);
                              ((b) this).b((fi) (Object) var5, (byte) -53);
                              return;
                            } else {
                              ((b) this).b((fi) (Object) var5, (byte) -53);
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L8: {
                        var12.a(-1, jl.field_D, (byte) 127);
                        if (var6 == 0) {
                          break L8;
                        } else {
                          tg discarded$28 = var12.a((cd) this, 260, md.field_c);
                          break L8;
                        }
                      }
                      if (-4 == (param0.field_g ^ -1)) {
                        var12.a(7, qh.field_N, (byte) 127);
                        ((b) this).b((fi) (Object) var12, (byte) -53);
                        return;
                      } else {
                        if (param0.field_g == 6) {
                          var12.a(9, o.field_f, (byte) 126);
                          if (var6 != 0) {
                            var12.a(7, qh.field_N, (byte) 127);
                            ((b) this).b((fi) (Object) var12, (byte) -53);
                            return;
                          } else {
                            ((b) this).b((fi) (Object) var12, (byte) -53);
                            return;
                          }
                        } else {
                          ((b) this).b((fi) (Object) var12, (byte) -53);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            var4 = ha.field_e;
            break L0;
          }
          L9: {
            var15 = new sf((sh) this, on.field_b, var4);
            var5 = var15;
            if (!param0.field_a) {
              break L9;
            } else {
              if (!param0.field_d) {
                tg discarded$29 = var15.a((cd) this, 260, md.field_c);
                if (var6 == 0) {
                  ((b) this).b((fi) (Object) var15, (byte) -53);
                  return;
                } else {
                  break L9;
                }
              } else {
                ((b) this).b((fi) (Object) new ok((b) this), (byte) -53);
                return;
              }
            }
          }
          if (((b) this).field_Bb) {
            tg discarded$30 = var15.a((cd) this, 260, md.field_c);
            if (-4 == (param0.field_g ^ -1)) {
              var15.a(7, qh.field_N, (byte) 127);
              ((b) this).b((fi) (Object) var15, (byte) -53);
              return;
            } else {
              if (param0.field_g != 6) {
                ((b) this).b((fi) (Object) var15, (byte) -53);
                return;
              } else {
                var15.a(9, o.field_f, (byte) 126);
                if (var6 == 0) {
                  ((b) this).b((fi) (Object) var15, (byte) -53);
                  return;
                } else {
                  var15.a(7, qh.field_N, (byte) 127);
                  ((b) this).b((fi) (Object) var15, (byte) -53);
                  return;
                }
              }
            }
          } else {
            if (param0.field_g != 5) {
              var15.a(-1, jl.field_D, (byte) 127);
              if (var6 != 0) {
                tg discarded$31 = var15.a((cd) this, 260, md.field_c);
                if (-4 == (param0.field_g ^ -1)) {
                  var15.a(7, qh.field_N, (byte) 127);
                  ((b) this).b((fi) (Object) var15, (byte) -53);
                  return;
                } else {
                  if (param0.field_g != 6) {
                    ((b) this).b((fi) (Object) var15, (byte) -53);
                    return;
                  } else {
                    var15.a(9, o.field_f, (byte) 126);
                    if (var6 == 0) {
                      ((b) this).b((fi) (Object) var15, (byte) -53);
                      return;
                    } else {
                      var15.a(7, qh.field_N, (byte) 127);
                      ((b) this).b((fi) (Object) var15, (byte) -53);
                      return;
                    }
                  }
                }
              } else {
                if (-4 == (param0.field_g ^ -1)) {
                  var15.a(7, qh.field_N, (byte) 127);
                  ((b) this).b((fi) (Object) var15, (byte) -53);
                  return;
                } else {
                  if (param0.field_g != 6) {
                    ((b) this).b((fi) (Object) var15, (byte) -53);
                    return;
                  } else {
                    var15.a(9, o.field_f, (byte) 126);
                    if (var6 == 0) {
                      ((b) this).b((fi) (Object) var15, (byte) -53);
                      return;
                    } else {
                      var15.a(7, qh.field_N, (byte) 127);
                      ((b) this).b((fi) (Object) var15, (byte) -53);
                      return;
                    }
                  }
                }
              }
            } else {
              var15.a(11, rn.field_g, (byte) 126);
              var15.a(17, og.field_k, (byte) 127);
              if (var6 != 0) {
                var15.a(-1, jl.field_D, (byte) 127);
                tg discarded$32 = var15.a((cd) this, 260, md.field_c);
                if (-4 == (param0.field_g ^ -1)) {
                  var15.a(7, qh.field_N, (byte) 127);
                  ((b) this).b((fi) (Object) var15, (byte) -53);
                  return;
                } else {
                  if (param0.field_g != 6) {
                    ((b) this).b((fi) (Object) var15, (byte) -53);
                    return;
                  } else {
                    var15.a(9, o.field_f, (byte) 126);
                    var15.a(7, qh.field_N, (byte) 127);
                    ((b) this).b((fi) (Object) var15, (byte) -53);
                    return;
                  }
                }
              } else {
                if (-4 == (param0.field_g ^ -1)) {
                  var15.a(7, qh.field_N, (byte) 127);
                  ((b) this).b((fi) (Object) var15, (byte) -53);
                  return;
                } else {
                  if (param0.field_g != 6) {
                    ((b) this).b((fi) (Object) var15, (byte) -53);
                    return;
                  } else {
                    var15.a(9, o.field_f, (byte) 126);
                    if (var6 == 0) {
                      ((b) this).b((fi) (Object) var15, (byte) -53);
                      return;
                    } else {
                      var15.a(7, qh.field_N, (byte) 127);
                      ((b) this).b((fi) (Object) var15, (byte) -53);
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          L10: {
            L11: {
              ((b) this).field_Ab = null;
              if (param0.field_a) {
                break L11;
              } else {
                L12: {
                  if (param0.field_b == null) {
                    break L12;
                  } else {
                    var4 = dm.field_t;
                    if (null != ((b) this).field_Ab) {
                      ((b) this).field_Ab.a((byte) -72);
                      if (var6 == 0) {
                        break L10;
                      } else {
                        break L12;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                var4 = param0.field_e;
                if (-249 == (param0.field_g ^ -1)) {
                  L13: {
                    if (!param1) {
                      mj.f(0);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  ((b) this).field_Bb = true;
                  var4 = ma.field_d;
                  break L11;
                } else {
                  break L10;
                }
              }
            }
            var4 = ha.field_e;
            break L10;
          }
          L14: {
            var7 = new sf((sh) this, on.field_b, var4);
            if (!param0.field_a) {
              break L14;
            } else {
              if (!param0.field_d) {
                tg discarded$33 = var7.a((cd) this, 260, md.field_c);
                if (var6 != 0) {
                  break L14;
                } else {
                  ((b) this).b((fi) (Object) var7, (byte) -53);
                  return;
                }
              } else {
                ((b) this).b((fi) (Object) new ok((b) this), (byte) -53);
                return;
              }
            }
          }
          L15: {
            if (((b) this).field_Bb) {
              tg discarded$34 = var7.a((cd) this, 260, md.field_c);
              break L15;
            } else {
              L16: {
                if (param0.field_g != 5) {
                  break L16;
                } else {
                  var7.a(11, rn.field_g, (byte) 126);
                  var7.a(17, og.field_k, (byte) 127);
                  break L16;
                }
              }
              var7.a(-1, jl.field_D, (byte) 127);
              tg discarded$35 = var7.a((cd) this, 260, md.field_c);
              break L15;
            }
          }
          if (-4 == (param0.field_g ^ -1)) {
            var7.a(7, qh.field_N, (byte) 127);
            ((b) this).b((fi) (Object) var7, (byte) -53);
            return;
          } else {
            if (param0.field_g == 6) {
              var7.a(9, o.field_f, (byte) 126);
              var7.a(7, qh.field_N, (byte) 127);
              ((b) this).b((fi) (Object) var7, (byte) -53);
              return;
            } else {
              ((b) this).b((fi) (Object) var7, (byte) -53);
              return;
            }
          }
        }
    }

    final boolean f(int param0) {
        ck var2 = null;
        if (param0 == 3) {
          if (((b) this).field_G) {
            if (!((b) this).field_Fb) {
              var2 = cf.a((byte) -113);
              if (var2 == null) {
                return super.f(3);
              } else {
                this.a(var2, false, 120);
                return super.f(3);
              }
            } else {
              return super.f(3);
            }
          } else {
            return super.f(3);
          }
        } else {
          field_Gb = 49L;
          if (((b) this).field_G) {
            if (!((b) this).field_Fb) {
              var2 = cf.a((byte) -113);
              if (var2 == null) {
                return super.f(3);
              } else {
                this.a(var2, false, 120);
                return super.f(3);
              }
            } else {
              return super.f(3);
            }
          } else {
            return super.f(3);
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_51_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          var5 = param2 + param3;
          var6 = param4 + param0;
          if (df.field_i >= param2) {
            stackOut_2_0 = df.field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (df.field_g < param0) {
            stackOut_5_0 = param0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = df.field_g;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 < df.field_k) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = df.field_k;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var9 = stackIn_9_0;
        if (param1 > 1) {
          L3: {
            if (var6 < df.field_h) {
              stackOut_50_0 = var6;
              stackIn_51_0 = stackOut_50_0;
              break L3;
            } else {
              stackOut_49_0 = df.field_h;
              stackIn_51_0 = stackOut_49_0;
              break L3;
            }
          }
          L4: {
            L5: {
              L6: {
                L7: {
                  var10 = stackIn_51_0;
                  if (df.field_i > param2) {
                    break L7;
                  } else {
                    if (param2 >= df.field_k) {
                      break L7;
                    } else {
                      var11 = var8 * df.field_e - -param2;
                      var12 = -var8 + var10 + 1 >> 409501089;
                      L8: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L7;
                        } else {
                          df.field_d[var11] = 16777215;
                          var11 = var11 + df.field_e * 2;
                          if (var13 != 0) {
                            break L6;
                          } else {
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                }
                if (param0 < df.field_g) {
                  break L6;
                } else {
                  if (var6 >= df.field_h) {
                    break L6;
                  } else {
                    var11 = var7 + df.field_e * param0;
                    var12 = var9 + (1 + -var7) >> 50781825;
                    L9: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L6;
                      } else {
                        df.field_d[var11] = 16777215;
                        var11 += 2;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          continue L9;
                        }
                      }
                    }
                  }
                }
              }
              if (var5 < df.field_i) {
                break L5;
              } else {
                if (var5 >= df.field_k) {
                  break L5;
                } else {
                  var11 = (var8 - -(var5 + -param2 & 1)) * df.field_e - -var5;
                  var12 = -var8 + var10 + 1 >> -1704708319;
                  L10: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L5;
                    } else {
                      df.field_d[var11] = 16777215;
                      var11 = var11 + 2 * df.field_e;
                      if (var13 != 0) {
                        break L4;
                      } else {
                        if (var13 == 0) {
                          continue L10;
                        } else {
                          L11: {
                            if (df.field_g > param0) {
                              break L11;
                            } else {
                              if (var6 < df.field_h) {
                                var11 = (1 & var6 + -param0) + df.field_e * var6 + var7;
                                var12 = -var7 + 1 - -var9 >> 1225724801;
                                L12: while (true) {
                                  var12--;
                                  if (var12 < 0) {
                                    break L11;
                                  } else {
                                    df.field_d[var11] = 16777215;
                                    var11 += 2;
                                    if (var13 == 0) {
                                      continue L12;
                                    } else {
                                      return;
                                    }
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (df.field_g > param0) {
              break L4;
            } else {
              if (var6 < df.field_h) {
                var11 = (1 & var6 + -param0) + df.field_e * var6 + var7;
                var12 = -var7 + 1 - -var9 >> 1225724801;
                L13: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L4;
                  } else {
                    df.field_d[var11] = 16777215;
                    var11 += 2;
                    if (var13 == 0) {
                      continue L13;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L14: {
            field_Db = true;
            if (var6 < df.field_h) {
              stackOut_12_0 = var6;
              stackIn_13_0 = stackOut_12_0;
              break L14;
            } else {
              stackOut_11_0 = df.field_h;
              stackIn_13_0 = stackOut_11_0;
              break L14;
            }
          }
          L15: {
            L16: {
              var10 = stackIn_13_0;
              if (df.field_i > param2) {
                break L16;
              } else {
                if (param2 >= df.field_k) {
                  break L16;
                } else {
                  var11 = var8 * df.field_e - -param2;
                  var12 = -var8 + var10 + 1 >> 409501089;
                  L17: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L16;
                    } else {
                      df.field_d[var11] = 16777215;
                      var11 = var11 + df.field_e * 2;
                      if (var13 != 0) {
                        break L15;
                      } else {
                        if (var13 == 0) {
                          continue L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (param0 < df.field_g) {
              break L15;
            } else {
              if (var6 >= df.field_h) {
                break L15;
              } else {
                var11 = var7 + df.field_e * param0;
                var12 = var9 + (1 + -var7) >> 50781825;
                L18: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L15;
                  } else {
                    df.field_d[var11] = 16777215;
                    var11 += 2;
                    if (var13 == 0) {
                      continue L18;
                    } else {
                      break L15;
                    }
                  }
                }
              }
            }
          }
          L19: {
            if (var5 < df.field_i) {
              break L19;
            } else {
              if (var5 >= df.field_k) {
                break L19;
              } else {
                var11 = (var8 - -(var5 + -param2 & 1)) * df.field_e - -var5;
                var12 = -var8 + var10 + 1 >> -1704708319;
                L20: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L19;
                  } else {
                    df.field_d[var11] = 16777215;
                    var11 = var11 + 2 * df.field_e;
                    if (var13 == 0) {
                      continue L20;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
          if (df.field_g <= param0) {
            if (var6 < df.field_h) {
              var11 = (1 & var6 + -param0) + df.field_e * var6 + var7;
              var12 = -var7 + 1 - -var9 >> 1225724801;
              L21: while (true) {
                var12--;
                if (var12 >= 0) {
                  df.field_d[var11] = 16777215;
                  var11 += 2;
                  if (var13 == 0) {
                    continue L21;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Withdraw invitation to <%0> to join this game";
        field_Db = true;
    }
}

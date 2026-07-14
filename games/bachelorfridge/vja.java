/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vja extends ii {
    int field_q;
    boolean field_s;
    boolean field_r;
    int field_p;
    boolean field_n;
    eaa field_o;

    void a(byte param0, lu param1) {
        int var3 = 0;
        pp var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (param0 > -12) {
          L0: {
            ((vja) this).field_p = -45;
            var3 = ((vja) this).field_q;
            if (!((vja) this).field_r) {
              break L0;
            } else {
              var3 = var3 | 128;
              break L0;
            }
          }
          L1: {
            if (!((vja) this).field_n) {
              break L1;
            } else {
              var3 = var3 | 64;
              break L1;
            }
          }
          L2: {
            if (!((vja) this).field_s) {
              break L2;
            } else {
              var3 = var3 | 32;
              break L2;
            }
          }
          param1.d(var3, 0);
          param1.d(((vja) this).field_p, 0);
          param1.d(((vja) this).field_o.g(0), 0);
          var4 = (pp) (Object) ((vja) this).field_o.b((byte) 90);
          L3: while (true) {
            if (var4 == null) {
              return;
            } else {
              var4.a(param1, (byte) -80);
              var4 = (pp) (Object) ((vja) this).field_o.c(0);
              continue L3;
            }
          }
        } else {
          L4: {
            var3 = ((vja) this).field_q;
            if (!((vja) this).field_r) {
              break L4;
            } else {
              var3 = var3 | 128;
              break L4;
            }
          }
          L5: {
            if (!((vja) this).field_n) {
              break L5;
            } else {
              var3 = var3 | 64;
              break L5;
            }
          }
          L6: {
            if (!((vja) this).field_s) {
              break L6;
            } else {
              var3 = var3 | 32;
              break L6;
            }
          }
          param1.d(var3, 0);
          param1.d(((vja) this).field_p, 0);
          param1.d(((vja) this).field_o.g(0), 0);
          var4 = (pp) (Object) ((vja) this).field_o.b((byte) 90);
          L7: while (true) {
            if (var4 == null) {
              return;
            } else {
              var4.a(param1, (byte) -80);
              var4 = (pp) (Object) ((vja) this).field_o.c(0);
              continue L7;
            }
          }
        }
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param0;
        if (0 != var2) {
          if (param1 > -31) {
            L0: {
              vja.a((byte) 40, true);
              if (var2 < 128) {
                break L0;
              } else {
                if ((var2 ^ -1) <= -161) {
                  break L0;
                } else {
                  L1: {
                    var3 = on.field_s[var2 - 128];
                    if (0 != var3) {
                      break L1;
                    } else {
                      var3 = 63;
                      break L1;
                    }
                  }
                  var2 = var3;
                  break L0;
                }
              }
            }
            return (char)var2;
          } else {
            L2: {
              if (var2 < 128) {
                break L2;
              } else {
                if ((var2 ^ -1) <= -161) {
                  break L2;
                } else {
                  L3: {
                    var3 = on.field_s[var2 - 128];
                    if (0 != var3) {
                      break L3;
                    } else {
                      var3 = 63;
                      break L3;
                    }
                  }
                  var2 = var3;
                  break L2;
                }
              }
            }
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    vja(int param0, nq param1, int param2, int param3, boolean param4, boolean param5, boolean param6) {
        super(1, param0, param1);
        ((vja) this).field_n = param5 ? true : false;
        ((vja) this).field_p = param3;
        ((vja) this).field_r = param4 ? true : false;
        ((vja) this).field_q = param2;
        ((vja) this).field_s = param6 ? true : false;
        ((vja) this).field_o = new eaa();
    }

    at a(int param0, gj param1) {
        if (param0 == 5) {
          if (4 == ((t) (Object) al.a(-121, ((vja) this).field_k)).field_p) {
            return (at) (Object) new vla(param1, (vja) this);
          } else {
            return (at) (Object) new mv(param1, (vja) this);
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 < 84) {
          return;
        } else {
          L0: {
            if (null != jea.field_c) {
              dg.g(dg.field_f, dg.field_j, -dg.field_f + dg.field_h, dg.field_k + -dg.field_j);
              jea.field_c.a(param1, 7802);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    vja(int param0, lu param1) {
        super(1, param0, param1);
        int var3 = param1.b(16711935);
        ((vja) this).field_q = 7 & var3;
        ((vja) this).field_n = -1 != (64 & var3 ^ -1) ? true : false;
        ((vja) this).field_r = (var3 & 128) != 0 ? true : false;
        ((vja) this).field_s = (32 & var3) != 0 ? true : false;
        ((vja) this).field_p = param1.b(16711935);
        ((vja) this).field_o = new eaa();
        int var4 = param1.b(16711935);
        while (true) {
            var4--;
            if (var4 < 0) {
                break;
            }
            ((vja) this).field_o.a((bw) (Object) dca.a((byte) 102, param1), true);
        }
    }

    void a(op param0, boolean param1) {
        Object var4 = null;
        pp var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        aga var10 = null;
        aga var11 = null;
        aga var12 = null;
        aga var17 = null;
        aga var26 = null;
        var4 = null;
        var8 = BachelorFridge.field_y;
        if (!param1) {
          var17 = ((vja) this).field_l.a(20, param0);
          var10 = var17;
          if (var17.i(55)) {
            return;
          } else {
            L0: {
              if (0 != ((vja) this).field_q) {
                var17.field_s = ((vja) this).field_q;
                break L0;
              } else {
                break L0;
              }
            }
            var4_ref = (pp) (Object) ((vja) this).field_o.b((byte) 90);
            var17.d(((vja) this).field_k, (byte) -94);
            if (!((vja) this).field_r) {
              if (!((vja) this).field_n) {
                var5 = 0;
                L1: while (true) {
                  if (var4_ref == null) {
                    L2: {
                      if (0 == var5) {
                        if (((vja) this).field_k == 69) {
                          break L2;
                        } else {
                          if (((vja) this).field_k == -71) {
                            break L2;
                          } else {
                            L3: {
                              var6 = ((t) (Object) al.a(-67, ((vja) this).field_k)).field_s;
                              if (-32 == ((vja) this).field_p) {
                                var6 = 0;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            if (var6 == 0) {
                              return;
                            } else {
                              boolean discarded$11 = var17.a(var6, var17, (byte) 2);
                              return;
                            }
                          }
                        }
                      } else {
                        if (-69 == (((vja) this).field_k ^ -1)) {
                          break L2;
                        } else {
                          L4: {
                            if (((vja) this).field_k == 69) {
                              break L4;
                            } else {
                              if (((vja) this).field_k == -71) {
                                break L4;
                              } else {
                                L5: {
                                  var6 = ((t) (Object) al.a(-67, ((vja) this).field_k)).field_s;
                                  if (-32 == ((vja) this).field_p) {
                                    var6 = 0;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (var6 == 0) {
                                  return;
                                } else {
                                  boolean discarded$12 = var17.a(var6, var17, (byte) 2);
                                  return;
                                }
                              }
                            }
                          }
                          boolean discarded$13 = var17.a(-var5, var17, (byte) 2);
                          return;
                        }
                      }
                    }
                    boolean discarded$14 = var17.a(-var5, var17, (byte) 2);
                    return;
                  } else {
                    if (var4_ref instanceof iv) {
                      L6: {
                        var26 = var4_ref.field_h.a(91, param0);
                        if (!((iv) (Object) var4_ref).field_j) {
                          L7: {
                            if (var26.a(13, (byte) -95)) {
                              boolean discarded$15 = var17.a(5, var26, (byte) 2);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var5 = var4_ref.field_f;
                          if (var26.i(-120)) {
                            var5 = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      if (this instanceof hba) {
                        var7 = nn.a(var26, var17, (byte) 104);
                        ((iv) (Object) var4_ref).a((byte) -21, var17, param0, var7);
                        var4_ref = (pp) (Object) ((vja) this).field_o.c(0);
                        continue L1;
                      } else {
                        ((iv) (Object) var4_ref).a((byte) -66, var17, param0, ((vja) this).field_q);
                        var4_ref = (pp) (Object) ((vja) this).field_o.c(0);
                        continue L1;
                      }
                    } else {
                      var4_ref.a(var17, param0, 12);
                      var4_ref = (pp) (Object) ((vja) this).field_o.c(0);
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var9 = null;
          ((vja) this).a((byte) 108, (lu) null);
          var11 = ((vja) this).field_l.a(20, param0);
          var10 = var11;
          if (var11.i(55)) {
            return;
          } else {
            L8: {
              if (0 != ((vja) this).field_q) {
                var11.field_s = ((vja) this).field_q;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var4_ref = (pp) (Object) ((vja) this).field_o.b((byte) 90);
              var11.d(((vja) this).field_k, (byte) -94);
              if (((vja) this).field_r) {
                break L9;
              } else {
                if (!((vja) this).field_n) {
                  var5 = 0;
                  L10: while (true) {
                    if (var4_ref == null) {
                      if (0 != var5) {
                        if (-69 == (((vja) this).field_k ^ -1)) {
                          boolean discarded$16 = var11.a(-var5, var11, (byte) 2);
                          return;
                        } else {
                          L11: {
                            L12: {
                              if (((vja) this).field_k == 69) {
                                break L12;
                              } else {
                                if (((vja) this).field_k == -71) {
                                  break L12;
                                } else {
                                  L13: {
                                    var6 = ((t) (Object) al.a(-67, ((vja) this).field_k)).field_s;
                                    if (-32 == ((vja) this).field_p) {
                                      var6 = 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (var6 == 0) {
                                    break L11;
                                  } else {
                                    boolean discarded$17 = var11.a(var6, var11, (byte) 2);
                                    break L11;
                                  }
                                }
                              }
                            }
                            boolean discarded$18 = var11.a(-var5, var11, (byte) 2);
                            break L11;
                          }
                          return;
                        }
                      } else {
                        L14: {
                          L15: {
                            if (((vja) this).field_k == 69) {
                              break L15;
                            } else {
                              if (((vja) this).field_k == -71) {
                                break L15;
                              } else {
                                L16: {
                                  var6 = ((t) (Object) al.a(-67, ((vja) this).field_k)).field_s;
                                  if (-32 == ((vja) this).field_p) {
                                    var6 = 0;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                if (var6 == 0) {
                                  break L14;
                                } else {
                                  boolean discarded$19 = var11.a(var6, var11, (byte) 2);
                                  break L14;
                                }
                              }
                            }
                          }
                          boolean discarded$20 = var11.a(-var5, var11, (byte) 2);
                          break L14;
                        }
                        return;
                      }
                    } else {
                      if (var4_ref instanceof iv) {
                        L17: {
                          var12 = var4_ref.field_h.a(91, param0);
                          if (!((iv) (Object) var4_ref).field_j) {
                            L18: {
                              if (var12.a(13, (byte) -95)) {
                                boolean discarded$21 = var11.a(5, var12, (byte) 2);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var5 = var4_ref.field_f;
                            if (var12.i(-120)) {
                              var5 = 0;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            break L17;
                          }
                        }
                        if (this instanceof hba) {
                          var7 = nn.a(var12, var11, (byte) 104);
                          ((iv) (Object) var4_ref).a((byte) -21, var11, param0, var7);
                          var4_ref = (pp) (Object) ((vja) this).field_o.c(0);
                          continue L10;
                        } else {
                          ((iv) (Object) var4_ref).a((byte) -66, var11, param0, ((vja) this).field_q);
                          var4_ref = (pp) (Object) ((vja) this).field_o.c(0);
                          continue L10;
                        }
                      } else {
                        var4_ref.a(var11, param0, 12);
                        var4_ref = (pp) (Object) ((vja) this).field_o.c(0);
                        continue L10;
                      }
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            return;
          }
        }
    }

    final boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -20) {
          if (!((vja) this).field_r) {
            if (!((vja) this).field_n) {
              if (((vja) this).field_s) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ((vja) this).field_s = false;
          if (!((vja) this).field_r) {
            if (((vja) this).field_n) {
              return true;
            } else {
              L0: {
                if (!((vja) this).field_s) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    static {
    }
}

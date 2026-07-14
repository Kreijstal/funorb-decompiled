/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends eg {
    static ta field_t;
    private nb[] field_w;
    static String field_z;
    private nb field_y;
    static ta field_v;
    static ea field_x;
    static int field_u;
    static String field_s;

    final void a(byte param0, ea param1) {
        nb[] var3 = null;
        int var4 = 0;
        nb var5 = null;
        int var6 = 0;
        Object var7 = null;
        nb[] var8 = null;
        var6 = MinerDisturbance.field_ab;
        var8 = ((on) this).field_w;
        var3 = var8;
        if (param0 <= 67) {
          L0: {
            var7 = null;
            this.a(false, (byte) -94, (on) null);
            var4 = 0;
            if (var8.length <= var4) {
              break L0;
            } else {
              L1: {
                var5 = var8[var4];
                if (var5 != null) {
                  var5.field_e = param1;
                  break L1;
                } else {
                  var4++;
                  break L1;
                }
              }
              var4++;
              var4++;
              var4++;
              break L0;
            }
          }
          return;
        } else {
          var4 = 0;
          L2: while (true) {
            if (var8.length <= var4) {
              return;
            } else {
              var5 = var8[var4];
              if (var5 != null) {
                var5.field_e = param1;
                var4++;
                continue L2;
              } else {
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    private final void a(boolean param0, byte param1, on param2) {
        int var4 = 0;
        nb var5 = null;
        nb var6 = null;
        nb var6_ref = null;
        int var7 = 0;
        nb stackIn_10_0 = null;
        nb stackIn_11_0 = null;
        nb stackIn_12_0 = null;
        nb stackIn_12_1 = null;
        nb stackOut_9_0 = null;
        nb stackOut_11_0 = null;
        nb stackOut_11_1 = null;
        nb stackOut_10_0 = null;
        nb stackOut_10_1 = null;
        var7 = MinerDisturbance.field_ab;
        super.a(-3, (eg) (Object) param2);
        if (param1 == 36) {
          if (param0) {
            var4 = 0;
            L0: while (true) {
              if (-7 < (var4 ^ -1)) {
                var5 = ((on) this).field_w[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L1: {
                    var6_ref = param2.field_w[var4];
                    stackOut_9_0 = (nb) var5;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var6_ref != null) {
                      stackOut_11_0 = (nb) (Object) stackIn_11_0;
                      stackOut_11_1 = (nb) var6_ref;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L1;
                    } else {
                      param2.field_w[var4] = new nb();
                      stackOut_10_0 = (nb) (Object) stackIn_10_0;
                      stackOut_10_1 = new nb();
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L1;
                    }
                  }
                  ((nb) (Object) stackIn_12_0).a(stackIn_12_1, (byte) -123);
                  var4++;
                  continue L0;
                } else {
                  param2.field_w[var4] = null;
                  var4++;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            ai.a((Object[]) (Object) ((on) this).field_w, 0, (Object[]) (Object) param2.field_w, 0, 6);
            return;
          }
        } else {
          return;
        }
    }

    public on() {
        ((on) this).field_w = new nb[6];
        ((on) this).field_y = new nb();
        ((on) this).field_w[0] = new nb();
        nb var1 = new nb();
        var1.b(-1);
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        hc var10 = null;
        nb var15 = null;
        nb var16 = null;
        nb var17 = null;
        nb var18 = null;
        nb var19 = null;
        nb var20 = null;
        nb var21 = null;
        nb var22 = null;
        nb var23 = null;
        nb var24 = null;
        nb var25 = null;
        nb var26 = null;
        nb var27 = null;
        nb var28 = null;
        nb var29 = null;
        nb var30 = null;
        nb var31 = null;
        nb var32 = null;
        nb var33 = null;
        nb var34 = null;
        nb var35 = null;
        nb var36 = null;
        nb var37 = null;
        nb var38 = null;
        nb var39 = null;
        nb var40 = null;
        nb var41 = null;
        nb var42 = null;
        nb var43 = null;
        nb var44 = null;
        nb var45 = null;
        nb var46 = null;
        nb var47 = null;
        nb var52 = null;
        nb var53 = null;
        nb var54 = null;
        nb var55 = null;
        nb var60 = null;
        nb var65 = null;
        nb var66 = null;
        fe stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        fe stackOut_1_0 = null;
        L0: {
          if (!(param2 instanceof hc)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (fe) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (fe) param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var10 = (hc) (Object) stackIn_3_0;
        wf.a(param2.field_t + param3, param2.field_u + param1, (byte) 8, param2.field_u + param1 - -param2.field_v, param3 + param2.field_t - -param2.field_q);
        if (param0 == 12088) {
          L1: {
            if (var10 != null) {
              param4 = param4 & var10.field_E;
              break L1;
            } else {
              break L1;
            }
          }
          var21 = ((on) this).field_w[0];
          ((on) this).field_y.b(-1);
          var21.a(param0 ^ 6185, param2, (on) this, ((on) this).field_y, param3, param1);
          if (var10 != null) {
            if (var10.field_H) {
              var44 = ((on) this).field_w[1];
              if (var44 != null) {
                L2: {
                  var44.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                  if (!var10.field_x) {
                    break L2;
                  } else {
                    var53 = ((on) this).field_w[3];
                    if (var10.field_w == 0) {
                      var52 = ((on) this).field_w[2];
                      if (var52 != null) {
                        var52.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (var53 != null) {
                        L3: {
                          var53.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                          if (!param2.k(param0 + -12188)) {
                            break L3;
                          } else {
                            var54 = ((on) this).field_w[5];
                            if (var54 != null) {
                              var54.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (!param4) {
                          var55 = ((on) this).field_w[4];
                          if (var55 != null) {
                            var55.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          } else {
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          }
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      } else {
                        L4: {
                          var45 = ((on) this).field_w[2];
                          if (var45 != null) {
                            var45.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (!param2.k(param0 + -12188)) {
                            break L5;
                          } else {
                            var46 = ((on) this).field_w[5];
                            if (var46 != null) {
                              var46.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (!param4) {
                          var47 = ((on) this).field_w[4];
                          if (var47 != null) {
                            var47.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          } else {
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          }
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (!param2.k(param0 + -12188)) {
                    break L6;
                  } else {
                    var65 = ((on) this).field_w[5];
                    if (var65 != null) {
                      var65.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                      break L6;
                    } else {
                      if (!param4) {
                        var60 = ((on) this).field_w[4];
                        if (var60 != null) {
                          var60.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      } else {
                        ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                        tk.b(true);
                        return;
                      }
                    }
                  }
                }
                if (!param4) {
                  var66 = ((on) this).field_w[4];
                  if (var66 != null) {
                    var66.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                    ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                    tk.b(true);
                    return;
                  } else {
                    ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                    tk.b(true);
                    return;
                  }
                } else {
                  ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                  tk.b(true);
                  return;
                }
              } else {
                L7: {
                  if (!var10.field_x) {
                    break L7;
                  } else {
                    var38 = ((on) this).field_w[3];
                    if (var10.field_w == 0) {
                      var37 = ((on) this).field_w[2];
                      if (var37 != null) {
                        var37.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      if (var38 != null) {
                        L8: {
                          var38.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                          if (!param2.k(param0 + -12188)) {
                            break L8;
                          } else {
                            var39 = ((on) this).field_w[5];
                            if (var39 != null) {
                              var39.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (!param4) {
                          var40 = ((on) this).field_w[4];
                          if (var40 != null) {
                            var40.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          } else {
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          }
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      } else {
                        L9: {
                          var34 = ((on) this).field_w[2];
                          if (var34 != null) {
                            var34.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (!param2.k(param0 + -12188)) {
                            break L10;
                          } else {
                            var35 = ((on) this).field_w[5];
                            if (var35 != null) {
                              var35.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (!param4) {
                          var36 = ((on) this).field_w[4];
                          if (var36 != null) {
                            var36.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          } else {
                            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                            tk.b(true);
                            return;
                          }
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (!param2.k(param0 + -12188)) {
                    break L11;
                  } else {
                    var42 = ((on) this).field_w[5];
                    if (var42 != null) {
                      var42.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                      break L11;
                    } else {
                      if (!param4) {
                        var41 = ((on) this).field_w[4];
                        if (var41 != null) {
                          var41.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      } else {
                        ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                        tk.b(true);
                        return;
                      }
                    }
                  }
                }
                if (!param4) {
                  var43 = ((on) this).field_w[4];
                  if (var43 != null) {
                    var43.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                    ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                    tk.b(true);
                    return;
                  } else {
                    ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                    tk.b(true);
                    return;
                  }
                } else {
                  ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                  tk.b(true);
                  return;
                }
              }
            } else {
              L12: {
                if (!var10.field_x) {
                  break L12;
                } else {
                  var28 = ((on) this).field_w[3];
                  if (var10.field_w == 0) {
                    var27 = ((on) this).field_w[2];
                    if (var27 != null) {
                      var27.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    if (var28 != null) {
                      L13: {
                        var28.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                        if (!param2.k(param0 + -12188)) {
                          break L13;
                        } else {
                          var29 = ((on) this).field_w[5];
                          if (var29 != null) {
                            var29.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (!param4) {
                        var30 = ((on) this).field_w[4];
                        if (var30 != null) {
                          var30.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      } else {
                        ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                        tk.b(true);
                        return;
                      }
                    } else {
                      L14: {
                        var24 = ((on) this).field_w[2];
                        if (var24 != null) {
                          var24.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (!param2.k(param0 + -12188)) {
                          break L15;
                        } else {
                          var25 = ((on) this).field_w[5];
                          if (var25 != null) {
                            var25.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (!param4) {
                        var26 = ((on) this).field_w[4];
                        if (var26 != null) {
                          var26.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        } else {
                          ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                          tk.b(true);
                          return;
                        }
                      } else {
                        ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                        tk.b(true);
                        return;
                      }
                    }
                  }
                }
              }
              L16: {
                if (!param2.k(param0 + -12188)) {
                  break L16;
                } else {
                  var32 = ((on) this).field_w[5];
                  if (var32 != null) {
                    var32.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                    break L16;
                  } else {
                    if (!param4) {
                      var31 = ((on) this).field_w[4];
                      if (var31 != null) {
                        var31.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                        ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                        tk.b(true);
                        return;
                      } else {
                        ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                        tk.b(true);
                        return;
                      }
                    } else {
                      ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                      tk.b(true);
                      return;
                    }
                  }
                }
              }
              if (!param4) {
                var33 = ((on) this).field_w[4];
                if (var33 != null) {
                  var33.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                  ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                  tk.b(true);
                  return;
                } else {
                  ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                  tk.b(true);
                  return;
                }
              } else {
                ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                tk.b(true);
                return;
              }
            }
          } else {
            L17: {
              if (!param2.k(param0 + -12188)) {
                break L17;
              } else {
                var22 = ((on) this).field_w[5];
                if (var22 != null) {
                  var22.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            if (!param4) {
              var23 = ((on) this).field_w[4];
              if (var23 != null) {
                var23.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
                ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                tk.b(true);
                return;
              } else {
                ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
                tk.b(true);
                return;
              }
            } else {
              ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
              tk.b(true);
              return;
            }
          }
        } else {
          L18: {
            ((on) this).field_y = null;
            if (var10 != null) {
              param4 = param4 & var10.field_E;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            var15 = ((on) this).field_w[0];
            ((on) this).field_y.b(-1);
            var15.a(param0 ^ 6185, param2, (on) this, ((on) this).field_y, param3, param1);
            if (var10 != null) {
              L20: {
                if (!var10.field_H) {
                  break L20;
                } else {
                  var16 = ((on) this).field_w[1];
                  if (var16 == null) {
                    break L20;
                  } else {
                    var16.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                    break L20;
                  }
                }
              }
              if (!var10.field_x) {
                break L19;
              } else {
                L21: {
                  var18 = ((on) this).field_w[3];
                  if (var10.field_w == 0) {
                    break L21;
                  } else {
                    if (var18 != null) {
                      var18.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                      break L19;
                    } else {
                      break L21;
                    }
                  }
                }
                var17 = ((on) this).field_w[2];
                if (var17 != null) {
                  var17.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                  break L19;
                } else {
                  break L19;
                }
              }
            } else {
              break L19;
            }
          }
          L22: {
            if (!param2.k(param0 + -12188)) {
              break L22;
            } else {
              var19 = ((on) this).field_w[5];
              if (var19 != null) {
                var19.a(14097, param2, (on) this, ((on) this).field_y, param3, param1);
                break L22;
              } else {
                break L22;
              }
            }
          }
          if (!param4) {
            var20 = ((on) this).field_w[4];
            if (var20 != null) {
              var20.a(param0 + 2009, param2, (on) this, ((on) this).field_y, param3, param1);
              ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
              tk.b(true);
              return;
            } else {
              ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
              tk.b(true);
              return;
            }
          } else {
            ((on) this).field_y.a(param1, param2, (on) this, param3, 100);
            tk.b(true);
            return;
          }
        }
    }

    final void a(int param0, ea[] param1, byte param2) {
        int var4 = 0;
        var4 = param0;
        if (((on) this).field_w[var4] != null) {
          if (param2 != 24) {
            field_z = null;
            ((on) this).field_w[param0].field_d = param1;
            return;
          } else {
            ((on) this).field_w[param0].field_d = param1;
            return;
          }
        } else {
          ((on) this).field_w[var4] = new nb();
          if (param2 == 24) {
            ((on) this).field_w[param0].field_d = param1;
            return;
          } else {
            field_z = null;
            ((on) this).field_w[param0].field_d = param1;
            return;
          }
        }
    }

    final void a(ea[] param0, boolean param1) {
        nb[] var3 = null;
        int var4 = 0;
        nb var5 = null;
        int var6 = 0;
        nb[] var7 = null;
        var6 = MinerDisturbance.field_ab;
        if (!param1) {
          L0: {
            field_x = null;
            var7 = ((on) this).field_w;
            var3 = var7;
            var4 = 0;
            if (var7.length <= var4) {
              break L0;
            } else {
              L1: {
                var5 = var7[var4];
                if (var5 == null) {
                  var4++;
                  break L1;
                } else {
                  var5.field_d = param0;
                  var4++;
                  break L1;
                }
              }
              var4++;
              var4++;
              var4++;
              break L0;
            }
          }
          return;
        } else {
          var7 = ((on) this).field_w;
          var3 = var7;
          var4 = 0;
          L2: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 == null) {
                var4++;
                var4++;
                continue L2;
              } else {
                var5.field_d = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    public static void d(int param0) {
        field_z = null;
        field_t = null;
        field_x = null;
        field_v = null;
        field_s = null;
        if (param0 >= -49) {
            field_v = null;
        }
    }

    final nb a(byte param0, int param1) {
        if (param0 >= -96) {
          on.d(-8);
          ((on) this).field_w[param1] = new nb();
          return new nb();
        } else {
          ((on) this).field_w[param1] = new nb();
          return new nb();
        }
    }

    on(on param0, boolean param1) {
        this();
        param0.a(param1, (byte) 36, (on) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new ta();
        field_z = "Become a member to get this expansion and...";
        field_v = new ta();
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}

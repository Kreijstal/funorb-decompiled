/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends h {
    private ab field_p;
    private ab[] field_o;

    final static void a(boolean param0, int param1) {
        hj var2 = ff.field_D;
        var2.a(param0, param1);
        var2.f(6389, 1);
        var2.f(6389, 0);
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return si.field_l > 250 ? true : false;
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        ab var7 = null;
        int var8 = 0;
        lj var10 = null;
        ab var11 = null;
        ab var15 = null;
        ab var16 = null;
        ab var17 = null;
        ab var18 = null;
        ab var19 = null;
        ab var20 = null;
        ab var21 = null;
        ab var22 = null;
        ab var23 = null;
        ab var24 = null;
        ab var25 = null;
        ab var26 = null;
        ab var27 = null;
        ab var28 = null;
        ab var29 = null;
        ab var30 = null;
        ab var31 = null;
        ab var32 = null;
        ab var33 = null;
        ab var34 = null;
        ab var35 = null;
        ab var36 = null;
        ab var37 = null;
        ab var38 = null;
        ab var39 = null;
        ab var40 = null;
        ab var41 = null;
        qg stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qg stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof lj)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qg) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qg) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (lj) (Object) stackIn_3_0;
          c.a(param4.field_p + (param0 - -param4.field_l), param4.field_p + param0, (byte) -50, param4.field_n + (param1 - -param4.field_h), param4.field_n + param1);
          if (var10 == null) {
            break L1;
          } else {
            param2 = param2 & var10.field_t;
            break L1;
          }
        }
        var7 = ((ki) this).field_o[0];
        ((ki) this).field_p.a(313);
        var7.a((ki) this, (byte) -70, param0, param1, ((ki) this).field_p, param4);
        if (var10 != null) {
          L2: {
            if (var10.field_y) {
              var11 = ((ki) this).field_o[1];
              if (var11 == null) {
                break L2;
              } else {
                L3: {
                  var11.a((ki) this, (byte) -95, param0, param1, ((ki) this).field_p, param4);
                  if (var10.field_g) {
                    L4: {
                      var20 = ((ki) this).field_o[3];
                      if (var10.field_s == 0) {
                        break L4;
                      } else {
                        if (var20 != null) {
                          var20.a((ki) this, (byte) -45, param0, param1, ((ki) this).field_p, param4);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var19 = ((ki) this).field_o[2];
                    if (var19 == null) {
                      break L3;
                    } else {
                      var19.a((ki) this, (byte) -55, param0, param1, ((ki) this).field_p, param4);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (!param4.b((byte) -111)) {
                    break L5;
                  } else {
                    var21 = ((ki) this).field_o[5];
                    if (var21 != null) {
                      var21.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var8 = 127 % ((param3 - 51) / 47);
                if (param2) {
                  ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                  fi.c(true);
                  return;
                } else {
                  var22 = ((ki) this).field_o[4];
                  if (var22 != null) {
                    var22.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  } else {
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          if (var10.field_g) {
            var35 = ((ki) this).field_o[3];
            if (var10.field_s == 0) {
              var31 = ((ki) this).field_o[2];
              if (var31 == null) {
                L6: {
                  if (!param4.b((byte) -111)) {
                    break L6;
                  } else {
                    var40 = ((ki) this).field_o[5];
                    if (var40 != null) {
                      var40.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                      break L6;
                    } else {
                      var8 = 127 % ((param3 - 51) / 47);
                      if (param2) {
                        ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                        fi.c(true);
                        return;
                      } else {
                        var39 = ((ki) this).field_o[4];
                        if (var39 != null) {
                          var39.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                          ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                          fi.c(true);
                          return;
                        } else {
                          ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                          fi.c(true);
                          return;
                        }
                      }
                    }
                  }
                }
                var8 = 127 % ((param3 - 51) / 47);
                if (param2) {
                  ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                  fi.c(true);
                  return;
                } else {
                  var41 = ((ki) this).field_o[4];
                  if (var41 != null) {
                    var41.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  } else {
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  }
                }
              } else {
                L7: {
                  var31.a((ki) this, (byte) -55, param0, param1, ((ki) this).field_p, param4);
                  if (!param4.b((byte) -111)) {
                    break L7;
                  } else {
                    var33 = ((ki) this).field_o[5];
                    if (var33 != null) {
                      var33.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                      break L7;
                    } else {
                      var8 = 127 % ((param3 - 51) / 47);
                      if (param2) {
                        ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                        fi.c(true);
                        return;
                      } else {
                        var32 = ((ki) this).field_o[4];
                        var15 = var32;
                        if (var32 != null) {
                          var32.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                          ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                          fi.c(true);
                          return;
                        } else {
                          ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                          fi.c(true);
                          return;
                        }
                      }
                    }
                  }
                }
                var8 = 127 % ((param3 - 51) / 47);
                if (param2) {
                  ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                  fi.c(true);
                  return;
                } else {
                  var34 = ((ki) this).field_o[4];
                  var15 = var34;
                  if (var34 != null) {
                    var34.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  } else {
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  }
                }
              }
            } else {
              if (var35 != null) {
                L8: {
                  var35.a((ki) this, (byte) -45, param0, param1, ((ki) this).field_p, param4);
                  if (!param4.b((byte) -111)) {
                    break L8;
                  } else {
                    var37 = ((ki) this).field_o[5];
                    if (var37 != null) {
                      var37.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                      break L8;
                    } else {
                      var8 = 127 % ((param3 - 51) / 47);
                      if (param2) {
                        ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                        fi.c(true);
                        return;
                      } else {
                        var36 = ((ki) this).field_o[4];
                        var15 = var36;
                        if (var36 != null) {
                          var36.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                          ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                          fi.c(true);
                          return;
                        } else {
                          ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                          fi.c(true);
                          return;
                        }
                      }
                    }
                  }
                }
                var8 = 127 % ((param3 - 51) / 47);
                if (param2) {
                  ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                  fi.c(true);
                  return;
                } else {
                  var38 = ((ki) this).field_o[4];
                  if (var38 != null) {
                    var38.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  } else {
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  }
                }
              } else {
                var27 = ((ki) this).field_o[2];
                if (var27 != null) {
                  var27.a((ki) this, (byte) -55, param0, param1, ((ki) this).field_p, param4);
                  if (param4.b((byte) -111)) {
                    L9: {
                      var29 = ((ki) this).field_o[5];
                      if (var29 != null) {
                        var29.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var8 = 127 % ((param3 - 51) / 47);
                    if (param2) {
                      ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                      fi.c(true);
                      return;
                    } else {
                      var30 = ((ki) this).field_o[4];
                      if (var30 != null) {
                        var30.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                        ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                        fi.c(true);
                        return;
                      } else {
                        ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                        fi.c(true);
                        return;
                      }
                    }
                  } else {
                    var8 = 127 % ((param3 - 51) / 47);
                    if (param2) {
                      ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                      fi.c(true);
                      return;
                    } else {
                      var28 = ((ki) this).field_o[4];
                      var15 = var28;
                      if (var28 != null) {
                        var28.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                        ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                        fi.c(true);
                        return;
                      } else {
                        ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                        fi.c(true);
                        return;
                      }
                    }
                  }
                } else {
                  L10: {
                    if (!param4.b((byte) -111)) {
                      break L10;
                    } else {
                      var25 = ((ki) this).field_o[5];
                      if (var25 != null) {
                        var25.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var8 = 127 % ((param3 - 51) / 47);
                  if (param2) {
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  } else {
                    var26 = ((ki) this).field_o[4];
                    var15 = var26;
                    if (var26 != null) {
                      var26.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                      ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                      fi.c(true);
                      return;
                    } else {
                      ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                      fi.c(true);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L11: {
              if (!param4.b((byte) -111)) {
                break L11;
              } else {
                var23 = ((ki) this).field_o[5];
                if (var23 != null) {
                  var23.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            var8 = 127 % ((param3 - 51) / 47);
            if (param2) {
              ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
              fi.c(true);
              return;
            } else {
              var24 = ((ki) this).field_o[4];
              if (var24 != null) {
                var24.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                fi.c(true);
                return;
              } else {
                ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                fi.c(true);
                return;
              }
            }
          }
        } else {
          L12: {
            if (!param4.b((byte) -111)) {
              break L12;
            } else {
              var17 = ((ki) this).field_o[5];
              if (var17 != null) {
                var17.a((ki) this, (byte) -107, param0, param1, ((ki) this).field_p, param4);
                break L12;
              } else {
                var8 = 127 % ((param3 - 51) / 47);
                if (param2) {
                  ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                  fi.c(true);
                  return;
                } else {
                  var16 = ((ki) this).field_o[4];
                  if (var16 != null) {
                    var16.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  } else {
                    ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
                    fi.c(true);
                    return;
                  }
                }
              }
            }
          }
          var8 = 127 % ((param3 - 51) / 47);
          if (param2) {
            ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
            fi.c(true);
            return;
          } else {
            var18 = ((ki) this).field_o[4];
            if (var18 != null) {
              var18.a((ki) this, (byte) -81, param0, param1, ((ki) this).field_p, param4);
              ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
              fi.c(true);
              return;
            } else {
              ((ki) this).field_p.a((byte) 21, (ki) this, param1, param4, param0);
              fi.c(true);
              return;
            }
          }
        }
    }

    final ab a(byte param0, int param1) {
        Object var4 = null;
        if (param0 != -21) {
          var4 = null;
          ki.a((byte) -43, (java.applet.Applet) null);
          ((ki) this).field_o[param1] = new ab();
          return new ab();
        } else {
          ((ki) this).field_o[param1] = new ab();
          return new ab();
        }
    }

    ki(ki param0, boolean param1) {
        this();
        param0.a(param1, (ki) this, false);
    }

    private final void a(boolean param0, ki param1, boolean param2) {
        int var4 = 0;
        ab var5 = null;
        ab var6 = null;
        int var7 = 0;
        ab stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ab stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ab stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ab stackIn_11_2 = null;
        ab stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ab stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ab stackOut_10_2 = null;
        ab stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ab stackOut_9_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        super.a((byte) -106, (h) (Object) param1);
        if (!param2) {
          if (param0) {
            var4 = 0;
            L0: while (true) {
              if (-7 < (var4 ^ -1)) {
                var5 = ((ki) this).field_o[var4];
                if (var5 == null) {
                  param1.field_o[var4] = null;
                  var4++;
                  continue L0;
                } else {
                  L1: {
                    var6 = param1.field_o[var4];
                    stackOut_8_0 = (ab) var5;
                    stackOut_8_1 = 72;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var6 == null) {
                      param1.field_o[var4] = new ab();
                      stackOut_10_0 = (ab) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = new ab();
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L1;
                    } else {
                      stackOut_9_0 = (ab) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (ab) var6;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L1;
                    }
                  }
                  ((ab) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                  var4++;
                  var4++;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            ji.a((Object[]) (Object) ((ki) this).field_o, 0, (Object[]) (Object) param1.field_o, 0, 6);
            return;
          }
        } else {
          return;
        }
    }

    final void a(ti[] param0, int param1) {
        ab[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ab var6 = null;
        int var7 = 0;
        ab[] var8 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        var4 = -26 / ((-58 - param1) / 38);
        var8 = ((ki) this).field_o;
        var3 = var8;
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            return;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_i = param0;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, ti[] param2) {
        int var4 = 0;
        if (param1 != -19106) {
          return;
        } else {
          L0: {
            var4 = param0;
            if (((ki) this).field_o[var4] == null) {
              ((ki) this).field_o[var4] = new ab();
              break L0;
            } else {
              break L0;
            }
          }
          ((ki) this).field_o[param0].field_i = param2;
          return;
        }
    }

    final void a(ti param0, int param1) {
        ab[] var3 = null;
        int var4 = 0;
        ab var5 = null;
        int var6 = 0;
        ab[] var7 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        var7 = ((ki) this).field_o;
        var3 = var7;
        if (param1 != 1) {
          return;
        } else {
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_d = param0;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    public ki() {
        ((ki) this).field_o = new ab[6];
        ((ki) this).field_p = new ab();
        ((ki) this).field_o[0] = new ab();
        ab var1 = new ab();
        var1.a(313);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        gb.a(param1, (byte) 83, "");
        if (param0 != 3) {
            return;
        }
        ol.a(param1, 30194);
    }

    static {
    }
}

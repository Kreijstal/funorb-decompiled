/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    private int field_n;
    static String field_k;
    private int field_x;
    static dq field_h;
    private int field_g;
    static long field_a;
    private int field_l;
    private int field_v;
    private int field_o;
    private boolean field_c;
    private int field_f;
    private int field_i;
    private o field_s;
    private int field_p;
    private int field_j;
    private int field_m;
    static String field_u;
    private int field_b;
    private int field_q;
    static String field_d;
    private int field_t;
    private int field_r;
    private float field_w;
    static String field_e;

    final boolean a(byte param0) {
        int var2 = 0;
        var2 = -88 / ((param0 - -5) / 36);
        if (ri.field_h >= ((co) this).field_j) {
          if (0 >= uo.field_j) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((co) this).field_n = param0;
        ((co) this).field_f = param2;
        if (param1 != 13756) {
            ((co) this).field_b = -1;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = 110;
        var3 = ((co) this).field_n;
        var4 = ((co) this).field_f;
        if (((co) this).a((byte) 99)) {
          L0: {
            if (((co) this).field_g < var3) {
              var3 = ((co) this).field_g;
              break L0;
            } else {
              if (var3 < ((co) this).field_r) {
                var3 = ((co) this).field_r;
                break L0;
              } else {
                L1: {
                  if (((co) this).field_t < var4) {
                    var4 = ((co) this).field_t;
                    break L1;
                  } else {
                    if (var4 < ((co) this).field_v) {
                      L2: {
                        var4 = ((co) this).field_v;
                        if (0.0f < ((co) this).field_w) {
                          var5 = (int)(((co) this).field_w * (float)var4 + 0.5f);
                          if (var3 >= var5) {
                            if (var3 > var5) {
                              var3 = var5;
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            var4 = (int)((float)var3 / ((co) this).field_w);
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (uo.field_i != var3) {
                          ((co) this).field_s.a(var3, 127, var4);
                          break L3;
                        } else {
                          if (var4 == wp.field_c) {
                            break L3;
                          } else {
                            ((co) this).field_s.a(var3, 127, var4);
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (((co) this).field_n > 0) {
                          ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                if (0.0f < ((co) this).field_w) {
                  var5 = (int)(((co) this).field_w * (float)var4 + 0.5f);
                  if (var3 >= var5) {
                    if (var3 > var5) {
                      var3 = var5;
                      if (uo.field_i == var3) {
                        if (var4 != wp.field_c) {
                          L5: {
                            ((co) this).field_s.a(var3, 127, var4);
                            if (((co) this).field_n > 0) {
                              ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          return;
                        } else {
                          L6: {
                            if (((co) this).field_n > 0) {
                              ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          return;
                        }
                      } else {
                        L7: {
                          ((co) this).field_s.a(var3, 127, var4);
                          if (((co) this).field_n > 0) {
                            ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        if (uo.field_i != var3) {
                          ((co) this).field_s.a(var3, 127, var4);
                          break L8;
                        } else {
                          if (var4 == wp.field_c) {
                            break L8;
                          } else {
                            ((co) this).field_s.a(var3, 127, var4);
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (((co) this).field_n > 0) {
                          ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      var4 = (int)((float)var3 / ((co) this).field_w);
                      if (uo.field_i != var3) {
                        ((co) this).field_s.a(var3, 127, var4);
                        break L10;
                      } else {
                        if (var4 == wp.field_c) {
                          break L10;
                        } else {
                          ((co) this).field_s.a(var3, 127, var4);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (((co) this).field_n > 0) {
                        ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    if (uo.field_i != var3) {
                      ((co) this).field_s.a(var3, 127, var4);
                      break L12;
                    } else {
                      if (var4 == wp.field_c) {
                        break L12;
                      } else {
                        ((co) this).field_s.a(var3, 127, var4);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (((co) this).field_n > 0) {
                      ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return;
                }
              }
            }
          }
          L14: {
            if (((co) this).field_t < var4) {
              var4 = ((co) this).field_t;
              break L14;
            } else {
              if (var4 < ((co) this).field_v) {
                L15: {
                  var4 = ((co) this).field_v;
                  if (0.0f < ((co) this).field_w) {
                    var5 = (int)(((co) this).field_w * (float)var4 + 0.5f);
                    if (var3 >= var5) {
                      if (var3 > var5) {
                        var3 = var5;
                        break L15;
                      } else {
                        break L15;
                      }
                    } else {
                      var4 = (int)((float)var3 / ((co) this).field_w);
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
                if (uo.field_i == var3) {
                  if (var4 == wp.field_c) {
                    L16: {
                      if (((co) this).field_n > 0) {
                        ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    return;
                  } else {
                    ((co) this).field_s.a(var3, 127, var4);
                    L17: {
                      if (((co) this).field_n > 0) {
                        ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    return;
                  }
                } else {
                  ((co) this).field_s.a(var3, 127, var4);
                  L18: {
                    if (((co) this).field_n > 0) {
                      ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                break L14;
              }
            }
          }
          if (0.0f < ((co) this).field_w) {
            var5 = (int)(((co) this).field_w * (float)var4 + 0.5f);
            if (var3 >= var5) {
              if (var3 > var5) {
                var3 = var5;
                if (uo.field_i == var3) {
                  if (var4 == wp.field_c) {
                    L19: {
                      if (((co) this).field_n > 0) {
                        ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    return;
                  } else {
                    L20: {
                      ((co) this).field_s.a(var3, 127, var4);
                      if (((co) this).field_n > 0) {
                        ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    return;
                  }
                } else {
                  L21: {
                    ((co) this).field_s.a(var3, 127, var4);
                    if (((co) this).field_n > 0) {
                      ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              } else {
                if (uo.field_i == var3) {
                  if (var4 == wp.field_c) {
                    L22: {
                      if (((co) this).field_n > 0) {
                        ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    return;
                  } else {
                    L23: {
                      ((co) this).field_s.a(var3, 127, var4);
                      if (((co) this).field_n > 0) {
                        ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    return;
                  }
                } else {
                  L24: {
                    ((co) this).field_s.a(var3, 127, var4);
                    if (((co) this).field_n > 0) {
                      ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                }
              }
            } else {
              var4 = (int)((float)var3 / ((co) this).field_w);
              if (uo.field_i == var3) {
                if (var4 != wp.field_c) {
                  L25: {
                    ((co) this).field_s.a(var3, 127, var4);
                    if (((co) this).field_n > 0) {
                      ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  return;
                } else {
                  L26: {
                    if (((co) this).field_n > 0) {
                      ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  return;
                }
              } else {
                L27: {
                  ((co) this).field_s.a(var3, 127, var4);
                  if (((co) this).field_n > 0) {
                    ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            }
          } else {
            if (uo.field_i == var3) {
              if (var4 != wp.field_c) {
                L28: {
                  ((co) this).field_s.a(var3, 127, var4);
                  if (((co) this).field_n > 0) {
                    ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              } else {
                L29: {
                  if (((co) this).field_n > 0) {
                    ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                return;
              }
            } else {
              L30: {
                ((co) this).field_s.a(var3, 127, var4);
                if (((co) this).field_n > 0) {
                  ae.field_a = (((co) this).field_n - uo.field_i) / 2;
                  break L30;
                } else {
                  break L30;
                }
              }
              return;
            }
          }
        } else {
          ((co) this).field_c = false;
          return;
        }
    }

    final mk b(boolean param0) {
        ((co) this).field_b = uo.field_i;
        ((co) this).field_l = wp.field_c;
        ((co) this).field_s.a(((co) this).field_q, 126, ((co) this).field_x);
        wl.field_i = param0 ? true : false;
        mk var2 = wo.a(mc.field_k, 150, ((co) this).field_x, 0, ((co) this).field_q, 0);
        if (!(var2 != null)) {
            ((co) this).b(89);
        }
        return var2;
    }

    final void b(int param0) {
        ((co) this).field_s.a(((co) this).field_b, 127, ((co) this).field_l);
        int var2 = 99 % ((param0 - -17) / 62);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_k = null;
        field_e = null;
        field_u = null;
        field_h = null;
    }

    final void c(int param0) {
        int var2 = 0;
        if (ib.field_f != null) {
          return;
        } else {
          L0: {
            if (uo.field_j <= 0) {
              ((co) this).field_c = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((co) this).field_c) {
            int fieldTemp$1 = ((co) this).field_m - 1;
            ((co) this).field_m = ((co) this).field_m - 1;
            if (fieldTemp$1 <= 0) {
              ((co) this).field_m = ((co) this).field_o;
              if (ri.field_h < ((co) this).field_j) {
                ((co) this).field_c = false;
                return;
              } else {
                this.a(-117);
                var2 = -110 / ((-61 - param0) / 38);
                return;
              }
            } else {
              return;
            }
          } else {
            if (uo.field_i < ((co) this).field_n) {
              ae.field_a = (((co) this).field_n - uo.field_i) / 2;
              if (uo.field_i == ((co) this).field_i) {
                if (((co) this).field_p == wp.field_c) {
                  return;
                } else {
                  ((co) this).field_s.a(((co) this).field_i, 127, ((co) this).field_p);
                  return;
                }
              } else {
                ((co) this).field_s.a(((co) this).field_i, 127, ((co) this).field_p);
                return;
              }
            } else {
              if (((co) this).field_n <= 0) {
                if (uo.field_i == ((co) this).field_i) {
                  if (((co) this).field_p != wp.field_c) {
                    ((co) this).field_s.a(((co) this).field_i, 127, ((co) this).field_p);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((co) this).field_s.a(((co) this).field_i, 127, ((co) this).field_p);
                  return;
                }
              } else {
                ae.field_a = 0;
                if (uo.field_i != ((co) this).field_i) {
                  ((co) this).field_s.a(((co) this).field_i, 127, ((co) this).field_p);
                  return;
                } else {
                  if (((co) this).field_p == wp.field_c) {
                    return;
                  } else {
                    ((co) this).field_s.a(((co) this).field_i, 127, ((co) this).field_p);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private co() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Your ignore list is full. Max of 100 hit.";
        field_u = "Owner";
        field_d = "Achieved";
        field_h = new dq();
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}

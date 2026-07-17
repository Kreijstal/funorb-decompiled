/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    boolean field_h;
    private int field_i;
    int field_p;
    private int field_d;
    private int field_c;
    static pl field_f;
    private int field_e;
    private int field_n;
    private int field_o;
    private int field_q;
    private int field_j;
    int field_s;
    private int field_m;
    private int field_g;
    static String field_a;
    private float field_r;
    private int field_k;
    private int field_t;
    private sh field_l;
    private int field_b;

    final boolean a(byte param0) {
        if (param0 < -113) {
          if (((vm) this).field_i <= cba.field_d) {
            if (-1 >= wla.field_ub) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((vm) this).field_n = -43;
          if (((vm) this).field_i <= cba.field_d) {
            if (-1 <= wla.field_ub) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = ((vm) this).field_d;
        var3 = ((vm) this).field_t;
        if (!((vm) this).a((byte) -115)) {
          ((vm) this).field_h = false;
          return;
        } else {
          L0: {
            if (var3 > ((vm) this).field_m) {
              var3 = ((vm) this).field_m;
              break L0;
            } else {
              if (var3 < ((vm) this).field_e) {
                var3 = ((vm) this).field_e;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (var2 > ((vm) this).field_o) {
              var2 = ((vm) this).field_o;
              break L1;
            } else {
              if (var2 < ((vm) this).field_n) {
                var2 = ((vm) this).field_n;
                if (((vm) this).field_r > 0.0f) {
                  L2: {
                    var4 = (int)(0.5f + ((vm) this).field_r * (float)var3);
                    if (var4 <= var2) {
                      if (var4 < var2) {
                        var2 = var4;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (int)((float)var2 / ((vm) this).field_r);
                      break L2;
                    }
                  }
                  if (mma.field_a == var2) {
                    if (var3 == qf.field_i) {
                      L3: {
                        if (((vm) this).field_d <= 0) {
                          break L3;
                        } else {
                          lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                          break L3;
                        }
                      }
                      return;
                    } else {
                      ((vm) this).field_l.a(var2, -117, var3);
                      L4: {
                        if (((vm) this).field_d <= 0) {
                          break L4;
                        } else {
                          lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    ((vm) this).field_l.a(var2, -117, var3);
                    L5: {
                      if (((vm) this).field_d <= 0) {
                        break L5;
                      } else {
                        lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L6: {
                    if (mma.field_a != var2) {
                      ((vm) this).field_l.a(var2, -117, var3);
                      break L6;
                    } else {
                      if (var3 == qf.field_i) {
                        break L6;
                      } else {
                        ((vm) this).field_l.a(var2, -117, var3);
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (((vm) this).field_d <= 0) {
                      break L7;
                    } else {
                      lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                break L1;
              }
            }
          }
          L8: {
            if (((vm) this).field_r <= 0.0f) {
              break L8;
            } else {
              var4 = (int)(0.5f + ((vm) this).field_r * (float)var3);
              if (var4 <= var2) {
                if (var4 < var2) {
                  var2 = var4;
                  break L8;
                } else {
                  if (mma.field_a != var2) {
                    L9: {
                      ((vm) this).field_l.a(var2, -117, var3);
                      if (((vm) this).field_d <= 0) {
                        break L9;
                      } else {
                        lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                        break L9;
                      }
                    }
                    return;
                  } else {
                    if (var3 == qf.field_i) {
                      if (((vm) this).field_d > 0) {
                        lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((vm) this).field_l.a(var2, -117, var3);
                      if (((vm) this).field_d > 0) {
                        lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L10: {
                  var3 = (int)((float)var2 / ((vm) this).field_r);
                  if (mma.field_a != var2) {
                    ((vm) this).field_l.a(var2, -117, var3);
                    break L10;
                  } else {
                    if (var3 != qf.field_i) {
                      ((vm) this).field_l.a(var2, -117, var3);
                      break L10;
                    } else {
                      if (((vm) this).field_d > 0) {
                        lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (((vm) this).field_d > 0) {
                  lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (mma.field_a != var2) {
            ((vm) this).field_l.a(var2, -117, var3);
            if (((vm) this).field_d > 0) {
              lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
              return;
            } else {
              return;
            }
          } else {
            if (var3 == qf.field_i) {
              if (((vm) this).field_d <= 0) {
                return;
              } else {
                lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                return;
              }
            } else {
              ((vm) this).field_l.a(var2, -117, var3);
              if (((vm) this).field_d > 0) {
                lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 26583) {
            vm.e(-62);
        }
    }

    final void a(boolean param0) {
        if (param0) {
          ((vm) this).a(true);
          if (null != dq.field_f) {
            return;
          } else {
            if (wla.field_ub <= 0) {
              ((vm) this).field_h = false;
              if (((vm) this).field_h) {
                int fieldTemp$6 = ((vm) this).field_q - 1;
                ((vm) this).field_q = ((vm) this).field_q - 1;
                if (fieldTemp$6 > 0) {
                  return;
                } else {
                  ((vm) this).field_q = ((vm) this).field_k;
                  if (~((vm) this).field_i < ~cba.field_d) {
                    ((vm) this).field_h = false;
                    return;
                  } else {
                    int discarded$7 = -102;
                    this.c();
                    return;
                  }
                }
              } else {
                if (~((vm) this).field_d < ~mma.field_a) {
                  lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                  if (~((vm) this).field_b != ~mma.field_a) {
                    ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                    return;
                  } else {
                    if (~((vm) this).field_g != ~qf.field_i) {
                      ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (((vm) this).field_d > 0) {
                    lp.field_g = 0;
                    if (~((vm) this).field_b != ~mma.field_a) {
                      ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                      return;
                    } else {
                      if (~((vm) this).field_g != ~qf.field_i) {
                        ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L0: {
                      if (~((vm) this).field_b != ~mma.field_a) {
                        ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                        break L0;
                      } else {
                        if (~((vm) this).field_g != ~qf.field_i) {
                          ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              if (((vm) this).field_h) {
                int fieldTemp$8 = ((vm) this).field_q - 1;
                ((vm) this).field_q = ((vm) this).field_q - 1;
                if (fieldTemp$8 > 0) {
                  return;
                } else {
                  ((vm) this).field_q = ((vm) this).field_k;
                  if (~((vm) this).field_i < ~cba.field_d) {
                    ((vm) this).field_h = false;
                    return;
                  } else {
                    int discarded$9 = -102;
                    this.c();
                    return;
                  }
                }
              } else {
                if (~((vm) this).field_d < ~mma.field_a) {
                  L1: {
                    lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                    if (~((vm) this).field_b != ~mma.field_a) {
                      ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                      break L1;
                    } else {
                      if (~((vm) this).field_g != ~qf.field_i) {
                        ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return;
                } else {
                  if (((vm) this).field_d > 0) {
                    L2: {
                      lp.field_g = 0;
                      if (~((vm) this).field_b != ~mma.field_a) {
                        ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                        break L2;
                      } else {
                        if (~((vm) this).field_g != ~qf.field_i) {
                          ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return;
                  } else {
                    L3: {
                      if (~((vm) this).field_b != ~mma.field_a) {
                        ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                        break L3;
                      } else {
                        if (~((vm) this).field_g != ~qf.field_i) {
                          ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        } else {
          if (null != dq.field_f) {
            return;
          } else {
            L4: {
              if (wla.field_ub > 0) {
                break L4;
              } else {
                ((vm) this).field_h = false;
                break L4;
              }
            }
            if (((vm) this).field_h) {
              int fieldTemp$10 = ((vm) this).field_q - 1;
              ((vm) this).field_q = ((vm) this).field_q - 1;
              if (fieldTemp$10 > 0) {
                return;
              } else {
                ((vm) this).field_q = ((vm) this).field_k;
                if (~((vm) this).field_i < ~cba.field_d) {
                  ((vm) this).field_h = false;
                  return;
                } else {
                  int discarded$11 = -102;
                  this.c();
                  return;
                }
              }
            } else {
              if (~((vm) this).field_d < ~mma.field_a) {
                L5: {
                  lp.field_g = (((vm) this).field_d + -mma.field_a) / 2;
                  if (~((vm) this).field_b != ~mma.field_a) {
                    ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                    break L5;
                  } else {
                    if (~((vm) this).field_g != ~qf.field_i) {
                      ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                return;
              } else {
                if (((vm) this).field_d > 0) {
                  L6: {
                    lp.field_g = 0;
                    if (~((vm) this).field_b != ~mma.field_a) {
                      ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                      break L6;
                    } else {
                      if (~((vm) this).field_g != ~qf.field_i) {
                        ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  return;
                } else {
                  L7: {
                    if (~((vm) this).field_b != ~mma.field_a) {
                      ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                      break L7;
                    } else {
                      if (~((vm) this).field_g != ~qf.field_i) {
                        ((vm) this).field_l.a(((vm) this).field_b, -124, ((vm) this).field_g);
                        break L7;
                      } else {
                        break L7;
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

    final void a(int param0) {
        ((vm) this).field_l.a(((vm) this).field_c, -122, ((vm) this).field_j);
        if (param0 < 51) {
            ((vm) this).field_o = 114;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((vm) this).field_s = param0;
        ((vm) this).field_p = param1;
        if (param2 != -1) {
            field_a = null;
        }
    }

    final via b(int param0) {
        via var2 = null;
        ((vm) this).field_j = qf.field_i;
        if (param0 == 27013) {
          ((vm) this).field_c = mma.field_a;
          ((vm) this).field_l.a(((vm) this).field_s, -123, ((vm) this).field_p);
          wla.field_Cb = false;
          int discarded$4 = 0;
          var2 = r.a(((vm) this).field_p, 0, param0 + -7720, dsa.field_c, ((vm) this).field_s);
          if (var2 == null) {
            ((vm) this).a(53);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((vm) this).field_s = -44;
          ((vm) this).field_c = mma.field_a;
          ((vm) this).field_l.a(((vm) this).field_s, -123, ((vm) this).field_p);
          wla.field_Cb = false;
          int discarded$5 = 0;
          var2 = r.a(((vm) this).field_p, 0, param0 + -7720, dsa.field_c, ((vm) this).field_s);
          if (var2 != null) {
            return var2;
          } else {
            ((vm) this).a(53);
            return var2;
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        ((vm) this).field_d = param0;
        if (param1) {
            ((vm) this).a(true);
            ((vm) this).field_t = param2;
            return;
        }
        ((vm) this).field_t = param2;
    }

    final boolean a(int param0, byte param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 >= 37) {
          if (((vm) this).field_n <= param2) {
            if (((vm) this).field_o >= param2) {
              if (param0 >= ((vm) this).field_e) {
                if (param0 <= ((vm) this).field_m) {
                  if (0.0f != ((vm) this).field_r) {
                    if (Math.round(((vm) this).field_r * (float)param0) == param2) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((vm) this).a(6, -40, -5);
          if (((vm) this).field_n <= param2) {
            if (((vm) this).field_o >= param2) {
              if (param0 >= ((vm) this).field_e) {
                if (param0 <= ((vm) this).field_m) {
                  if (0.0f == ((vm) this).field_r) {
                    return true;
                  } else {
                    L0: {
                      if (Math.round(((vm) this).field_r * (float)param0) != param2) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L0;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L0;
                      }
                    }
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 == -1) {
          if (wla.field_ub > 0) {
            if (((vm) this).field_i <= cba.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((vm) this).a(-62, true, 91);
          if (wla.field_ub > 0) {
            if (((vm) this).field_i <= cba.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private vm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new pl(2);
        field_a = "Hey you! Get out of the way of these boulders of doom.";
    }
}

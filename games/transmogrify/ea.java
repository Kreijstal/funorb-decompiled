/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_n;
    private boolean field_g;
    private int field_j;
    private int field_a;
    private int field_d;
    private int field_b;
    private int field_h;
    private int field_l;
    private jb field_r;
    private int field_c;
    private float field_s;
    private int field_o;
    private int field_i;
    private int field_k;
    private int field_m;
    private int field_q;
    private int field_p;
    private int field_f;
    private int field_e;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = ((ea) this).field_c;
        if (param0 < 83) {
          field_n = null;
          var3 = ((ea) this).field_q;
          if (!((ea) this).a(48)) {
            ((ea) this).field_g = false;
            return;
          } else {
            L0: {
              if (var3 > ((ea) this).field_j) {
                var3 = ((ea) this).field_j;
                break L0;
              } else {
                if (((ea) this).field_k > var3) {
                  var3 = ((ea) this).field_k;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L1: {
              if (((ea) this).field_i < var2) {
                var2 = ((ea) this).field_i;
                break L1;
              } else {
                if (var2 >= ((ea) this).field_l) {
                  break L1;
                } else {
                  var2 = ((ea) this).field_l;
                  if (((ea) this).field_s > 0.0f) {
                    var4 = (int)((float)var3 * ((ea) this).field_s + 0.5f);
                    if (var4 <= var2) {
                      if (var4 >= var2) {
                        L2: {
                          if (fk.field_E != var2) {
                            ((ea) this).field_r.a(var2, var3, -23222);
                            break L2;
                          } else {
                            if (var3 == mk.field_x) {
                              break L2;
                            } else {
                              ((ea) this).field_r.a(var2, var3, -23222);
                              break L2;
                            }
                          }
                        }
                        L3: {
                          if (0 >= ((ea) this).field_c) {
                            break L3;
                          } else {
                            gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                            break L3;
                          }
                        }
                        return;
                      } else {
                        var2 = var4;
                        L4: {
                          if (fk.field_E != var2) {
                            ((ea) this).field_r.a(var2, var3, -23222);
                            break L4;
                          } else {
                            if (var3 == mk.field_x) {
                              break L4;
                            } else {
                              ((ea) this).field_r.a(var2, var3, -23222);
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (0 >= ((ea) this).field_c) {
                            break L5;
                          } else {
                            gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                            break L5;
                          }
                        }
                        return;
                      }
                    } else {
                      L6: {
                        var3 = (int)((float)var2 / ((ea) this).field_s);
                        if (fk.field_E != var2) {
                          ((ea) this).field_r.a(var2, var3, -23222);
                          break L6;
                        } else {
                          if (var3 == mk.field_x) {
                            break L6;
                          } else {
                            ((ea) this).field_r.a(var2, var3, -23222);
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (0 >= ((ea) this).field_c) {
                          break L7;
                        } else {
                          gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                          break L7;
                        }
                      }
                      return;
                    }
                  } else {
                    L8: {
                      if (fk.field_E != var2) {
                        ((ea) this).field_r.a(var2, var3, -23222);
                        break L8;
                      } else {
                        if (var3 == mk.field_x) {
                          break L8;
                        } else {
                          ((ea) this).field_r.a(var2, var3, -23222);
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (0 >= ((ea) this).field_c) {
                        break L9;
                      } else {
                        gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                        break L9;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (((ea) this).field_s > 0.0f) {
              L10: {
                var4 = (int)((float)var3 * ((ea) this).field_s + 0.5f);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / ((ea) this).field_s);
                  break L10;
                } else {
                  if (var4 >= var2) {
                    break L10;
                  } else {
                    var2 = var4;
                    if (fk.field_E != var2) {
                      L11: {
                        ((ea) this).field_r.a(var2, var3, -23222);
                        if (0 >= ((ea) this).field_c) {
                          break L11;
                        } else {
                          gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                          break L11;
                        }
                      }
                      return;
                    } else {
                      if (var3 == mk.field_x) {
                        if (0 < ((ea) this).field_c) {
                          gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((ea) this).field_r.a(var2, var3, -23222);
                        if (0 < ((ea) this).field_c) {
                          gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (fk.field_E != var2) {
                ((ea) this).field_r.a(var2, var3, -23222);
                if (0 < ((ea) this).field_c) {
                  gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (var3 == mk.field_x) {
                  if (0 >= ((ea) this).field_c) {
                    return;
                  } else {
                    gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                    return;
                  }
                } else {
                  ((ea) this).field_r.a(var2, var3, -23222);
                  if (0 < ((ea) this).field_c) {
                    gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L12: {
                if (fk.field_E != var2) {
                  ((ea) this).field_r.a(var2, var3, -23222);
                  break L12;
                } else {
                  if (var3 == mk.field_x) {
                    break L12;
                  } else {
                    ((ea) this).field_r.a(var2, var3, -23222);
                    break L12;
                  }
                }
              }
              if (0 < ((ea) this).field_c) {
                gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          var3 = ((ea) this).field_q;
          if (!((ea) this).a(48)) {
            ((ea) this).field_g = false;
            return;
          } else {
            L13: {
              if (var3 > ((ea) this).field_j) {
                var3 = ((ea) this).field_j;
                break L13;
              } else {
                if (((ea) this).field_k > var3) {
                  var3 = ((ea) this).field_k;
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (((ea) this).field_i < var2) {
                var2 = ((ea) this).field_i;
                break L14;
              } else {
                if (var2 >= ((ea) this).field_l) {
                  break L14;
                } else {
                  L15: {
                    var2 = ((ea) this).field_l;
                    if (((ea) this).field_s > 0.0f) {
                      var4 = (int)((float)var3 * ((ea) this).field_s + 0.5f);
                      if (var4 > var2) {
                        var3 = (int)((float)var2 / ((ea) this).field_s);
                        break L15;
                      } else {
                        if (var4 >= var2) {
                          break L15;
                        } else {
                          var2 = var4;
                          break L15;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (fk.field_E != var2) {
                      ((ea) this).field_r.a(var2, var3, -23222);
                      break L16;
                    } else {
                      if (var3 == mk.field_x) {
                        break L16;
                      } else {
                        ((ea) this).field_r.a(var2, var3, -23222);
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (0 >= ((ea) this).field_c) {
                      break L17;
                    } else {
                      gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                      break L17;
                    }
                  }
                  return;
                }
              }
            }
            if (((ea) this).field_s > 0.0f) {
              L18: {
                var4 = (int)((float)var3 * ((ea) this).field_s + 0.5f);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / ((ea) this).field_s);
                  break L18;
                } else {
                  if (var4 >= var2) {
                    break L18;
                  } else {
                    L19: {
                      var2 = var4;
                      if (fk.field_E != var2) {
                        ((ea) this).field_r.a(var2, var3, -23222);
                        break L19;
                      } else {
                        if (var3 == mk.field_x) {
                          break L19;
                        } else {
                          ((ea) this).field_r.a(var2, var3, -23222);
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (0 >= ((ea) this).field_c) {
                        break L20;
                      } else {
                        gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                        break L20;
                      }
                    }
                    return;
                  }
                }
              }
              if (fk.field_E != var2) {
                L21: {
                  ((ea) this).field_r.a(var2, var3, -23222);
                  if (0 >= ((ea) this).field_c) {
                    break L21;
                  } else {
                    gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                    break L21;
                  }
                }
                return;
              } else {
                if (var3 == mk.field_x) {
                  if (0 < ((ea) this).field_c) {
                    gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L22: {
                    ((ea) this).field_r.a(var2, var3, -23222);
                    if (0 >= ((ea) this).field_c) {
                      break L22;
                    } else {
                      gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                      break L22;
                    }
                  }
                  return;
                }
              }
            } else {
              L23: {
                if (fk.field_E != var2) {
                  ((ea) this).field_r.a(var2, var3, -23222);
                  break L23;
                } else {
                  if (var3 == mk.field_x) {
                    break L23;
                  } else {
                    ((ea) this).field_r.a(var2, var3, -23222);
                    break L23;
                  }
                }
              }
              L24: {
                if (0 >= ((ea) this).field_c) {
                  break L24;
                } else {
                  gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                  break L24;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 <= 102) {
          ((ea) this).field_h = 4;
          ((ea) this).field_q = param0;
          ((ea) this).field_c = param1;
          return;
        } else {
          ((ea) this).field_q = param0;
          ((ea) this).field_c = param1;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 >= 47) {
          if (((ea) this).field_h <= qa.field_p) {
            if (wj.field_o <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final dg d(byte param0) {
        dg var2 = null;
        ((ea) this).field_p = fk.field_E;
        ((ea) this).field_e = mk.field_x;
        ((ea) this).field_r.a(((ea) this).field_a, ((ea) this).field_o, -23222);
        if (param0 != -18) {
          L0: {
            this.a((byte) -73);
            mg.field_c = false;
            var2 = ql.a(0, 0, lk.field_b, 0, ((ea) this).field_a, ((ea) this).field_o);
            if (var2 == null) {
              ((ea) this).c((byte) -125);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            mg.field_c = false;
            var2 = ql.a(0, 0, lk.field_b, 0, ((ea) this).field_a, ((ea) this).field_o);
            if (var2 == null) {
              ((ea) this).c((byte) -125);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final void b(int param0) {
        if (ub.field_c != null) {
          return;
        } else {
          if (param0 < wj.field_o) {
            if (!((ea) this).field_g) {
              if (((ea) this).field_c > fk.field_E) {
                gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                if (((ea) this).field_d == fk.field_E) {
                  if (mk.field_x != ((ea) this).field_f) {
                    ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                  return;
                }
              } else {
                if (((ea) this).field_c > 0) {
                  gl.field_D = 0;
                  if (((ea) this).field_d == fk.field_E) {
                    if (mk.field_x != ((ea) this).field_f) {
                      ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                    return;
                  }
                } else {
                  if (((ea) this).field_d == fk.field_E) {
                    if (mk.field_x == ((ea) this).field_f) {
                      return;
                    } else {
                      ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                      return;
                    }
                  } else {
                    ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                    return;
                  }
                }
              }
            } else {
              int fieldTemp$2 = ((ea) this).field_m - 1;
              ((ea) this).field_m = ((ea) this).field_m - 1;
              if (fieldTemp$2 <= 0) {
                ((ea) this).field_m = ((ea) this).field_b;
                if (qa.field_p < ((ea) this).field_h) {
                  ((ea) this).field_g = false;
                  return;
                } else {
                  this.a((byte) 107);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((ea) this).field_g = false;
            if (!((ea) this).field_g) {
              L0: {
                if (((ea) this).field_c > fk.field_E) {
                  gl.field_D = (-fk.field_E + ((ea) this).field_c) / 2;
                  break L0;
                } else {
                  if (((ea) this).field_c > 0) {
                    gl.field_D = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              if (((ea) this).field_d == fk.field_E) {
                if (mk.field_x == ((ea) this).field_f) {
                  return;
                } else {
                  ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                  return;
                }
              } else {
                ((ea) this).field_r.a(((ea) this).field_d, ((ea) this).field_f, -23222);
                return;
              }
            } else {
              int fieldTemp$3 = ((ea) this).field_m - 1;
              ((ea) this).field_m = ((ea) this).field_m - 1;
              if (fieldTemp$3 <= 0) {
                ((ea) this).field_m = ((ea) this).field_b;
                if (qa.field_p < ((ea) this).field_h) {
                  ((ea) this).field_g = false;
                  return;
                } else {
                  this.a((byte) 107);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = -90 / ((param0 - -63) / 61);
        ((ea) this).field_r.a(((ea) this).field_p, ((ea) this).field_e, -23222);
    }

    final static void a(byte param0, java.applet.Applet param1, boolean param2, String param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                L1: {
                  if (fe.field_k.startsWith("win")) {
                    int discarded$8 = 2117267440;
                    if (ca.a(param3)) {
                      return;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                {
                  L2: {
                    param1.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var4_ref;
                stackOut_9_1 = new StringBuilder().append("ea.H(").append(68).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L4;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L4;
                }
              }
              L5: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L5;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static mi a(byte[] param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ea.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 0 + ')');
        }
        return (mi) (Object) stackIn_4_0;
    }

    public static void b() {
        int var1 = 41;
        field_n = null;
    }

    private ea() throws Throwable {
        throw new Error();
    }

    static {
    }
}

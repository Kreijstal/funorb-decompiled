/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static long field_k;
    static ir[] field_d;
    private int field_c;
    private int field_b;
    int field_h;
    int field_e;
    private boolean field_g;
    static String field_j;
    private int field_i;
    private int field_f;
    boolean field_a;
    static int field_l;

    public static void g(int param0) {
        field_j = null;
        int var1 = 98 / ((param0 - -72) / 33);
        field_d = null;
    }

    final void a(int param0, byte param1) {
        if (this.field_f != 0) {
          if (param1 != 1) {
            this.f(107);
            return;
          } else {
            return;
          }
        } else {
          this.field_g = false;
          this.field_h = param0;
          this.field_a = true;
          if (param1 == 1) {
            return;
          } else {
            this.f(107);
            return;
          }
        }
    }

    final void a(boolean param0) {
        this.field_b = 0;
        this.field_a = param0 ? true : false;
        this.field_c = 0;
        if (!(this.field_f != 0)) {
            this.field_c = qi.field_a;
        }
    }

    final static void a(byte param0) {
        int var1 = 11 / ((42 - param0) / 35);
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 77) {
          L0: {
            this.c((byte) -114);
            if (this.field_f == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_f == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        if (this.field_e <= param1) {
          throw new IllegalArgumentException();
        } else {
          if (param0 < this.field_e) {
            L0: {
              this.field_c = 0;
              this.field_a = false;
              this.field_b = 0;
              var4 = -36 % ((17 - param2) / 35);
              if (0 != ne.field_s) {
                this.field_f = ne.field_s;
                this.field_i = lc.field_V;
                this.field_g = true;
                this.field_b = ne.field_s;
                this.field_h = param0;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_f != 0) {
              if (cd.field_b != 0) {
                if (-1 > (this.field_i ^ -1)) {
                  this.field_i = this.field_i - 1;
                  L1: {
                    if (ne.field_s != 0) {
                      break L1;
                    } else {
                      if (0 != cd.field_b) {
                        break L1;
                      } else {
                        this.field_f = 0;
                        if (this.field_f == 0) {
                          L2: {
                            if (this.field_g) {
                              break L2;
                            } else {
                              if (re.field_c) {
                                break L2;
                              } else {
                                return;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (this.field_g) {
                              this.field_h = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (this.field_h == param1) {
                              this.field_g = true;
                              this.field_h = param1;
                              return;
                            } else {
                              this.field_a = true;
                              this.field_g = true;
                              this.field_h = param1;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_f == 0) {
                    L3: {
                      if (this.field_g) {
                        break L3;
                      } else {
                        if (re.field_c) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                    if (param1 < 0) {
                      if (!this.field_g) {
                        return;
                      } else {
                        this.field_h = -1;
                        return;
                      }
                    } else {
                      if (this.field_h == param1) {
                        this.field_g = true;
                        this.field_h = param1;
                        return;
                      } else {
                        this.field_a = true;
                        this.field_g = true;
                        this.field_h = param1;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  this.field_i = kh.field_oc;
                  this.field_i = this.field_i - 1;
                  if (ne.field_s == 0) {
                    if (0 == cd.field_b) {
                      this.field_f = 0;
                      if (this.field_f == 0) {
                        L4: {
                          L5: {
                            if (this.field_g) {
                              break L5;
                            } else {
                              if (re.field_c) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (this.field_g) {
                              this.field_h = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (this.field_h == param1) {
                              this.field_g = true;
                              this.field_h = param1;
                              break L4;
                            } else {
                              this.field_a = true;
                              this.field_g = true;
                              this.field_h = param1;
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (this.field_f == 0) {
                        L6: {
                          L7: {
                            if (this.field_g) {
                              break L7;
                            } else {
                              if (re.field_c) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (!this.field_g) {
                              return;
                            } else {
                              this.field_h = -1;
                              return;
                            }
                          } else {
                            if (this.field_h == param1) {
                              this.field_g = true;
                              this.field_h = param1;
                              break L6;
                            } else {
                              this.field_a = true;
                              this.field_g = true;
                              this.field_h = param1;
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (this.field_f == 0) {
                      L8: {
                        L9: {
                          if (this.field_g) {
                            break L9;
                          } else {
                            if (re.field_c) {
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (!this.field_g) {
                            return;
                          } else {
                            this.field_h = -1;
                            return;
                          }
                        } else {
                          if (this.field_h == param1) {
                            this.field_g = true;
                            this.field_h = param1;
                            break L8;
                          } else {
                            this.field_a = true;
                            this.field_g = true;
                            this.field_h = param1;
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L10: {
                  if (ne.field_s != 0) {
                    break L10;
                  } else {
                    if (0 != cd.field_b) {
                      break L10;
                    } else {
                      L11: {
                        this.field_f = 0;
                        if (this.field_f != 0) {
                          break L11;
                        } else {
                          L12: {
                            if (this.field_g) {
                              break L12;
                            } else {
                              if (re.field_c) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (this.field_g) {
                              this.field_h = -1;
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            if (this.field_h == param1) {
                              this.field_g = true;
                              this.field_h = param1;
                              break L11;
                            } else {
                              this.field_a = true;
                              this.field_g = true;
                              this.field_h = param1;
                              break L11;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_f == 0) {
                  L13: {
                    if (this.field_g) {
                      break L13;
                    } else {
                      if (re.field_c) {
                        break L13;
                      } else {
                        return;
                      }
                    }
                  }
                  if (param1 < 0) {
                    if (!this.field_g) {
                      return;
                    } else {
                      this.field_h = -1;
                      return;
                    }
                  } else {
                    if (this.field_h == param1) {
                      this.field_g = true;
                      this.field_h = param1;
                      return;
                    } else {
                      this.field_a = true;
                      this.field_g = true;
                      this.field_h = param1;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L14: {
                if (ne.field_s != 0) {
                  break L14;
                } else {
                  if (0 != cd.field_b) {
                    break L14;
                  } else {
                    L15: {
                      this.field_f = 0;
                      if (this.field_f != 0) {
                        break L15;
                      } else {
                        L16: {
                          if (this.field_g) {
                            break L16;
                          } else {
                            if (re.field_c) {
                              break L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (this.field_g) {
                            this.field_h = -1;
                            break L15;
                          } else {
                            break L15;
                          }
                        } else {
                          if (this.field_h == param1) {
                            this.field_g = true;
                            this.field_h = param1;
                            break L15;
                          } else {
                            this.field_a = true;
                            this.field_g = true;
                            this.field_h = param1;
                            break L15;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_f == 0) {
                L17: {
                  if (this.field_g) {
                    break L17;
                  } else {
                    if (re.field_c) {
                      break L17;
                    } else {
                      return;
                    }
                  }
                }
                if (param1 < 0) {
                  if (!this.field_g) {
                    return;
                  } else {
                    this.field_h = -1;
                    return;
                  }
                } else {
                  if (this.field_h == param1) {
                    this.field_g = true;
                    this.field_h = param1;
                    return;
                  } else {
                    this.field_a = true;
                    this.field_g = true;
                    this.field_h = param1;
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final static void h(int param0) {
        if (-1 <= (hb.field_a ^ -1)) {
          if (0 < uf.field_z) {
            uf.field_z = uf.field_z - 1;
            if (hb.field_a <= 0) {
              if (0 >= uf.field_z) {
                L0: {
                  if ((nj.field_b ^ -1) < -1) {
                    fr.a((byte) -35, nj.field_b);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (param0 != -13953) {
                  ia.g(67);
                  return;
                } else {
                  return;
                }
              } else {
                L1: {
                  fr.a((byte) -42, uf.field_z);
                  if ((nj.field_b ^ -1) < -1) {
                    fr.a((byte) -35, nj.field_b);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param0 != -13953) {
                  ia.g(67);
                  return;
                } else {
                  return;
                }
              }
            } else {
              qi.a((byte) -80);
              if (0 >= uf.field_z) {
                L2: {
                  if ((nj.field_b ^ -1) < -1) {
                    fr.a((byte) -35, nj.field_b);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param0 != -13953) {
                  ia.g(67);
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  fr.a((byte) -42, uf.field_z);
                  if ((nj.field_b ^ -1) < -1) {
                    fr.a((byte) -35, nj.field_b);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param0 != -13953) {
                  ia.g(67);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if ((nj.field_b ^ -1) < -1) {
              nj.field_b = nj.field_b - 1;
              if (hb.field_a <= 0) {
                if (0 >= uf.field_z) {
                  L4: {
                    if ((nj.field_b ^ -1) < -1) {
                      fr.a((byte) -35, nj.field_b);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (param0 != -13953) {
                    ia.g(67);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L5: {
                    fr.a((byte) -42, uf.field_z);
                    if ((nj.field_b ^ -1) < -1) {
                      fr.a((byte) -35, nj.field_b);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param0 == -13953) {
                      break L6;
                    } else {
                      ia.g(67);
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                L7: {
                  qi.a((byte) -80);
                  if (0 >= uf.field_z) {
                    break L7;
                  } else {
                    fr.a((byte) -42, uf.field_z);
                    break L7;
                  }
                }
                L8: {
                  if ((nj.field_b ^ -1) < -1) {
                    fr.a((byte) -35, nj.field_b);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0 == -13953) {
                    break L9;
                  } else {
                    ia.g(67);
                    break L9;
                  }
                }
                return;
              }
            } else {
              if (hb.field_a <= 0) {
                L10: {
                  if (0 >= uf.field_z) {
                    break L10;
                  } else {
                    fr.a((byte) -42, uf.field_z);
                    break L10;
                  }
                }
                L11: {
                  if ((nj.field_b ^ -1) < -1) {
                    fr.a((byte) -35, nj.field_b);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param0 == -13953) {
                    break L12;
                  } else {
                    ia.g(67);
                    break L12;
                  }
                }
                return;
              } else {
                L13: {
                  qi.a((byte) -80);
                  if (0 >= uf.field_z) {
                    break L13;
                  } else {
                    fr.a((byte) -42, uf.field_z);
                    break L13;
                  }
                }
                L14: {
                  if ((nj.field_b ^ -1) < -1) {
                    fr.a((byte) -35, nj.field_b);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0 == -13953) {
                    break L15;
                  } else {
                    ia.g(67);
                    break L15;
                  }
                }
                return;
              }
            }
          }
        } else {
          hb.field_a = hb.field_a - 1;
          if (hb.field_a > 0) {
            qi.a((byte) -80);
            if (0 < uf.field_z) {
              L16: {
                fr.a((byte) -42, uf.field_z);
                if ((nj.field_b ^ -1) < -1) {
                  fr.a((byte) -35, nj.field_b);
                  break L16;
                } else {
                  break L16;
                }
              }
              if (param0 == -13953) {
                return;
              } else {
                ia.g(67);
                return;
              }
            } else {
              L17: {
                if ((nj.field_b ^ -1) < -1) {
                  fr.a((byte) -35, nj.field_b);
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param0 == -13953) {
                  break L18;
                } else {
                  ia.g(67);
                  break L18;
                }
              }
              return;
            }
          } else {
            L19: {
              if (0 >= uf.field_z) {
                break L19;
              } else {
                fr.a((byte) -42, uf.field_z);
                break L19;
              }
            }
            L20: {
              if ((nj.field_b ^ -1) < -1) {
                fr.a((byte) -35, nj.field_b);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (param0 == -13953) {
                break L21;
              } else {
                ia.g(67);
                break L21;
              }
            }
            return;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        vh var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 24552) {
                break L1;
              } else {
                var3 = (vh) null;
                ia.a(false, (vh) null);
                break L1;
              }
            }
            L2: {
              if (null == hl.a(param0, param1 ^ 24553)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ia.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1) {
          L0: {
            field_l = 96;
            if (null == oq.field_z) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == oq.field_z) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -20421) {
          L0: {
            this.field_a = true;
            if (-97 != (this.field_c ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-97 != (this.field_c ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param0) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((ia) (this)).field_g = stackIn_3_1 != 0;
        if (!param3) {
          return;
        } else {
          L1: {
            this.field_f = 0;
            if (this.field_g) {
              this.field_h = param2;
              break L1;
            } else {
              this.field_h = param1;
              break L1;
            }
          }
          return;
        }
    }

    final void e(int param0) {
        this.field_b = 0;
        this.field_a = false;
        this.field_c = 0;
        if (this.field_f != 0) {
          L0: {
            if (this.field_f != 0) {
              break L0;
            } else {
              if (98 != qi.field_a) {
                break L0;
              } else {
                L1: {
                  if ((this.field_h ^ -1) >= -1) {
                    this.field_h = this.field_e;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_a = true;
                this.field_g = false;
                this.field_h = this.field_h - 1;
                break L0;
              }
            }
          }
          if (param0 != -15525) {
            return;
          } else {
            L2: {
              if (-1 != (this.field_f ^ -1)) {
                break L2;
              } else {
                if (qi.field_a != 99) {
                  break L2;
                } else {
                  L3: {
                    this.field_h = this.field_h + 1;
                    this.field_g = false;
                    if (this.field_e <= this.field_h) {
                      this.field_h = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_a = true;
                  break L2;
                }
              }
            }
            return;
          }
        } else {
          this.field_c = qi.field_a;
          if (this.field_f == 0) {
            if (98 == qi.field_a) {
              L4: {
                if ((this.field_h ^ -1) >= -1) {
                  this.field_h = this.field_e;
                  break L4;
                } else {
                  break L4;
                }
              }
              this.field_a = true;
              this.field_g = false;
              this.field_h = this.field_h - 1;
              if (param0 != -15525) {
                return;
              } else {
                L5: {
                  if (-1 != (this.field_f ^ -1)) {
                    break L5;
                  } else {
                    if (qi.field_a != 99) {
                      break L5;
                    } else {
                      L6: {
                        this.field_h = this.field_h + 1;
                        this.field_g = false;
                        if (this.field_e <= this.field_h) {
                          this.field_h = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_a = true;
                      break L5;
                    }
                  }
                }
                return;
              }
            } else {
              if (param0 != -15525) {
                return;
              } else {
                L7: {
                  if (-1 != (this.field_f ^ -1)) {
                    break L7;
                  } else {
                    if (qi.field_a != 99) {
                      break L7;
                    } else {
                      L8: {
                        this.field_h = this.field_h + 1;
                        this.field_g = false;
                        if (this.field_e <= this.field_h) {
                          this.field_h = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      this.field_a = true;
                      break L7;
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (param0 == -15525) {
              if (-1 == (this.field_f ^ -1)) {
                if (qi.field_a != 99) {
                  return;
                } else {
                  L9: {
                    this.field_h = this.field_h + 1;
                    this.field_g = false;
                    if (this.field_e <= this.field_h) {
                      this.field_h = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_a = true;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(boolean param0, vh param1) {
        try {
            param1.field_N = 16777215;
            param1.field_Fb = 1;
            param1.field_I = (lr) ((Object) sa.field_h);
            param1.field_F = rm.field_g;
            param1.field_X = null;
            if (!param0) {
                field_d = (ir[]) null;
            }
            param1.field_cb = 1;
            param1.field_Gb = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ia.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 103) {
          L0: {
            this.a(false, 98, 79, false);
            if (103 != this.field_c) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (103 != this.field_c) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1) {
          L0: {
            ia.g(19);
            if (97 != this.field_c) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (97 != this.field_c) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean b(byte param0) {
        if (param0 >= 49) {
          if (this.field_b == 0) {
            if (this.field_c != 84) {
              if ((this.field_c ^ -1) == -84) {
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
          return false;
        }
    }

    final void a(boolean param0, int param1) {
        this.field_b = 0;
        this.field_c = 0;
        this.field_a = false;
        if (-1 == (this.field_f ^ -1)) {
          if (-97 == (qi.field_a ^ -1)) {
            L0: {
              if ((this.field_h ^ -1) >= -1) {
                this.field_h = this.field_e;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              this.field_h = this.field_h - 1;
              this.field_g = false;
              this.field_a = true;
              if (-1 == (this.field_f ^ -1)) {
                this.field_c = qi.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0) {
              L2: {
                if (-1 != (this.field_f ^ -1)) {
                  break L2;
                } else {
                  if (97 == qi.field_a) {
                    L3: {
                      this.field_h = this.field_h + 1;
                      if (this.field_e <= this.field_h) {
                        this.field_h = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_a = true;
                    this.field_g = false;
                    break L2;
                  } else {
                    L4: {
                      if (0 != this.field_f) {
                        break L4;
                      } else {
                        if (qi.field_a == 98) {
                          this.field_g = false;
                          this.field_a = true;
                          if ((this.field_h ^ -1) > -1) {
                            this.field_h = param1;
                            break L4;
                          } else {
                            return;
                          }
                        } else {
                          if (qi.field_a != 99) {
                            break L4;
                          } else {
                            L5: {
                              this.field_g = false;
                              this.field_a = true;
                              if ((this.field_h ^ -1) > -1) {
                                this.field_h = param1;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L6: {
                if (0 != this.field_f) {
                  break L6;
                } else {
                  if (qi.field_a == 98) {
                    this.field_g = false;
                    this.field_a = true;
                    if ((this.field_h ^ -1) > -1) {
                      this.field_h = param1;
                      break L6;
                    } else {
                      return;
                    }
                  } else {
                    if (qi.field_a != 99) {
                      break L6;
                    } else {
                      L7: {
                        this.field_g = false;
                        this.field_a = true;
                        if ((this.field_h ^ -1) > -1) {
                          this.field_h = param1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L8: {
              if (-1 == (this.field_f ^ -1)) {
                this.field_c = qi.field_a;
                break L8;
              } else {
                break L8;
              }
            }
            if (param0) {
              L9: {
                if (-1 != (this.field_f ^ -1)) {
                  break L9;
                } else {
                  if (97 == qi.field_a) {
                    L10: {
                      this.field_h = this.field_h + 1;
                      if (this.field_e <= this.field_h) {
                        this.field_h = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    this.field_a = true;
                    this.field_g = false;
                    break L9;
                  } else {
                    if (0 == this.field_f) {
                      if (qi.field_a == 98) {
                        this.field_g = false;
                        this.field_a = true;
                        if ((this.field_h ^ -1) <= -1) {
                          return;
                        } else {
                          this.field_h = param1;
                          return;
                        }
                      } else {
                        if (qi.field_a != 99) {
                          return;
                        } else {
                          L11: {
                            this.field_g = false;
                            this.field_a = true;
                            if ((this.field_h ^ -1) > -1) {
                              this.field_h = param1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (0 == this.field_f) {
                if (qi.field_a == 98) {
                  this.field_g = false;
                  this.field_a = true;
                  if ((this.field_h ^ -1) <= -1) {
                    return;
                  } else {
                    this.field_h = param1;
                    return;
                  }
                } else {
                  if (qi.field_a != 99) {
                    return;
                  } else {
                    L12: {
                      this.field_g = false;
                      this.field_a = true;
                      if ((this.field_h ^ -1) > -1) {
                        this.field_h = param1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
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
        } else {
          L13: {
            if (-1 == (this.field_f ^ -1)) {
              this.field_c = qi.field_a;
              break L13;
            } else {
              break L13;
            }
          }
          if (param0) {
            L14: {
              if (-1 != (this.field_f ^ -1)) {
                break L14;
              } else {
                if (97 == qi.field_a) {
                  L15: {
                    this.field_h = this.field_h + 1;
                    if (this.field_e <= this.field_h) {
                      this.field_h = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  this.field_a = true;
                  this.field_g = false;
                  break L14;
                } else {
                  if (0 == this.field_f) {
                    if (qi.field_a == 98) {
                      this.field_g = false;
                      this.field_a = true;
                      if ((this.field_h ^ -1) <= -1) {
                        return;
                      } else {
                        this.field_h = param1;
                        return;
                      }
                    } else {
                      if (qi.field_a == 99) {
                        L16: {
                          this.field_g = false;
                          this.field_a = true;
                          if ((this.field_h ^ -1) > -1) {
                            this.field_h = param1;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (0 == this.field_f) {
              if (qi.field_a == 98) {
                this.field_g = false;
                this.field_a = true;
                if ((this.field_h ^ -1) <= -1) {
                  return;
                } else {
                  this.field_h = param1;
                  return;
                }
              } else {
                if (qi.field_a == 99) {
                  L17: {
                    this.field_g = false;
                    this.field_a = true;
                    if ((this.field_h ^ -1) > -1) {
                      this.field_h = param1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  return;
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

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 19) {
          L0: {
            ia.b(-55);
            if ((this.field_c ^ -1) != -103) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.field_c ^ -1) != -103) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ia(int param0) {
        this.field_g = false;
        this.field_h = 0;
        this.field_e = param0;
    }

    static {
        field_j = "Offer rematch";
        field_l = -1;
    }
}

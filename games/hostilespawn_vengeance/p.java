/*
 * Decompiled by CFR-JS 0.4.0.
 */
class p {
    oc field_j;
    static String[] field_g;
    static java.applet.Applet field_a;
    static bd field_d;
    static ic[] field_m;
    static String[] field_k;
    og field_l;
    boolean field_b;
    boolean field_f;
    int field_h;
    int field_i;
    double field_c;
    int field_e;
    boolean field_n;

    final void a(int param0) {
        if (param0 == 8573) {
          if (0.0 <= this.field_l.field_f) {
            L0: {
              if (this.field_l.field_f > 1.0) {
                this.field_j.field_e = this.field_j.field_e + 1;
                this.field_l.field_f = this.field_l.field_f - 1.0;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_l.field_a < 0.0) {
              L1: {
                this.field_l.field_a = this.field_l.field_a + 1.0;
                this.field_j.field_g = this.field_j.field_g - 1;
                if (this.field_l.field_a > 1.0) {
                  this.field_l.field_a = this.field_l.field_a - 1.0;
                  this.field_j.field_g = this.field_j.field_g + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                if (this.field_l.field_a > 1.0) {
                  this.field_l.field_a = this.field_l.field_a - 1.0;
                  this.field_j.field_g = this.field_j.field_g + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            L3: {
              this.field_j.field_e = this.field_j.field_e - 1;
              this.field_l.field_f = this.field_l.field_f + 1.0;
              if (this.field_l.field_f > 1.0) {
                this.field_j.field_e = this.field_j.field_e + 1;
                this.field_l.field_f = this.field_l.field_f - 1.0;
                break L3;
              } else {
                break L3;
              }
            }
            if (this.field_l.field_a >= 0.0) {
              L4: {
                if (this.field_l.field_a > 1.0) {
                  this.field_l.field_a = this.field_l.field_a - 1.0;
                  this.field_j.field_g = this.field_j.field_g + 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                this.field_l.field_a = this.field_l.field_a + 1.0;
                this.field_j.field_g = this.field_j.field_g - 1;
                if (this.field_l.field_a > 1.0) {
                  this.field_l.field_a = this.field_l.field_a - 1.0;
                  this.field_j.field_g = this.field_j.field_g + 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean[] a(int param0, int param1, id param2) {
        boolean[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        boolean[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_i != param1) {
                if (!this.field_b) {
                  var4 = this.field_l.a(param0, this.field_c, this.field_j, false, param2);
                  break L1;
                } else {
                  var4 = this.field_l.a(this.field_j, this.field_c, 1, param0, param2);
                  break L1;
                }
              } else {
                var4 = this.field_l.a(this.field_c, this.field_j, param0, param2, (byte) -71);
                break L1;
              }
            }
            this.b((byte) 117);
            stackIn_7_0 = (boolean[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("p.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(byte param0) {
        if (param0 != 54) {
            id var3 = (id) null;
            this.a(-16, -122, (id) null);
            return false;
        }
        return false;
    }

    public static void d(int param0) {
        field_a = null;
        field_g = null;
        field_m = null;
        field_k = null;
        field_d = null;
        if (param0 != -4676) {
            field_a = (java.applet.Applet) null;
        }
    }

    final boolean a(double param0, double param1, int param2) {
        int var6;
        int var7;
        if (param2 == 29821) {
          var6 = (int)((-param0 + ((double)this.field_j.field_e + this.field_l.field_f)) * 24.0);
          var7 = (int)((-param1 + ((double)this.field_j.field_g + this.field_l.field_a)) * 24.0);
          if ((var6 ^ -1) <= 15) {
            if (16 >= var6) {
              if (var7 >= -16) {
                if (-17 > (var7 ^ -1)) {
                  return false;
                } else {
                  return true;
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
          return true;
        }
    }

    final void b(byte param0) {
        L0: {
          if (this.field_l.field_f < 0.0) {
            this.field_j.field_e = this.field_j.field_e - 1;
            this.field_l.field_f = this.field_l.field_f + 1.0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 117) {
          L1: {
            field_k = (String[]) null;
            if (this.field_l.field_f > 1.0) {
              this.field_j.field_e = this.field_j.field_e + 1;
              this.field_l.field_f = this.field_l.field_f - 1.0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_l.field_a < 0.0) {
              this.field_l.field_a = this.field_l.field_a + 1.0;
              this.field_j.field_g = this.field_j.field_g - 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (this.field_l.field_a > 1.0) {
              this.field_l.field_a = this.field_l.field_a - 1.0;
              this.field_j.field_g = this.field_j.field_g + 1;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (this.field_l.field_f > 1.0) {
              this.field_j.field_e = this.field_j.field_e + 1;
              this.field_l.field_f = this.field_l.field_f - 1.0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (this.field_l.field_a < 0.0) {
              this.field_l.field_a = this.field_l.field_a + 1.0;
              this.field_j.field_g = this.field_j.field_g - 1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (this.field_l.field_a > 1.0) {
              this.field_l.field_a = this.field_l.field_a - 1.0;
              this.field_j.field_g = this.field_j.field_g + 1;
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    void a(int param0, double param1, int param2) {
        double var5;
        int var7;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          if (param1 >= 0.0) {
            if (param1 >= 256.0) {
              param1 = param1 - 256.0;
              break L0;
            } else {
              break L0;
            }
          } else {
            param1 = param1 + 256.0;
            break L0;
          }
        }
        if (param0 == 225) {
          L1: {
            var5 = param1 - this.field_c;
            if (var5 < 128.0) {
              if (-128.0 > var5) {
                var5 = var5 + 256.0;
                break L1;
              } else {
                if (var5 <= (double)param2) {
                  if (var5 >= (double)(-param2)) {
                    this.field_c = param1;
                    if (256.0 > this.field_c) {
                      if (0.0 > this.field_c) {
                        this.field_c = this.field_c + 256.0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_c = this.field_c - 256.0;
                      return;
                    }
                  } else {
                    L2: {
                      if (var5 >= 0.0) {
                        this.field_c = this.field_c + (double)param2;
                        break L2;
                      } else {
                        this.field_c = this.field_c - (double)param2;
                        break L2;
                      }
                    }
                    if (256.0 > this.field_c) {
                      if (0.0 <= this.field_c) {
                        return;
                      } else {
                        this.field_c = this.field_c + 256.0;
                        return;
                      }
                    } else {
                      this.field_c = this.field_c - 256.0;
                      return;
                    }
                  }
                } else {
                  L3: {
                    if (var5 >= 0.0) {
                      this.field_c = this.field_c + (double)param2;
                      break L3;
                    } else {
                      this.field_c = this.field_c - (double)param2;
                      break L3;
                    }
                  }
                  L4: {
                    if (256.0 <= this.field_c) {
                      this.field_c = this.field_c - 256.0;
                      break L4;
                    } else {
                      if (0.0 <= this.field_c) {
                        break L4;
                      } else {
                        this.field_c = this.field_c + 256.0;
                        break L4;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              var5 = var5 - 256.0;
              break L1;
            }
          }
          if (var5 <= (double)param2) {
            if (var5 >= (double)(-param2)) {
              this.field_c = param1;
              if (256.0 > this.field_c) {
                if (0.0 > this.field_c) {
                  this.field_c = this.field_c + 256.0;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_c = this.field_c - 256.0;
                return;
              }
            } else {
              if (var5 >= 0.0) {
                this.field_c = this.field_c + (double)param2;
                if (256.0 > this.field_c) {
                  if (0.0 <= this.field_c) {
                    return;
                  } else {
                    this.field_c = this.field_c + 256.0;
                    return;
                  }
                } else {
                  this.field_c = this.field_c - 256.0;
                  return;
                }
              } else {
                this.field_c = this.field_c - (double)param2;
                if (256.0 > this.field_c) {
                  if (0.0 <= this.field_c) {
                    return;
                  } else {
                    this.field_c = this.field_c + 256.0;
                    return;
                  }
                } else {
                  this.field_c = this.field_c - 256.0;
                  return;
                }
              }
            }
          } else {
            if (var5 >= 0.0) {
              this.field_c = this.field_c + (double)param2;
              if (256.0 > this.field_c) {
                if (0.0 > this.field_c) {
                  this.field_c = this.field_c + 256.0;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_c = this.field_c - 256.0;
                return;
              }
            } else {
              this.field_c = this.field_c - (double)param2;
              if (256.0 > this.field_c) {
                if (0.0 > this.field_c) {
                  this.field_c = this.field_c + 256.0;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_c = this.field_c - 256.0;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 6) {
          L0: {
            this.a((byte) 27);
            if (6 != this.field_i) {
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
            if (6 != this.field_i) {
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

    final int c(int param0) {
        if (this.field_i != 36) {
          if (this.field_i != 37) {
            if (this.field_i != 41) {
              if ((this.field_i ^ -1) != -92) {
                if (198 > this.field_i) {
                  if (223 == this.field_i) {
                    return 0;
                  } else {
                    if ((this.field_i ^ -1) != -253) {
                      if (this.field_i != 35) {
                        if ((this.field_i ^ -1) > -284) {
                          if ((this.field_i ^ -1) != -151) {
                            L0: {
                              if (-324 < (this.field_i ^ -1)) {
                                break L0;
                              } else {
                                if (331 < this.field_i) {
                                  break L0;
                                } else {
                                  return 0;
                                }
                              }
                            }
                            if (param0 == 0) {
                              if (335 <= this.field_i) {
                                if (338 >= this.field_i) {
                                  return 0;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 1;
                              }
                            } else {
                              return -50;
                            }
                          } else {
                            return 0;
                          }
                        } else {
                          if ((this.field_i ^ -1) <= -309) {
                            if ((this.field_i ^ -1) != -151) {
                              L1: {
                                if (-324 < (this.field_i ^ -1)) {
                                  break L1;
                                } else {
                                  if (331 < this.field_i) {
                                    break L1;
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                              if (param0 == 0) {
                                if (335 <= this.field_i) {
                                  if (338 >= this.field_i) {
                                    return 0;
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return 1;
                                }
                              } else {
                                return -50;
                              }
                            } else {
                              return 0;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  if (this.field_i > 202) {
                    if (223 == this.field_i) {
                      return 0;
                    } else {
                      if ((this.field_i ^ -1) != -253) {
                        if (this.field_i != 35) {
                          if ((this.field_i ^ -1) > -284) {
                            if ((this.field_i ^ -1) != -151) {
                              L2: {
                                if (-324 < (this.field_i ^ -1)) {
                                  break L2;
                                } else {
                                  if (331 < this.field_i) {
                                    break L2;
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                              if (param0 == 0) {
                                if (335 <= this.field_i) {
                                  if (338 < this.field_i) {
                                    return 1;
                                  } else {
                                    return 0;
                                  }
                                } else {
                                  return 1;
                                }
                              } else {
                                return -50;
                              }
                            } else {
                              return 0;
                            }
                          } else {
                            if ((this.field_i ^ -1) <= -309) {
                              if ((this.field_i ^ -1) != -151) {
                                L3: {
                                  if (-324 < (this.field_i ^ -1)) {
                                    break L3;
                                  } else {
                                    if (331 < this.field_i) {
                                      break L3;
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                                if (param0 == 0) {
                                  if (335 <= this.field_i) {
                                    if (338 < this.field_i) {
                                      return 1;
                                    } else {
                                      return 0;
                                    }
                                  } else {
                                    return 1;
                                  }
                                } else {
                                  return -50;
                                }
                              } else {
                                return 0;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 0;
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 0;
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    p() {
        this.field_j = new oc();
        this.field_l = new og();
        this.field_h = 0;
        this.field_i = 0;
        this.field_e = 0;
        this.field_c = 0.0;
    }

    static {
        field_g = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_m = new ic[2];
    }
}

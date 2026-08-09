/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    static int field_j;
    private int field_k;
    private int field_g;
    private int field_i;
    private int field_n;
    static fb field_a;
    int field_b;
    private boolean field_e;
    static int field_o;
    static String field_l;
    static int[] field_f;
    int field_c;
    private int field_h;
    static String field_d;
    static boolean field_m;

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == -1) {
          if (-1 == (this.field_h ^ -1)) {
            if (84 != this.field_i) {
              if (-84 == (this.field_i ^ -1)) {
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
          this.field_h = 80;
          if (-1 == (this.field_h ^ -1)) {
            if (84 == this.field_i) {
              return true;
            } else {
              L0: {
                if (-84 != (this.field_i ^ -1)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
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

    final void e(int param0) {
        this.field_h = 0;
        this.field_g = 0;
        this.field_i = 0;
        if (param0 > 2) {
          L0: {
            if (0 == this.field_n) {
              this.field_i = oq.field_j;
              break L0;
            } else {
              break L0;
            }
          }
          if (0 == this.field_n) {
            if (96 == oq.field_j) {
              if (-1 > (this.field_c ^ -1)) {
                this.field_e = false;
                this.field_c = this.field_c - 1;
                if (0 == this.field_n) {
                  if (97 != oq.field_j) {
                    return;
                  } else {
                    L1: {
                      this.field_c = this.field_c + 1;
                      if (this.field_c >= this.field_b) {
                        this.field_c = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    this.field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.field_c = this.field_b;
                this.field_e = false;
                this.field_c = this.field_c - 1;
                if (0 == this.field_n) {
                  if (97 != oq.field_j) {
                    return;
                  } else {
                    L2: {
                      this.field_c = this.field_c + 1;
                      if (this.field_c >= this.field_b) {
                        this.field_c = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    this.field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (0 == this.field_n) {
                if (97 != oq.field_j) {
                  return;
                } else {
                  L3: {
                    this.field_c = this.field_c + 1;
                    if (this.field_c >= this.field_b) {
                      this.field_c = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_e = false;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (0 == this.field_n) {
              if (97 != oq.field_j) {
                return;
              } else {
                L4: {
                  this.field_c = this.field_c + 1;
                  if (this.field_c >= this.field_b) {
                    this.field_c = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_e = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        this.field_i = param0;
        this.field_h = 0;
        this.field_g = 0;
        if (0 == this.field_n) {
          if ((oq.field_j ^ -1) == -99) {
            L0: {
              if (-1 <= (this.field_c ^ -1)) {
                this.field_c = this.field_b;
                break L0;
              } else {
                break L0;
              }
            }
            this.field_e = false;
            this.field_c = this.field_c - 1;
            if (this.field_n != 0) {
              if (-1 == (this.field_n ^ -1)) {
                if (99 == oq.field_j) {
                  this.field_c = this.field_c + 1;
                  this.field_e = false;
                  if (this.field_b <= this.field_c) {
                    this.field_c = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_i = oq.field_j;
              if (-1 == (this.field_n ^ -1)) {
                if (99 == oq.field_j) {
                  this.field_c = this.field_c + 1;
                  this.field_e = false;
                  if (this.field_b <= this.field_c) {
                    this.field_c = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (this.field_n != 0) {
              if (-1 == (this.field_n ^ -1)) {
                if (99 == oq.field_j) {
                  this.field_c = this.field_c + 1;
                  this.field_e = false;
                  if (this.field_b > this.field_c) {
                    return;
                  } else {
                    this.field_c = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_i = oq.field_j;
              if (-1 == (this.field_n ^ -1)) {
                if (99 == oq.field_j) {
                  this.field_c = this.field_c + 1;
                  this.field_e = false;
                  if (this.field_b > this.field_c) {
                    return;
                  } else {
                    this.field_c = 0;
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
        } else {
          if (this.field_n != 0) {
            if (-1 == (this.field_n ^ -1)) {
              if (99 == oq.field_j) {
                this.field_c = this.field_c + 1;
                this.field_e = false;
                if (this.field_b > this.field_c) {
                  return;
                } else {
                  this.field_c = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_i = oq.field_j;
            if (-1 == (this.field_n ^ -1)) {
              if (99 == oq.field_j) {
                this.field_c = this.field_c + 1;
                this.field_e = false;
                if (this.field_b > this.field_c) {
                  return;
                } else {
                  this.field_c = 0;
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

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1) {
          L0: {
            this.a(126);
            if (102 != this.field_i) {
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
            if (102 != this.field_i) {
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
        if (param0 != -97) {
            return true;
        }
        return -97 == (this.field_i ^ -1) ? true : false;
    }

    final boolean f(int param0) {
        if (param0 >= -38) {
            return false;
        }
        return 97 == this.field_i ? true : false;
    }

    public static void b(boolean param0) {
        field_l = null;
        field_a = null;
        field_f = null;
        field_d = null;
        if (!param0) {
            java.net.URL var2 = (java.net.URL) null;
            np.a((String) null, -42, (String) null, true, (java.net.URL) null);
        }
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -34) {
          L0: {
            this.field_b = 69;
            if (this.field_n == 0) {
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
            if (this.field_n == 0) {
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
        if (this.field_b <= param2) {
          throw new IllegalArgumentException();
        } else {
          if (this.field_b > param1) {
            this.field_h = 0;
            this.field_i = 0;
            this.field_g = 0;
            if (0 != je.field_d) {
              this.field_k = ne.field_j;
              this.field_c = param1;
              this.field_h = je.field_d;
              this.field_g = je.field_d;
              this.field_n = je.field_d;
              this.field_e = true;
              if ((this.field_n ^ -1) != param0) {
                if (0 != rf.field_n) {
                  if (0 < this.field_k) {
                    this.field_k = this.field_k - 1;
                    L0: {
                      if (je.field_d != 0) {
                        break L0;
                      } else {
                        if (0 == rf.field_n) {
                          this.field_n = 0;
                          break L0;
                        } else {
                          L1: {
                            if (this.field_n != 0) {
                              break L1;
                            } else {
                              L2: {
                                if (this.field_e) {
                                  break L2;
                                } else {
                                  if (!r.field_d) {
                                    break L1;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              if ((param2 ^ -1) > -1) {
                                if (this.field_e) {
                                  this.field_c = -1;
                                  break L1;
                                } else {
                                  return;
                                }
                              } else {
                                if (param2 != this.field_c) {
                                  this.field_c = param2;
                                  this.field_e = true;
                                  return;
                                } else {
                                  this.field_c = param2;
                                  this.field_e = true;
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L3: {
                      if (this.field_n != 0) {
                        break L3;
                      } else {
                        if (this.field_e) {
                          if ((param2 ^ -1) > -1) {
                            if (this.field_e) {
                              this.field_c = -1;
                              break L3;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != this.field_c) {
                              this.field_c = param2;
                              this.field_e = true;
                              return;
                            } else {
                              this.field_c = param2;
                              this.field_e = true;
                              return;
                            }
                          }
                        } else {
                          if (!r.field_d) {
                            break L3;
                          } else {
                            if ((param2 ^ -1) > -1) {
                              if (this.field_e) {
                                this.field_c = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (param2 != this.field_c) {
                                this.field_c = param2;
                                this.field_e = true;
                                return;
                              } else {
                                this.field_c = param2;
                                this.field_e = true;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    this.field_k = eo.field_Y;
                    this.field_h = this.field_n;
                    this.field_k = this.field_k - 1;
                    if (je.field_d != 0) {
                      L4: {
                        if (this.field_n != 0) {
                          break L4;
                        } else {
                          L5: {
                            if (this.field_e) {
                              break L5;
                            } else {
                              if (!r.field_d) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (this.field_e) {
                              this.field_c = -1;
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            if (param2 != this.field_c) {
                              this.field_c = param2;
                              this.field_e = true;
                              break L4;
                            } else {
                              this.field_c = param2;
                              this.field_e = true;
                              break L4;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L6: {
                        if (0 == rf.field_n) {
                          this.field_n = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (this.field_n != 0) {
                          break L7;
                        } else {
                          L8: {
                            if (this.field_e) {
                              break L8;
                            } else {
                              if (!r.field_d) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (this.field_e) {
                              this.field_c = -1;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param2 != this.field_c) {
                              this.field_c = param2;
                              this.field_e = true;
                              break L7;
                            } else {
                              this.field_c = param2;
                              this.field_e = true;
                              break L7;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L9: {
                    if (je.field_d != 0) {
                      break L9;
                    } else {
                      if (0 == rf.field_n) {
                        this.field_n = 0;
                        break L9;
                      } else {
                        if (this.field_n == 0) {
                          L10: {
                            if (this.field_e) {
                              break L10;
                            } else {
                              if (r.field_d) {
                                break L10;
                              } else {
                                return;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (this.field_e) {
                              this.field_c = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != this.field_c) {
                              this.field_c = param2;
                              this.field_e = true;
                              return;
                            } else {
                              this.field_c = param2;
                              this.field_e = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_n == 0) {
                    if (this.field_e) {
                      if ((param2 ^ -1) > -1) {
                        if (!this.field_e) {
                          return;
                        } else {
                          this.field_c = -1;
                          return;
                        }
                      } else {
                        if (param2 != this.field_c) {
                          this.field_c = param2;
                          this.field_e = true;
                          return;
                        } else {
                          this.field_c = param2;
                          this.field_e = true;
                          return;
                        }
                      }
                    } else {
                      if (r.field_d) {
                        if ((param2 ^ -1) > -1) {
                          if (this.field_e) {
                            this.field_c = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param2 != this.field_c) {
                            this.field_c = param2;
                            this.field_e = true;
                            return;
                          } else {
                            this.field_c = param2;
                            this.field_e = true;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if (je.field_d != 0) {
                    break L11;
                  } else {
                    if (0 == rf.field_n) {
                      this.field_n = 0;
                      break L11;
                    } else {
                      L12: {
                        if (this.field_n != 0) {
                          break L12;
                        } else {
                          L13: {
                            if (this.field_e) {
                              break L13;
                            } else {
                              if (!r.field_d) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (this.field_e) {
                              this.field_c = -1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            if (param2 != this.field_c) {
                              this.field_c = param2;
                              this.field_e = true;
                              break L12;
                            } else {
                              this.field_c = param2;
                              this.field_e = true;
                              break L12;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (this.field_n == 0) {
                  if (this.field_e) {
                    if ((param2 ^ -1) > -1) {
                      if (!this.field_e) {
                        return;
                      } else {
                        this.field_c = -1;
                        return;
                      }
                    } else {
                      if (param2 != this.field_c) {
                        this.field_c = param2;
                        this.field_e = true;
                        return;
                      } else {
                        this.field_c = param2;
                        this.field_e = true;
                        return;
                      }
                    }
                  } else {
                    if (r.field_d) {
                      L14: {
                        if ((param2 ^ -1) > -1) {
                          if (this.field_e) {
                            this.field_c = -1;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          if (param2 != this.field_c) {
                            this.field_c = param2;
                            this.field_e = true;
                            break L14;
                          } else {
                            this.field_c = param2;
                            this.field_e = true;
                            break L14;
                          }
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
            } else {
              L15: {
                if ((this.field_n ^ -1) == param0) {
                  break L15;
                } else {
                  if (0 == rf.field_n) {
                    break L15;
                  } else {
                    if (0 < this.field_k) {
                      this.field_k = this.field_k - 1;
                      break L15;
                    } else {
                      this.field_k = eo.field_Y;
                      this.field_h = this.field_n;
                      L16: {
                        this.field_k = this.field_k - 1;
                        if (je.field_d != 0) {
                          break L16;
                        } else {
                          if (0 == rf.field_n) {
                            this.field_n = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (this.field_n != 0) {
                          break L17;
                        } else {
                          L18: {
                            if (this.field_e) {
                              break L18;
                            } else {
                              if (!r.field_d) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (this.field_e) {
                              this.field_c = -1;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            if (param2 != this.field_c) {
                              this.field_c = param2;
                              this.field_e = true;
                              break L17;
                            } else {
                              this.field_c = param2;
                              this.field_e = true;
                              break L17;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L19: {
                if (je.field_d != 0) {
                  break L19;
                } else {
                  if (0 == rf.field_n) {
                    this.field_n = 0;
                    break L19;
                  } else {
                    L20: {
                      if (this.field_n != 0) {
                        break L20;
                      } else {
                        L21: {
                          if (this.field_e) {
                            break L21;
                          } else {
                            if (!r.field_d) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if ((param2 ^ -1) > -1) {
                          if (this.field_e) {
                            this.field_c = -1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (param2 != this.field_c) {
                            this.field_c = param2;
                            this.field_e = true;
                            break L20;
                          } else {
                            this.field_c = param2;
                            this.field_e = true;
                            break L20;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (this.field_n == 0) {
                if (this.field_e) {
                  if ((param2 ^ -1) > -1) {
                    if (!this.field_e) {
                      return;
                    } else {
                      this.field_c = -1;
                      return;
                    }
                  } else {
                    if (param2 != this.field_c) {
                      this.field_c = param2;
                      this.field_e = true;
                      return;
                    } else {
                      this.field_c = param2;
                      this.field_e = true;
                      return;
                    }
                  }
                } else {
                  if (r.field_d) {
                    L22: {
                      if ((param2 ^ -1) > -1) {
                        if (this.field_e) {
                          this.field_c = -1;
                          break L22;
                        } else {
                          break L22;
                        }
                      } else {
                        if (param2 != this.field_c) {
                          this.field_c = param2;
                          this.field_e = true;
                          break L22;
                        } else {
                          this.field_c = param2;
                          this.field_e = true;
                          break L22;
                        }
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
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, boolean param3, java.net.URL param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            StringBuilder stackIn_52_1 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            StringBuilder stackIn_55_1 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                var5 = param4.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (0 <= var7_int) {
                        if (param1 >= 0) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if ((var7_int ^ -1) <= -1) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (0 <= var7_int) {
                          if (param0 == null) {
                            break L3;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (-1 < (var7_int ^ -1)) {
                        break L6;
                      } else {
                        if (param2 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if ((param1 ^ -1) >= -1) {
                        break L8;
                      } else {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param1));
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if (-1 > (param0.length() ^ -1)) {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if ((param2.length() ^ -1) < -1) {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L11;
                      } else {
                        discarded$8 = var7.append('/');
                        break L11;
                      }
                    }
                    L12: {
                      if (!param3) {
                        break L12;
                      } else {
                        field_d = (String) null;
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackIn_44_0 = new java.net.URL(param4, var7.toString());
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_46_0 = (java.net.URL) (param4);
                      return stackIn_46_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_49_0 = (RuntimeException) (var5_ref);

                stackIn_49_1 = new StringBuilder().append("np.G(");

                if (param0 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "null";
                  break L14;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "null";
                  break L15;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "{...}";
                  break L15;
                }
              }
              L16: {


                stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "null";
                  break L16;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "{...}";
                  break L16;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_50_0), stackIn_56_2 + ')');
            }
            return stackIn_44_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var5 = 31 % ((param3 - 0) / 42);
          this.field_n = 0;
          stackIn_2_0 = this;

          if (!param2) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((np) (this)).field_e = stackIn_3_1 != 0;
        if (this.field_e) {
          this.field_c = param0;
          return;
        } else {
          this.field_c = param1;
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            field_f = (int[]) null;
            if ((this.field_i ^ -1) != -104) {
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
            if ((this.field_i ^ -1) != -104) {
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

    final boolean a(byte param0) {
        int var2;
        var2 = -16 / ((param0 - 2) / 34);
        if (-1 == (this.field_g ^ -1)) {
          if (this.field_i != 84) {
            if (this.field_i == 83) {
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
    }

    np(int param0) {
        this.field_e = false;
        this.field_c = 0;
        this.field_b = param0;
    }

    static {
        field_l = "Opposing fleets destroyed.";
        field_o = 5;
        field_d = "Skip Intro";
    }
}

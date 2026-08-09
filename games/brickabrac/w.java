/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    private int field_h;
    private tp[] field_q;
    private jp field_p;
    static jp field_r;
    private int field_b;
    private String field_f;
    private boolean field_a;
    private String[] field_d;
    static int field_k;
    static String field_m;
    private jp field_e;
    static int[] field_n;
    private int field_c;
    private int field_j;
    private re field_g;
    private int field_o;
    private int field_i;
    private jp field_l;

    final int a(boolean param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          this.field_o = this.field_o + 65536;
          L0: while (true) {
            if ((dm.a(fo.field_c, -1, this.field_o) ^ -1) > -65537) {
              L1: {
                var3 = -1;
                if (null != this.field_q) {
                  var3 = this.field_q.length;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((var3 ^ -1) == 0) {
                  break L2;
                } else {
                  L3: {
                    if (fo.field_f > this.field_j) {
                      this.field_j = this.field_j + 1;
                      if (fo.field_n < this.field_j) {
                        L4: {
                          if (null == this.field_q) {
                            break L4;
                          } else {
                            if (this.field_q[this.field_h] == null) {
                              break L4;
                            } else {
                              if (fo.field_f > this.field_j) {
                                break L3;
                              } else {
                                if (null != this.field_q[(this.field_h + 1) % var3]) {
                                  break L3;
                                } else {
                                  this.field_j = this.field_j - 1;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        this.field_j = this.field_j - 1;
                        break L3;
                      } else {
                        if (fo.field_f > this.field_j) {
                          break L3;
                        } else {
                          if (null != this.field_q[(this.field_h + 1) % var3]) {
                            break L3;
                          } else {
                            this.field_j = this.field_j - 1;
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (fo.field_f > this.field_j) {
                      break L5;
                    } else {
                      this.field_b = this.field_h;
                      this.field_j = this.field_j - fo.field_f;
                      if (!this.field_a) {
                        this.field_h = this.field_h - 1;
                        if (-1 < (this.field_h ^ -1)) {
                          this.field_h = this.field_h + var3;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        this.field_h = this.field_h + 1;
                        if (var3 > this.field_h) {
                          break L5;
                        } else {
                          this.field_h = this.field_h - var3;
                          break L5;
                        }
                      }
                    }
                  }
                  if (fo.field_n < this.field_j) {
                    this.field_a = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (ll.field_c != null) {
                var4 = 0;
                if (ki.field_e != 0) {
                  if ((qo.field_O ^ -1) < -258) {
                    if (290 > qo.field_O) {
                      L6: {
                        if (-10 <= (tb.field_fb ^ -1)) {
                          break L6;
                        } else {
                          if (-83 < (tb.field_fb ^ -1)) {
                            this.field_a = false;
                            this.field_j = fo.field_f;
                            var4 = 1;
                            break L6;
                          } else {
                            L7: {
                              if ((tb.field_fb ^ -1) >= -559) {
                                break L7;
                              } else {
                                if ((tb.field_fb ^ -1) <= -632) {
                                  break L7;
                                } else {
                                  this.field_j = fo.field_f;
                                  var4 = 1;
                                  this.field_a = true;
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var4 != 0) {
                                break L8;
                              } else {
                                if (fo.field_n >= this.field_j) {
                                  break L8;
                                } else {
                                  if ((qo.field_O ^ -1) >= -258) {
                                    break L8;
                                  } else {
                                    if (qo.field_O >= 290) {
                                      break L8;
                                    } else {
                                      if (-10 > (pq.field_k ^ -1)) {
                                        L9: {
                                          if (-83 < (pq.field_k ^ -1)) {
                                            this.field_j = fo.field_n;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                        if (-559 <= (pq.field_k ^ -1)) {
                                          break L8;
                                        } else {
                                          if ((pq.field_k ^ -1) <= -632) {
                                            break L8;
                                          } else {
                                            this.field_j = fo.field_n;
                                            break L8;
                                          }
                                        }
                                      } else {
                                        if (-559 <= (pq.field_k ^ -1)) {
                                          break L8;
                                        } else {
                                          if ((pq.field_k ^ -1) <= -632) {
                                            break L8;
                                          } else {
                                            this.field_j = fo.field_n;
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (!param1) {
                              return 0;
                            } else {
                              L10: {
                                this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                var4 = 0;
                                if (this.field_g.a((byte) 113)) {
                                  L11: {
                                    if (this.field_g.field_j == 0) {
                                      var4 = 1;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (-2 != (this.field_g.field_j ^ -1)) {
                                    break L10;
                                  } else {
                                    return 2;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              L12: {
                                if (ea.field_a) {
                                  L13: while (true) {
                                    if (!jl.a((byte) 5)) {
                                      break L12;
                                    } else {
                                      var5 = this.a((byte) -120);
                                      if (-1 == (var5 ^ -1)) {
                                        continue L13;
                                      } else {
                                        return var5;
                                      }
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              if (var4 != 0) {
                                this.b((byte) 9);
                                return 3;
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if ((tb.field_fb ^ -1) >= -559) {
                          break L14;
                        } else {
                          if ((tb.field_fb ^ -1) <= -632) {
                            break L14;
                          } else {
                            this.field_j = fo.field_f;
                            var4 = 1;
                            this.field_a = true;
                            break L14;
                          }
                        }
                      }
                      if (var4 == 0) {
                        if (fo.field_n < this.field_j) {
                          L15: {
                            if ((qo.field_O ^ -1) >= -258) {
                              break L15;
                            } else {
                              if (qo.field_O >= 290) {
                                break L15;
                              } else {
                                L16: {
                                  if (-10 <= (pq.field_k ^ -1)) {
                                    break L16;
                                  } else {
                                    if (-83 < (pq.field_k ^ -1)) {
                                      this.field_j = fo.field_n;
                                      break L16;
                                    } else {
                                      L17: {
                                        if (-559 <= (pq.field_k ^ -1)) {
                                          break L17;
                                        } else {
                                          if ((pq.field_k ^ -1) <= -632) {
                                            break L17;
                                          } else {
                                            this.field_j = fo.field_n;
                                            if (!param1) {
                                              return 0;
                                            } else {
                                              L18: {
                                                this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                                var4 = 0;
                                                if (this.field_g.a((byte) 113)) {
                                                  L19: {
                                                    if (this.field_g.field_j == 0) {
                                                      var4 = 1;
                                                      break L19;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                  if (-2 != (this.field_g.field_j ^ -1)) {
                                                    break L18;
                                                  } else {
                                                    return 2;
                                                  }
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              L20: {
                                                if (ea.field_a) {
                                                  L21: while (true) {
                                                    if (!jl.a((byte) 5)) {
                                                      break L20;
                                                    } else {
                                                      var5 = this.a((byte) -120);
                                                      if (-1 == (var5 ^ -1)) {
                                                        continue L21;
                                                      } else {
                                                        return var5;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              if (var4 != 0) {
                                                this.b((byte) 9);
                                                return 3;
                                              } else {
                                                return 0;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (!param1) {
                                        return 0;
                                      } else {
                                        this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                        var4 = 0;
                                        if (this.field_g.a((byte) 113)) {
                                          L22: {
                                            if (this.field_g.field_j == 0) {
                                              var4 = 1;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                          if (-2 != (this.field_g.field_j ^ -1)) {
                                            if (ea.field_a) {
                                              L23: while (true) {
                                                if (!jl.a((byte) 5)) {
                                                  if (var4 != 0) {
                                                    this.b((byte) 9);
                                                    return 3;
                                                  } else {
                                                    return 0;
                                                  }
                                                } else {
                                                  var5 = this.a((byte) -120);
                                                  if (-1 == (var5 ^ -1)) {
                                                    continue L23;
                                                  } else {
                                                    return var5;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (var4 != 0) {
                                                this.b((byte) 9);
                                                return 3;
                                              } else {
                                                return 0;
                                              }
                                            }
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          L24: {
                                            if (ea.field_a) {
                                              L25: while (true) {
                                                if (!jl.a((byte) 5)) {
                                                  break L24;
                                                } else {
                                                  var5 = this.a((byte) -120);
                                                  if (-1 == (var5 ^ -1)) {
                                                    continue L25;
                                                  } else {
                                                    return var5;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L24;
                                            }
                                          }
                                          if (var4 != 0) {
                                            this.b((byte) 9);
                                            return 3;
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if (-559 <= (pq.field_k ^ -1)) {
                                  break L15;
                                } else {
                                  if ((pq.field_k ^ -1) <= -632) {
                                    break L15;
                                  } else {
                                    this.field_j = fo.field_n;
                                    if (!param1) {
                                      return 0;
                                    } else {
                                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                      var4 = 0;
                                      if (this.field_g.a((byte) 113)) {
                                        L26: {
                                          if (this.field_g.field_j == 0) {
                                            var4 = 1;
                                            break L26;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        if (-2 != (this.field_g.field_j ^ -1)) {
                                          if (ea.field_a) {
                                            L27: while (true) {
                                              if (!jl.a((byte) 5)) {
                                                if (var4 != 0) {
                                                  this.b((byte) 9);
                                                  return 3;
                                                } else {
                                                  return 0;
                                                }
                                              } else {
                                                var5 = this.a((byte) -120);
                                                if (-1 == (var5 ^ -1)) {
                                                  continue L27;
                                                } else {
                                                  return var5;
                                                }
                                              }
                                            }
                                          } else {
                                            if (var4 != 0) {
                                              this.b((byte) 9);
                                              return 3;
                                            } else {
                                              return 0;
                                            }
                                          }
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        if (ea.field_a) {
                                          L28: while (true) {
                                            if (!jl.a((byte) 5)) {
                                              if (var4 != 0) {
                                                this.b((byte) 9);
                                                return 3;
                                              } else {
                                                return 0;
                                              }
                                            } else {
                                              var5 = this.a((byte) -120);
                                              if (-1 == (var5 ^ -1)) {
                                                continue L28;
                                              } else {
                                                return var5;
                                              }
                                            }
                                          }
                                        } else {
                                          if (var4 != 0) {
                                            this.b((byte) 9);
                                            return 3;
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (!param1) {
                            return 0;
                          } else {
                            this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                            var4 = 0;
                            if (this.field_g.a((byte) 113)) {
                              L29: {
                                if (this.field_g.field_j == 0) {
                                  var4 = 1;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              if (-2 != (this.field_g.field_j ^ -1)) {
                                if (ea.field_a) {
                                  L30: while (true) {
                                    if (!jl.a((byte) 5)) {
                                      if (var4 != 0) {
                                        this.b((byte) 9);
                                        return 3;
                                      } else {
                                        return 0;
                                      }
                                    } else {
                                      var5 = this.a((byte) -120);
                                      if (-1 == (var5 ^ -1)) {
                                        continue L30;
                                      } else {
                                        return var5;
                                      }
                                    }
                                  }
                                } else {
                                  if (var4 != 0) {
                                    this.b((byte) 9);
                                    return 3;
                                  } else {
                                    return 0;
                                  }
                                }
                              } else {
                                return 2;
                              }
                            } else {
                              if (ea.field_a) {
                                L31: while (true) {
                                  if (!jl.a((byte) 5)) {
                                    if (var4 != 0) {
                                      this.b((byte) 9);
                                      return 3;
                                    } else {
                                      return 0;
                                    }
                                  } else {
                                    var5 = this.a((byte) -120);
                                    if (-1 == (var5 ^ -1)) {
                                      continue L31;
                                    } else {
                                      return var5;
                                    }
                                  }
                                }
                              } else {
                                if (var4 != 0) {
                                  this.b((byte) 9);
                                  return 3;
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                        } else {
                          if (!param1) {
                            return 0;
                          } else {
                            this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                            var4 = 0;
                            if (this.field_g.a((byte) 113)) {
                              L32: {
                                if (this.field_g.field_j == 0) {
                                  var4 = 1;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              if (-2 != (this.field_g.field_j ^ -1)) {
                                if (ea.field_a) {
                                  L33: while (true) {
                                    if (!jl.a((byte) 5)) {
                                      if (var4 != 0) {
                                        this.b((byte) 9);
                                        return 3;
                                      } else {
                                        return 0;
                                      }
                                    } else {
                                      var5 = this.a((byte) -120);
                                      if (-1 == (var5 ^ -1)) {
                                        continue L33;
                                      } else {
                                        return var5;
                                      }
                                    }
                                  }
                                } else {
                                  if (var4 != 0) {
                                    this.b((byte) 9);
                                    return 3;
                                  } else {
                                    return 0;
                                  }
                                }
                              } else {
                                return 2;
                              }
                            } else {
                              if (ea.field_a) {
                                L34: while (true) {
                                  if (!jl.a((byte) 5)) {
                                    if (var4 != 0) {
                                      this.b((byte) 9);
                                      return 3;
                                    } else {
                                      return 0;
                                    }
                                  } else {
                                    var5 = this.a((byte) -120);
                                    if (-1 == (var5 ^ -1)) {
                                      continue L34;
                                    } else {
                                      return var5;
                                    }
                                  }
                                }
                              } else {
                                if (var4 != 0) {
                                  this.b((byte) 9);
                                  return 3;
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (!param1) {
                          return 0;
                        } else {
                          this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                          var4 = 0;
                          if (this.field_g.a((byte) 113)) {
                            L35: {
                              if (this.field_g.field_j == 0) {
                                var4 = 1;
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            if (-2 != (this.field_g.field_j ^ -1)) {
                              if (ea.field_a) {
                                L36: while (true) {
                                  if (!jl.a((byte) 5)) {
                                    if (var4 != 0) {
                                      this.b((byte) 9);
                                      return 3;
                                    } else {
                                      return 0;
                                    }
                                  } else {
                                    var5 = this.a((byte) -120);
                                    if (-1 == (var5 ^ -1)) {
                                      continue L36;
                                    } else {
                                      return var5;
                                    }
                                  }
                                }
                              } else {
                                if (var4 != 0) {
                                  this.b((byte) 9);
                                  return 3;
                                } else {
                                  return 0;
                                }
                              }
                            } else {
                              return 2;
                            }
                          } else {
                            if (ea.field_a) {
                              L37: while (true) {
                                if (!jl.a((byte) 5)) {
                                  if (var4 != 0) {
                                    this.b((byte) 9);
                                    return 3;
                                  } else {
                                    return 0;
                                  }
                                } else {
                                  var5 = this.a((byte) -120);
                                  if (-1 == (var5 ^ -1)) {
                                    continue L37;
                                  } else {
                                    return var5;
                                  }
                                }
                              }
                            } else {
                              if (var4 != 0) {
                                this.b((byte) 9);
                                return 3;
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L38: {
                        if (var4 != 0) {
                          break L38;
                        } else {
                          if (fo.field_n >= this.field_j) {
                            break L38;
                          } else {
                            if ((qo.field_O ^ -1) >= -258) {
                              break L38;
                            } else {
                              if (qo.field_O >= 290) {
                                break L38;
                              } else {
                                if (-10 > (pq.field_k ^ -1)) {
                                  L39: {
                                    if (-83 < (pq.field_k ^ -1)) {
                                      this.field_j = fo.field_n;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  if (-559 <= (pq.field_k ^ -1)) {
                                    break L38;
                                  } else {
                                    if ((pq.field_k ^ -1) <= -632) {
                                      break L38;
                                    } else {
                                      this.field_j = fo.field_n;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (-559 <= (pq.field_k ^ -1)) {
                                    break L38;
                                  } else {
                                    if ((pq.field_k ^ -1) <= -632) {
                                      break L38;
                                    } else {
                                      this.field_j = fo.field_n;
                                      break L38;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (!param1) {
                        return 0;
                      } else {
                        L40: {
                          this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                          var4 = 0;
                          if (this.field_g.a((byte) 113)) {
                            L41: {
                              if (this.field_g.field_j == 0) {
                                var4 = 1;
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                            if (-2 != (this.field_g.field_j ^ -1)) {
                              break L40;
                            } else {
                              return 2;
                            }
                          } else {
                            break L40;
                          }
                        }
                        L42: {
                          if (ea.field_a) {
                            L43: while (true) {
                              if (!jl.a((byte) 5)) {
                                break L42;
                              } else {
                                var5 = this.a((byte) -120);
                                if (-1 == (var5 ^ -1)) {
                                  continue L43;
                                } else {
                                  return var5;
                                }
                              }
                            }
                          } else {
                            break L42;
                          }
                        }
                        if (var4 != 0) {
                          this.b((byte) 9);
                          return 3;
                        } else {
                          return 0;
                        }
                      }
                    }
                  } else {
                    L44: {
                      if (var4 != 0) {
                        break L44;
                      } else {
                        if (fo.field_n >= this.field_j) {
                          break L44;
                        } else {
                          if ((qo.field_O ^ -1) >= -258) {
                            break L44;
                          } else {
                            if (qo.field_O >= 290) {
                              break L44;
                            } else {
                              L45: {
                                if (-10 <= (pq.field_k ^ -1)) {
                                  break L45;
                                } else {
                                  if (-83 < (pq.field_k ^ -1)) {
                                    this.field_j = fo.field_n;
                                    break L45;
                                  } else {
                                    L46: {
                                      if (-559 <= (pq.field_k ^ -1)) {
                                        break L46;
                                      } else {
                                        if ((pq.field_k ^ -1) <= -632) {
                                          break L46;
                                        } else {
                                          this.field_j = fo.field_n;
                                          break L46;
                                        }
                                      }
                                    }
                                    if (!param1) {
                                      return 0;
                                    } else {
                                      L47: {
                                        this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                        var4 = 0;
                                        if (this.field_g.a((byte) 113)) {
                                          L48: {
                                            if (this.field_g.field_j == 0) {
                                              var4 = 1;
                                              break L48;
                                            } else {
                                              break L48;
                                            }
                                          }
                                          if (-2 != (this.field_g.field_j ^ -1)) {
                                            break L47;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          break L47;
                                        }
                                      }
                                      L49: {
                                        if (ea.field_a) {
                                          L50: while (true) {
                                            if (!jl.a((byte) 5)) {
                                              break L49;
                                            } else {
                                              var5 = this.a((byte) -120);
                                              if (-1 == (var5 ^ -1)) {
                                                continue L50;
                                              } else {
                                                return var5;
                                              }
                                            }
                                          }
                                        } else {
                                          break L49;
                                        }
                                      }
                                      if (var4 != 0) {
                                        this.b((byte) 9);
                                        return 3;
                                      } else {
                                        return 0;
                                      }
                                    }
                                  }
                                }
                              }
                              if (-559 <= (pq.field_k ^ -1)) {
                                break L44;
                              } else {
                                if ((pq.field_k ^ -1) <= -632) {
                                  break L44;
                                } else {
                                  this.field_j = fo.field_n;
                                  if (!param1) {
                                    return 0;
                                  } else {
                                    L51: {
                                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                      var4 = 0;
                                      if (this.field_g.a((byte) 113)) {
                                        L52: {
                                          if (this.field_g.field_j == 0) {
                                            var4 = 1;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                        if (-2 != (this.field_g.field_j ^ -1)) {
                                          break L51;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        break L51;
                                      }
                                    }
                                    L53: {
                                      if (ea.field_a) {
                                        L54: while (true) {
                                          if (!jl.a((byte) 5)) {
                                            break L53;
                                          } else {
                                            var5 = this.a((byte) -120);
                                            if (-1 == (var5 ^ -1)) {
                                              continue L54;
                                            } else {
                                              return var5;
                                            }
                                          }
                                        }
                                      } else {
                                        break L53;
                                      }
                                    }
                                    if (var4 != 0) {
                                      this.b((byte) 9);
                                      return 3;
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (!param1) {
                      return 0;
                    } else {
                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                      var4 = 0;
                      if (this.field_g.a((byte) 113)) {
                        L55: {
                          if (this.field_g.field_j == 0) {
                            var4 = 1;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        if (-2 != (this.field_g.field_j ^ -1)) {
                          if (ea.field_a) {
                            L56: while (true) {
                              if (!jl.a((byte) 5)) {
                                if (var4 != 0) {
                                  this.b((byte) 9);
                                  return 3;
                                } else {
                                  return 0;
                                }
                              } else {
                                var5 = this.a((byte) -120);
                                if (-1 == (var5 ^ -1)) {
                                  continue L56;
                                } else {
                                  return var5;
                                }
                              }
                            }
                          } else {
                            if (var4 != 0) {
                              this.b((byte) 9);
                              return 3;
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 2;
                        }
                      } else {
                        L57: {
                          if (ea.field_a) {
                            L58: while (true) {
                              if (!jl.a((byte) 5)) {
                                break L57;
                              } else {
                                var5 = this.a((byte) -120);
                                if (-1 == (var5 ^ -1)) {
                                  continue L58;
                                } else {
                                  return var5;
                                }
                              }
                            }
                          } else {
                            break L57;
                          }
                        }
                        if (var4 != 0) {
                          this.b((byte) 9);
                          return 3;
                        } else {
                          return 0;
                        }
                      }
                    }
                  }
                } else {
                  L59: {
                    if (var4 != 0) {
                      break L59;
                    } else {
                      if (fo.field_n >= this.field_j) {
                        break L59;
                      } else {
                        if ((qo.field_O ^ -1) >= -258) {
                          break L59;
                        } else {
                          if (qo.field_O >= 290) {
                            break L59;
                          } else {
                            L60: {
                              if (-10 <= (pq.field_k ^ -1)) {
                                break L60;
                              } else {
                                if (-83 < (pq.field_k ^ -1)) {
                                  this.field_j = fo.field_n;
                                  break L60;
                                } else {
                                  L61: {
                                    if (-559 <= (pq.field_k ^ -1)) {
                                      break L61;
                                    } else {
                                      if ((pq.field_k ^ -1) <= -632) {
                                        break L61;
                                      } else {
                                        this.field_j = fo.field_n;
                                        break L61;
                                      }
                                    }
                                  }
                                  if (param1) {
                                    L62: {
                                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                      var4 = 0;
                                      if (this.field_g.a((byte) 113)) {
                                        L63: {
                                          if (this.field_g.field_j == 0) {
                                            var4 = 1;
                                            break L63;
                                          } else {
                                            break L63;
                                          }
                                        }
                                        if (-2 != (this.field_g.field_j ^ -1)) {
                                          break L62;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        break L62;
                                      }
                                    }
                                    L64: {
                                      if (ea.field_a) {
                                        L65: while (true) {
                                          if (!jl.a((byte) 5)) {
                                            break L64;
                                          } else {
                                            var5 = this.a((byte) -120);
                                            if (-1 == (var5 ^ -1)) {
                                              continue L65;
                                            } else {
                                              return var5;
                                            }
                                          }
                                        }
                                      } else {
                                        break L64;
                                      }
                                    }
                                    if (var4 == 0) {
                                      return 0;
                                    } else {
                                      this.b((byte) 9);
                                      return 3;
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            }
                            if (-559 <= (pq.field_k ^ -1)) {
                              break L59;
                            } else {
                              if ((pq.field_k ^ -1) <= -632) {
                                break L59;
                              } else {
                                this.field_j = fo.field_n;
                                if (param1) {
                                  L66: {
                                    this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                    var4 = 0;
                                    if (this.field_g.a((byte) 113)) {
                                      L67: {
                                        if (this.field_g.field_j == 0) {
                                          var4 = 1;
                                          break L67;
                                        } else {
                                          break L67;
                                        }
                                      }
                                      if (-2 != (this.field_g.field_j ^ -1)) {
                                        break L66;
                                      } else {
                                        return 2;
                                      }
                                    } else {
                                      break L66;
                                    }
                                  }
                                  L68: {
                                    if (ea.field_a) {
                                      L69: while (true) {
                                        if (!jl.a((byte) 5)) {
                                          break L68;
                                        } else {
                                          var5 = this.a((byte) -120);
                                          if (-1 == (var5 ^ -1)) {
                                            continue L69;
                                          } else {
                                            return var5;
                                          }
                                        }
                                      }
                                    } else {
                                      break L68;
                                    }
                                  }
                                  if (var4 != 0) {
                                    this.b((byte) 9);
                                    return 3;
                                  } else {
                                    return 0;
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param1) {
                    this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                    var4 = 0;
                    if (this.field_g.a((byte) 113)) {
                      L70: {
                        if (this.field_g.field_j == 0) {
                          var4 = 1;
                          break L70;
                        } else {
                          break L70;
                        }
                      }
                      if (-2 != (this.field_g.field_j ^ -1)) {
                        if (ea.field_a) {
                          L71: while (true) {
                            if (!jl.a((byte) 5)) {
                              if (var4 != 0) {
                                this.b((byte) 9);
                                return 3;
                              } else {
                                return 0;
                              }
                            } else {
                              var5 = this.a((byte) -120);
                              if (-1 == (var5 ^ -1)) {
                                continue L71;
                              } else {
                                return var5;
                              }
                            }
                          }
                        } else {
                          if (var4 != 0) {
                            this.b((byte) 9);
                            return 3;
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 2;
                      }
                    } else {
                      L72: {
                        if (ea.field_a) {
                          L73: while (true) {
                            if (!jl.a((byte) 5)) {
                              break L72;
                            } else {
                              var5 = this.a((byte) -120);
                              if (-1 == (var5 ^ -1)) {
                                continue L73;
                              } else {
                                return var5;
                              }
                            }
                          }
                        } else {
                          break L72;
                        }
                      }
                      if (var4 != 0) {
                        this.b((byte) 9);
                        return 3;
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                if (param1) {
                  this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                  var4 = 0;
                  if (this.field_g.a((byte) 113)) {
                    L74: {
                      if (this.field_g.field_j == 0) {
                        var4 = 1;
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                    if (-2 != (this.field_g.field_j ^ -1)) {
                      if (ea.field_a) {
                        L75: while (true) {
                          if (!jl.a((byte) 5)) {
                            if (var4 == 0) {
                              return 0;
                            } else {
                              this.b((byte) 9);
                              return 3;
                            }
                          } else {
                            var5 = this.a((byte) -120);
                            if (-1 == (var5 ^ -1)) {
                              continue L75;
                            } else {
                              return var5;
                            }
                          }
                        }
                      } else {
                        if (var4 == 0) {
                          return 0;
                        } else {
                          this.b((byte) 9);
                          return 3;
                        }
                      }
                    } else {
                      return 2;
                    }
                  } else {
                    if (ea.field_a) {
                      L76: while (true) {
                        if (!jl.a((byte) 5)) {
                          if (var4 == 0) {
                            return 0;
                          } else {
                            this.b((byte) 9);
                            return 3;
                          }
                        } else {
                          var5 = this.a((byte) -120);
                          if (-1 == (var5 ^ -1)) {
                            continue L76;
                          } else {
                            return var5;
                          }
                        }
                      }
                    } else {
                      if (var4 == 0) {
                        return 0;
                      } else {
                        this.b((byte) 9);
                        return 3;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              }
            } else {
              this.field_i = this.field_i + 1;
              this.field_o = this.field_o - fo.field_c;
              continue L0;
            }
          }
        } else {
          return -9;
        }
    }

    private final void a(boolean param0) {
        tp var2;
        int var3;
        int var4;
        int var5;
        tp var6;
        tp var7;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.field_q == null) {
          if (null != ch.field_c) {
            ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
            return;
          } else {
            return;
          }
        } else {
          var6 = this.field_q[this.field_h];
          var2 = var6;
          if (var2 != null) {
            L0: {
              var6.a(9, 58);
              if (this.field_j < fo.field_n) {
                var7 = this.field_q[this.field_b];
                var2 = var7;
                if (var2 != null) {
                  var3 = (60 + var7.field_f) * this.field_j / fo.field_n;
                  var4 = var3 - 30;
                  if (this.field_a) {
                    ml.a(-256 * var4 / 30, var2, (byte) 101, 58, 9, (-var4 + var7.field_f) * 256 / 30);
                    break L0;
                  } else {
                    ml.a(256 * (-var4 + var7.field_f) / 30, var7, (byte) 106, 58, 9, -256 * var4 / 30);
                    break L0;
                  }
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (param0) {
              return;
            } else {
              field_k = -125;
              return;
            }
          } else {
            if (null != ch.field_c) {
              ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
              if (this.field_j < fo.field_n) {
                var7 = this.field_q[this.field_b];
                var2 = var7;
                if (var2 != null) {
                  var3 = (60 + var7.field_f) * this.field_j / fo.field_n;
                  var4 = var3 - 30;
                  if (this.field_a) {
                    ml.a(-256 * var4 / 30, var2, (byte) 101, 58, 9, (-var4 + var7.field_f) * 256 / 30);
                    if (!param0) {
                      field_k = -125;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ml.a(256 * (-var4 + var7.field_f) / 30, var7, (byte) 106, 58, 9, -256 * var4 / 30);
                    if (!param0) {
                      field_k = -125;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!param0) {
                    field_k = -125;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (!param0) {
                  field_k = -125;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (this.field_j < fo.field_n) {
                var7 = this.field_q[this.field_b];
                var2 = var7;
                if (var2 != null) {
                  var3 = (60 + var7.field_f) * this.field_j / fo.field_n;
                  var4 = var3 - 30;
                  if (!this.field_a) {
                    L1: {
                      ml.a(256 * (-var4 + var7.field_f) / 30, var7, (byte) 106, 58, 9, -256 * var4 / 30);
                      if (param0) {
                        break L1;
                      } else {
                        field_k = -125;
                        break L1;
                      }
                    }
                    return;
                  } else {
                    L2: {
                      ml.a(-256 * var4 / 30, var2, (byte) 101, 58, 9, (-var4 + var7.field_f) * 256 / 30);
                      if (param0) {
                        break L2;
                      } else {
                        field_k = -125;
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  L3: {
                    if (param0) {
                      break L3;
                    } else {
                      field_k = -125;
                      break L3;
                    }
                  }
                  return;
                }
              } else {
                L4: {
                  if (param0) {
                    break L4;
                  } else {
                    field_k = -125;
                    break L4;
                  }
                }
                return;
              }
            }
          }
        }
    }

    private final void a(int param0) {
        int var2;
        int var3;
        jp var5;
        String var6;
        String var7;
        int[] var16;
        int[] var17;
        if (this.field_l == null) {
          if (null == co.field_j) {
            return;
          } else {
            this.field_l = new jp(622, 47);
            fc.a(-49, this.field_l);
            lb.g(0, 0, 622, 47, 4540749, 65793);
            var2 = 16448250;
            var3 = 10068666;
            var16 = lk.a(param0 + -580, var2, var3);
            this.a(47, 0, this.field_f, var16, co.field_j, 622, 0, 0);
            sc.b(param0 + -592);
            this.field_e = new jp(param0, 24);
            this.a(co.field_j, -4, 0.75f, (byte) 124, 475, va.field_c, var16, 24, this.field_e, 0);
            var17 = lk.a(-124, 526344, 526344);
            var5 = new jp(121, 122);
            fc.a(param0 ^ -388, var5);
            lb.g(0, 0, var5.field_D, var5.field_C / 2, 16180917, 16306250);
            lb.g(0, var5.field_C / 2, var5.field_D, var5.field_C, 16306250, 15568919);
            var6 = tl.field_a;
            var7 = ko.field_q;
            this.a(co.field_j, -16, 0.5f, (byte) 118, var5.field_D, var6, var17, var5.field_C, var5, 0);
            this.a(co.field_j, 20, 0.5f, (byte) 105, var5.field_D, var7, var17, var5.field_C, var5, 0);
            this.a(co.field_j, -co.field_j.field_F + (var5.field_C / 2 + 12), 0.699999988079071f, (byte) 62, var5.field_D, uo.field_e[this.field_c], var17, var5.field_C / 3, var5, 0);
            sc.b(-119);
            this.field_p = new jp(121, 122);
            fc.a(-115, this.field_p);
            var5.e(this.field_p.field_D / 2, this.field_p.field_C / 2, -2048, 4096);
            sc.b(-108);
            return;
          }
        } else {
          return;
        }
    }

    final void e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        lb.g(9, 9, 622, 47, 4540749, 65793);
        lb.g(9, 257, 622, 33, 2585);
        lb.g(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L0: while (true) {
          if (4 <= var2) {
            L1: {
              if (param0 <= -6) {
                break L1;
              } else {
                this.a(111);
                break L1;
              }
            }
            var2 = 0;
            var3 = 299;
            L2: while (true) {
              if (2 <= var2) {
                this.a(true);
                if (jg.field_d != null) {
                  if (jg.field_d.a((byte) -127)) {
                    L3: {
                      if (!jg.field_d.a("members_expansion_screen", -28138)) {
                        break L3;
                      } else {
                        if (!jg.field_d.a("arialish12", -28138)) {
                          break L3;
                        } else {
                          if (!jg.field_d.a("pump32", -28138)) {
                            break L3;
                          } else {
                            if (fe.field_jb == null) {
                              break L3;
                            } else {
                              if (!fe.field_jb.a((byte) -127)) {
                                break L3;
                              } else {
                                if (!fe.field_jb.a("arialish12", -28138)) {
                                  break L3;
                                } else {
                                  if (fe.field_jb.a("pump32", -28138)) {
                                    bl.field_J = uo.a((byte) 29, jg.field_d, "frame", "members_expansion_screen");
                                    ll.field_c = pl.a("members_expansion_screen", "arrow", (byte) 111, jg.field_d);
                                    ch.field_c = nq.a((byte) -37, "arialish12", jg.field_d, fe.field_jb, "");
                                    co.field_j = si.a((byte) -107, "pump32", "", jg.field_d, fe.field_jb);
                                    rp.field_u = um.a("members_expansion_screen", "benefit_orbs", 1593955777, jg.field_d);
                                    nc.field_e = um.a("members_expansion_screen", "button_text", 1593955777, jg.field_d);
                                    sf.field_V = bd.a("members_expansion_screen", "button_highlights", jg.field_d, (byte) -8);
                                    fe.field_jb = null;
                                    jg.field_d = null;
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    this.a(475);
                    if (null != bl.field_J) {
                      this.field_p.c(376, 339);
                      this.field_l.c(9, 9);
                      bl.field_J.a(0, 0);
                      if (null != ll.field_c) {
                        ll.field_c.c(9, 257);
                        ll.field_c.f(558, 257);
                        if ((po.field_a ^ -1) < -258) {
                          if (-291 < (po.field_a ^ -1)) {
                            var2 = 40 - -(di.a((byte) 124, this.field_i << 790494148) * 40 >> -314792144);
                            if (0 < var2) {
                              L4: {
                                if (9 >= pq.field_k) {
                                  break L4;
                                } else {
                                  if (pq.field_k >= 82) {
                                    break L4;
                                  } else {
                                    ll.field_c.f(8, 256, var2);
                                    ll.field_c.f(10, 256, var2);
                                    ll.field_c.f(8, 258, var2);
                                    ll.field_c.f(10, 258, var2);
                                    this.field_e.c(16, 302);
                                    ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                    rp.field_u.c(30, 330);
                                    ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                                    if (0 != this.field_g.field_j) {
                                      if (-2 != (this.field_g.field_j ^ -1)) {
                                        return;
                                      } else {
                                        sf.field_V[1].c(508, 387);
                                        return;
                                      }
                                    } else {
                                      sf.field_V[0].c(508, 299);
                                      return;
                                    }
                                  }
                                }
                              }
                              L5: {
                                if (558 >= pq.field_k) {
                                  break L5;
                                } else {
                                  if (pq.field_k < 631) {
                                    ll.field_c.a();
                                    ll.field_c.f(557, 256, var2);
                                    ll.field_c.f(559, 256, var2);
                                    ll.field_c.f(557, 258, var2);
                                    ll.field_c.f(559, 258, var2);
                                    ll.field_c.a();
                                    break L5;
                                  } else {
                                    this.field_e.c(16, 302);
                                    ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                    rp.field_u.c(30, 330);
                                    ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                                    if (0 == this.field_g.field_j) {
                                      sf.field_V[0].c(508, 299);
                                      return;
                                    } else {
                                      if (-2 == (this.field_g.field_j ^ -1)) {
                                        sf.field_V[1].c(508, 387);
                                        return;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_e.c(16, 302);
                              ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                              rp.field_u.c(30, 330);
                              ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                              if (0 == this.field_g.field_j) {
                                sf.field_V[0].c(508, 299);
                                return;
                              } else {
                                if (-2 == (this.field_g.field_j ^ -1)) {
                                  sf.field_V[1].c(508, 387);
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              this.field_e.c(16, 302);
                              ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                              rp.field_u.c(30, 330);
                              ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                              if (0 != this.field_g.field_j) {
                                if (-2 == (this.field_g.field_j ^ -1)) {
                                  sf.field_V[1].c(508, 387);
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                sf.field_V[0].c(508, 299);
                                return;
                              }
                            }
                          } else {
                            this.field_e.c(16, 302);
                            ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                            rp.field_u.c(30, 330);
                            ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                            ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                            ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                            nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                            if (0 != this.field_g.field_j) {
                              if (-2 == (this.field_g.field_j ^ -1)) {
                                sf.field_V[1].c(508, 387);
                                return;
                              } else {
                                return;
                              }
                            } else {
                              sf.field_V[0].c(508, 299);
                              return;
                            }
                          }
                        } else {
                          this.field_e.c(16, 302);
                          ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                          rp.field_u.c(30, 330);
                          ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                          ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                          ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                          nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                          if (0 != this.field_g.field_j) {
                            if (-2 != (this.field_g.field_j ^ -1)) {
                              return;
                            } else {
                              sf.field_V[1].c(508, 387);
                              return;
                            }
                          } else {
                            sf.field_V[0].c(508, 299);
                            return;
                          }
                        }
                      } else {
                        this.field_e.c(16, 302);
                        ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                        rp.field_u.c(30, 330);
                        ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                        if (0 != this.field_g.field_j) {
                          if (-2 != (this.field_g.field_j ^ -1)) {
                            return;
                          } else {
                            sf.field_V[1].c(508, 387);
                            return;
                          }
                        } else {
                          sf.field_V[0].c(508, 299);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    this.a(475);
                    if (null != bl.field_J) {
                      L6: {
                        this.field_p.c(376, 339);
                        this.field_l.c(9, 9);
                        bl.field_J.a(0, 0);
                        if (null != ll.field_c) {
                          ll.field_c.c(9, 257);
                          ll.field_c.f(558, 257);
                          if ((po.field_a ^ -1) >= -258) {
                            break L6;
                          } else {
                            if (-291 < (po.field_a ^ -1)) {
                              var2 = 40 - -(di.a((byte) 124, this.field_i << 790494148) * 40 >> -314792144);
                              if (0 >= var2) {
                                break L6;
                              } else {
                                L7: {
                                  if (9 >= pq.field_k) {
                                    break L7;
                                  } else {
                                    if (pq.field_k >= 82) {
                                      break L7;
                                    } else {
                                      L8: {
                                        ll.field_c.f(8, 256, var2);
                                        ll.field_c.f(10, 256, var2);
                                        ll.field_c.f(8, 258, var2);
                                        ll.field_c.f(10, 258, var2);
                                        this.field_e.c(16, 302);
                                        ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                        rp.field_u.c(30, 330);
                                        ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                        ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                        ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                        nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                                        if (0 == this.field_g.field_j) {
                                          sf.field_V[0].c(508, 299);
                                          break L8;
                                        } else {
                                          if (-2 == (this.field_g.field_j ^ -1)) {
                                            sf.field_V[1].c(508, 387);
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      return;
                                    }
                                  }
                                }
                                if (558 >= pq.field_k) {
                                  break L6;
                                } else {
                                  if (pq.field_k < 631) {
                                    ll.field_c.a();
                                    ll.field_c.f(557, 256, var2);
                                    ll.field_c.f(559, 256, var2);
                                    ll.field_c.f(557, 258, var2);
                                    ll.field_c.f(559, 258, var2);
                                    ll.field_c.a();
                                    break L6;
                                  } else {
                                    L9: {
                                      this.field_e.c(16, 302);
                                      ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                      rp.field_u.c(30, 330);
                                      ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                                      if (0 == this.field_g.field_j) {
                                        sf.field_V[0].c(508, 299);
                                        break L9;
                                      } else {
                                        if (-2 == (this.field_g.field_j ^ -1)) {
                                          sf.field_V[1].c(508, 387);
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      this.field_e.c(16, 302);
                      ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                      rp.field_u.c(30, 330);
                      ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                      if (0 != this.field_g.field_j) {
                        if (-2 != (this.field_g.field_j ^ -1)) {
                          return;
                        } else {
                          sf.field_V[1].c(508, 387);
                          return;
                        }
                      } else {
                        sf.field_V[0].c(508, 299);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  this.a(475);
                  if (null != bl.field_J) {
                    L10: {
                      this.field_p.c(376, 339);
                      this.field_l.c(9, 9);
                      bl.field_J.a(0, 0);
                      if (null != ll.field_c) {
                        ll.field_c.c(9, 257);
                        ll.field_c.f(558, 257);
                        if ((po.field_a ^ -1) >= -258) {
                          break L10;
                        } else {
                          if (-291 < (po.field_a ^ -1)) {
                            var2 = 40 - -(di.a((byte) 124, this.field_i << 790494148) * 40 >> -314792144);
                            if (0 >= var2) {
                              break L10;
                            } else {
                              L11: {
                                if (9 >= pq.field_k) {
                                  break L11;
                                } else {
                                  if (pq.field_k >= 82) {
                                    break L11;
                                  } else {
                                    L12: {
                                      ll.field_c.f(8, 256, var2);
                                      ll.field_c.f(10, 256, var2);
                                      ll.field_c.f(8, 258, var2);
                                      ll.field_c.f(10, 258, var2);
                                      this.field_e.c(16, 302);
                                      ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                      rp.field_u.c(30, 330);
                                      ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                                      if (0 == this.field_g.field_j) {
                                        sf.field_V[0].c(508, 299);
                                        break L12;
                                      } else {
                                        if (-2 == (this.field_g.field_j ^ -1)) {
                                          sf.field_V[1].c(508, 387);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                              if (558 >= pq.field_k) {
                                break L10;
                              } else {
                                if (pq.field_k < 631) {
                                  ll.field_c.a();
                                  ll.field_c.f(557, 256, var2);
                                  ll.field_c.f(559, 256, var2);
                                  ll.field_c.f(557, 258, var2);
                                  ll.field_c.f(559, 258, var2);
                                  ll.field_c.a();
                                  break L10;
                                } else {
                                  L13: {
                                    this.field_e.c(16, 302);
                                    ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                    rp.field_u.c(30, 330);
                                    ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                                    if (0 == this.field_g.field_j) {
                                      sf.field_V[0].c(508, 299);
                                      break L13;
                                    } else {
                                      if (-2 == (this.field_g.field_j ^ -1)) {
                                        sf.field_V[1].c(508, 387);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    this.field_e.c(16, 302);
                    ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    rp.field_u.c(30, 330);
                    ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                    if (0 != this.field_g.field_j) {
                      if (-2 != (this.field_g.field_j ^ -1)) {
                        return;
                      } else {
                        sf.field_V[1].c(508, 387);
                        return;
                      }
                    } else {
                      sf.field_V[0].c(508, 299);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                lb.g(508, var3, 127, 42, 1130115, 3365268);
                lb.g(508, 42 + var3, 127, 42, 12410);
                var3 += 91;
                var2++;
                continue L2;
              }
            }
          } else {
            lb.g(var3, 331, 117, 90, 460551, 3881787);
            var2++;
            var3 += 121;
            continue L0;
          }
        }
    }

    private final void b(byte param0) {
        try {
            oo.a(uc.e((byte) -86), 0);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        int var2 = 82 % ((param0 - 72) / 51);
    }

    final int a(byte param0) {
        int var2;
        this.field_g.d(-1);
        if (this.field_g.a((byte) 113)) {
          if (this.field_g.field_j != 0) {
            if ((this.field_g.field_j ^ -1) != -2) {
              var2 = 83 % ((param0 - -17) / 51);
              if (13 == dc.field_b) {
                return 1;
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            this.b((byte) 125);
            return 3;
          }
        } else {
          var2 = 83 % ((param0 - -17) / 51);
          if (13 == dc.field_b) {
            return 1;
          } else {
            return 0;
          }
        }
    }

    private final void a(dh param0, int param1, float param2, byte param3, int param4, String param5, int[] param6, int param7, jp param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        jp var13 = null;
        try {
          L0: {
            L1: {
              var11_int = (int)((float)param4 / param2);
              if (param3 >= 56) {
                break L1;
              } else {
                this.field_o = -54;
                break L1;
              }
            }
            var12 = (int)((float)param7 / param2);
            var13 = new jp(var11_int, var12);
            fc.a(-116, var13);
            param8.a((int)((float)(-param9) / param2), (int)((float)(-param1) / param2), (int)((float)param8.field_D / param2), (int)((float)param8.field_C / param2));
            this.a(var12, 0, param5, param6, param0, var11_int, 0, 0);
            sc.b(-104);
            fc.a(-126, param8);
            var13.c(param9, param1, param4, param7);
            sc.b(-93);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var11);

            stackIn_6_1 = new StringBuilder().append("w.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param9 + ')');
        }
    }

    private final void a(String param0, boolean param1, boolean param2, tp[] param3, String[] param4, java.applet.Applet param5) {
        String var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var7 = param5.getParameter("currency");
                if (var7 == null) {
                  break L2;
                } else {
                  if (dc.a((CharSequence) ((Object) var7), -53)) {
                    this.field_c = fl.a((CharSequence) ((Object) var7), -28734);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_c = 2;
              break L1;
            }
            L3: {
              this.field_f = param0;
              this.field_g = new re(2);
              this.field_q = param3;
              this.field_d = param4;
              if (this.field_q == null) {
                break L3;
              } else {
                if (3 > this.field_q.length) {
                  break L3;
                } else {
                  if (!param1) {
                    ea.field_a = param2;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("w.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = param0 >> -1206002808;
        var4 = 255 & param0;
        if (param2 <= 90) {
          field_k = 6;
          var5 = param1 >> -652453464;
          var6 = 255 & param1;
          return (var4 * var6 >> -2062548824) + (var3 * param1 + var5 * var4);
        } else {
          var5 = param1 >> -652453464;
          var6 = 255 & param1;
          return (var4 * var6 >> -2062548824) + (var3 * param1 + var5 * var4);
        }
    }

    public static void d(byte param0) {
        field_r = null;
        field_m = null;
        if (param0 < 82) {
            field_r = (jp) null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void c(byte param0) {
        fk.field_h = null;
        if (param0 != 3) {
          field_k = -112;
          h.field_F = null;
          ik.field_j = false;
          rg.field_k = null;
          ik.field_b = null;
          return;
        } else {
          h.field_F = null;
          ik.field_j = false;
          rg.field_k = null;
          ik.field_b = null;
          return;
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 > 4) {
                break L1;
              } else {
                field_r = (jp) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[-1 + (var2_int + -var4)] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("w.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, String param2, int[] param3, dh param4, int param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = BrickABrac.field_J ? 1 : 0;
        jf.d(-99);
        if (param7 != 0) {
            return;
        }
        try {
            for (var9_int = param6; param0 > var9_int; var9_int++) {
                lb.e(param1, var9_int, param5, 1 + var9_int);
                var10 = var9_int * param3.length / param0;
                var11 = param3[param3.length - (var10 + 1)];
                param4.a(param2, param1, param6, param5, param0, var11, -1, 1, 1, 0);
            }
            sc.b(-102);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "w.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (null == bl.field_J) {
          return -1;
        } else {
          if (-509 >= (param2 ^ -1)) {
            if ((param2 ^ -1) > -636) {
              L0: {
                if (299 > param0) {
                  break L0;
                } else {
                  if (-387 >= (param0 ^ -1)) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              if (param1 == -636) {
                if (508 <= param2) {
                  if (-636 < (param2 ^ -1)) {
                    if (param0 >= 390) {
                      if (param0 < 475) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -75;
              }
            } else {
              if (param1 == -636) {
                if (508 <= param2) {
                  if (-636 < (param2 ^ -1)) {
                    if (param0 >= 390) {
                      if (param0 >= 475) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -75;
              }
            }
          } else {
            if (param1 == -636) {
              if (508 <= param2) {
                if (-636 < (param2 ^ -1)) {
                  if (param0 >= 390) {
                    if (param0 >= 475) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -75;
            }
          }
        }
    }

    w(java.applet.Applet param0, String param1, tp[] param2, boolean param3, String[] param4) {
        this.field_a = true;
        this.field_i = 0;
        this.field_o = 0;
        try {
            this.a(param1, false, param3, param2, param4, param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "If you are not, please change your password to something more obscure!";
    }
}

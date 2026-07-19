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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
                                      if (-10 <= (pq.field_k ^ -1)) {
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
                              L9: {
                                this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                var4 = 0;
                                if (this.field_g.a((byte) 113)) {
                                  L10: {
                                    if (this.field_g.field_j == 0) {
                                      var4 = 1;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if (-2 != (this.field_g.field_j ^ -1)) {
                                    break L9;
                                  } else {
                                    return 2;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L11: {
                                if (ea.field_a) {
                                  L12: while (true) {
                                    if (!jl.a((byte) 5)) {
                                      break L11;
                                    } else {
                                      var5 = this.a((byte) -120);
                                      if (-1 == (var5 ^ -1)) {
                                        continue L12;
                                      } else {
                                        return var5;
                                      }
                                    }
                                  }
                                } else {
                                  break L11;
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
                      L13: {
                        if ((tb.field_fb ^ -1) >= -559) {
                          break L13;
                        } else {
                          if ((tb.field_fb ^ -1) <= -632) {
                            break L13;
                          } else {
                            this.field_j = fo.field_f;
                            var4 = 1;
                            this.field_a = true;
                            break L13;
                          }
                        }
                      }
                      if (var4 == 0) {
                        if (fo.field_n < this.field_j) {
                          L14: {
                            if ((qo.field_O ^ -1) >= -258) {
                              break L14;
                            } else {
                              if (qo.field_O >= 290) {
                                break L14;
                              } else {
                                L15: {
                                  if (-10 <= (pq.field_k ^ -1)) {
                                    break L15;
                                  } else {
                                    if (-83 < (pq.field_k ^ -1)) {
                                      this.field_j = fo.field_n;
                                      break L15;
                                    } else {
                                      L16: {
                                        if (-559 <= (pq.field_k ^ -1)) {
                                          break L16;
                                        } else {
                                          if ((pq.field_k ^ -1) <= -632) {
                                            break L16;
                                          } else {
                                            this.field_j = fo.field_n;
                                            if (!param1) {
                                              return 0;
                                            } else {
                                              L17: {
                                                this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                                var4 = 0;
                                                if (this.field_g.a((byte) 113)) {
                                                  L18: {
                                                    if (this.field_g.field_j == 0) {
                                                      var4 = 1;
                                                      break L18;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                  if (-2 != (this.field_g.field_j ^ -1)) {
                                                    break L17;
                                                  } else {
                                                    return 2;
                                                  }
                                                } else {
                                                  break L17;
                                                }
                                              }
                                              L19: {
                                                if (ea.field_a) {
                                                  L20: while (true) {
                                                    if (!jl.a((byte) 5)) {
                                                      break L19;
                                                    } else {
                                                      var5 = this.a((byte) -120);
                                                      if (-1 == (var5 ^ -1)) {
                                                        continue L20;
                                                      } else {
                                                        return var5;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L19;
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
                                          L21: {
                                            if (this.field_g.field_j == 0) {
                                              var4 = 1;
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          if (-2 != (this.field_g.field_j ^ -1)) {
                                            if (ea.field_a) {
                                              L22: while (true) {
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
                                                    continue L22;
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
                                          L23: {
                                            if (ea.field_a) {
                                              L24: while (true) {
                                                if (!jl.a((byte) 5)) {
                                                  break L23;
                                                } else {
                                                  var5 = this.a((byte) -120);
                                                  if (-1 == (var5 ^ -1)) {
                                                    continue L24;
                                                  } else {
                                                    return var5;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L23;
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
                                  break L14;
                                } else {
                                  if ((pq.field_k ^ -1) <= -632) {
                                    break L14;
                                  } else {
                                    this.field_j = fo.field_n;
                                    if (!param1) {
                                      return 0;
                                    } else {
                                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                      var4 = 0;
                                      if (this.field_g.a((byte) 113)) {
                                        L25: {
                                          if (this.field_g.field_j == 0) {
                                            var4 = 1;
                                            break L25;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        if (-2 != (this.field_g.field_j ^ -1)) {
                                          if (ea.field_a) {
                                            L26: while (true) {
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
                                                  continue L26;
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
                              L28: {
                                if (this.field_g.field_j == 0) {
                                  var4 = 1;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              if (-2 != (this.field_g.field_j ^ -1)) {
                                if (ea.field_a) {
                                  L29: while (true) {
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
                                        continue L29;
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
                            }
                          }
                        } else {
                          if (!param1) {
                            return 0;
                          } else {
                            this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                            var4 = 0;
                            if (this.field_g.a((byte) 113)) {
                              L31: {
                                if (this.field_g.field_j == 0) {
                                  var4 = 1;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              if (-2 != (this.field_g.field_j ^ -1)) {
                                if (ea.field_a) {
                                  L32: while (true) {
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
                                        continue L32;
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
                            L34: {
                              if (this.field_g.field_j == 0) {
                                var4 = 1;
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                            if (-2 != (this.field_g.field_j ^ -1)) {
                              if (ea.field_a) {
                                L35: while (true) {
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
                                      continue L35;
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
                          }
                        }
                      }
                    } else {
                      L37: {
                        if (var4 != 0) {
                          break L37;
                        } else {
                          if (fo.field_n >= this.field_j) {
                            break L37;
                          } else {
                            if ((qo.field_O ^ -1) >= -258) {
                              break L37;
                            } else {
                              if (qo.field_O >= 290) {
                                break L37;
                              } else {
                                if (-10 <= (pq.field_k ^ -1)) {
                                  if (-559 <= (pq.field_k ^ -1)) {
                                    break L37;
                                  } else {
                                    if ((pq.field_k ^ -1) <= -632) {
                                      break L37;
                                    } else {
                                      this.field_j = fo.field_n;
                                      break L37;
                                    }
                                  }
                                } else {
                                  if (-559 <= (pq.field_k ^ -1)) {
                                    break L37;
                                  } else {
                                    if ((pq.field_k ^ -1) <= -632) {
                                      break L37;
                                    } else {
                                      this.field_j = fo.field_n;
                                      break L37;
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
                        L38: {
                          this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                          var4 = 0;
                          if (this.field_g.a((byte) 113)) {
                            L39: {
                              if (this.field_g.field_j == 0) {
                                var4 = 1;
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                            if (-2 != (this.field_g.field_j ^ -1)) {
                              break L38;
                            } else {
                              return 2;
                            }
                          } else {
                            break L38;
                          }
                        }
                        L40: {
                          if (ea.field_a) {
                            L41: while (true) {
                              if (!jl.a((byte) 5)) {
                                break L40;
                              } else {
                                var5 = this.a((byte) -120);
                                if (-1 == (var5 ^ -1)) {
                                  continue L41;
                                } else {
                                  return var5;
                                }
                              }
                            }
                          } else {
                            break L40;
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
                    L42: {
                      if (var4 != 0) {
                        break L42;
                      } else {
                        if (fo.field_n >= this.field_j) {
                          break L42;
                        } else {
                          if ((qo.field_O ^ -1) >= -258) {
                            break L42;
                          } else {
                            if (qo.field_O >= 290) {
                              break L42;
                            } else {
                              L43: {
                                if (-10 <= (pq.field_k ^ -1)) {
                                  break L43;
                                } else {
                                  if (-83 < (pq.field_k ^ -1)) {
                                    this.field_j = fo.field_n;
                                    break L43;
                                  } else {
                                    L44: {
                                      if (-559 <= (pq.field_k ^ -1)) {
                                        break L44;
                                      } else {
                                        if ((pq.field_k ^ -1) <= -632) {
                                          break L44;
                                        } else {
                                          this.field_j = fo.field_n;
                                          break L44;
                                        }
                                      }
                                    }
                                    if (!param1) {
                                      return 0;
                                    } else {
                                      L45: {
                                        this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                        var4 = 0;
                                        if (this.field_g.a((byte) 113)) {
                                          L46: {
                                            if (this.field_g.field_j == 0) {
                                              var4 = 1;
                                              break L46;
                                            } else {
                                              break L46;
                                            }
                                          }
                                          if (-2 != (this.field_g.field_j ^ -1)) {
                                            break L45;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          break L45;
                                        }
                                      }
                                      L47: {
                                        if (ea.field_a) {
                                          L48: while (true) {
                                            if (!jl.a((byte) 5)) {
                                              break L47;
                                            } else {
                                              var5 = this.a((byte) -120);
                                              if (-1 == (var5 ^ -1)) {
                                                continue L48;
                                              } else {
                                                return var5;
                                              }
                                            }
                                          }
                                        } else {
                                          break L47;
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
                                break L42;
                              } else {
                                if ((pq.field_k ^ -1) <= -632) {
                                  break L42;
                                } else {
                                  this.field_j = fo.field_n;
                                  if (!param1) {
                                    return 0;
                                  } else {
                                    L49: {
                                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                      var4 = 0;
                                      if (this.field_g.a((byte) 113)) {
                                        L50: {
                                          if (this.field_g.field_j == 0) {
                                            var4 = 1;
                                            break L50;
                                          } else {
                                            break L50;
                                          }
                                        }
                                        if (-2 != (this.field_g.field_j ^ -1)) {
                                          break L49;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        break L49;
                                      }
                                    }
                                    L51: {
                                      if (ea.field_a) {
                                        L52: while (true) {
                                          if (!jl.a((byte) 5)) {
                                            break L51;
                                          } else {
                                            var5 = this.a((byte) -120);
                                            if (-1 == (var5 ^ -1)) {
                                              continue L52;
                                            } else {
                                              return var5;
                                            }
                                          }
                                        }
                                      } else {
                                        break L51;
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
                        L53: {
                          if (this.field_g.field_j == 0) {
                            var4 = 1;
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        if (-2 != (this.field_g.field_j ^ -1)) {
                          if (ea.field_a) {
                            L54: while (true) {
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
                                  continue L54;
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
                        L55: {
                          if (ea.field_a) {
                            L56: while (true) {
                              if (!jl.a((byte) 5)) {
                                break L55;
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
                            break L55;
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
                  L57: {
                    if (var4 != 0) {
                      break L57;
                    } else {
                      if (fo.field_n >= this.field_j) {
                        break L57;
                      } else {
                        if ((qo.field_O ^ -1) >= -258) {
                          break L57;
                        } else {
                          if (qo.field_O >= 290) {
                            break L57;
                          } else {
                            L58: {
                              if (-10 <= (pq.field_k ^ -1)) {
                                break L58;
                              } else {
                                if (-83 < (pq.field_k ^ -1)) {
                                  this.field_j = fo.field_n;
                                  break L58;
                                } else {
                                  L59: {
                                    if (-559 <= (pq.field_k ^ -1)) {
                                      break L59;
                                    } else {
                                      if ((pq.field_k ^ -1) <= -632) {
                                        break L59;
                                      } else {
                                        this.field_j = fo.field_n;
                                        break L59;
                                      }
                                    }
                                  }
                                  if (param1) {
                                    L60: {
                                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                      var4 = 0;
                                      if (this.field_g.a((byte) 113)) {
                                        L61: {
                                          if (this.field_g.field_j == 0) {
                                            var4 = 1;
                                            break L61;
                                          } else {
                                            break L61;
                                          }
                                        }
                                        if (-2 != (this.field_g.field_j ^ -1)) {
                                          break L60;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        break L60;
                                      }
                                    }
                                    L62: {
                                      if (ea.field_a) {
                                        L63: while (true) {
                                          if (!jl.a((byte) 5)) {
                                            break L62;
                                          } else {
                                            var5 = this.a((byte) -120);
                                            if (-1 == (var5 ^ -1)) {
                                              continue L63;
                                            } else {
                                              return var5;
                                            }
                                          }
                                        }
                                      } else {
                                        break L62;
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
                              break L57;
                            } else {
                              if ((pq.field_k ^ -1) <= -632) {
                                break L57;
                              } else {
                                this.field_j = fo.field_n;
                                if (param1) {
                                  L64: {
                                    this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                                    var4 = 0;
                                    if (this.field_g.a((byte) 113)) {
                                      L65: {
                                        if (this.field_g.field_j == 0) {
                                          var4 = 1;
                                          break L65;
                                        } else {
                                          break L65;
                                        }
                                      }
                                      if (-2 != (this.field_g.field_j ^ -1)) {
                                        break L64;
                                      } else {
                                        return 2;
                                      }
                                    } else {
                                      break L64;
                                    }
                                  }
                                  L66: {
                                    if (ea.field_a) {
                                      L67: while (true) {
                                        if (!jl.a((byte) 5)) {
                                          break L66;
                                        } else {
                                          var5 = this.a((byte) -120);
                                          if (-1 == (var5 ^ -1)) {
                                            continue L67;
                                          } else {
                                            return var5;
                                          }
                                        }
                                      }
                                    } else {
                                      break L66;
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
                      L68: {
                        if (this.field_g.field_j == 0) {
                          var4 = 1;
                          break L68;
                        } else {
                          break L68;
                        }
                      }
                      if (-2 != (this.field_g.field_j ^ -1)) {
                        if (ea.field_a) {
                          L69: while (true) {
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
                                continue L69;
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
                      L70: {
                        if (ea.field_a) {
                          L71: while (true) {
                            if (!jl.a((byte) 5)) {
                              break L70;
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
                          break L70;
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
                    L72: {
                      if (this.field_g.field_j == 0) {
                        var4 = 1;
                        break L72;
                      } else {
                        break L72;
                      }
                    }
                    if (-2 != (this.field_g.field_j ^ -1)) {
                      if (ea.field_a) {
                        L73: while (true) {
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
                              continue L73;
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
                      L74: while (true) {
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
                            continue L74;
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
        int discarded$2 = 0;
        int discarded$3 = 0;
        tp var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tp var6 = null;
        tp var7 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.field_q == null) {
          if (null != ch.field_c) {
            discarded$2 = ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
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
              discarded$3 = ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
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
        int var2 = 0;
        int var3 = 0;
        jp var5 = null;
        String var6 = null;
        String var7 = null;
        int[] var16 = null;
        int[] var17 = null;
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
        int discarded$52 = 0;
        int discarded$53 = 0;
        int discarded$54 = 0;
        int discarded$55 = 0;
        int discarded$56 = 0;
        int discarded$57 = 0;
        int discarded$58 = 0;
        int discarded$59 = 0;
        int discarded$60 = 0;
        int discarded$61 = 0;
        int discarded$62 = 0;
        int discarded$63 = 0;
        int discarded$64 = 0;
        int discarded$65 = 0;
        int discarded$66 = 0;
        int discarded$67 = 0;
        int discarded$68 = 0;
        int discarded$69 = 0;
        int discarded$70 = 0;
        int discarded$71 = 0;
        int discarded$72 = 0;
        int discarded$73 = 0;
        int discarded$74 = 0;
        int discarded$75 = 0;
        int discarded$76 = 0;
        int discarded$77 = 0;
        int discarded$78 = 0;
        int discarded$79 = 0;
        int discarded$80 = 0;
        int discarded$81 = 0;
        int discarded$82 = 0;
        int discarded$83 = 0;
        int discarded$84 = 0;
        int discarded$85 = 0;
        int discarded$86 = 0;
        int discarded$87 = 0;
        int discarded$88 = 0;
        int discarded$89 = 0;
        int discarded$90 = 0;
        int discarded$91 = 0;
        int discarded$92 = 0;
        int discarded$93 = 0;
        int discarded$94 = 0;
        int discarded$95 = 0;
        int discarded$96 = 0;
        int discarded$97 = 0;
        int discarded$98 = 0;
        int discarded$99 = 0;
        int discarded$100 = 0;
        int discarded$101 = 0;
        int discarded$102 = 0;
        int discarded$103 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
                                    discarded$52 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                    rp.field_u.c(30, 330);
                                    discarded$53 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    discarded$54 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    discarded$55 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                                    discarded$56 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                    rp.field_u.c(30, 330);
                                    discarded$57 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    discarded$58 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    discarded$59 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                              discarded$60 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                              rp.field_u.c(30, 330);
                              discarded$61 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              discarded$62 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              discarded$63 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                              discarded$64 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                              rp.field_u.c(30, 330);
                              discarded$65 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              discarded$66 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                              discarded$67 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                            discarded$68 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                            rp.field_u.c(30, 330);
                            discarded$69 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                            discarded$70 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                            discarded$71 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                          discarded$72 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                          rp.field_u.c(30, 330);
                          discarded$73 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                          discarded$74 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                          discarded$75 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                        discarded$76 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                        rp.field_u.c(30, 330);
                        discarded$77 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        discarded$78 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        discarded$79 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                                        discarded$80 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                        rp.field_u.c(30, 330);
                                        discarded$81 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                        discarded$82 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                        discarded$83 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                                      discarded$84 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                      rp.field_u.c(30, 330);
                                      discarded$85 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      discarded$86 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      discarded$87 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                      discarded$88 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                      rp.field_u.c(30, 330);
                      discarded$89 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      discarded$90 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      discarded$91 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                                      discarded$92 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                      rp.field_u.c(30, 330);
                                      discarded$93 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      discarded$94 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                      discarded$95 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                                    discarded$96 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                                    rp.field_u.c(30, 330);
                                    discarded$97 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    discarded$98 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                                    discarded$99 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
                    discarded$100 = ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    rp.field_u.c(30, 330);
                    discarded$101 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    discarded$102 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    discarded$103 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
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
        int var2 = 0;
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
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        jp var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            stackOut_4_0 = (RuntimeException) (var11);
            stackOut_4_1 = new StringBuilder().append("w.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param7).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param8 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param9 + ')');
        }
    }

    private final void a(String param0, boolean param1, boolean param2, tp[] param3, String[] param4, java.applet.Applet param5) {
        String var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
            stackOut_13_0 = (RuntimeException) (var7_ref);
            stackOut_13_1 = new StringBuilder().append("w.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
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
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("w.J(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
        int discarded$0 = 0;
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
                discarded$0 = param4.a(param2, param1, param6, param5, param0, var11, -1, 1, 1, 0);
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

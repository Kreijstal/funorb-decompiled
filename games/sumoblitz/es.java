/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends bq {
    private ch field_f;
    private int field_h;
    private vk field_i;
    private float field_g;
    private tq field_k;
    private float[] field_e;
    static String field_j;

    final boolean b(byte param0) {
        if (param0 > -64) {
            this.field_f = (ch) null;
            return true;
        }
        return true;
    }

    public static void c(int param0) {
        if (param0 != 4) {
            return;
        }
        field_j = null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_k != null) {
          this.field_b.g(1, 126);
          if (param0 > 39) {
            L0: {
              if ((param1 & 128) != 0) {
                this.field_b.a(32, (ht) null);
                break L0;
              } else {
                L1: {
                  if ((1 & param2 ^ -1) == -2) {
                    break L1;
                  } else {
                    if (this.field_f.field_g) {
                      this.field_b.a(54, this.field_f.field_b);
                      if (var5 != 0) {
                        this.field_b.a(86, this.field_f.field_i[0]);
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        L2: {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            L3: {
                              if (this.field_f.field_g) {
                                break L3;
                              } else {
                                var4 = 16 * (this.field_b.field_Ac % 4000) / 4000;
                                this.field_b.a(13, this.field_f.field_i[var4]);
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                                break L3;
                              }
                            }
                            this.field_b.a(36, this.field_f.field_b);
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_g, 0.0f, 0.0f, 1.0f);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              L4: {
                                this.field_b.a(32, (ht) null);
                                this.field_b.g(0, 122);
                                if ((param1 & 64) == 0) {
                                  break L4;
                                } else {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                                  break L4;
                                }
                              }
                              ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                              ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                              ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                              L5: {
                                var4 = param1 & 3;
                                if (var4 == 2) {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                  break L5;
                                } else {
                                  L6: {
                                    if (var4 == 3) {
                                      break L6;
                                    } else {
                                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                    break L5;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        this.field_b.g(0, 122);
                        if ((param1 & 64) != 0) {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                          if (var5 == 0) {
                            var4 = param1 & 3;
                            if (var4 != 2) {
                              if (var4 == 3) {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                                if (var5 != 0) {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                                if (var5 != 0) {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                              return;
                            }
                          } else {
                            L7: {
                              ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                              ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                              ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                              var4 = param1 & 3;
                              if (var4 == 2) {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                break L7;
                              } else {
                                L8: {
                                  if (var4 == 3) {
                                    break L8;
                                  } else {
                                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                                    break L8;
                                  }
                                }
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                                if (var5 == 0) {
                                  break L7;
                                } else {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                  break L7;
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          L9: {
                            ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                            ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                            ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                            jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                            var4 = param1 & 3;
                            if (var4 == 2) {
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                              break L9;
                            } else {
                              L10: {
                                if (var4 == 3) {
                                  break L10;
                                } else {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                                  if (var5 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                              if (var5 == 0) {
                                break L9;
                              } else {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                break L9;
                              }
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L11: {
                        this.field_b.a(86, this.field_f.field_i[0]);
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                        if (var5 == 0) {
                          break L11;
                        } else {
                          L12: {
                            if (this.field_f.field_g) {
                              break L12;
                            } else {
                              var4 = 16 * (this.field_b.field_Ac % 4000) / 4000;
                              this.field_b.a(13, this.field_f.field_i[var4]);
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                              break L12;
                            }
                          }
                          this.field_b.a(36, this.field_f.field_b);
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_g, 0.0f, 0.0f, 1.0f);
                          if (var5 == 0) {
                            break L11;
                          } else {
                            L13: {
                              this.field_b.a(32, (ht) null);
                              this.field_b.g(0, 122);
                              if ((param1 & 64) == 0) {
                                break L13;
                              } else {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                                break L13;
                              }
                            }
                            ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                            ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                            ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                            jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                            L14: {
                              var4 = param1 & 3;
                              if (var4 == 2) {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                break L14;
                              } else {
                                L15: {
                                  if (var4 == 3) {
                                    break L15;
                                  } else {
                                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                                if (var5 == 0) {
                                  break L14;
                                } else {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                  break L14;
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      this.field_b.g(0, 122);
                      if ((param1 & 64) != 0) {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                        if (var5 == 0) {
                          var4 = param1 & 3;
                          if (var4 != 2) {
                            if (var4 == 3) {
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                              if (var5 != 0) {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                return;
                              } else {
                                return;
                              }
                            } else {
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                              if (var5 != 0) {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                            return;
                          }
                        } else {
                          L16: {
                            ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                            ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                            ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                            jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                            var4 = param1 & 3;
                            if (var4 == 2) {
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                              break L16;
                            } else {
                              L17: {
                                if (var4 == 3) {
                                  break L17;
                                } else {
                                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                                  break L17;
                                }
                              }
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                              if (var5 == 0) {
                                break L16;
                              } else {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                                break L16;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L18: {
                          ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                          ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                          ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                          jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                          var4 = param1 & 3;
                          if (var4 == 2) {
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                            break L18;
                          } else {
                            L19: {
                              if (var4 == 3) {
                                break L19;
                              } else {
                                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                                if (var5 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                            if (var5 == 0) {
                              break L18;
                            } else {
                              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                              break L18;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L20: {
                  if (this.field_f.field_g) {
                    break L20;
                  } else {
                    var4 = 16 * (this.field_b.field_Ac % 4000) / 4000;
                    this.field_b.a(13, this.field_f.field_i[var4]);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L20;
                    }
                  }
                }
                this.field_b.a(36, this.field_f.field_b);
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_g, 0.0f, 0.0f, 1.0f);
                if (var5 == 0) {
                  break L0;
                } else {
                  L21: {
                    L22: {
                      this.field_b.a(32, (ht) null);
                      this.field_b.g(0, 122);
                      if ((param1 & 64) == 0) {
                        break L22;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
                        if (var5 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                    ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                    ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                    jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                    break L21;
                  }
                  L23: {
                    var4 = param1 & 3;
                    if (var4 == 2) {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                      break L23;
                    } else {
                      L24: {
                        if (var4 == 3) {
                          break L24;
                        } else {
                          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                          if (var5 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                      if (var5 == 0) {
                        break L23;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                        break L23;
                      }
                    }
                  }
                  return;
                }
              }
            }
            this.field_b.g(0, 122);
            if ((param1 & 64) == 0) {
              ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
              ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
              ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
              jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
              var4 = param1 & 3;
              if (var4 != 2) {
                if (var4 == 3) {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                  if (var5 != 0) {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                    return;
                  } else {
                    return;
                  }
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                  if (var5 == 0) {
                    return;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                    return;
                  }
                }
              } else {
                jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                return;
              }
            } else {
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
              if (var5 == 0) {
                var4 = param1 & 3;
                if (var4 != 2) {
                  L25: {
                    if (var4 == 3) {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                      if (var5 == 0) {
                        break L25;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                      if (var5 == 0) {
                        break L25;
                      } else {
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                  return;
                }
              } else {
                ps.field_d[1] = this.field_b.field_cb * this.field_b.field_z;
                ps.field_d[2] = this.field_b.field_cb * this.field_b.field_ac;
                ps.field_d[0] = this.field_b.field_Fc * this.field_b.field_cb;
                jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, ps.field_d, 0);
                var4 = param1 & 3;
                if (var4 != 2) {
                  L26: {
                    if (var4 == 3) {
                      break L26;
                    } else {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
                      if (var5 != 0) {
                        break L26;
                      } else {
                        return;
                      }
                    }
                  }
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
                  if (var5 != 0) {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                    return;
                  } else {
                    return;
                  }
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 > -30) {
            this.field_g = 2.270503520965576f;
        }
    }

    final void a(byte param0, int param1, ht param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_b.a(param0 ^ 9, param2);
              this.field_b.c(param1, true);
              if (param0 == 35) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("es.A(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void b(int param0) {
        if (!(null != this.field_k)) {
            return;
        }
        this.field_k.a((byte) 121, '');
        this.field_b.g(1, 119);
        this.field_b.a(16, (ht) null);
        this.field_b.g(0, 118);
        if (param0 > -125) {
            this.a(53, false);
        }
    }

    es(fr param0, ch param1) {
        super(param0);
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var3 = null;
        int[][] var3_array = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var16 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_f = param1;
              if (!this.field_b.field_Ib) {
                break L1;
              } else {
                if ((this.field_b.field_T ^ -1) > -3) {
                  break L1;
                } else {
                  this.field_i = wr.a(this.field_b, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", -24674);
                  if (null == this.field_i) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var16 = qe.a(false, 3, 0, 4, 4096, 4, 64, 256, 0.4000000059604645f);
                    var12 = var16;
                    var11 = var12;
                    var3_array = var11;
                    var23 = qe.a(false, 3, 8, 4, 4096, 4, 64, 256, 0.4000000059604645f);
                    var5 = 0;
                    this.field_e = new float[32768];
                    var6 = 0;
                    L2: while (true) {
                      L3: {
                        if (256 <= var6) {
                          break L3;
                        } else {
                          var24 = var16[var6];
                          var25 = var23[var6];
                          if (var10 != 0) {
                            break L1;
                          } else {
                            var9 = 0;
                            L4: while (true) {
                              L5: {
                                L6: {
                                  if (64 <= var9) {
                                    break L6;
                                  } else {
                                    incrementValue$2 = var5;
                                    var5++;
                                    this.field_e[incrementValue$2] = (float)var24[var9] / 4096.0f;
                                    incrementValue$3 = var5;
                                    var5++;
                                    this.field_e[incrementValue$3] = (float)var25[var9] / 4096.0f;
                                    var9++;
                                    if (var10 != 0) {
                                      break L5;
                                    } else {
                                      if (var10 == 0) {
                                        continue L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                break L5;
                              }
                              if (var10 == 0) {
                                continue L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      this.a(true);
                      break L1;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("es.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        this.field_k = new tq(this.field_b, 2);
        this.field_k.a(0, 4864);
        this.field_b.g(1, 90);
        this.field_b.e(0, -16777216);
        this.field_b.a(20685, 7681, 260);
        this.field_b.a(121, 0, 34166, 770);
        this.field_b.g(0, 96);
        jaggl.OpenGL.glBindProgramARB(34336, this.field_i.field_a);
        jaggl.OpenGL.glEnable(34336);
        this.field_k.a(true);
        this.field_k.a(1, 4864);
        this.field_b.g(1, 100);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_b.c(0, param0);
        this.field_b.a(122, 0, 5890, 770);
        this.field_b.g(0, 99);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        this.field_k.a(true);
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_k == null) {
          return;
        } else {
          this.field_k.a((byte) 121, ' ');
          this.field_b.g(1, 115);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(this.field_b.field_mc.b((byte) 57), 0);
          if (param0 >= 33) {
            jaggl.OpenGL.glMatrixMode(5888);
            this.field_b.g(0, 115);
            if (this.field_h != this.field_b.field_Ac) {
              var3 = 128 * (this.field_b.field_Ac % 5000) / 5000;
              var4 = 0;
              L0: while (true) {
                if (64 <= var4) {
                  if (this.field_f.field_g) {
                    this.field_g = (float)(this.field_b.field_Ac % 4000) / 4000.0f;
                    if (var5 != 0) {
                      jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                      this.field_h = this.field_b.field_Ac;
                      return;
                    } else {
                      this.field_h = this.field_b.field_Ac;
                      return;
                    }
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                    this.field_h = this.field_b.field_Ac;
                    return;
                  }
                } else {
                  jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field_e, var3);
                  var3 += 2;
                  var4++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
                    this.field_h = this.field_b.field_Ac;
                    return;
                  }
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

    static {
        field_j = "Loading graphics";
    }
}

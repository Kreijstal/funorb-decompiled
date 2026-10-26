/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends ab implements dr, dn {
    static pt field_t;
    private bm field_x;
    private boolean field_B;
    private mi field_D;
    static int field_u;
    private mi field_z;
    private boolean field_C;
    private bm field_v;
    private mi field_w;
    private String field_y;
    private boolean field_E;
    static int field_A;

    final void a(byte param0, int param1, int param2, int param3) {
        if (this.field_y != null) {
          qo.field_b.a(this.field_y, 20 + param3 + this.field_p, 15 + param2 + this.field_h, this.field_q - 40, this.field_n, 16777215, -1, 1, 0, qo.field_b.field_I);
        }
        if (null != this.field_w) {
          vp.b(param3 + 10, param2 + 134, -20 + this.field_q, 4210752);
        }
        if (param0 <= 64) {
          return;
        }
        super.a((byte) 77, param1, param2, param3);
    }

    final static float a(float param0, int param1) {
        if (param1 > -55) {
          field_u = -54;
        }
        return param0 * (param0 * param0) * (param0 * (-15.0f + param0 * 6.0f) + 10.0f);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(-20, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.b(param3, -101);
            return stackIn_6_0;
          }
          if (param1 == 99) {
            stackIn_10_0 = this.a(80, param3);
            return stackIn_10_0;
          }
          var5_int = -87 % ((param0 + 53) / 33);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ce.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        bm var3 = null;
        String var4 = null;
        try {
          var3 = this.field_v;
          var4 = param0;
          var3.a(-20975, var4, false);
          if (param1 < 43) {
            bm var5 = (bm) null;
            this.b((bm) null, 39);
          }
          this.field_x.f((byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ce.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(int param0) {
        this.field_v.f((byte) -2);
        this.field_x.f((byte) -2);
        if (param0 != 310) {
          this.field_x = (bm) null;
        }
    }

    final String d(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (null == this.field_v.field_f) {
          return "";
        }
        return this.field_v.field_f;
    }

    final static void decodeHighscoreResponse(byte obfuscationGuard) {
        int nameEntryIndex = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int rowIndex = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int responseKind = 0;
        int queryId = 0;
        HighscoreQuery query = null;
        long acknowledgementToken = 0L;
        int nameEntryCount = 0;
        int entryLimit = 0;
        ScoreSubmission submission = null;
        int valuesPerEntry = 0;
        String[][] namesByView = null;
        String[][] alternateNamesByView = null;
        long[][] submissionTokensByView = null;
        int[][] valuesByView = null;
        int allRowCount = 0;
        int ownRowCount = 0;
        int uniqueRowCount = 0;
        int allValueOffset = 0;
        int ownValueOffset = 0;
        int uniqueValueOffset = 0;
        int rowCount = 0;
        int nameIndex = 0;
        String displayName = null;
        long submissionToken = 0L;
        int valuesStartPosition = 0;
        int allValueIndex = 0;
        int obfuscationControl = 0;
        CipherPacketBuffer packet = null;
        int submissionId;
        int ownValueIndex;
        int uniqueValueIndex;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 116) {
            field_A = -61;
          }
          packet = IntKeyLookup.incomingPacket;
          responseKind = packet.readUnsignedByte(-85);
          if (responseKind == 0) {
            queryId = packet.readUnsignedShort((byte) 0);
            query = (HighscoreQuery) (nh.pendingHighscoreQueries.first(268435455));
            while (query != null) {
              if (queryId != query.queryId) {
                query = (HighscoreQuery) (nh.pendingHighscoreQueries.next((byte) 103));
                continue;
              }
              break;
            }
            if (query == null) {
              te.b(true);
              return;
            }
            nameEntryCount = packet.readUnsignedByte(obfuscationGuard - 167);
            if (nameEntryCount != 0) {
              entryLimit = query.entryLimit;
              pe.highscoreNameEntries[0].alternateName = null;
              valuesPerEntry = query.valuesPerEntry;
              pe.highscoreNameEntries[0].primaryName = fj.playerDisplayName;
              pe.highscoreNameEntries[0].usedInUniqueView = false;
              for (nameEntryIndex = 1; nameEntryIndex < nameEntryCount; nameEntryIndex++) {
                pe.highscoreNameEntries[nameEntryIndex].primaryName = packet.readNullTerminatedText(-17883);
                pe.highscoreNameEntries[nameEntryIndex].usedInUniqueView = false;
                if (packet.readUnsignedByte(-47) != 1) {
                  pe.highscoreNameEntries[nameEntryIndex].alternateName = null;
                } else {
                  pe.highscoreNameEntries[nameEntryIndex].alternateName = packet.readNullTerminatedText(obfuscationGuard ^ -17839);
                }
              }
              dupTemp$0 = new String[3][entryLimit];
              query.namesByView = dupTemp$0;
              namesByView = dupTemp$0;
              alternateNamesByView = new String[3][entryLimit];
              dupTemp$1 = new long[3][entryLimit];
              query.submissionTokensByView = dupTemp$1;
              submissionTokensByView = dupTemp$1;
              dupTemp$2 = new int[3][entryLimit * valuesPerEntry];
              query.valuesByView = dupTemp$2;
              valuesByView = dupTemp$2;
              allRowCount = 0;
              ownRowCount = 0;
              uniqueRowCount = 0;
              allValueOffset = 0;
              ownValueOffset = 0;
              uniqueValueOffset = 0;
              rowCount = packet.readUnsignedByte(-119);
              if (rowCount > 0) {
                for (rowIndex = 0; rowIndex < rowCount; rowIndex++) {
                  nameIndex = packet.readUnsignedByte(obfuscationGuard ^ 69);
                  displayName = pe.highscoreNameEntries[nameIndex].primaryName;
                  submissionToken = packet.readLong((byte) -32);
                  valuesStartPosition = packet.position;
                  if (entryLimit > rowIndex) {
                    namesByView[0][allRowCount] = displayName;
                    alternateNamesByView[0][allRowCount] = pe.highscoreNameEntries[nameIndex].alternateName;
                    submissionTokensByView[0][allRowCount] = submissionToken;
                    allRowCount++;
                    for (allValueIndex = 0; valuesPerEntry > allValueIndex; allValueIndex++) {
                      incrementValue$3 = allValueOffset;
                      allValueOffset++;
                      valuesByView[0][incrementValue$3] = packet.readInt((byte) 124);
                    }
                  }
                  if (displayName != null &&
                    fd.isCurrentPlayerName(displayName, (byte) -6)) {
                    namesByView[1][ownRowCount] = fj.playerDisplayName;
                    alternateNamesByView[1][ownRowCount] = null;
                    submissionTokensByView[1][ownRowCount] = submissionToken;
                    ownRowCount++;
                    packet.position = valuesStartPosition;
                    for (ownValueIndex = 0; valuesPerEntry > ownValueIndex; ownValueIndex++) {
                      incrementValue$4 = ownValueOffset;
                      ownValueOffset++;
                      valuesByView[1][incrementValue$4] = packet.readInt((byte) 114);
                    }
                  }
                  if (entryLimit > uniqueRowCount &&
                    !pe.highscoreNameEntries[nameIndex].usedInUniqueView) {
                    pe.highscoreNameEntries[nameIndex].usedInUniqueView = true;
                    namesByView[2][uniqueRowCount] = displayName;
                    alternateNamesByView[2][uniqueRowCount] = pe.highscoreNameEntries[nameIndex].alternateName;
                    submissionTokensByView[2][uniqueRowCount] = submissionToken;
                    uniqueRowCount++;
                    packet.position = valuesStartPosition;
                    for (uniqueValueIndex = 0; valuesPerEntry > uniqueValueIndex; uniqueValueIndex++) {
                      incrementValue$5 = uniqueValueOffset;
                      uniqueValueOffset++;
                      valuesByView[2][incrementValue$5] = packet.readInt((byte) 113);
                    }
                  }
                }
              }
            }
            query.completed = true;
            query.unlink(obfuscationGuard ^ -16);
            return;
          }
          if (responseKind == 1) {
            submissionId = packet.readUnsignedShort((byte) 0);
            acknowledgementToken = packet.readLong((byte) 64);
            submission = (ScoreSubmission) (tq.pendingScoreSubmissions.first(268435455));
            while (submission != null) {
              if (submission.submissionId != submissionId) {
                submission = (ScoreSubmission) (tq.pendingScoreSubmissions.next((byte) 103));
                continue;
              }
              break;
            }
            if (submission == null) {
              te.b(true);
              return;
            }
            submission.submissionToken = acknowledgementToken;
            submission.unlink(-127);
            return;
          }
          v.a("HS1: " + CipherPacketBuffer.k((byte) 65), (byte) -52, (Throwable) null);
          te.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "ce.JA(" + obfuscationGuard + ')');
        }
    }

    public final void b(bm param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_v) {
            this.field_x.a((ea) (this), (byte) -42);
          }
          if (this.field_x == param0) {
            this.d((byte) -85);
          }
          if (param1 != -40) {
            this.field_D = (mi) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ce.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 != -3) {
          return false;
        }
        return nl.field_s;
    }

    private final void d(byte param0) {
        if (fh.e(31574) ||
          !(this.field_v.field_f.length() <= 0) &&
          !(0 >= this.field_x.field_f.length())) {
          s.a(this.field_x.field_f, false, this.field_v.field_f);
        }
        if (param0 > -59) {
          this.d((byte) -4);
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != this.field_D) {
            if (param1 != this.field_w) {
              if (this.field_z != param1) {
                var6_int = 122 % ((param4 + 27) / 61);
                return;
              }
              if (!this.field_C) {
                if (this.field_E) {
                  pj.b((byte) -75);
                } else {
                  PacketBuffer.i(-112);
                }
              } else {
                ArchiveIndex.b(17);
              }
            } else {
              cu.c((byte) 104);
            }
          } else {
            this.d((byte) -84);
          }
          var6_intLifetime1 = 122 % ((param4 + 27) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ce.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(bm param0, int param1) {
        try {
          if (param1 != -6525) {
            String var4 = (String) null;
            this.a((String) null, 56);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ce.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ce(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ir) null);
        bc dupTemp$0 = null;
        bc dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        mi stackIn_18_1 = null;
        mi stackIn_18_2 = null;
        mi stackIn_19_1 = null;
        mi stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb var6 = null;
        RuntimeException var6_ref = null;
        hc var7 = null;
        String var8 = null;
        gu var9 = null;
        bc var12 = null;
        bc var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_E = stackIn_4_1;
          this.field_y = param1;
          stackIn_7_1 = (param3);
          this.field_B = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_C = stackIn_10_1;
          if (this.field_C && (this.field_B ||
            this.field_E)) {
            throw new IllegalStateException();
          }
          this.field_v = (bm) ((Object) new kk(param0, (no) (this), 100));
          this.field_x = (bm) ((Object) new kk("", (no) (this), 20));
          if (!this.field_C) {
            this.field_D = new mi(ms.field_a, (no) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_E) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = Bullet.field_j;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = nu.field_a;
            }
            this.field_z = new mi(stackIn_19_3, (no) null);
            if (this.field_B) {
              this.field_w = new mi(SteeringMode.field_b, (no) (this));
            }
          } else {
            this.field_D = new mi(hg.field_z, (no) null);
            this.field_z = new mi(mb.field_s, (no) null);
            this.field_v.field_u = false;
          }
          this.field_v.field_e = (ir) ((Object) new sl(10000536));
          this.field_x.field_e = (ir) ((Object) new ul(10000536));
          var6 = new qb();
          this.field_D.field_e = (ir) ((Object) var6);
          if (null != this.field_z) {
            this.field_z.field_e = (ir) ((Object) var6);
          }
          this.field_v.field_k = ae.field_g;
          if (null != this.field_w) {
            this.field_w.field_e = (ir) ((Object) var6);
          }
          if (this.field_w != null) {
            this.field_w.field_k = cl.field_db;
          }
          if (this.field_C) {
            this.field_z.field_k = gq.field_d;
          } else {
            if (this.field_E) {
              this.field_z.field_k = td.field_c;
              this.field_z.field_e = (ir) ((Object) new wg());
            } else {
              this.field_z.field_e = (ir) ((Object) new wg());
            }
          }
          this.field_h = 15;
          var7 = qo.field_b;
          if (null != this.field_y) {
            this.field_h = this.field_h + (5 + var7.a(this.field_y, this.field_q - 40, var7.field_I));
          }
          var8 = kk.field_J;
          var9 = lc.a(17123, bm.m(125));
          if (ef.field_k != var9) {
            if (lp.field_f == var9) {
              var8 = io.field_e;
            }
          } else {
            var8 = hu.field_b;
          }
          dupTemp$0 = new bc(10, this.field_h, -20 + this.field_q, 25, this.field_v, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(dupTemp$0, 1);
          this.field_h = this.field_h + (((ea) ((Object) var12)).field_n + 5);
          dupTemp$1 = new bc(10, this.field_h, -20 + this.field_q, 25, this.field_x, false, 80, 3, var7, 16777215, vj.field_b);
          var13 = dupTemp$1;
          this.a(dupTemp$1, 1);
          this.field_D.field_o = (no) (this);
          this.field_h = this.field_h + (5 + ((ea) ((Object) var13)).field_n);
          if (null != this.field_w) {
            this.field_w.field_o = (no) (this);
          }
          if (null != this.field_z) {
            this.field_z.field_o = (no) (this);
          }
          if (this.field_w != null) {
            this.field_D.a(30, 85, this.field_h, -95 + this.field_q, (byte) 126);
            this.field_h = this.field_h + 60;
          } else {
            this.field_D.a(30, 8, this.field_h, -6 + (this.field_q - 10), (byte) 126);
            this.field_h = this.field_h + 35;
          }
          if (null != this.field_w) {
            this.field_w.a(30, 8, this.field_h, this.field_q - 6 - 10, (byte) 126);
            this.field_h = this.field_h + 35;
          }
          if (this.field_z != null) {
            if (!this.field_C &&
              !this.field_E) {
              this.field_z.a(20, 8, this.field_h, 40, (byte) 126);
              this.field_h = this.field_h + 25;
            } else {
              this.field_z.a(30, 8, this.field_h, this.field_q - 6 - 10, (byte) 127);
              this.field_h = this.field_h + 35;
            }
          }
          this.a(this.field_h + 3, 0, 0, this.field_q, (byte) 126);
          this.a(this.field_D, 1);
          if (this.field_w != null) {
            this.a(this.field_w, 1);
          }
          if (null != this.field_z) {
            this.a(this.field_z, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("ce.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static ll[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -29003) {
          field_t = (pt) null;
        }
        return qk.a(3, 1, param3, param4, 1, 1, param1, -128, param0);
    }

    public static void i(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 35) / 61);
    }

    static {
        field_t = new pt();
    }
}
